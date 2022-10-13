package heranca;

public class Revista extends MidiaFisica {
    
    public Revista(String dono) {
        super(dono);
        }

    private String manchete;
    private String editorial;
    
    public String getManchete() {
        return manchete;
    }
    public void setManchete(String manchete) {
        this.manchete = manchete;
    }
    public String getEditorial() {
        return editorial;
    }
    public void setEditorial(String editorial) {
        this.editorial = editorial;
    }

    @Override
	public String toString() {
		return super.toString() +
				"\nManchete: " + getManchete() + 
				"\nEditorial: " + getEditorial();
	}

    @Override
		public String retornarTipo() {
			return super.retornarTipo() + " Tipo Revista ";
		}
    @Override
    public void obrigarImplementaçãoClasseFilha() {
        // TODO Auto-generated method stub
        
    }

}
