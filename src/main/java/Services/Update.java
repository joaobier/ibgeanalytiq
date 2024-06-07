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

        ArrayList<City> cidades = lista.getCidades();

        for (int i = 0; i < lista.cidades.size(); i++) {
            City item = cidades.get(i);
            if(item.getId().equals(id)) {
                System.out.println("Achei isso aqui: "+item.toCSV());
                System.out.println("VOU REMOVER!");
                cidades.remove(i);
            }
        }

        cidades.add(cidade);
        writer.atualizarTodoCSV(cidades);

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
        return true;
    }
}
