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
import java.util.ArrayList;
/**
 *
 * @author Gabriel Cândido Ribeiro da Silva <gcrs2018@gmail.com>
 * @author Gustavo Rezende Gabriel <gustavorezendegabriel@hotmail.com>
 * @author João Vitor Bier Barros <joaovitorbierbarros@gmail.com>
 * @author Theo da Silva Sa <03silva.theo@gmail.com>
 * @date 03/06/2024
 * @brief Class Main
 */

public class Read {

    public Read() {
    }

    
    public ArrayList<City> FindAll(Lista lista) {
        return lista.getCidades();
    }

    
    public City FindById(String id, Lista lista) {

        for (int i = 0; i < lista.cidades.size(); i++) {
            if (lista.cidades.get(i).getId().equals(id)) {
                return lista.cidades.get(i);
            }
        }
        return null;
    }

    
    public City FindByName(String municipio, Lista lista) {

        for (int i = 0; i < lista.cidades.size(); i++) {
            if (lista.cidades.get(i).getMunicipio().equals(municipio)) {
                return lista.cidades.get(i);
            }
        }
        return null;
    }

    
    public City FindBestPibPerCapta(Lista lista) {
        City city = lista.cidades.get(0);
        for (int i = 1; i < lista.cidades.size(); i++) {

            if (lista.cidades.get(i).getPibPcTotal() > city.getPibPcTotal()) {
                city = lista.cidades.get(i);
            }

        }
        return city;
    }

    
    public City FindBestIdh(Lista lista) {
        City city = lista.cidades.get(0);
        for (int i = 1; i < lista.cidades.size(); i++) {

            if (lista.cidades.get(i).getIdh() > city.getIdh()) {
                city = lista.cidades.get(i);
            }

        }
        return city;
    }


    public City FindWorstPibPerCapta(Lista lista) {
        City city = lista.cidades.get(0);
        for (int i = 1; i < lista.cidades.size(); i++) {

            if (lista.cidades.get(i).getPibPcTotal() < city.getPibPcTotal()) {
                city = lista.cidades.get(i);
            }

        }
        return city;
    }

    
    public City FindWorstIdh(Lista lista) {
        City city = lista.cidades.get(0);
        for (int i = 1; i < lista.cidades.size(); i++) {

            if (lista.cidades.get(i).getIdh() < city.getIdh()) {
                city = lista.cidades.get(i);
            }

        }
        return city;
    }

}
