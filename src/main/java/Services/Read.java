package Services;

import Model.City;
import java.util.ArrayList;

public class Read {

    public Read(){}

    public ArrayList<City> FindAll(Lista lista) {
        return lista.getCidades();
    }

    public City FindById(String id,Lista lista) {
        int idInt = Integer.parseInt(id);
        for (City element : lista.cidades){
            //return lista.getCidades().get(id);
        }
        return lista.getCidades().get(idInt);
    }

    public void FindByName(char municipio,Lista lista) {

    }

    public void FindBestPibPerCapta(Lista lista) {

    }

    public void FindBestIdh(Lista lista) {

    }

    public void FindWorstPibPerCapta(Lista lista) {

    }

    public void FindWorstIdh(Lista lista) {

    }

}
