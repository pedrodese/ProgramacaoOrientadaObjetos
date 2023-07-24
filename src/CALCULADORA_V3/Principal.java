package CALCULADORA_V3;

import CALCULADORA_V2.EntradaSaida;

import javax.swing.*;

public class Principal {

    private static Operacoes oper = new Operacoes();
    public static void main(String[] args) {
        int continuar;
        double resultado = 0;

        do{
            double num1 = CALCULADORA_V2.EntradaSaida.solicitaNumero("1º");
            double num2 = CALCULADORA_V2.EntradaSaida.solicitaNumero("2º");
            int operacao = CALCULADORA_V2.EntradaSaida.solicitaOperacao();

            switch (operacao){
                case 1 ->{
                    resultado = oper.calculaSoma(num1, num2);
                }
                case 2 ->{
                    resultado = oper.calculaSubtracao(num1, num2);
                }
                case 3 ->{
                    resultado = oper.calculaMultiplicacao(num1, num2);
                }
                case 4 ->{
                    while(num2==0){
                        num2= EntradaSaida.solicitaNumero("2º");
                    }
                    resultado = oper.calculaDivisao(num1, num2);
                }
                default -> {
                    JOptionPane.showMessageDialog(null, "Operação inválida! A calculador será encerrada!");
                    System.exit(0);
                }
            }
            
            EntradaSaida.mostraResultado(resultado, operacao);
            continuar = Integer.parseInt(JOptionPane.showInputDialog("Deseja continuar calculando? 1- Sim | 2- Não "));

        } while(continuar == 1);
    }

}
