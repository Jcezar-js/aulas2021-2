#include <stdio.h>
#include <string.h>
#include <stdlib.h>
#define TAM 15

/* run this program using the console pauser or add your own getch, system("pause") or input loop */

// int main(void) {
	
// 	int a, b; 
	
// 	printf("Digite o valor de A: ");
// 	scanf("%d", &a);
// 	printf("Digite o valor de B: ");
// 	scanf("%d", &b);
	
// 	double media;
// 	media = (a+b)/2.0;
	
// 	printf("A média de %d e %d é %f", a, b, media);
	
// 	return EXIT_SUCCESS;
// }

// EX2
// int main(void){
	
// 	char nome[61];
// 	printf("Digite seu Nome:");
// 	gets(nome);
	
// 	printf("O nome armazenado foi: %s \n", nome);

// 	size_t size = strlen(nome);
	
// 	int i;
	
// 	for(i = 0; i <size / 2; i++){
// 		char tmp = nome[i]; //Armazenando carácter inicial
// 		nome[i] = nome[size - i - 1]; //trocando carácter da ponta oposta
// 		nome[size -i -1] = tmp; //Armazena o carácter inicial no nome
// 	}
// 	printf("O nome invertido é: %s", nome);
	
// 	return 0;
// }


// int main(){
// 	float vet[TAM];
// 	int opcao, i;	
	
// 	for (i = 0; i < TAM; i++){
// 			printf("Digite aqui um número: ");
// 			scanf("%f", &vet[i]);
// 		if (vet[i] == 0){
// 			printf("\n O numero não é valido \n");
// 			return 0;
// 		}
// 	}	

// 	do{
// 		printf("\n0-Finalizar\n1-Imprimir vetor \n");
// 		scanf("%d", &opcao);
		
// 		switch(opcao)
// 		{
// 		case 0:
// 			printf("Finalizando. \n");
// 			break;
// 		case 1:
// 			for(i=14; i >= 0; i--){
// 				printf("%.2f", vet[i]);
// 			}
// 			printf("\n");
// 			break;
// 		default:
// 			printf("Opcao invalida! \n");	 
// 		}
// 	}while(opcao != 0);
	
// 	return 0;
// }

int main() {
   //  char texto[5];

   //  printf("Digite alguma coisa: \n");
   //  scanf("%s" + texto[5]);

   // texto[5] &(1<<5);


int N = 1;
    int i = 56;

    // Verificar se o bit i do nÃºmero N estÃ¡ ativo:
    printf("O Bit %d estÃ¡ em %d\n", i, N & (1 << i) ? 1 : 0);

   // texto[0] |= (0 << 0);
   // texto[1] |= (0 << 1);
   // texto[2] |= (0 << 2);
   // texto[3] |= (0 << 3);
   // texto[4] |= (0 << 4);


   // printf("%s" + texto[5]);
}