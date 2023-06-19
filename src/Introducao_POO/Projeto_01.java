package Introducao_POO;

import javax.swing.JOptionPane;
public class Projeto_01 {
    public static void main(String[] args) {
        int[] valores = new int[10];
        for(int i=0;i<10;i++){
            valores[i] = Integer.parseInt(JOptionPane.showInputDialog("Informe o " + (i+1) + "º valor: "));
        }
        String repetir;

        do{
            int opcao = Integer.parseInt(JOptionPane.showInputDialog("O que você deseja ver?: "

                    + "\n 1 - Todos os valores"
                    + "\n 2 - Somente o primeiro Valor"
                    + "\n 3 - Somente o ultimo Valor"
                    + "\n 4 - Ver os valores pares"
            ));


            switch (opcao) {
                //Mostrando todos os valores
                case 1 -> {
                    for (int i = 0; i < 10; i++) {
                        JOptionPane.showMessageDialog(null, valores[i], "Valor " + (i + 1), JOptionPane.INFORMATION_MESSAGE);
                    }
                }
                //Mostrando somente o primeiro valor.
                case 2 ->
                        JOptionPane.showMessageDialog(null, valores[0], "Primeiro valor", JOptionPane.INFORMATION_MESSAGE);

                //Mostrando somente o ultimo valor.
                case 3 ->
                        JOptionPane.showMessageDialog(null, valores[9], "Ultimo valor", JOptionPane.INFORMATION_MESSAGE);

                //Mostrando somente os valores pares
                case 4 -> {
                    String valoresPares = "";
                    for (int i = 0; i < 10; i++) {
                        if (valores[i] % 2 == 0) {
                            if (valoresPares != "") {
                                valoresPares += ", ";
                            }
                            valoresPares += valores[i];
                        }
                    }
                    JOptionPane.showMessageDialog(null, valoresPares, "Valores Pares", JOptionPane.INFORMATION_MESSAGE);
                }
                //caso a opcão seja inválida.
                default -> JOptionPane.showMessageDialog(null, "Opção inválida", "Erro", JOptionPane.WARNING_MESSAGE);
            }
            repetir = JOptionPane.showInputDialog("Deseja voltar ao menu? "
                    + "\n Digite S para sim ou outro caractere para encerrar: ");
        } while(repetir.equals("S"));
    }
}
