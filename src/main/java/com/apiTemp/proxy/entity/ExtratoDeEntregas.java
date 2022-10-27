package com.apiTemp.proxy.entity;

public class ExtratoDeEntregas {
    private int exercicio;
    private int cod_ibge;
    private int populacao;
    private String instituicao;
    private String entregavel;
    private int periodo;
    private char periodicidade;
    private String status_relatorio;
    private String data_status;
    private char forma_envio;
    private char tipo_relatorio;

    public int getExercicio() {
        return exercicio;
    }

    public void setExercicio(int exercicio) {
        this.exercicio = exercicio;
    }

    public int getCod_ibge() {
        return cod_ibge;
    }

    public void setCod_ibge(int cod_ibge) {
        this.cod_ibge = cod_ibge;
    }

    public int getPopulacao() {
        return populacao;
    }

    public void setPopulacao(int populacao) {
        this.populacao = populacao;
    }

    public String getInstituicao() {
        return instituicao;
    }

    public void setInstituicao(String instituicao) {
        this.instituicao = instituicao;
    }

    public String getEntregavel() {
        return entregavel;
    }

    public void setEntregavel(String entregavel) {
        this.entregavel = entregavel;
    }

    public int getPeriodo() {
        return periodo;
    }

    public void setPeriodo(int periodo) {
        this.periodo = periodo;
    }

    public char getPeriodicidade() {
        return periodicidade;
    }

    public void setPeriodicidade(char periodicidade) {
        this.periodicidade = periodicidade;
    }

    public String getStatus_relatorio() {
        return status_relatorio;
    }

    public void setStatus_relatorio(String status_relatorio) {
        this.status_relatorio = status_relatorio;
    }

    public String getData_status() {
        return data_status;
    }

    public void setData_status(String data_status) {
        this.data_status = data_status;
    }

    public char getForma_envio() {
        return forma_envio;
    }

    public void setForma_envio(char forma_envio) {
        this.forma_envio = forma_envio;
    }

    public char getTipo_relatorio() {
        return tipo_relatorio;
    }

    public void setTipo_relatorio(char tipo_relatorio) {
        this.tipo_relatorio = tipo_relatorio;
    }
}
