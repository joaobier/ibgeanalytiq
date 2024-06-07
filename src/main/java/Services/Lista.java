package Services;

import Model.City;
import Utils.Reader;

import java.util.ArrayList;

public class Lista {

    private Reader leitor;
    protected ArrayList<City> cidades;

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

    public ArrayList<City> getCidades() {
        return cidades;
    }

    public void setCidades(ArrayList<City> array){
        this.cidades = array;
    }
    
    public void atualizarLista(){
        this.cidades = this.leitor.ler();
    }

    
    public boolean removeCity(City cidade){
        cidades.remove(cidade);
        return true;
    }
    
    public boolean AddCidade(City cidade){
        this.cidades.add(cidade);
        return true;
    }
}