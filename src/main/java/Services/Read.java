package Services;

import Model.City;
import java.util.ArrayList;

public class Read {

    public Read() {
    }

    
    public ArrayList<City> FindAll(Lista lista) {
        return lista.getCidades();
    }

    
    public City FindById(String id, Lista lista) {
        City city = lista.cidades.get(0);
        for (int i = 0; i < lista.cidades.size(); i++) {
            if (lista.cidades.get(i).getId().equals(id)) {
                city = lista.cidades.get(i);
            }
        }
        return city;
    }

    
    public City FindByName(char municipio, Lista lista) {
        City city = lista.cidades.get(0);
        for (int i = 0; i < lista.cidades.size(); i++) {
            if (lista.cidades.get(i).getMunicipio().equals(municipio)) {
                city = lista.cidades.get(i);
            }
        }
        return city;
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
