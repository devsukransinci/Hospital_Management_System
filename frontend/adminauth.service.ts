import { Injectable } from '@angular/core';

@Injectable({
  providedIn: 'root'
})
export class AdminauthService {

  constructor() { }

  authenticate(username:string,password:string){
    if(username=="admin"&&password=="1234" ){
      sessionStorage.setItem('username',username);
      return true;
  
    } else {
      return false;
    }
  }
  
  isUserLoggedIn(){
    console.log("user login ho gaya hai")
   let user= sessionStorage.getItem('username2');
   return !(user==null)
  }

  logout(){
    console.log("logout user ho gaye")
    sessionStorage.removeItem('username2');
  }
}
