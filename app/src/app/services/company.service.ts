import { Injectable } from '@angular/core';
import { Headers, Http, Response, RequestOptions } from '@angular/http';
import {Observable} from 'rxjs/Observable';
// import { Observable } from 'rxjs';
import 'rxjs/add/operator/map';
import 'rxjs/add/operator/catch';
import 'rxjs/add/operator/toPromise';

import { environment } from '../../environments/environment';

import { Company } from '../models/company';

@Injectable()
export class CompanyService {
  
  urlBluepages = "https://faces.tap.ibm.com/api/find/?q=uid:";

  constructor(private http: Http) {}
  
  private headers = new Headers({ 'Content-Type': 'application/json' });
  private companyUrl = environment.apiUrl + '/company';

  addCompanyWithObservable(company:Company): Observable<String> {
    const url = `${this.companyUrl}`;
    let options = new RequestOptions({ headers: this.headers });
    return this.http.post(url, company, options)
                .map(res => res)
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
