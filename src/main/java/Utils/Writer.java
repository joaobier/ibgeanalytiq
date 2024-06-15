package Utils;

import Model.City;

import java.io.*;
import java.util.ArrayList;

public class Writer {

    String filePath = "C:\\Users\\joaov\\OneDrive\\Área de Trabalho\\Out\\out.csv";
    //String filePath = "C:\\Users\\Aluno\\Desktop\\original.csv";
    //String filePath= "C:\\Users\\Sa_Th\\Desktop\\Out\\out.csv";
    //String filePath= "C:\\Users\\Sa_Th\\Desktop\\DadosPI\\out.csv";

    public Writer(){
        writeOutFile();
    }

    public void adicionarCidade(City cidade){
        try(BufferedWriter writer = new BufferedWriter(new FileWriter(filePath,true))) {
            writer.write(cidade.toCSVOut());

        } catch (IOException e) {
            e.printStackTrace();
            throw new RuntimeException(e);
        }

    }

    public void atualizarTodoCSV(ArrayList<City> listaAtual){
       //BufferedWriter writer = new BufferedWriter(new FileWriter(filePath)) ANTIGO O FILE IGUAL
       //BufferedWriter writer = new BufferedWriter(new OutputStreamWriter(new FileOutputStream(filePath), StandardCharsets.ISO_8859_1)); NOVO QUE ARRUMA OS ACENTO
        try(BufferedWriter writer = new BufferedWriter(new FileWriter(filePath))){
            
            //writer.write("Código IBGE;Municípios;Microrregião;Estado;Região Geográfica;Área Km²;População;Domicílios;PIB Total (R$ mil);IDH - Índice de Desenv. Humano;Renda Média;Renda Nominal;PEA Dia;IDH - Dimensão Educação;IDH - Dimensão Longevidade" + "\n");
            for(City cidade : listaAtual){
                writer.write(cidade.toCSVOut());
            }
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }

    public void writeOutFile(){

        String pasta = "C:\\Users\\joaov\\OneDrive\\Área de Trabalho\\Out";
        //String pasta = "C:\\Users\\Sa_Th\\Desktop\\Out";
        String arquivo = pasta+ "\\out.csv";

        File diretorio = new File(pasta);

        if(!diretorio.exists()){
            //CRIANDO O DIRETORIO
            if(diretorio.mkdir()){
                System.out.println("CRIEI A PASTA!");

                //CRIANDO O ARQUIVO
                File file = new File(arquivo);
                try{
                    if(!file.exists()){
                        file.createNewFile();
                        System.out.println("Criei o arquivo!");
                    }else System.out.println("O Arquivo já existe");

                }catch (Exception e) {
                    throw new RuntimeException(e);
                }
            }else System.out.println("Deu ruim!");
        }else System.out.println("A pasta já existe!");



    }

}