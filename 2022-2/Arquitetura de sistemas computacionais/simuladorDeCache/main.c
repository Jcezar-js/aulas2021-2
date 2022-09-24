#include<stdio.h>
#include<stdlib.h>
#include"funcoes.c"


int main(){
     int op, op2, tmp, dado, aux,tam;
     char endereco[7];

     inicializaMemoriaPrincipal(); //chamando função

     do{
          system("cls");
          printf("\n SIMULADOR DE MEMORIA CACHE\n\n\n");

           //interface
          printf("\n\n\n1- MEMORIA PRINCIPAL");
          printf("\n2- LER");
          printf("\n3- ESCREVER");
          printf("\n4- ESTATISTICAS");
          printf("\n5- SAIR \n\n");
          scanf("%d", &op);
          fflush(stdin);


          if ((op < 1) || (op > 5)){ //validando entradas da interface
               printf("\n\n\n Opcao invalida digite um valor entre 1 e 5! \n\n\n");
               system("pause");
               system("cls"); //limpa terminal
               continue;
          }

          switch (op)
          {
          case 1:{
               system("cls");
               printf("----- MEMORIA PRINCIPAL ----- \n\n");
               //função imprimir memoria principal
               renderizarMemoriaPrincipal();
               system("pause");
               system("cls");
               break;
          }
               
               
          
          default:
               break;
          }

     }while(op != 5);{

     }
}