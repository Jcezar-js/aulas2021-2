package heranca;

public abstract class MidiaDigital extends Midia {
    
    public MidiaDigital(String dono) {
        super(dono);
    }

    private int duracao;
    private int estudio;


    public int getDuracao() {
        return duracao;
    }
    public void setDuracao(int duracao) {
        this.duracao = duracao;
    }
    public int getEstudio() {
        return estudio;
    }
    public void setEstudio(int estudio) {
        this.estudio = estudio;
    }

    @Override
	public String toString() {
		return super.toString() +
				"\nDuração: " + getDuracao() + 
				"\nEstúdio: " + getEstudio();
	}
    
}
