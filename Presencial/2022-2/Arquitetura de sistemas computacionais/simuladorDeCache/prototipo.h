#ifndef PROTOTIPOS_H
#define PROTOTIPO_H
//prototipos de funcoes

void inicializaMemoriaPrincipal();
void renderizarMemoriaPrincipal();


struct memoriaPrincipal
{
	int conteudo;
	int contador;

}principal [32] [4];


//estastísticas
struct estatistica{
	
	int num_acesso;
	int num_acerto;
	int num_faltas;
	int num_leituras;
	int num_escritas;
	int num_acerto_leitura;
	int num_acerto_escrita;
	int num_faltas_leitura;
	int num_faltas_escrita;
}estatistica;

#endif