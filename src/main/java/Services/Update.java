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
package Services;

import Model.City;
import Utils.Writer;
import java.text.SimpleDateFormat;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.ArrayList;
import java.util.Date;
import java.util.Scanner;
/**
 *
 * @author Gabriel Cândido Ribeiro da Silva <gcrs2018@gmail.com>
 * @author Gustavo Rezende Gabriel <gustavorezendegabriel@hotmail.com>
 * @author João Vitor Bier Barros <joaovitorbierbarros@gmail.com>
 * @author Theo da Silva Sa <03silva.theo@gmail.com>
 * @date 03/06/2024
 * @brief Class Main
 */

public class Update {

    Read read;
    Writer writer;

    public Update() {
        this.read = new Read();
        this.writer = new Writer();
    }

    public void UpdateById(String id, Lista lista, City cidade) {

        for (int i = 0; i < lista.getCidades().size(); i++) {
            
            if(cidade.getId() == lista.getCidades().get(i).getId()){
                System.out.println("Achei isso aqui: "+ lista.getCidades().get(i).toCSV());
                LocalDate momento = LocalDate.now();
                DateTimeFormatter formato = DateTimeFormatter.ofPattern("dd/MM/yyyy");
                formato.format(momento);
                String horarioString = momento.toString();
                cidade.setUltimaAtualizacao(horarioString);
                lista.cidades.set(i, cidade);
                writer.atualizarTodoCSV(lista.getCidades());
            }
        }

        //Pega a hora do sistema no momento do update
        
        //SimpleDateFormat formato = new SimpleDateFormat("dd/MM/yyyy HH:mm:ss"); //usando esse formatador para colocar a hora em um formato legível
        
        //Adiciona a data da atualização na cidade atualizada
        

        //cidades.add(cidade);
        //writer.atualizarTodoCSV(cidades);

        //lista.setCidades(cidades);
        //lista.listarComoCSV();

        //writer.atualizarTodoCSV(lista.getCidades());
        /*
        cidade = new City(ler.next(), ler.next(), ler.next(), ler.next(), ler.next(), ler.nextDouble(), ler.nextDouble(), ler.nextDouble(), ler.nextDouble(), ler.nextDouble(), ler.nextDouble(), ler.nextDouble(), ler.nextDouble(), ler.nextDouble(), ler.nextDouble());
        writer.adicionarCidade(cidade);
        lista.atualizarLista();
        /*
        cidades.add(createCity());
        lista.setCidades(cidades);
        writer.adicionarCidade(cidade);
         */
    }
}
