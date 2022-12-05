import { Component, OnInit } from '@angular/core';
import{User} from '../user';
import { RegisterUserService } from '../register-user.service';
@Component({
  selector: 'app-register-user',
  templateUrl: './register-user.component.html',
  styleUrls: ['./register-user.component.css']
})
export class RegisterUserComponent implements OnInit {

  user:User=new User();
  constructor(private registerservice:RegisterUserService) { }

  ngOnInit(): void {
  }
userRegister(){
  console.log(this.user);
  this.registerservice.registerUser(this.user).subscribe(data=>
  {
    alert("successfully User is registered ")
  },error => alert("sorry user not register"));
  
  
  
  }  
  
    
}

