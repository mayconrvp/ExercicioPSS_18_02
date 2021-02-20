package com.pss.exercicio_1802.model;

public class Funcionario implements ProcessaAprovacao {
    protected double limiteAprovacao;
    protected String cargo;
    
    public Funcionario(String cargo, double limiteAprovacao){
        this.cargo = cargo;
        this.limiteAprovacao = limiteAprovacao;
    }
    
    @Override
    public void processarAprovacao(double valor) {
        if (valor<=this.limiteAprovacao){
            System.out.println("Limite Aprovado pelo " +this.cargo);
        }else{
            System.out.println("Limite não pode ser aprovado pelo " +this.cargo);
        }
    }
    
    public double getLimiteAprovacao() {
        return limiteAprovacao;
    }

    public void setLimiteAprovacao(double limiteAprovacao) {
        this.limiteAprovacao = limiteAprovacao;
    }

    public String getCargo(){
        return cargo;
    }
    
    public void setCargo(String cargo){
        this.cargo = cargo;
    }
    
}
