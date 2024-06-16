/*
 * Copyright (C) 2024 Gabriel Cândido Ribeiro da Silva <gcrs2018@gmail.com> 
 * Copyright (C) 2024 Gustavo Rezende Gabriel <gustavorezendegabriel@hotmail.com>
 * Copyright (C) 2024 João Vitor Bier Barros <joaovitorbierbarros@gmail.com>
 * Copyright (C) 2024 Theo da Silva Sa <03silva.theo@gmail.com>
 *
 * This program is free software: you can redistribute it and/or modify
 * it under the terms of the GNU General Public License as published by
 * the Free Software Foundation, either version 3 of the License, or
 * (at your option) any later version.
 *
 * This program is distributed in the hope that it will be useful,
 * but WITHOUT ANY WARRANTY; without even the implied warranty of
 * MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE.  See the
 * GNU General Public License for more details.
 *
 * You should have received a copy of the GNU General Public License
 * along with this program.  If not, see <http://www.gnu.org/licenses/>.
 */
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
/**
 *
 * @author Gabriel Cândido Ribeiro da Silva <gcrs2018@gmail.com>
 * @author Gustavo Rezende Gabriel <gustavorezendegabriel@hotmail.com>
 * @author João Vitor Bier Barros <joaovitorbierbarros@gmail.com>
 * @author Theo da Silva Sa <03silva.theo@gmail.com>
 * @date 03/06/2024
 * @brief Class Main
 */

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