package Services;

import Model.City;
import Utils.Writer;
import java.util.ArrayList;
import java.util.Scanner;

public class Update {

    Read read;
    Writer writer;

    public Update() {
        this.read = new Read();
        this.writer = new Writer();
    }

    public boolean UpdateById(String id, Lista lista, City cidade) {
        Scanner ler = new Scanner(System.in);
        ArrayList<City> cidades = lista.getCidades();
        for (int i = 0; i < lista.cidades.size(); i++) {
            if (lista.cidades.get(i).getId().equals(id)) {
                //lista.removeCity(cidade);
                cidades.remove(i);
            }
        }
        
        writer.atualizarTodoCSV(cidades);
        /*
        cidade = new City(ler.next(), ler.next(), ler.next(), ler.next(), ler.next(), ler.nextDouble(), ler.nextDouble(), ler.nextDouble(), ler.nextDouble(), ler.nextDouble(), ler.nextDouble(), ler.nextDouble(), ler.nextDouble(), ler.nextDouble(), ler.nextDouble());
        writer.adicionarCidade(cidade);
        lista.atualizarLista();
        /*
        cidades.add(createCity());
        lista.setCidades(cidades);
        writer.adicionarCidade(cidade);
         */
        return true;
    }
}
