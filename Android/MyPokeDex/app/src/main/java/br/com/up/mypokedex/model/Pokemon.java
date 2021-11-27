package br.com.up.mypokedex.model;

import org.json.JSONArray;

import java.io.Serializable;
import java.util.ArrayList;

//Serialização serve para Organizar os dados de uma forma legível
public class Pokemon implements Serializable {

    private int id;
    private String name;
    private String image;

    public Pokemon(int id, String name, String image) {
        this.id = id;
        this.name = name;
        this.image = image;
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
}
