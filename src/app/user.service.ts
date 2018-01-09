import { Injectable } from '@angular/core';

import { Headers, Http } from '@angular/http';
import 'rxjs/add/operator/toPromise';

import { User } from './user';

@Injectable()
export class UserService {

  private userUrl = '/rest/user/hello?name=1';
    //private userUrl = '//localhost:8081/rest/user/hello?name=1';
    //private userUrl = '//192.168.1.34:8080/spa48/rest/user/hello?name=1';



    constructor(private http: Http) { }

    // Get all Users
    getHelloMsg(): Promise<User[]> {
    return this.http.get(this.userUrl)
      .toPromise()
      .then(response => response.json() as User[])
      .catch(this.handleError);
  }

  private handleError(error: any): Promise<any> {
    return Promise.reject(error.message || error);
  }
}
