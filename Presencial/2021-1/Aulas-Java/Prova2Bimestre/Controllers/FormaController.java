package Controllers;

import java.util.ArrayList;

import models.forma;
import models.circulo;
import models.Retangulo;
import models.triangulo;

public class FormaController {

    private static ArrayList<forma> formas = new ArrayList<forma>();
    private static ArrayList<circulo> circulo = new ArrayList<circulo>();
    private static ArrayList<Retangulo> retangulo = new ArrayList<Retangulo>();
    private static ArrayList<triangulo> triangulo = new ArrayList<triangulo>();

    public static void cadastrar(forma forma) {
        formas.add(forma);

        if (forma instanceof Retangulo) {
            retangulo.add((Retangulo) forma);
        }
        if (forma instanceof triangulo) {
            triangulo.add((triangulo) forma);
        }
        if (forma instanceof circulo) {
            circulo.add((circulo) forma);
        }
    }

    public static ArrayList<forma> listar() {
        return formas;
    }

    public static ArrayList<Retangulo> listarRetangulos() {
        return retangulo;
    }

    public static ArrayList<circulo> listarCirculos() {
        return circulo;
    }

    public static ArrayList<triangulo> listarTriangulos() {
		return triangulo;
	}
}
