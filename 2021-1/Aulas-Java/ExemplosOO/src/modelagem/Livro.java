package modelagem;
import java.util.Date;

public class Livro {
		
	//Construtor da classe Livro
	public Livro() {
		setCriadoEm(new Date());
	}
	
	public Livro(String isbn) {
		setCriadoEm(new Date());
//		setIsbn(isbn);
		this.isbn = isbn;
	}

	//Atributos
	private String nome;
	private String edicao;
	private int ano;
	private int paginas;
	private String autor;
	private String isbn;
	private String genero;
	private Date criadoEm;
	
	//Getters and Setters
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	public String getEdicao() {
		return edicao;
	}
	public void setEdicao(String edicao) {
		this.edicao = edicao;
	}
	public int getAno() {
		return ano;
	}
	public void setAno(int ano) {
		this.ano = ano;
	}
	public int getPaginas() {
		return paginas;
	}
	public void setPaginas(int paginas) {
		this.paginas = paginas;
	}
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
		System.out.println("Guardamos o ISBN");
		this.isbn = isbn;
	}
	public String getGenero() {
		return genero;
	}
	public void setGenero(String genero) {
		this.genero = genero;
	}
	
	public Date getCriadoEm() {
		return criadoEm;
	}
	public void setCriadoEm(Date criadoEm) {
		this.criadoEm = criadoEm;
	}
	
	@Override
	public boolean equals(Object obj) {
		Livro outroLivro = (Livro) obj;
		return getAno() == outroLivro.getAno() &&  getNome() == outroLivro.getNome();
	}
	
	@Override
	public String toString() {
		return "Nome: " + getNome() + " | Ano: " + getAno() + " | Data: " + getCriadoEm() + " | ISBN: " 
				+ getIsbn();
	}
	
}












