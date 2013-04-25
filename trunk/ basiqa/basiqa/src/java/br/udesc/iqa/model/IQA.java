package br.udesc.iqa.model;

public class IQA {

    private Double coliformes;

    private Double ph = null;

    private Double dbo;

    private Double nitrogenioTotal;

    private Double fosforoTotal;

    private Double variacaoTemperatura;

    private Double turbidez;

    private Double od;

    private Double solidosTotais;

    private Double resultado;

    private Nivel nivel;

    public Double getColiformes() {
        return coliformes;
    }

    public void setColiformes(Double coliformes) {
        this.coliformes = coliformes;
    }

    public Double getDbo() {
        return dbo;
    }

    public void setDbo(Double dbo) {
        this.dbo = dbo;
    }

    public Double getFosforoTotal() {
        return fosforoTotal;
    }

    public void setFosforoTotal(Double fosforoTotal) {
        this.fosforoTotal = fosforoTotal;
    }

    public Double getNitrogenioTotal() {
        return nitrogenioTotal;
    }

    public void setNitrogenioTotal(Double nitrogenioTotal) {
        this.nitrogenioTotal = nitrogenioTotal;
    }

    public Double getOd() {
        return od;
    }

    public void setOd(Double od) {
        this.od = od;
    }

    public Double getPh() {
        return ph;
    }

    public void setPh(Double ph) {
        this.ph = ph;
    }

    public Double getSolidosTotais() {
        return solidosTotais;
    }

    public void setSolidosTotais(Double solidosTotais) {
        this.solidosTotais = solidosTotais;
    }

    public Double getTurbidez() {
        return turbidez;
    }

    public void setTurbidez(Double turbidez) {
        this.turbidez = turbidez;
    }

    public Double getVariacaoTemperatura() {
        return variacaoTemperatura;
    }

    public void setVariacaoTemperatura(Double variacaoTemperatura) {
        this.variacaoTemperatura = variacaoTemperatura;
    }

    public Double getResultado() {
        return resultado;
    }

    public void setResultado(Double resultado) {
        this.resultado = resultado;
    }

    public Nivel getNivel() {
        return nivel;
    }

    public void setNivel(Nivel nivel) {
        this.nivel = nivel;
    }
}