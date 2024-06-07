package Model;

import java.text.DecimalFormat;

public class City {

    String id;
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

    //variáveis geradas através de operações da própria classe com dados base
    double densidadeDemografica;
    double pibPcTotal;
    String classficacaoIDH;

    //CONSTRUTOR
    public City(String id,
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

        //contas para setar as 3 variáveis dependentes
        this.densidadeDemografica = (pibTotal/populacao);
        this.pibPcTotal = (pibTotal/populacao);

        //Classificação de IDH
        if(idh > 0.8){
            this.classficacaoIDH = "MUITO ALTO";
        }else if(idh > 0.7 && idh <= 0.8){
            this.classficacaoIDH = "ALTO";
        }else if(idh > 0.55 && idh <= 0.7){
            this.classficacaoIDH = "MÉDIO";
        }else if(idh <= 0.55){
            this.classficacaoIDH = "BAIXO";
        }

    }

    public City(){}

    //GETTERS E SETTERS
    public String getId() {
        return id;
    }

    public void setId(String id) {
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

    public double getDensidadeDemografica() {
        return densidadeDemografica;
    }

    public void setDensidadeDemografica(double densidadeDemografica) {
        this.densidadeDemografica = densidadeDemografica;
    }

    public double getPibPcTotal() {
        return pibPcTotal;
    }

    public void setPibPcTotal(double pibPcTotal) {
        this.pibPcTotal = pibPcTotal;
    }

    public String getClassficacaoIDH() {
        return classficacaoIDH;
    }

    public void setClassficacaoIDH(String classficacaoIDH) {
        this.classficacaoIDH = classficacaoIDH;
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
                ", densidade=" + mostrarNumeroFormatado(densidadeDemografica,4) +
                ", pibTotal=" + mostrarNumeroFormatado(pibTotal,5) +
                ", classficacaoIDH=" + classficacaoIDH +
                '}';
    }

    public String toCSV(){
        return
                        "\n" +
                        id + ";" +
                        municipio + ";" +
                        microgeriao + ";" +
                        estado+ ";" +
                        regiaoGeografica + ";" +
                        mostrarNumeroFormatado(area,3)+ ";" +
                        mostrarNumeroFormatado(populacao,5)+ ";" +
                        mostrarNumeroFormatado(domicilios,4)+ ";" +
                        mostrarNumeroFormatado(pibTotal,5)+ ";" +
                        mostrarNumeroFormatado(idh,5)+ ";" +
                        mostrarNumeroFormatado(rendaMedia,4)+ ";" +
                        mostrarNumeroFormatado(rendaNominal,3)+ ";" +
                        pea+ ";" +
                        mostrarNumeroFormatado(idhEducacao,5)+ ";" +
                        mostrarNumeroFormatado(idhLongevidade,5);
    }

    public String toCSVOut(){
        return
                "\n" +
                        id + ";" +
                        municipio + ";" +
                        microgeriao + ";" +
                        estado+ ";" +
                        regiaoGeografica + ";" +
                        mostrarNumeroFormatado(area,3)+ ";" +
                        mostrarNumeroFormatado(populacao,5)+ ";" +
                        mostrarNumeroFormatado(domicilios,4)+ ";" +
                        mostrarNumeroFormatado(pibTotal,5)+ ";" +
                        mostrarNumeroFormatado(idh,5)+ ";" +
                        mostrarNumeroFormatado(rendaMedia,4)+ ";" +
                        mostrarNumeroFormatado(rendaNominal,3)+ ";" +
                        pea+ ";" +
                        mostrarNumeroFormatado(idhEducacao,5)+ ";" +
                        mostrarNumeroFormatado(idhLongevidade,5)+ ";" +
                        mostrarNumeroFormatado(densidadeDemografica,5)+ ";" +
                        mostrarNumeroFormatado(pibPcTotal,5)+ ";" +
                        classficacaoIDH;
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
