package Services;

import Model.City;
import Utils.Reader;
import Utils.Writer;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;

public class Lista {

    private Reader leitor = new Reader();
    protected ArrayList<City> cidades;
    //private String filePathSaida = "C:\\Users\\joaov\\OneDrive\\Área de Trabalho\\Out\\out.csv"; //path do arquivo de saída
    private String filePathSaida;
    File fileOut; //declara o arquivo para verificar se ele existe

    public Lista(){ 
        this.filePathSaida ="C:\\Projeto Integrador\\Out\\01.ProjetoIntegrador_BaseMunicipios_Out.csv";
        fileOut = new File(filePathSaida);
        //sizeList();
        //System.out.println("FILEOUT ESTÁ VERIFICANDO O LOCAL:" + fileOut.getAbsolutePath()+ " E RETORNANDO UM: " + fileOut.exists());
        preencherLista();

    }

    public void preencherLista(){
        //this.cidades = this.leitor.lerArquivo();
        try {
            if (this.fileOut.exists()) {
                System.out.println("ESTOU LENDO O  OUT");
                //();
                this.cidades = leitor.lerArquivoSaida();
                //sizeList();// lê o que tem no arquivo de saída
            } else {
                
                System.out.println("ESTOU LENDO A ENTRADA");
                //();
                this.cidades = leitor.lerArquivoEntrada(); // lê o que tem no arquivo de entrada
                //sizeList();
                // Aproveita e já cria o arquivo de saída
                Writer writer = new Writer();
                writer.atualizarTodoCSV(this.cidades);
                //sizeList();// já preenche o arquivo de saída
            }
        } catch (Exception e) {
            System.err.println("Erro ao processar arquivos: " + e.getMessage());
            e.printStackTrace();
        }
        /*
        if(fileOut.exists() /*&& fileOut.length() > 0*//*){
            System.out.println("O arquivo de saída já existe, irei ler");
            this.cidades = leitor.lerArquivoSaida(); //lê o que tem no arquivo de saída
        }else{
            System.out.println("O arquivo de saida não existe, ele será criado!");
            this.cidades = leitor.lerArquivoEntrada(); //lê o que tem no arquivo de entrada

            //aproveita e já cria o arquivo de saida
            Writer writer = new Writer();
            //writer.writeOutFile();
            writer.atualizarTodoCSV(this.cidades); //já preenche o arquivo de saída
        }
        */

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
        //sizeList();
        this.cidades = array;
        //sizeList();
    }
    
    public void atualizarLista(){
        //sizeList();
        this.cidades = null;
        //sizeList();
        this.cidades = this.leitor.lerArquivoSaida();
        //sizeList();

    }
    
    /*
    public void sizeList(){
        if(this.cidades == null){
            System.out.println("Está nulo");
        } else{
            System.out.println("Tamanho da lista: " + this.cidades.size());
        }
    }
    */

    
    public boolean removeCity(City cidade){
        cidades.remove(cidade);
        return true;
    }
    
    public boolean AddCidade(City cidade){
        //sizeList();
        this.cidades.add(cidade);
        //sizeList();
        return true;
    }
}