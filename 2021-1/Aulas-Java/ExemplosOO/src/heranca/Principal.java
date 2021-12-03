package heranca;

import java.util.ArrayList;

//rever a aula gravada a partir de 1:50 (CONCEITO IMPORTANTE)
public class Principal {

	public static void main(String[] args) {
		
		Livro livro = new Livro("João da silva pinto");
		
		livro.setId(1);
		livro.setTitulo("Orientação a Objetos");
		livro.setEdicao(1);
		livro.setPaginas(450);
		livro.setEditora("Deconto");
		livro.setAutor("José da Silva");
		livro.setIsbn("1231-43131-421\n\n");
		
		System.out.println(livro.retornarTipo());
		System.out.println("\n" + livro);

		System.out.println("=====================================================================\n\n ");

		Revista revista = new Revista("Abobado da silva neto");

		revista.setId(6);
		revista.setTitulo("Java Lang");
		revista.setEdicao(6);
		revista.setPaginas(132);
		revista.setEditora("Cezar S.");
		revista.setManchete("Nova linguagem de programação entra no mercado");
		revista.setEditorial("ISTOÉ");

		// System.out.println(revista.retornarTipo());
		System.out.println("\n" + revista);

		int idade = 12312312;

		ArrayList<Midia> midias = new ArrayList<Midia>();
		midias.add(livro);
		midias.add(revista);

		livro = new Livro ("");
		revista = new Revista("");

		for (Midia midia : midias){
			System.out.println("\n\n=====================================================================\n\n ");
			System.out.println(midia.retornarTipo());
		}
	}
	// 2:14 videoaula

}
