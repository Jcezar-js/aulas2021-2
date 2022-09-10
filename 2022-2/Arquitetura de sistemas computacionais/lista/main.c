#include <stdio.h>
#include <string.h>
#include <stdlib.h>
#define MAX 10

/* run this program using the console pauser or add your own getch, system("pause") or input loop */

//int main(void) {
//	
//	int a, b; 
//	
//	printf("Digite o valor de A: ");
//	scanf("%d", &a);
//	printf("Digite o valor de B: ");
//	scanf("%d", &b);
//	
//	double media;
//	media = (a+b)/2.0;
//	
//	printf("A média de %d e %d é %f", a, b, media);
//	
//	return EXIT_SUCCESS;
//}

//EX2
//int main(void){
//	
//	char nome[61];
//	printf("Digite seu Nome:");
//	gets(nome);
//	
//	printf("O nome armazenado foi: %s \n", nome);
//
//	size_t size = strlen(nome);
//	
//	int i;
//	
//	for(i = 0; i <size / 2; i++){
//		char tmp = nome[i]; //Armazenando carácter inicial
//		nome[i] = nome[size - i - 1]; //trocando carácter da ponta oposta
//		nome[size -i -1] = tmp; //Armazena o carácter inicial no nome
//	}
//	printf("O nome invertido é: %s", nome);
//	
//	return 0;
//}



//EX03
int imprimirVetor(int num[], int tam){
	int i;
	for(i=0; i < tam /2 ; i++)
		num tmp = num[i]; 
		num [i] = num [tam -i -1];
		num [tam -i -1] = tmp;
		printf("%d \n", num[i]);
}
	
	
	
	return 0;
}
