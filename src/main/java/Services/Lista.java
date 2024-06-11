package Services;

import Model.City;
import Utils.Reader;
import Utils.Writer;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.util.ArrayList;

public class Lista {

    private Reader leitor = new Reader();
    protected ArrayList<City> cidades;
    //private String filePathSaida = "C:\\Users\\joaov\\OneDrive\\Área de Trabalho\\Out\\out.csv"; //path do arquivo de saída
    private String filePathSaida ="C:\\Users\\Aluno\\Desktop\\Out\\out.csv";
    File fileOut = new File(filePathSaida); //declara o arquivo para verificar se ele existe

    public Lista(){

        preencherLista();

    }

    public void preencherLista(){
        //this.cidades = this.leitor.lerArquivo();

        if(fileOut.exists() && fileOut.length() > 0){
            System.out.println("O arquivo de saída já existe, irei ler");
            this.cidades = leitor.lerArquivoSaida(); //lê o que tem no arquivo de saída
        }else{
            System.out.println("O arquivo de saida não existe, ele será criado!");
            this.cidades =leitor.lerArquivoEntrada(); //lê o que tem no arquivo de entrada

            //aproveita e já cria o arquivo de saida
            Writer writer = new Writer();
            writer.writeOutFile();
            writer.atualizarTodoCSV(this.cidades); //já preenche o arquivo de saída
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

    public void quantasCidades() {
        System.out.println("Há " + cidades.size() + " cidades registradas");
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