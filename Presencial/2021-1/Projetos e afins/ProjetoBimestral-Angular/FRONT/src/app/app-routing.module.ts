import { Component, NgModule } from '@angular/core';
import { RouterModule, Routes } from '@angular/router';
import { CadastroComponent } from './components/views/cadastro/cadastro.component';
import { ListarComponent } from './components/views/listar/listar.component';

const routes: Routes = [

{
  path:'',
  component:ListarComponent
},
{
  path: 'pessoas/cadastrar',
  component: CadastroComponent
}



];

@NgModule({
  imports: [RouterModule.forRoot(routes)],
  exports: [RouterModule]
})
export class AppRoutingModule { }
