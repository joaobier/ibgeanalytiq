package Services;

import Model.City;
import Utils.Reader;

import java.io.File;
import java.util.ArrayList;

public class Lista {

    private Reader leitor;
    protected ArrayList<City> cidades;
    private String filePathSaida = "C:\\Users\\joaov\\OneDrive\\Área de Trabalho\\Out\\out.csv"; //path do arquivo de saída
    File fileOut = new File(filePathSaida); //declara o arquivo para verificar se ele existe
    public Lista(){
        preencherLista();
    }

    public void preencherLista(){
        this.leitor = new Reader();
        if(fileOut.length() > 243){
            System.out.println("Tamanho do arquivo é de: " + fileOut.length());
            this.cidades = leitor.lerArquivoSaida();
        }else{
            System.out.println("O arquivo tem só uma linha, que é o cabeçalho, vou ler o arquivo de entrada padrão");
            this.cidades =leitor.lerArquivoEntrada();
        }
    }

    public void listar(){
        //this.cidades = leitor.ler();
        for (int i = 0; i < cidades.size(); i++){
            System.out.println(cidades.get(i).toCSV());
        }
    }

    public void listarComNumero() {
        //this.cidades = leitor.ler();
        for (int i = 0; i < cidades.size(); i++){
            System.out.println(i+": " + cidades.get(i).toCSV());
        }
    }


    public void listarComoCSV(){
        //this.cidades = leitor.ler();
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

        this.cidades = this.leitor.lerArquivoSaida();

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