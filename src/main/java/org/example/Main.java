package org.example;
import Model.City;
import Services.Lista;
import Utils.Writer;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {

        Lista lista = new Lista();

        lista.listarComoCSV();

        Writer writer = new Writer();
        City cidade = new City("53000","Biercity","Bierland","Bier","BierCountry",1000,1000,1000,1000,1000,1000,1000,1000,1000,1000);
        writer.adicionarCidade(cidade);

        lista.listarComoCSV();





    }
}