using System;
using System.Collections.Generic;

namespace exemplo_04
{
    class Program
    {
        static void Main(string[] args)
        {
            
            /************************************************************************************
              AULA: Programação Básica C#

              1. Variáveis var, int, short, long, decimal, double e bool;
              2. Operadores de atribuição, aritméticos, relacionais, lógicos e unários;
              3. Estruturas de decisão if/else, ternárias e switch;
              4. Estruturas de repetição while, do/while, for, foreach;
              5. Arrays, List e Collections.

          ***********************************************************************************/

          // 1. Variáveis int, short, long, decimal, double e bool;
          // 2. Operadores de atribuição, aritméticos, relacionais, lógicos e unários;

          var a = 10;
          int b = 5;
          //const int c = 1;
          bool c = true;
          Console.WriteLine(a);
          Console.WriteLine("A + B: " + (a + b));
          Console.WriteLine("A - B: " + (a - b));
          Console.WriteLine("A * B: " + (a * b));
          Console.WriteLine("A / B: " + (a / b));
          Console.WriteLine("A % B: " + (a % b));

          // operadores aritméticos de atribuição (=, *=, /=, +=, -=):

          var e = 10;
          e += a;
          Console.WriteLine("e += a: " + e);
          e -= a;
          Console.WriteLine("e -= a: " + e);
          e *= a;
          Console.WriteLine("e *= a: " + e);
          e /= a;
          Console.WriteLine("e /= a: " + e);

          // operadores relacionais (==, !=, <, >, <=, >=) e lógicos (!, &&, ||) e unários (++, --):

          Console.WriteLine("A == B: "+ (a == b));
          Console.WriteLine("A != B: "+ (a != b));
          Console.WriteLine("A < B: "+ (a < b));
          Console.WriteLine("A > B: "+ (a > b));
          Console.WriteLine("A <= B: "+ (a <= b));
          Console.WriteLine("A >= B: "+ (a >= b));

          c = false;
          Console.WriteLine("A é igual B e C é verdadeiro: "+ (a == b && c));
          Console.WriteLine("A é igual B ou C é verdadeiro: "+ (a == b || !c));

          a = 10;
          b = 10;
          Console.WriteLine("A é igual B? " + (a++ == b));
          Console.WriteLine(a);
          Console.WriteLine(b);
          Console.WriteLine("A é igual B? " + (--a == ++b));
          Console.WriteLine(a);
          Console.WriteLine(b);

          // (VARIÁVEIS) + (OPERADORES) + (ESTRUTURAS)
          // Estruturas de decisão if/else, ternárias e switch:

          a = 10;
          b = 5;
          if (a == b){
            Console.WriteLine("A é igual a B!");
          } else {
            Console.WriteLine("A é diferente B!");
          }

          var mensagem = a != b ? "A é diferente B!" : "A é igual a B!"; 
          Console.WriteLine(mensagem);

          // 4. Estruturas de repetição while, do/while, for, foreach;
          // 5. Arrays, List e Collections.
          //using System;
          //using System.Collections.Generic;

          var names = new List<string> { "<name>", "Ana", "Felipe" };
          foreach (var name in names)
          {
              Console.WriteLine($"Hello {name.ToUpper()}!");
          }

          int[] dias = new int[5] { 2, 3, 4, 5, 6 };
          switch (dias[9]) {
            case 2:
                Console.WriteLine("Segunda-feira!");
              break;
            case 3:
                Console.WriteLine("Terça-feira!");
              break;
            case 4:
                Console.WriteLine("Quarta-feira!");
              break;    
            case 5:
                Console.WriteLine("Quinta-feira!");
              break;  
            case 6:
                Console.WriteLine("Sexta-feira!");
              break;    
            default:
                Console.WriteLine("É final de semana!");
              break;
          }

          bool executar = true;
          string[] nomes = new string[]{"João", "Pedro", "Paulo", "Tiago", "Ana", "Maria"};

          var contador = 0;
          Console.WriteLine("\nRepetição utilizando while:");
          while(contador < nomes.Length && executar){
            Console.WriteLine(nomes[contador]);
            contador++;
          }

          contador = 0;
          Console.WriteLine("\nRepetição utilizando do/while:");
          do {
            Console.WriteLine(nomes[contador]);
            contador++;
          } while(contador < nomes.Length && executar);


          Console.WriteLine("\nRepetição utilizando for convencional:");
          for(var i = 0; i < nomes.Length; i++){
            Console.WriteLine(nomes[i]);
          }

          Console.WriteLine("\nRepetição utilizando foreach");
          foreach(string nome in nomes){
            Console.WriteLine(nome);
          }
        }
    }
}