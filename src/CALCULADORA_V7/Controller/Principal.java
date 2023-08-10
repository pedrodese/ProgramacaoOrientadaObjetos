package CALCULADORA_V7.Controller;

import CALCULADORA_V7.Model.*;
import CALCULADORA_V7.View.EntradaSaida;

import javax.swing.*;


public class Principal {

    public static void main(String[] args){
        int continuar;
        double resultado = 0;
        Operacoes oper = null;

        do{
            double num1 = EntradaSaida.solicitaNumero("1º");
            double num2 = EntradaSaida.solicitaNumero("2º");
            int operacao = EntradaSaida.solicitaOperacao();

            switch (operacao){
                case 1 ->{
                    oper = new Soma();
                }
                case 2 ->{
                    oper = new Subtracao();
                }
                case 3 ->{
                    oper = new Multiplicacao();
                }
                case 4 ->{
                    while(num2==0){
                        num2= EntradaSaida.solicitaNumero("2º");
                    }
                    oper = new Divisao();
                }
                default -> {
                    JOptionPane.showMessageDialog(null, "Operação inválida! A calculadora será encerrada!");
                    System.exit(0);
                }
            }
            oper.setNum1(num1);
            oper.setNum2(num2);
            resultado=oper.calcula();

            EntradaSaida.mostraResultado(resultado, operacao);
            continuar = Integer.parseInt(JOptionPane.showInputDialog("Deseja continuar calculando? 1- Sim | 2- Não "));

        } while(continuar == 1);

        JOptionPane.showMessageDialog(null, "Obrigado por utilizar minha calculadora :)");
    }

}

