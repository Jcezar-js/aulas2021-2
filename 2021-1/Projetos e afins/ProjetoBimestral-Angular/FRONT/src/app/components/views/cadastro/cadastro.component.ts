import { Component, OnInit } from '@angular/core';
import {HttpClient} from '@angular/common/http';
import { Pessoa } from 'src/app/models/Pessoa';


@Component({
  selector: 'app-cadastro',
  templateUrl: './cadastro.component.html',
  styleUrls: ['./cadastro.component.css']
})
export class CadastroComponent implements OnInit {

  constructor(http: HttpClient) {
    
  }

  ngOnInit(): void {
  }

}
