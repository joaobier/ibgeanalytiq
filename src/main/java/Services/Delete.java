package Services;

import Model.City;
import java.util.ArrayList;

public class Delete {

    public Delete() {}

    public boolean DeleteById(int id, Lista lista, City cidade) {
        //Controlado pela Interface Gráfica

        ArrayList<City> cidades = lista.getCidades();
        cidades.remove(cidade);
        lista.setCidades(cidades);
        return true;
    }
}
