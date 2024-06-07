package Utils;

import Model.City;

import java.io.*;
import java.nio.charset.StandardCharsets;
import java.util.ArrayList;

public class Writer {

    //String filePath = "C:\\Users\\joaov\\OneDrive\\Área de Trabalho\\Dados Projeto Integrador\\original.csv";
    //String filePath = "C:\\Users\\Aluno\\Desktop\\original.csv";
    //String filePath= "C:\\Users\\Sa_Th\\Desktop\\DadosPI\\teste.csv";
    String filePath;

    public Writer(){
        this.filePath = "C:\\Users\\Aluno\\Desktop\\dadosPI\\teste.csv";
    }

    public void adicionarCidade(City cidade){

        try(BufferedWriter writer = new BufferedWriter(new FileWriter(filePath,true))) {
            writer.write(cidade.toCSV());

        } catch (IOException e) {
            e.printStackTrace();
            throw new RuntimeException(e);
        }

    }

    public void atualizarTodoCSV(ArrayList<City> listaAtual){

       //BufferedWriter writer = new BufferedWriter(new FileWriter(filePath)) ANTIGO O FILE IGUAL
       //BufferedWriter writer = new BufferedWriter(new OutputStreamWriter(new FileOutputStream(filePath), StandardCharsets.ISO_8859_1)); NOVO QUE ARRUMA OS ACENTO
        try(BufferedWriter writer = new BufferedWriter(new FileWriter(filePath))){
            
            writer.write("Código IBGE;Municípios;Microrregião;Estado;Região Geográfica;Área Km²;População;Domicílios;PIB Total (R$ mil);IDH - Índice de Desenv. Humano;Renda Média;Renda Nominal;PEA Dia;IDH - Dimensão Educação;IDH - Dimensão Longevidade");
            for(City cidade : listaAtual){
                writer.write(cidade.toCSV());
            }
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }

    public void writeOutFile(ArrayList<City> listaAtual){

        File file = new File("C:\\Users\\Aluno\\Desktop\\out\\out.csv");

    }

}