package heranca;

public abstract class MidiaFisica extends Midia {

	public MidiaFisica(String dono) {
		super(dono);
	}

	private int paginas;
	private int edicao;
	private String editora;

	public String getEditora() {
		return editora;
	}

	public void setEditora(String editora) {
		this.editora = editora;
	}

	public int getPaginas() {
		return paginas;
	}

	public void setPaginas(int paginas) {
		this.paginas = paginas;
	}

	public int getEdicao() {
		return edicao;
	}

	public void setEdicao(int edicao) {
		this.edicao = edicao;
	}

	@Override
	public String toString() {
		return super.toString() + "\nEditora: " + getEditora() + "\nPáginas: " + getPaginas() + "\nEdição: "
				+ getEdicao();
	}

	@Override
	public String retornarTipo() {
		return super.retornarTipo() + "Mídia Física ->";
	}

}
