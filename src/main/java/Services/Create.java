package Services;

import Model.City;
import java.util.ArrayList;

public class Create {

    public Create() {}

    public boolean createCity(Lista lista, City cidade) {

        //Controlado pela interface Gráfica
        ArrayList<City> cidades = lista.getCidades();
        cidades.add(cidade);
        lista.setCidades(cidades);
        return true;
    }
}
