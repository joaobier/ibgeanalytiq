package Services;

import Model.City;
import Utils.Writer;

import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
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

        //Pega a hora do sistema no momento do update
        Date momento = new Date();
        SimpleDateFormat formato = new SimpleDateFormat("dd/MM/yyyy HH:mm:ss"); //usando esse formatador para colocar a hora em um formato legível
        formato.format(momento);
        //Adiciona a data da atualização na cidade atualizada
        cidade.setUltimaAtualizacao(momento.toString());

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
