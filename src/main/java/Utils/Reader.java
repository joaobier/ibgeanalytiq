package Utils;
import Model.City;

import java.io.*;
import java.util.ArrayList;
import java.util.List;

import static java.lang.Double.*;
import static java.lang.Integer.parseInt;

public class Reader {

    private ArrayList<City> listaCidades = new ArrayList<City>();

    public Reader()
    {
        //String filePath = "C:\\Users\\Aluno\\Desktop\\csv\\copia.csv";
        String filePath = "C:\\Users\\joaov\\OneDrive\\Área de Trabalho\\Dados Projeto Integrador\\original.csv";
        BufferedReader reader = null;
        String line = "";

        try
        {
            reader = new BufferedReader(new FileReader(filePath));
            while((line = reader.readLine()) != null){
                String[] row = line.split(";");

                for(int j = 0; j < row.length; j++){
                    row[j] = row[j].replace(".","").replace(",",".").trim();

                }

                City city = new City(
                        parseInt(row[0]),
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

                listaCidades.add(city);

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
            }catch (Exception e){
                e.printStackTrace();
            }
        }
    }

    public ArrayList<City> getListaCidades(){
        return listaCidades;
    }

}