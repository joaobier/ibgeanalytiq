package Services;

import Model.City;
import Utils.Writer;

import java.util.ArrayList;

public class Delete {

    Writer writer;

    public Delete() {
        writer = new Writer();
    }

    public void DeleteById(int id, Lista lista) {
        //ArrayList<City> cidades = lista.getCidades();
        //City cidade = cidades.get(id);
        System.out.println(lista.getCidades().get(id).toString());
        lista.getCidades().remove(id);
        //cidades.remove(cidade);
        writer.atualizarTodoCSV(lista.getCidades());
        
    }
}
