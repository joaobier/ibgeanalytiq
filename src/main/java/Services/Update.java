package Services;

import Model.City;
import Utils.Writer;

import java.text.SimpleDateFormat;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
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

    public void UpdateById(String id, Lista lista, City cidade) {

        for (int i = 0; i < lista.getCidades().size(); i++) {
            
            if(cidade.getId() == lista.getCidades().get(i).getId()){
                System.out.println("Achei isso aqui: "+ lista.getCidades().get(i).toCSV());
                LocalDate momento = LocalDate.now();
                DateTimeFormatter formato = DateTimeFormatter.ofPattern("dd/MM/yyyy");
                formato.format(momento);
                String horarioString = momento.toString();
                cidade.setUltimaAtualizacao(horarioString);
                lista.cidades.set(i, cidade);
                writer.atualizarTodoCSV(lista.getCidades());
            }
        }

        //Pega a hora do sistema no momento do update
        
        //SimpleDateFormat formato = new SimpleDateFormat("dd/MM/yyyy HH:mm:ss"); //usando esse formatador para colocar a hora em um formato legível
        
        //Adiciona a data da atualização na cidade atualizada
        

        //cidades.add(cidade);
        //writer.atualizarTodoCSV(cidades);

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
    }
}
