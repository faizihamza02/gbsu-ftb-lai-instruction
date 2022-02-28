import { HttpClient } from '@angular/common/http';
import { Injectable } from '@angular/core';
import { Result } from './model/result';

@Injectable({
  providedIn: 'root'
})
export class GbsuFtbLaiService {
  constructor(private _httpClient: HttpClient) { }

  convertNumber(number:number){
    return this._httpClient.get<Result>("http://localhost:8080//gbsu-ftb-lai/"+number);
  }

}
