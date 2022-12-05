import { Injectable } from '@angular/core';
import { HttpClient } from '@angular/common/http';
import { Observable,Observer } from 'rxjs';
import { Tablet } from './tablet';

@Injectable({
  providedIn: 'root'
})
export class TabletService {

  baseUrl="http://localhost:8080/tablet"
  constructor(private httpClient:HttpClient) { }
  tabletUser(tablet:Tablet):Observable<object>{
    console.log(tablet);
    return this.httpClient.post(`${this.baseUrl}`,tablet);
}
}

