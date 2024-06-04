package Utils;

import Model.City;

import java.util.ArrayList;

public class Lista {

    Reader leitor;
    ArrayList<City> cidades;

    public Lista(){
        this.leitor = new Reader();
        this.cidades = leitor.getListaCidades();
    }

    public void listar(){
        for(City c : cidades) {
            System.out.println(c.toString());
        }
    }

}
