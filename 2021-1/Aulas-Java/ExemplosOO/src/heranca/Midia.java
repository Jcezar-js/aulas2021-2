package heranca;

import java.util.Date;

public abstract class Midia {
	
	public Midia(String dono) {
		System.out.println("Dono: " + dono);
		setCriadoEm(new Date());
	}
	
	private int id;
	private String titulo;
	private Date criadoEm;
	
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getTitulo() {
		return titulo;
	}
	public void setTitulo(String titulo) {
		this.titulo = titulo;
	}
	public Date getCriadoEm() {
		return criadoEm;
	}
	public void setCriadoEm(Date criadoEm) {
		this.criadoEm = criadoEm;
	}
	
	@Override
	public String toString() {
		return "Id: " + getId() + 
				"\nTítulo: " + getTitulo() + 
				"\nCriado em: " + getCriadoEm();
	}

	public String retornarTipo() {
		return "Tipo Mídia -> ";
	}
	
	public abstract void obrigarImplementaçãoClasseFilha();

}









