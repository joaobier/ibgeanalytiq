package Utils;

import Model.City;

import java.util.ArrayList;

public class Lista {

    Reader leitor;
    ArrayList<City> cidades;

    public Lista(){
        this.leitor = new Reader();
        this.cidades = leitor.ler();
    }

    public void listar(){
        this.cidades = leitor.ler();
        for(City c : cidades) {
            System.out.println(c.toString());
        }
    }

    public void listarComoCSV(){
        this.cidades = leitor.ler();
        for(City c : cidades) {
            System.out.println(c.toCSV());
        }
    }

}