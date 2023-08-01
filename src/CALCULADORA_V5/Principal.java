package CALCULADORA_V5;

import javax.swing.*;

public class Principal {

    public static void main(String[] args){
        int continuar;
        double resultado = 0;

        do{
            double num1 = EntradaSaida.solicitaNumero("1º");
            double num2 = EntradaSaida.solicitaNumero("2º");
            int operacao = EntradaSaida.solicitaOperacao();

            switch (operacao){
                case 1 ->{
                    Soma soma = new Soma();
                    soma.setNum1(num1);
                    soma.setNum2(num2);
                    resultado = soma.calcula();
                }
                case 2 ->{
                    Subtracao sub = new Subtracao();
                    sub.setNum1(num1);
                    sub.setNum2(num2);
                    resultado = sub.calcula();
                }
                case 3 ->{
                    CALCULADORA_V5.Multiplicacao multi = new Multiplicacao();
                    multi.setNum1(num1);
                    multi.setNum2(num2);
                    resultado = multi.calcula();
                }
                case 4 ->{
                    while(num2==0){
                        num2= EntradaSaida.solicitaNumero("2º");
                    }
                    CALCULADORA_V5.Divisao divi = new Divisao();
                    divi.setNum1(num1);
                    divi.setNum2(num2);
                    resultado = divi.calcula();
                }
                default -> {
                    JOptionPane.showMessageDialog(null, "Operação inválida! A calculador será encerrada!");
                    System.exit(0);
                }
            }
            
            EntradaSaida.mostraResultado(resultado, operacao);
            continuar = Integer.parseInt(JOptionPane.showInputDialog("Deseja continuar calculando? 1- Sim | 2- Não "));

        } while(continuar == 1);

        JOptionPane.showMessageDialog(null, "Obrigado por utilizar minha calculadora :)");
    }

}
