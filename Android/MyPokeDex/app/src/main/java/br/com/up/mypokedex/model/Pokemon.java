package br.com.up.mypokedex.model;

import java.io.Serializable;
import java.util.ArrayList;

//Serialização serve para Organizar os dados de uma forma legível
public class Pokemon implements Serializable {

    private int id;
    private String name;
    private String image;
    private String genre;
    private ArrayList<String> moves;
    private ArrayList<String> types;
    private ArrayList<String> abilities;
    private ArrayList<String> Stats;


    public Pokemon(int id, String name, String image, String genre) {
        this.id = id;
        this.name = name;
        this.image = image;
        this.genre = genre;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getImage() {
        return image;
    }

    public void setImage(String image) {
        this.image = image;
    }

    public ArrayList<String> getMoves() {
        return moves;
    }

    public void setMoves(ArrayList<String> moves) {
        this.moves = moves;
    }

    public ArrayList<String> getTypes() {
        return types;
    }

    public void setTypes(ArrayList<String> types) {
        this.types = types;
    }

    public String getGenre() {  return genre; }

    public void setGenre(String genre) { this.genre = genre; }

    public ArrayList<String> getAbilities() { return abilities;  }

    public void setAbilities(ArrayList<String> abilities) { this.abilities = abilities; }

    public ArrayList<String> getStats() { return Stats; }

    public void setStats(ArrayList<String> stats) { Stats = stats; }
}
