package models;

public class triangulo extends forma {

    

    double base;
    double altura;

    public double getBase() {
        return base;
    }

    public void setBase(double base) {
        this.base = base;
    }

    public double getAltura() {
        return altura;
    }

    public void setAltura(double altura) {
        this.altura = altura;
    }

    public Double CalcularArea() {
        return getAltura() * getBase();
    }

}
