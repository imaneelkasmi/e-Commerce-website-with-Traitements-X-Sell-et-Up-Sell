import { NgModule } from '@angular/core';
import { Routes, RouterModule } from '@angular/router';
import { HomeComponent } from './pages/home/home.component';
import { ProduitDetailsComponent } from './pages/produit-details/produit-details.component';
import { SearchComponent } from './pages/search/search.component';
import { PanierComponent } from './pages/panier/panier.component';
import { CategoryComponent } from './pages/category/category.component';
import { ChekoutComponent } from './pages/chekout/chekout.component';
import { ProfilComponent } from './pages/profil/profil.component';
import { LoginComponent } from './pages/login/login.component';
import { RegisterComponent } from './pages/register/register.component';
import { AddProduitComponent } from './pages/add-produit/add-produit.component';
import { AuthGuard } from './auth.guard';


const routes: Routes = [
  { path: '', component: CategoryComponent },
  { path: 'produit/:id', component: ProduitDetailsComponent },
  { path: 'search', component: SearchComponent },
  { path: 'panier', component: PanierComponent },
  { path: 'category/:id', component: CategoryComponent },
  { path: 'chekout', component: ChekoutComponent },
  { path: 'profil', component: ProfilComponent },
  { path: 'login', component: LoginComponent },
  { path: 'register', component: RegisterComponent },
  { path: 'add-produit', component: AddProduitComponent, canActivate:[AuthGuard]}
  
];

@NgModule({
  imports: [RouterModule.forRoot(routes)],
  exports: [RouterModule]
})
export class AppRoutingModule { }
