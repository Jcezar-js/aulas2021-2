using System;
// import list
using System.Collections.Generic;

class Pessoa {
    
    private string nome;
    // padrão c#
    public string Cpf { get; set; }
    private string sexo;
    private string telefone;

    public List<Endereco> Enderecos { get; set; }

// Padrão java:
    public string getNome(){
        return nome;
    }

    
    public void setNome(string nome){
        this.nome = nome;
    }


}