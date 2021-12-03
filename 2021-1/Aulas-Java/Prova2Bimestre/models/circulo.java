package models;

public class circulo extends forma {
    
    double raio;

    public double getRaio() {
        return raio;
    }

    public void setRaio(double raio) {
        this.raio = raio;
    }

    public Double CalcularArea() {
        return Math.PI * Math.pow(raio, 2);
    }
}
