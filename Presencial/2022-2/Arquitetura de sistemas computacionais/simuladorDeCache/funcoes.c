#ifndef FUNCOES_C
#define FUNCOES_C
#include<stdio.h>
#include<string.h>
#include<stdlib.h>
#include<time.h>

#include "prototipo.h"

char binario[8];
int tamanho, x,y,z;


void inicializaMemoriaPrincipal(){

     int cont=0;
          x=0, y=0,z;
          srand(time(NULL)); //GERADOR DE SEMENTES
          while(x < 32){
               while( y<4){
                    do{
                         z = rand()%255; //gera um valor aleatório entre 1 e 255
                    }while( z < 10 || z > 256);

               principal[x][y].conteudo = z;
               principal[x][y].contador = cont;
               cont++;
               y++;
               }
          x++;

          }
estatistica.num_acesso=0;
estatistica.num_acerto=0;
estatistica.num_faltas=0;
estatistica.num_leituras=0;
estatistica.num_escritas=0;
estatistica.num_acerto_escrita=0;
estatistica.num_acerto_leitura=0;
estatistica.num_faltas_escrita=0;
estatistica.num_faltas_leitura=0;

}

void renderizarMemoriaPrincipal(){
     int z = 12;
          x=0, y=0;
     
     while (x < 32){
          if (x <= 9){
               printf("\t BLOCO 0%d : ", x);
          }else{
               printf("\t BLOCO %d : ", x);
          }


          if(x==0){ //tratamento para endereço de memória
               printf("000 -> ");
          }
          if(x==1){
               printf("004 -> ");
          }
          if(x==2){
               printf("008 -> ");
          }


          
          if (x > 2 && x < 32){
               printf("0%d -> ", z);
               z = z+4;
          }

          y=0;
          printf("| ");
          while(y < 4){
               ltoa(principal[x][y].conteudo,binario,2);
               tamanho = strlen(binario);
               if(tamanho == 0){printf("00000000");}
               if(tamanho == 1){printf("0000000");}
               if(tamanho == 2){printf("000000");}
               if(tamanho == 3){printf("00000");}
               if(tamanho == 4){printf("0000");}
               if(tamanho == 5){printf("000");}
               if(tamanho == 6){printf("00");}
               if(tamanho == 7){printf("0");}

			printf("%s | ",binario);
			y++;
          }
          printf("\n");
          x++;    
     }
     
}



#endif