import { Injectable } from '@angular/core';
import { Headers, Http, Response, RequestOptions } from '@angular/http';
import {Observable} from 'rxjs/Observable';
// import { Observable } from 'rxjs';
import 'rxjs/add/operator/map';
import 'rxjs/add/operator/catch';
import 'rxjs/add/operator/toPromise';

import { environment } from '../../environments/environment';

import { User } from '../models/user';

@Injectable()
export class UserService {
  
  urlBluepages = "https://faces.tap.ibm.com/api/find/?q=uid:";

  constructor(private http: Http) {}
  
  private headers = new Headers({ 'Content-Type': 'application/json' });
  private userUrl = environment.apiUrl + '/user';

  addUserWithObservable(user:User): Observable<String> {
    const url = `${this.userUrl}`;
    let options = new RequestOptions({ headers: this.headers });
    return this.http.post(url, user, options)
                .map(res => res)
                .catch(this.handleErrorObservable);
  }

  getUserObservable(): Observable<User[]> {
    return this.http.get(this.userUrl)
      .map(res => res.json())
      .catch(this.handleErrorObservable);
  }

  getUsersByIDWalletObservable(idWallet:String): Observable<User[]> {
    return this.http.get(this.userUrl + "/" + idWallet)
      .map(res => res.json())
      .catch(this.handleErrorObservable);
  }


  // updateUserWithObservable(user:User): Observable<String> {
  //   const url = `${this.userUrl}` + "/update";
  //   let options = new RequestOptions({ headers: this.headers });
    
  //   return this.http.post(url, user, options)
  //               .map(res => res)
  //               .catch(this.handleErrorObservable);
  // }

  // suspendUserWithObservable(user:User): Observable<String> {
  //   const url = `${this.userUrl}` + "/suspend";
  //   let options = new RequestOptions({ headers: this.headers });
    
  //   return this.http.post(url, user, options)
  //               .map(res => res)
  //               .catch(this.handleErrorObservable);
  // }

  // getUsersObservable(): Observable<User[]> {
  //   return this.http.get(this.userUrl)
  //     .map(res => res.json())
  //     .catch(this.handleErrorObservable);
  // }

  // getUserByUIDObservable(uid:String): Observable<User> {
  //   return this.http.get(this.userUrl + "/" + uid)
  //     .map(res => res.json()[0])
  //     .catch(this.handleErrorObservable);
  // }

  // getVerifyUserByUIDObservable(uid:String): Observable<boolean> {
  //   return this.http.get(this.userUrl + "/verify/" + uid)
  //     .map(res => res.json())
  //     .catch(this.handleErrorObservable);
  // }


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
