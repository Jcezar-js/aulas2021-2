using System;
using models;

namespace exemploEF_aula04
{
    class Program
    {
        static void Main(string[] args)
        {
            ExemploContext ctx = new ExemploContext();
            var p = new Pessoa();
            p.Nome = "João";
            ctx.Pessoas.Add(p);

            ctx.SaveChanges();
            Console.WriteLine("Registro gravado com sucesso!");

            //mostra as pessoas registradas no bd
            var pessoas = ctx.Pessoas;
            foreach (var pessoa in pessoas)
            {
                Console.WriteLine($"Nome: [pessoa.Nome]");
            }
        }
    }
}
