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

/**
 *
 * @author Gabriel Cândido Ribeiro da Silva <gcrs2018@gmail.com>
 * @author Gustavo Rezende Gabriel <gustavorezendegabriel@hotmail.com>
 * @author João Vitor Bier Barros <joaovitorbierbarros@gmail.com>
 * @author Theo da Silva Sa <03silva.theo@gmail.com>
 * @date 03/06/2024
 * @brief Class Writer
 */

public class Writer {

    String filePath = "C:\\Projeto Integrador\\Out\\01.ProjetoIntegrador_BaseMunicipios_Out.csv";
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

        String pasta = "C:\\Projeto Integrador\\Out";
        //String pasta = "C:\\Users\\Sa_Th\\Desktop\\Out";
        String arquivo = pasta+ "\\01.ProjetoIntegrador_BaseMunicipios_Out.csv";

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