package org.example;
import Model.City;
import Services.Lista;
import Utils.Reader;
import Utils.Writer;

import java.io.File;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {

        //INSTANCIANDO O WRITER E O READER
        Writer writer = new Writer();
        Reader reader = new Reader();
        
        //INSTANCIANDO UMA LISTA
        Lista lista = new Lista();

        //LISTANDO A LISTA QUE ESTÁ NO CSV E O NOSSO SISTEMA SÓ PARA VER
        //lista.listarComoCSV();
        
        //SÓ PARA SEPARAR
        System.out.println("-------------------------------------------------------------------------------------------------------");
        
        //INSTANCIANDO UMA CIDADE
        City cidade = new City("53000","Biercity","Bierland","Bier","BierCountry",1000,1000,1000,1000,1000,1000,1000,1000,1000,1000);
        City cidade2 = new City("666","Gotham City","NY","BatStado","EUA",0.2,1,1,1,1,1,1,1,1,1);
        
        //ADICIONANDO MINHA CIDADE A MINHA LISTA
        lista.AddCidade(cidade);
        lista.AddCidade(cidade2);
        
        lista.listarComoCSV();
        
        System.out.println("-------------------------------------------------------------------------------------------------------");

        
        writer.atualizarTodoCSV(lista.getCidades());
        
        //SÓ PARA VER O FINAL
        
        //ATULIZA AS CIDADES PELO CSV
        lista.setCidades(reader.ler());
        lista.listarComoCSV();
        
        //writer.atualizarTodoCSV(lista.getCidades());
        //System.out.println(cidade.toString());
        //lista.listarComoCSV();
        //writer.writeOutFile(lista.getCidades());
        //boolean sucess = new File("C:\\Users\\Aluno\\Desktop\\out" + "\\saida");
    }
}