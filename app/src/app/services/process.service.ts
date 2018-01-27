import { Injectable } from '@angular/core';
import { Headers, Http, Response, RequestOptions } from '@angular/http';
import {Observable} from 'rxjs/Observable';
// import { Observable } from 'rxjs';
import 'rxjs/add/operator/map';
import 'rxjs/add/operator/catch';
import 'rxjs/add/operator/toPromise';

import { environment } from '../../environments/environment';

import { Process } from '../models/process';

@Injectable()
export class ProcessService {
  
  urlBluepages = "https://faces.tap.ibm.com/api/find/?q=uid:";

  constructor(private http: Http) {}
  
  private headers = new Headers({ 'Content-Type': 'application/json' });
  private processUrl = environment.apiUrl + '/process';

  addProcessWithObservable(process:Process): Observable<String> {
    const url = `${this.processUrl}`;
    let options = new RequestOptions({ headers: this.headers });
    return this.http.post(url, process, options)
                .map(res => res)
                .catch(this.handleErrorObservable);
  }

  getProcessObservable(): Observable<Process[]> {
    return this.http.get(this.processUrl)
      .map(res => res.json())
      .catch(this.handleErrorObservable);
  }

  getProcesssByIDWalletObservable(idProcess:String): Observable<Process[]> {
    return this.http.get(this.processUrl + "/" + idProcess)
      .map(res => res.json())
      .catch(this.handleErrorObservable);
  }

  private handleErrorObservable (error: Response | any) {
    console.error(error.message || error);
    return Observable.throw(error.message || error);
  }

  private extractData(res: Response) {
    let body = res.json();
    return body.data || {};
  }
      
  private handleError(error: any): Promise<any> {
    console.error('An error occurred', error);
    return Promise.reject(error.message || error);
  }
}
