package heranca;

public class Livro extends MidiaFisica{


	public Livro(String dono) {
		//passa o paramêtro para a classe pai
		super(dono);
	}

	private String autor;
	private String isbn;

	public String getAutor() {
		return autor;
	}
	public void setAutor(String autor) {
		this.autor = autor;
	}
	public String getIsbn() {
		return isbn;
	}
	public void setIsbn(String isbn) {
		this.isbn = isbn;
	}
	@Override
	public String toString() {
		return super.toString() +
				"\nAutor: " + getAutor() + 
				"\nISBN: " + getIsbn();
	}
	
	@Override
		public String retornarTipo() {
			return super.retornarTipo() + " Tipo Livro";
		}

	@Override
	public void obrigarImplementaçãoClasseFilha() {
		
	}
}









