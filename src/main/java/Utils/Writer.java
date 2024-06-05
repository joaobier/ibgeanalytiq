package Utils;

import Model.City;

import java.io.*;
import java.util.ArrayList;

public class Writer {

    String filePath = "C:\\Users\\joaov\\OneDrive\\Área de Trabalho\\Dados Projeto Integrador\\original.csv";

    public void adicionarCidade(City cidade){

        try(BufferedWriter writer = new BufferedWriter(new FileWriter(filePath,true))) {
            writer.write(cidade.toCSV());

        } catch (IOException e) {
            e.printStackTrace();
            throw new RuntimeException(e);
        }

    }

    public void atualizarTodoCSV(ArrayList<City> listaAtual){

        try(BufferedWriter writer = new BufferedWriter(new FileWriter(filePath))){
            writer.write("Código IBGE;Municípios;Microrregião;Estado;Região Geográfica;Área Km²;População;Domicílios;PIB Total (R$ mil);IDH - Índice de Desenv. Humano;Renda Média;Renda Nominal;PEA Dia;IDH - Dimensão Educação;IDH - Dimensão Longevidade");
            for(City cidade : listaAtual){
                writer.write(cidade.toCSV());
            }
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }

}