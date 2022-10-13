import { Component, OnInit } from '@angular/core';
import {HttpClient} from '@angular/common/http';
import { Pessoa } from 'src/app/models/Pessoa';



@Component({
  selector: 'app-listar',
  templateUrl: './listar.component.html',
  styleUrls: ['./listar.component.css']
})
export class ListarComponent implements OnInit {
  
  pessoas: Pessoa[] = [];

  constructor(http: HttpClient) {
    this.pessoas = [];
    http.get<Pessoa[]>("http://localhost:3000/listar/pessoas").subscribe((lista) => {
      this.pessoas = lista
      console.log(this.pessoas)
    });
  }

  ngOnInit(): void {

  }

}
