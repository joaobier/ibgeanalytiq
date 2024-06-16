/*
 * Copyright (C) 2024 Gabriel Cândido Ribeiro da Silva <gcrs2018@gmail.com> 
 * Copyright (C) 2024 Gustavo Rezende Gabriel <gustavorezendegabriel@hotmail.com>
 * Copyright (C) 2024 João Vitor Bier Barros <joaovitorbierbarros@gmail.com>
 * Copyright (C) 2024 Theo da Silva Sa <03silva.theo@gmail.com>
 *
 * This program is free software: you can redistribute it and/or modify
 * it under the terms of the GNU General Public License as published by
 * the Free Software Foundation, either version 3 of the License, or
 * (at your option) any later version.
 *
 * This program is distributed in the hope that it will be useful,
 * but WITHOUT ANY WARRANTY; without even the implied warranty of
 * MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE.  See the
 * GNU General Public License for more details.
 *
 * You should have received a copy of the GNU General Public License
 * along with this program.  If not, see <http://www.gnu.org/licenses/>.
 */
package Utils;

import Model.City;
import java.io.*;
import java.util.ArrayList;
import static java.lang.Double.*;
import static java.lang.Integer.parseInt;

/**
 *
 * @author Gabriel Cândido Ribeiro da Silva <gcrs2018@gmail.com>
 * @author Gustavo Rezende Gabriel <gustavorezendegabriel@hotmail.com>
 * @author João Vitor Bier Barros <joaovitorbierbarros@gmail.com>
 * @author Theo da Silva Sa <03silva.theo@gmail.com>
 * @date 03/06/2024
 * @brief Class Reader
 */

public class Reader {

    private ArrayList<City> listaCidades = new ArrayList<>();
    private String filePathEntrada = "C:\\Projeto Integrador\\Entrada\\01.ProjetoIntegrador_BaseMunicipios_In.csv";
    private String filePathSaida = "C:\\Projeto Integrador\\Out\\01.ProjetoIntegrador_BaseMunicipios_Out.csv";
    public Reader(){
        //this.filePathEntrada = "C:\\Users\\Aluno\\Desktop\\dadosPI\\teste.csv";
        //this.filePathSaida = "C:\\Users\\Aluno\\Desktop\\Out\\out.csv";
        //this.filePath= "C:\\Users\\Aluno\\Desktop\\original.csv";
        //this.filePathEntrada= "C:\\Users\\Sa_Th\\Desktop\\DadosPI\\01.ProjetoIntegrador_BaseMunicipios_In.csv";
        //this.filePathSaida = "C:\\Users\\Sa_Th\\Desktop\\Out\\out.csv";
        //this.filePathEntrada = "C:\\Users\\joaov\\OneDrive\\Área de Trabalho\\DadosPI\\original.csv";
        //this.filePathSaida = "C:\\Users\\joaov\\OneDrive\\Área de Trabalho\\Out\\out.csv";
        //this.listaCidades = new ArrayList<City>();
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

    public ArrayList<City> lerArquivoSaida(){

        ArrayList<City> listaCidades = new ArrayList<>();

        try(BufferedReader br = new BufferedReader(new FileReader(filePathSaida))){
            System.out.println("eu entendi e vou ler");

            String line;
            while((line = br.readLine()) != null){
                String[] row = line.split(";");
                for (int i = 5; i <= 16; i++) {
                    row[i] = row[i].replace(',', '.'); //DAVA ERRO NA HORA DE PASSAR PARA O DOUBLE
                }
                if(row.length == 21){
                    City city = new City(
                            row[0],  // id
                            row[1],  // municipio
                            row[2],  // microregiao
                            row[3],  // estado
                            row[4],  // regiaoGeografica
                            Double.parseDouble(row[5]),  // area
                            Double.parseDouble(row[6]),  // populacao
                            Double.parseDouble(row[7]),  // domicilios
                            Double.parseDouble(row[8]),  // pibTotal
                            Double.parseDouble(row[9]),  // idh
                            Double.parseDouble(row[10]), // rendaMedia
                            Double.parseDouble(row[11]), // rendaNominal
                            Double.parseDouble(row[12]), // pea
                            Double.parseDouble(row[13]), // idhEducacao
                            Double.parseDouble(row[14]), // idhLongevidade
                            Double.parseDouble(row[15]), // densidadeDemografica
                            Double.parseDouble(row[16]), // pibPcTotal
                            row[17],  // classficacaoIDH
                            row[18],  // ultimaAtualizacao
                            row[19],  // classificacaoIDHEdu
                            row[20]   // classificacaoIDHLongevidade
                    );

                    System.out.println(city.toString());
                    listaCidades.add(city);

                }else{
                    System.err.println("Linha com numero incorreto de campos encontrada: " + line);
                }

            }

        }catch (Exception e){
            e.printStackTrace();
        }

        return listaCidades;

    }
    
    public ArrayList<City> getListaCidades(){
        return listaCidades;
    }

}