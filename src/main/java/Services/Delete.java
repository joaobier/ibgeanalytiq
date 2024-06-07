package Services;

import Model.City;
import Utils.Writer;

import java.util.ArrayList;

public class Delete {

    Writer writer;

    public Delete() {
        writer = new Writer();
    }

    public boolean DeleteById(int id, Lista lista, City cidade) {
        //Controlado pela Interface Gráfica
        ArrayList<City> cidades = lista.getCidades();
        cidades.remove(cidade);
        lista.setCidades(cidades);
        writer.atualizarTodoCSV(cidades);
        return true;
    }
}
