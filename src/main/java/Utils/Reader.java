package Utils;
import Model.City;

import java.io.*;
import java.util.ArrayList;

import static java.lang.Double.*;
import static java.lang.Integer.parseInt;

public class Reader {

    private ArrayList<City> listaCidades;
    String filePathEntrada;
    String filePathSaida;
    public Reader(){
        //this.filePathEntrada = "C:\\Users\\Aluno\\Desktop\\dadosPI\\teste.csv";
        //this.filePathSaida = "C:\\Users\\Aluno\\Desktop\\Out\\out.csv";
        //this.filePath= "C:\\Users\\Aluno\\Desktop\\original.csv";
        this.filePathEntrada= "C:\\Users\\Sa_Th\\Desktop\\DadosPI\\01.ProjetoIntegrador_BaseMunicipios_In.csv";
        this.filePathSaida = "C:\\Users\\Sa_Th\\Desktop\\Out\\out.csv";
        //this.filePathEntrada = "C:\\Users\\joaov\\OneDrive\\Área de Trabalho\\Dados Projeto Integrador\\original.csv";
        //this.filePathSaida = "C:\\Users\\joaov\\OneDrive\\Área de Trabalho\\Out\\out.csv";
        this.listaCidades = new ArrayList<City>();
    }

    public ArrayList<City> lerArquivoEntrada(){

        BufferedReader reader = null;
        String line = "";

        try
        {
            reader = new BufferedReader(new FileReader(this.filePathEntrada));
            reader.readLine(); //só pra pular a linha que tem o cabeçalho
            while((line = reader.readLine()) != null){
                String[] row = line.split(";");

                for(int j = 0; j < row.length; j++){
                    row[j] = row[j].replace(".","").replace(",",".").trim();

                }

                City city = new City(
                        row[0],
                        row[1],
                        row[2],
                        row[3],
                        row[4],
                        parseDouble(row[5]),
                        parseDouble(row[6]),
                        parseDouble(row[7]),
                        parseDouble(row[8]),
                        parseDouble(row[9]),
                        parseDouble(row[10]),
                        parseDouble(row[11]),
                        parseDouble(row[12]),
                        parseDouble(row[13]),
                        parseDouble(row[14]));

                this.listaCidades.add(city);

            }
        }
        catch (FileNotFoundException e) {
            e.printStackTrace();
            throw new RuntimeException(e);
        } catch (IOException e) {
            e.printStackTrace();
            throw new RuntimeException(e);
        } finally {
            try{
                reader.close();
                return this.listaCidades;
            }catch (Exception e){
                e.printStackTrace();
            }
        }
        return this.listaCidades;
    }

    public ArrayList<City> lerArquivo(){

        BufferedReader reader = null;
        String line = "";

        System.out.println("Vou ler o arquivo na posição: " + filePathSaida);
        try
        {
            reader = new BufferedReader(new FileReader(this.filePathSaida));
            //reader.readLine(); //só pra pular a linha que tem o cabeçalho
            while((line = reader.readLine()) != null){
                String[] row = line.split(";");

                for(int j = 0; j < row.length; j++){
                    row[j] = row[j].replace(".","").replace(",",".").trim();

                }
                for(int j = 0; j < row.length; j++){
                    System.out.println(j +"="+row[j]);
                }

                City city = new City(
                        row[0],
                        row[1],
                        row[2],
                        row[3],
                        row[4],
                        parseDouble(row[5]),
                        parseDouble(row[6]),
                        parseDouble(row[7]),
                        parseDouble(row[8]),
                        parseDouble(row[9]),
                        parseDouble(row[10]),
                        parseDouble(row[11]),
                        parseDouble(row[12]),
                        parseDouble(row[13]),
                        parseDouble(row[14]));

                //System.out.println(city.toString());
                this.listaCidades.add(city);

            }
        }
        catch (FileNotFoundException e) {
            e.printStackTrace();
            throw new RuntimeException(e);
        } catch (IOException e) {
            e.printStackTrace();
            throw new RuntimeException(e);
        } finally {
            try{
                reader.close();
                return this.listaCidades;
            }catch (Exception e){
                e.printStackTrace();
            }
        }
        return this.listaCidades;
    }

    public ArrayList<City> lerArquivoSaida(){

        BufferedReader reader = null;
        String line = "";

        System.out.println("Vou ler o arquivo na posição:" + filePathSaida);
        try
        {
            reader = new BufferedReader(new FileReader(this.filePathSaida));
            //reader.readLine(); //só pra pular a linha que tem o cabeçalho //Não tem mais cabeçalho, não precisa pular
            while((line = reader.readLine()) != null){
                String[] row = line.split(";");

                for(int j = 0; j < row.length; j++){
                    row[j] = row[j].replace(".","").replace(",",".").trim();

                }



                //acho que esse construtor está com problema
                City city = new City(
                        row[0], //id
                        row[1], //municipio
                        row[2], //microregiao
                        row[3], //estado
                        row[4], //regiao geografica
                        parseDouble(row[5]), //area
                        parseDouble(row[6]), //população
                        parseDouble(row[7]), //domicilios
                        parseDouble(row[8]), //pibTotal
                        parseDouble(row[9]), //idh
                        parseDouble(row[10]), //rendaMedia
                        parseDouble(row[11]), //rendaNominal
                        parseDouble(row[12]), //pea
                        parseDouble(row[13]), //idhEducacao
                        parseDouble(row[14]), //idhLongevidade
                        parseDouble(row[15]), //densidadeDemografica
                        parseDouble(row[16]), //pibPcTotal
                        row[17], //classificacaoIDH
                        row[18],//ultimaAtualizacao
                        row[19], //classificacaoIDHEdu
                        row[20] //classificacaoIDHLongevidade
                ); 
                //System.out.println(city.toString());
                this.listaCidades.add(city);

            }
        }
        catch (FileNotFoundException e) {
            e.printStackTrace();
            throw new RuntimeException(e);
        } catch (IOException e) {
            e.printStackTrace();
            throw new RuntimeException(e);
        } finally {
            try{
                reader.close();
                return this.listaCidades;
            }catch (Exception e){
                e.printStackTrace();
            }
        }
        return this.listaCidades;
    }



    public ArrayList<City> getListaCidades(){
        return listaCidades;
    }

}