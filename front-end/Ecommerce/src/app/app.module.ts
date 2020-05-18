import { BrowserModule } from '@angular/platform-browser';
import { NgModule } from '@angular/core';
import { MatMenuModule} from '@angular/material/menu';


import { FormsModule,ReactiveFormsModule } from '@angular/forms';
import { HttpClientModule, HTTP_INTERCEPTORS } from '@angular/common/http';
import { AppRoutingModule } from './app-routing.module';
import { AppComponent } from './app.component';
import { BrowserAnimationsModule } from '@angular/platform-browser/animations';
import { HomeComponent } from './pages/home/home.component';
import { ProfilComponent } from './pages/profil/profil.component';
import { ChekoutComponent } from './pages/chekout/chekout.component';
import { CategoryComponent } from './pages/category/category.component';
import { PanierComponent } from './pages/panier/panier.component';
import { SearchComponent } from './pages/search/search.component';
import { ProduitDetailsComponent } from './pages/produit-details/produit-details.component';
import { RegisterComponent } from './pages/register/register.component';
import { LoginComponent } from './pages/login/login.component';
import { NavbarComponent } from './include/navbar/navbar.component';
import { FooterComponent } from './include/footer/footer.component';
import { BodyHomeComponent } from './include/body-home/body-home.component';
import { BodyCategoryComponent } from './include/body-category/body-category.component';
import { BodyRegisterComponent } from './include/body-register/body-register.component';
import { BodyProduitComponent } from './include/body-produit/body-produit.component';
import { TokenIterceptorServiceService } from './service/token-iterceptor-service.service';
import { AddProduitComponent } from './pages/add-produit/add-produit.component';
import { AddProduitBodyComponent } from './include/add-produit-body/add-produit-body.component';
import { SideBarCateComponent } from './include/side-bar-cate/side-bar-cate.component';
import { AuthGuard } from './auth.guard';
import { SideBarProfilComponent } from './include/side-bar-profil/side-bar-profil.component';
import { OrderProfilComponent } from './include/order-profil/order-profil.component';

@NgModule({
  declarations: [
    AppComponent,
    HomeComponent,
    ProfilComponent,
    ChekoutComponent,
    CategoryComponent,
    PanierComponent,
    SearchComponent,
    ProduitDetailsComponent,
    RegisterComponent,
    LoginComponent,
    NavbarComponent,
    FooterComponent,
    BodyHomeComponent,
    BodyCategoryComponent,
    BodyRegisterComponent,
    BodyProduitComponent,
    AddProduitComponent,
    AddProduitBodyComponent,
    SideBarCateComponent,
    SideBarProfilComponent,
    OrderProfilComponent
  ],
  imports: [
    BrowserModule,
    AppRoutingModule,
    BrowserAnimationsModule,
    MatMenuModule,
    HttpClientModule,
    ReactiveFormsModule,
    FormsModule
    
    
  ],
  providers: [AuthGuard,
    {
      provide: HTTP_INTERCEPTORS,
      useClass:  TokenIterceptorServiceService,
      multi: true
    }
  ],
  bootstrap: [AppComponent]
})
export class AppModule { }
