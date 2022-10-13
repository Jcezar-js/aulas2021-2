package models;

public class Retangulo extends forma {

    double largura;
    double altura;

    public double getLargura() {
        return largura;
    }
    public void setLargura(double largura) {
        this.largura = largura;
    }
    public double getAltura() {
        return altura;
    }
    public void setAltura(double altura) {
        this.altura = altura;
    }
    
    public Double CalcularArea() {
        return getAltura() * getLargura();
    }
    
}
