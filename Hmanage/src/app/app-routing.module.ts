import { NgModule } from '@angular/core';
import { RouterModule, Routes } from '@angular/router';
import { CartComponent } from './cart/cart.component';
import { LoginComponent } from './login/login.component';
import { ProductsComponent } from './products/products.component';
import{RegisterUserComponent} from './register-user/register-user.component';
import { TabletComponent } from './tablet/tablet.component';


const routes: Routes = [
  {path:'register-user',component:RegisterUserComponent},
  {path:'products',component:ProductsComponent},
  {path:'cart',component:CartComponent},
  {path:'login',component:LoginComponent},
  {path:'tablet',component:TabletComponent}
]

@NgModule({
  imports: [RouterModule.forRoot(routes)],
  exports: [RouterModule]
})
export class AppRoutingModule { }
