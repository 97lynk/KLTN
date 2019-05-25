import {NgModule} from '@angular/core';
import {Routes, RouterModule} from '@angular/router';
import {HomePageComponent} from './home-page/home-page.component';
import {CreatePostComponent} from './create-post/create-post.component';
import {DetailPostComponent} from './detail-post/detail-post.component';
import {MotelPageComponent} from './motel-page/motel-page.component';
import {HousePageComponent} from './house-page/house-page.component';
import {SearchPageComponent} from './search-page/search-page.component';
import {UpdatePostComponent} from './update-post/update-post.component';
import {UserPageComponent} from './user-page/user-page.component';
import {LogoutComponent} from './logout/logout.component';
import {AuthGuard} from './auth/auth-guard.service';

const routes: Routes = [
  {
    path: 'create-post',
    canActivate: [AuthGuard], // here we tell Angular to check the access with our AuthGuard
    component: CreatePostComponent
  },
  {path: 'user', component: UserPageComponent},
  {path: 'update', component: UpdatePostComponent},
  {path: 'result', component: SearchPageComponent},
  {path: 'house', component: HousePageComponent},
  {path: 'motel', component: MotelPageComponent},
  {path: 'post', component: DetailPostComponent},
  {path: '', redirectTo: '/home', pathMatch: 'full'},
  {path: 'home', component: HomePageComponent},
  {path: 'logout', component: LogoutComponent}
];

@NgModule({
  imports: [RouterModule.forRoot(routes)],
  exports: [RouterModule]
})
export class AppRoutingModule {
}
