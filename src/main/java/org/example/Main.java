package org.example;
import Model.City;
import Services.Lista;
import Utils.Writer;

import java.io.File;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {

        Lista lista = new Lista();

        lista.listarComoCSV();

        Writer writer = new Writer();
        City cidade = new City("53000","Biercity","Bierland","Bier","BierCountry",1000,1000,1000,1000,1000,1000,1000,1000,1000,1000);
        //writer.adicionarCidade(cidade);

        System.out.println(cidade.toString());

        //lista.listarComoCSV();

        writer.writeOutFile(lista.getCidades());

        boolean sucess = new File("C:\\Users\\Aluno\\Desktop\\out" + "\\saida");


    }
}