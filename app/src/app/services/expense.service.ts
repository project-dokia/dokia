import { Injectable } from '@angular/core';
import { Headers, Http, Response, RequestOptions } from '@angular/http';
import {Observable} from 'rxjs/Observable';
// import { Observable } from 'rxjs';
import 'rxjs/add/operator/map';
import 'rxjs/add/operator/catch';
import 'rxjs/add/operator/toPromise';

import { environment } from '../../environments/environment';

import { Expense } from '../models/expense';

@Injectable()
export class ExpenseService {
  
  urlBluepages = "https://faces.tap.ibm.com/api/find/?q=uid:";

  constructor(private http: Http) {}
  
  private headers = new Headers({ 'Content-Type': 'application/json' });
  private expenseUrl = environment.apiUrl + '/expense';

  addExpenseWithObservable(expense:Expense): Observable<String> {
    const url = `${this.expenseUrl}`;
    let options = new RequestOptions({ headers: this.headers });
    return this.http.post(url, expense, options)
                .map(res => res)
                .catch(this.handleErrorObservable);
  }

  getExpenseObservable(): Observable<Expense[]> {
    return this.http.get(this.expenseUrl)
      .map(res => res.json())
      .catch(this.handleErrorObservable);
  }

  getExpensesByIDWalletObservable(idExpense:String): Observable<Expense[]> {
    return this.http.get(this.expenseUrl + "/" + idExpense)
      .map(res => res.json())
      .catch(this.handleErrorObservable);
  }

  getExpensesByIDObservable(_id:String): Observable<Expense> {
    return this.http.get(this.expenseUrl + "/id/" + _id)
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
