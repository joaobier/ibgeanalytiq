package Model;

public class City {

    int id;
    String municipio;
    String microgeriao;
    String estado;
    String regiaoGeografica;
    double area;
    int populacao;
    int domicilios;
    Long pibTotal;
    double idh;
    double rendaMedia;
    double rendaNominal;
    double pea;
    double idhEducacao;
    double idhLongevidade;

    public City(int id,
                String municipio,
                String microgeriao,
                String regiaoGeografica,
                String estado,
                double area,
                int populacao,
                int domicilios,
                Long pibTotal,
                double idh,
                double rendaMedia,
                double rendaNominal,
                double pea,
                double idhEducacao,
                double idhLongevidade) {
        this.id = id;
        this.municipio = municipio;
        this.microgeriao = microgeriao;
        this.regiaoGeografica = regiaoGeografica;
        this.estado = estado;
        this.area = area;
        this.populacao = populacao;
        this.domicilios = domicilios;
        this.pibTotal = pibTotal;
        this.idh = idh;
        this.rendaMedia = rendaMedia;
        this.rendaNominal = rendaNominal;
        this.pea = pea;
        this.idhEducacao = idhEducacao;
        this.idhLongevidade = idhLongevidade;
    }

    public City(){}

}
