package com.pss.exercicio_1802.model;

import java.util.Scanner;

/**
 *
 * @author mayco
 */
public class Principal {
    public static void main(String[] args) {
        Scanner ler = new Scanner(System.in);
        double n;
        
        GerenteImediato f1 = new GerenteImediato();
        GerenteGeral f2 = new GerenteGeral();
        DiretorFinanceiro f3 = new DiretorFinanceiro();
        DiretorGeral f4 = new DiretorGeral();
                
        System.out.println("Limite a ser aprovado: ");
        n = ler.nextDouble();
        
        if(n<=500){
            f1.processarAprovacao(n);
        }else if (n>500){
            f2.processarAprovacao(n);
            if(n>1500){
                f3.processarAprovacao(n);
            }
            if(n>5000){
                f4.processarAprovacao(n);
            }
        }else if (n>15000){
            System.out.println("O valor não pôde ser aprovado");
        }
        
        //FORMA2
//        if(n < f1.limiteAprovacao){
//            System.out.println("Limite de R$" + n +" aprovado pelo Gerente Imediato");
//        }else if(n > f1.limiteAprovacao && n < f2.limiteAprovacao){
//            System.out.println("Limite de R$" + n +" aprovado pelo Gerente Geral");
//        }else if(n > f2.limiteAprovacao && n < f3.limiteAprovacao){
//            System.out.println("Limite de R$" + n +" aprovado pelo Diretor Financeiro");
//        }else if(n>f3.limiteAprovacao && n<f4.limiteAprovacao){
//            System.out.println("Limite de R$" + n +" aprovado pelo Diretor Geral");
//        }else{
//            System.out.println("O Limite de R$" + n +" não pôde ser aprovado");
//        }
    }
}
