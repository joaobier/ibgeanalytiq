package Model;

import java.text.DecimalFormat;

public class City {

    int id;
    String municipio;
    String microgeriao;
    String estado;
    String regiaoGeografica;
    double area;
    double populacao;
    double domicilios;
    double pibTotal;
    double idh;
    double rendaMedia;
    double rendaNominal;
    double pea;
    double idhEducacao;
    double idhLongevidade;

    //CONSTRUTOR
    public City(int id,
                String municipio,
                String microgeriao,
                String estado,
                String regiaoGeografica,
                double area,
                double populacao,
                double domicilios,
                double pibTotal,
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

    //GETTERS E SETTERS
    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getMunicipio() {
        return municipio;
    }

    public void setMunicipio(String municipio) {
        this.municipio = municipio;
    }

    public String getMicrogeriao() {
        return microgeriao;
    }

    public void setMicrogeriao(String microgeriao) {
        this.microgeriao = microgeriao;
    }

    public String getEstado() {
        return estado;
    }

    public void setEstado(String estado) {
        this.estado = estado;
    }

    public String getRegiaoGeografica() {
        return regiaoGeografica;
    }

    public void setRegiaoGeografica(String regiaoGeografica) {
        this.regiaoGeografica = regiaoGeografica;
    }

    public double getArea() {
        return area;
    }

    public void setArea(double area) {
        this.area = area;
    }

    public double getPopulacao() {
        return populacao;
    }

    public void setPopulacao(double populacao) {
        this.populacao = populacao;
    }

    public double getDomicilios() {
        return domicilios;
    }

    public void setDomicilios(double domicilios) {
        this.domicilios = domicilios;
    }

    public double getPibTotal() {
        return pibTotal;
    }

    public void setPibTotal(double pibTotal) {
        this.pibTotal = pibTotal;
    }

    public double getIdh() {
        return idh;
    }

    public void setIdh(double idh) {
        this.idh = idh;
    }

    public double getRendaMedia() {
        return rendaMedia;
    }

    public void setRendaMedia(double rendaMedia) {
        this.rendaMedia = rendaMedia;
    }

    public double getRendaNominal() {
        return rendaNominal;
    }

    public void setRendaNominal(double rendaNominal) {
        this.rendaNominal = rendaNominal;
    }

    public double getPea() {
        return pea;
    }

    public void setPea(double pea) {
        this.pea = pea;
    }

    public double getIdhEducacao() {
        return idhEducacao;
    }

    public void setIdhEducacao(double idhEducacao) {
        this.idhEducacao = idhEducacao;
    }

    public double getIdhLongevidade() {
        return idhLongevidade;
    }

    public void setIdhLongevidade(double idhLongevidade) {
        this.idhLongevidade = idhLongevidade;
    }

    //TO STRING
    @Override
    public String toString() {
        return "City{" +
                "id=" + id +
                ", municipio='" + municipio + '\'' +
                ", microgeriao='" + microgeriao + '\'' +
                ", estado='" + estado + '\'' +
                ", regiaoGeografica='" + regiaoGeografica + '\'' +
                ", area=" + mostrarNumeroFormatado(area,3) +
                ", populacao=" + mostrarNumeroFormatado(populacao,5) +
                ", domicilios=" + mostrarNumeroFormatado(domicilios,4) +
                ", pibTotal=" + mostrarNumeroFormatado(pibTotal,5) +
                ", idh=" + mostrarNumeroFormatado(idh, 5) +
                ", rendaMedia=" + mostrarNumeroFormatado(rendaMedia,4) +
                ", rendaNominal=" + mostrarNumeroFormatado(rendaNominal,3) +
                ", pea=" + pea +
                ", idhEducacao=" + mostrarNumeroFormatado(idhEducacao,5)  +
                ", idhLongevidade=" + mostrarNumeroFormatado(idhLongevidade,5) +
                '}';
    }

    //FUNÇÃO PARA ARRUMAR OS NUMEROS QUE ESTÃO FICANDO EM NOTAÇÃO CIÊNTIFICA
    public String mostrarNumeroFormatado(double numero,int casasPosVirgula){

        String formato = "#.#";
        for(int i = 0; i < casasPosVirgula; i++){
            formato = formato + "#";
        }
        DecimalFormat df = new DecimalFormat(formato);

        String numeroFormatado = df.format(numero);

        return numeroFormatado;
    }
}
