package Services;

import Model.City;
import Utils.Writer;

import java.util.ArrayList;

public class Create {

    Writer writer;

    public Create() {
        writer = new Writer();
    }

    public boolean createCity(Lista lista, City cidade) {

        //Controlado pela interface Gráfica
        ArrayList<City> cidades = lista.getCidades();
        cidades.add(cidade);
        lista.setCidades(cidades);
        writer.atualizarTodoCSV(cidades);
        return true;
    }
}