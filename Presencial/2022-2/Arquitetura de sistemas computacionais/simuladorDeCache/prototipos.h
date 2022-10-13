#ifndef PROTOTIPOS_H
#define PROTOTIPOS_H

//prototipos das funções

void inicializa_memoria_principal();
void inicializar_memoria_cache();
void imprimi_memoria_principal();
void imprimi_memoria_cache();
void procura_endereco_mp(int end_inteiro);
void procura_endereco_cache(char endereco[7]);
void controle_cache(char char_rotulo[5],int conjunto,char endereco[7]);
void limpa_quadro(int aux2,int conjunto,char char_rotulo[5]);
void atualiza_memoria_mp(int temp,int dado,int ativo);
void limpa_buffer(int a);
void imprimir_buffer();
void inicializa_buffer();
void imprimi_informacao(int info,int conjunto,int x,char endereco[7]);


struct memoria_principal//estrutura da memoria principal
{
	int conteudo;
	int contador;
}principal[32][4];



struct cache//estrutura da memoria cache
{
       char rotulo_cache[5];
       int conteudo[4];
}quadro0[4],quadro1[4];


struct buffer//estrutura do buffer de escrita
{
       char rotulo_buffer[5];
       int conteudo[4]; 
       int contador;
       int ocupado;
}bloco_buffer[2];
  
struct estatistica //estrutura as estatisticas
{
	int numero_acessos; 
	int numero_acertos; 
	int numero_faltas; 
	int numero_leituras;
	int numero_escritas; 
	int numero_acertos_leitura; 
	int numero_acertos_escrita; 
	int numero_faltas_leitura; 
	int numero_faltas_escrita; 
}estatistica;


#endif
