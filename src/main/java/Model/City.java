/*
 * Copyright (C) 2024 Gabriel Cândido Ribeiro da Silva <gcrs2018@gmail.com> 
 * Copyright (C) 2024 Gustavo Rezende Gabriel <gustavorezendegabriel@hotmail.com>
 * Copyright (C) 2024 João Vitor Bier Barros <joaovitorbierbarros@gmail.com>
 * Copyright (C) 2024 Theo da Silva Sa <03silva.theo@gmail.com>
 *
 * This program is free software: you can redistribute it and/or modify
 * it under the terms of the GNU General Public License as published by
 * the Free Software Foundation, either version 3 of the License, or
 * (at your option) any later version.
 *
 * This program is distributed in the hope that it will be useful,
 * but WITHOUT ANY WARRANTY; without even the implied warranty of
 * MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE.  See the
 * GNU General Public License for more details.
 *
 * You should have received a copy of the GNU General Public License
 * along with this program.  If not, see <http://www.gnu.org/licenses/>.
 */
package Model;

import java.text.DecimalFormat;
import java.util.Date;
/**
 *
 * @author Gabriel Cândido Ribeiro da Silva <gcrs2018@gmail.com>
 * @author Gustavo Rezende Gabriel <gustavorezendegabriel@hotmail.com>
 * @author João Vitor Bier Barros <joaovitorbierbarros@gmail.com>
 * @author Theo da Silva Sa <03silva.theo@gmail.com>
 * @date 03/06/2024
 * @brief Class Main
 */

public class City {

    String id;
    String municipio;
    String microregiao;
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
    String ultimaAtualizacao;
    //variáveis geradas através de operações da própria classe com dados base
    double densidadeDemografica;
    double pibPcTotal;
    String classficacaoIDH;
    String classificacaoIDHEdu;
    String classificacaoIDHLongevidade;

    //CONSTRUTOR QUE SE USA PARA LER O ARQUIVO DE ENTRADA
    public City(String id,
                String municipio,
                String microregiao,
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
        this.microregiao = microregiao;
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
        this.ultimaAtualizacao = "-";
        //contas para setar as 3 variáveis dependentes
        this.densidadeDemografica = (pibTotal/populacao);
        this.pibPcTotal = (pibTotal/populacao);
        this.classficacaoIDH = avaliacaoIdh(idh);
        this.classificacaoIDHEdu = avaliacaoIdh(idhEducacao);
        this.classificacaoIDHLongevidade = avaliacaoIdh(idhLongevidade);
        
    }

    //CONSTRUTOR COM TUDO PARA SE USAR MAIS PRA LER O ARQUIVO DE SAIDA
    public City(
            String id,
            String municipio,
            String microregiao,
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
            double idhLongevidade,
            double densidadeDemografica,
            double pibPcTotal,
            String classficacaoIDH,
            String ultimaAtualizacao,
            String classificacaoIdhEdu,
            String classificacaoIdhLongevidade
            ){
        this.id = id;
        this.municipio = municipio;
        this.microregiao = microregiao;
        this.estado = estado;
        this.regiaoGeografica = regiaoGeografica;
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
        this.ultimaAtualizacao = ultimaAtualizacao;
        this.densidadeDemografica = densidadeDemografica;
        this.pibPcTotal = pibPcTotal;
        this.classficacaoIDH = classficacaoIDH;
        this.classificacaoIDHEdu = classificacaoIdhEdu;
        this.classificacaoIDHLongevidade = classificacaoIdhLongevidade;
    }

    public City(){}

    public String avaliacaoIdh(double idh){
        
        String avaliacao = "";
        
         if(idh > 0.8){
            avaliacao = "MUITO ALTO";
        }else if(idh > 0.7 && idh <= 0.8){
            avaliacao = "ALTO";
        }else if(idh > 0.55 && idh <= 0.7){
            avaliacao = "MÉDIO";
        }else if(idh <= 0.55){
            avaliacao = "BAIXO";
        }
         
        return avaliacao;
    }
    
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

    public String getMicroregiao() {
        return microregiao;
    }

    public void setMicroregiao(String microgeriao) {
        this.microregiao = microgeriao;
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

    public void setDensidadeDemografica(double densidadeDemografica) {this.densidadeDemografica = densidadeDemografica;}

    public double getPibPcTotal() {return pibPcTotal;}

    public void setPibPcTotal(double pibPcTotal) {this.pibPcTotal = pibPcTotal;}

    public String getClassficacaoIDH() {return classficacaoIDH;}

    public void setClassficacaoIDH(String classficacaoIDH) {this.classficacaoIDH = classficacaoIDH;}

    public String getClassificacaoIDHEdu() {return classificacaoIDHEdu;}

    public void setClassificacaoIDHEdu(String classificacaoIDHEdu) {this.classificacaoIDHEdu = classificacaoIDHEdu;}

    public String getClassificacaoIDHLongevidade() {return classificacaoIDHLongevidade;}

    public void setClassificacaoIDHLongevidade(String classificacaoIDHLongevidade) {this.classificacaoIDHLongevidade = classificacaoIDHLongevidade;}
    
    

    public void setUltimaAtualizacao(String momento) {this.ultimaAtualizacao = momento;}

    public String getUltimaAtualizacao() {return ultimaAtualizacao;}

    //TO STRING
    @Override
    public String toString() {
        return "City{" +
                "id=" + id +
                ", municipio='" + municipio + '\'' +
                ", microgeriao='" + microregiao + '\'' +
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
                ", pib Per Capta Total=" + mostrarNumeroFormatado(pibPcTotal,5) +
                ", classficacaoIDH=" + classficacaoIDH +
                ", classificaoIDHEdu=" + classificacaoIDHEdu +
                ", classificacaoIDHLongevidade" + classificacaoIDHLongevidade +
                ", ultimaAlteracao= " + ultimaAtualizacao +
                '}';
    }

    public String toCSV(){
        return
                        
                        id + ";" +
                        municipio + ";" +
                        microregiao + ";" +
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
                        ultimaAtualizacao + "\n";
                
    }

    public String toCSVOut(){
        return
                
                        id + ";" +
                        municipio + ";" +
                        microregiao + ";" +
                        estado+ ";" +
                        regiaoGeografica + ";" +
                        mostrarNumeroFormatado(area,3)+ ";" +
                        mostrarNumeroFormatado(populacao,5)+ ";" +
                        mostrarNumeroFormatado(domicilios,4)+ ";" +
                        mostrarNumeroFormatado(pibTotal,5)+ ";" +
                        mostrarNumeroFormatado(idh,5)+ ";" +
                        mostrarNumeroFormatado(rendaMedia,4)+ ";" +
                        mostrarNumeroFormatado(rendaNominal,3)+ ";" +
                        mostrarNumeroFormatado(pea,4)  + ";" +
                        mostrarNumeroFormatado(idhEducacao,5)+ ";" +
                        mostrarNumeroFormatado(idhLongevidade,5)+ ";" +
                        mostrarNumeroFormatado(densidadeDemografica,5)+ ";" +
                        mostrarNumeroFormatado(pibPcTotal,5)+ ";" +
                        classficacaoIDH + ";" +
                        ultimaAtualizacao + ";"+
                        classificacaoIDHEdu + ";" +
                        classificacaoIDHLongevidade +"\n";
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
