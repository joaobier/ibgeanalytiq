package org.example;
import Model.City;
import Services.*;
import Services.Update;
import Utils.Reader;
import Utils.Writer;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args){

        Lista lista = new Lista();
        //Writer writer = new Writer();
        //writer.writeOutFile();
        //writer.atualizarTodoCSV(lista.getCidades());
        //System.out.println("Vou imprimir a lista de cidades");
        //lista = new Lista();
        //lista.listarComoCSV();
        lista.quantasCidades();

        //writer.atualizarTodoCSV(lista.getCidades());

        //LISTANDO A LISTA QUE ESTÁ NO CSV E O NOSSO SISTEMA SÓ PARA VER
        //lista.listarComoCSV();
        
        //SÓ PARA SEPARAR
        //System.out.println("-------------------------------------------------------------------------------------------------------");

        //INSTANCIANDO UMA CIDADE
        //City cidade = new City("53000","Biercity","Bierland","Bier","BierCountry",1000,1000,1000,1000,1000,1000,1000,1000,1000,1000);
        //City cidade2 = new City("666","Gotham City","NY","BatStado","EUA",0.2,1,1,1,1,1,1,1,1,1);
        
        //ADICIONANDO MINHA CIDADE A MINHA LISTA
        //Create criador = new Create();

        //ADICIONANDO A CIDADE NA LISTA E NO CSV
        //criador.createCity(lista,cidade);
        //criador.createCity(lista,cidade2);

        //City cidade3 = new City("999","Metropolis","NY","BatStado","EUA",0.2,1,1,1,1,1,1,1,1,1);
        //Update update = new Update();
        //update.UpdateById("666",lista,cidade3);

        //Read read = new Read();
        //System.out.println(read.FindById("999",lista).toString());

        //City last = lista.getCidades().getLast();
        //System.out.println(last.toString());

        //writer.writeOutFile();

        /*
        Read read = new Read();
        System.out.println("--------------------------------------------------------");
        System.out.println(read.FindById("5221577",lista));
        System.out.println(read.FindByName("Trombas",lista));
        System.out.println(read.FindBestPibPerCapta(lista));
        System.out.println(read.FindWorstPibPerCapta(lista));
        System.out.println(read.FindBestIdh(lista));
        System.out.println(read.FindWorstIdh(lista));
        System.out.println("--------------------------------------------------------");
        */
        //LISTANDO A LISTA NA INSTÂNCIA DA MÁQUINA
        //System.out.println("--------------------------------------------------------");
        //lista.listarComoCSV();
        //System.out.println("--------------------------------------------------------");

        /*
        //ADICIONANDO NO DOCUMENTO CSV ESSAS CIDADES
        writer.adicionarCidade(cidade);
        writer.adicionarCidade(cidade2);
        */
        //writer.atualizarTodoCSV(lista.getCidades());



        //writer.atualizarTodoCSV(lista.getCidades());

        //System.out.println("-------------------------------------------------------------------------------------------------------");

       // City item = new City("00001","Brasilia","Distrito Fredre","Microgeriao","Dsitrito Freredrel",9,9,9,9,9,9,9,9,9,9);

        //Update updater = new Update();

        //updater.UpdateById("666",lista,item);

        //lista.listarComNumero();

        //writer.atualizarTodoCSV(lista.getCidades());
        
        //SÓ PARA VER O FINAL
        
        //ATUALIZA AS CIDADES PELO CSV
        //lista.setCidades(reader.ler());
        //lista.listarComoCSV();
        
        //writer.atualizarTodoCSV(lista.getCidades());
        //System.out.println(cidade.toString());
        //lista.listarComoCSV();
        //writer.writeOutFile(lista.getCidades());
        //boolean sucess = new File("C:\\Users\\Aluno\\Desktop\\out" + "\\saida");
    }
}