package Utils;
import Model.City;

import java.io.*;
import java.util.ArrayList;
import java.util.List;

import static java.lang.Double.*;
import static java.lang.Integer.parseInt;

public class Reader {

    private ArrayList<City> listaCidades;
    String filePath;

    public Reader(){
        //this.filePath = "C:\\Users\\joaov\\OneDrive\\Área de Trabalho\\Dados Projeto Integrador\\original.csv";
        //this.filePath= "C:\\Users\\Aluno\\Desktop\\original.csv";
        this.filePath= "C:\\Users\\Sa_Th\\Desktop\\DadosPI\\teste.csv";
        //this.filePath = "C:\\Users\\joaov\\OneDrive\\Área de Trabalho\\Dados Projeto Integrador\\teste.csv";
        this.listaCidades = new ArrayList<City>();
    }

    public ArrayList<City> ler(){

        BufferedReader reader = null;
        String line = "";

        try
        {
            reader = new BufferedReader(new FileReader(this.filePath));
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

    public ArrayList<City> getListaCidades(){
        return listaCidades;
    }

}