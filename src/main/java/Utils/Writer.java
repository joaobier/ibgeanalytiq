package Utils;

import Model.City;

import java.io.*;
import java.util.ArrayList;

public class Writer {

    String filePath = "C:\\Users\\joaov\\OneDrive\\Área de Trabalho\\Out\\out.csv";
    //String filePath = "C:\\Users\\Aluno\\Desktop\\original.csv";
    //String filePath= "C:\\Users\\Sa_Th\\Desktop\\DadosPI\\teste.csv";
    //String filePath= "C:\\Users\\Aluno\\Desktop\\dadosPI\\teste.csv";

    public Writer(){
        writeOutFile();
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
            
            writer.write("Código IBGE;Municípios;Microrregião;Estado;Região Geográfica;Área Km²;População;Domicílios;PIB Total (R$ mil);IDH - Índice de Desenv. Humano;Renda Média;Renda Nominal;PEA Dia;IDH - Dimensão Educação;IDH - Dimensão Longevidade" + "\n");
            for(City cidade : listaAtual){
                writer.write(cidade.toCSV());
            }
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }

    public void writeOutFile(){

        String pasta = "C:\\Users\\joaov\\OneDrive\\Área de Trabalho\\Out";
        String arquivo = pasta+ "\\out.csv";

        File diretorio = new File(pasta);

        if(!diretorio.exists()){
            if(diretorio.mkdir()){
                System.out.println("CRIEI A PASTA!");
            }else System.out.println("Deu ruim!");
        }else System.out.println("A pasta já existe!");

        File file = new File(arquivo);
        try{
          if(file.createNewFile()){
              System.out.println("Arquivo out criado!");
          }else System.out.println("Falha ao criar o arquivo");

            try (FileWriter fw = new FileWriter(file);
                 PrintWriter pw = new PrintWriter(fw)) {

                // Cabeçalhos do CSV
                pw.println("Código IBGE;Municípios;Microrregião;Estado;Região Geográfica;Área Km²;População;Domicílios;PIB Total (R$ mil);IDH - Índice de Desenv. Humano;Renda Média;Renda Nominal;PEA Dia;IDH - Dimensão Educação;IDH - Dimensão Longevidade");

            } catch (IOException e) {
            throw new RuntimeException(e);
            }
        }catch (Exception e) {
            throw new RuntimeException(e);
        }

    }

}