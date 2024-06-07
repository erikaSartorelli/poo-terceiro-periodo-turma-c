package SegundoBimestre.lista3;

import javax.swing.*;
import java.util.ArrayList;
import java.util.List;

public class Main {
      public static void main(String[] args) {
        atv01();
        atv02();
        atv03();
        atv04();
        atv05();
        atv06();
    }

    private static void atv01() {
        JOptionPane.showMessageDialog(null, "Olá, Mundo!");
    }

    private static void atv02() {
        String nome = JOptionPane.showInputDialog("Qual seu nome:");
        JOptionPane.showMessageDialog(null, "Seja bem vindo " + nome);
    }

    private static void atv03() {
        int opcao = JOptionPane.showConfirmDialog(null, "Deseja Continuar?");
        if (opcao == 0) {
            JOptionPane.showMessageDialog(null, "Continuando!");
        } else {
            JOptionPane.showMessageDialog(null, "Saindo!");
        }
    }

    private static void atv04() {
        List<String> opcoes = new ArrayList<>(List.of("Opção 1", "Opção 2", "Opção 3"));
        String opcao = (String) JOptionPane.showInputDialog(
                null,
                "Escolha um opção",
                "Atividade 4",
                JOptionPane.QUESTION_MESSAGE,
                null,
                opcoes.toArray(),
                opcoes.toArray()[0]
        );
        switch (opcao) {
            case "Opção 1" -> JOptionPane.showMessageDialog(null, "Opção 1 escolhida");
            case "Opção 2" -> JOptionPane.showMessageDialog(null, "Opção 2 escolhida");
            case "Opção 3" -> JOptionPane.showMessageDialog(null, "Opção 3 escolhida");
        }
    }

    private static void atv05() {
        try {
            throw new ErroPersonalizadoException("Algum erro aconteceu!");
        } catch (ErroPersonalizadoException e) {
            JOptionPane.showMessageDialog(null, e.getMessage(), "Atividade 5", JOptionPane.ERROR_MESSAGE);
        }
    }

    private static void atv06() {
        List<String> options = new ArrayList<>(List.of("+", "-", "*", "/"));
        String option = (String) JOptionPane.showInputDialog(
                null,
                "Escolha um opção:",
                "Atividade 4",
                JOptionPane.QUESTION_MESSAGE,
                null,
                options.toArray(),
                options.toArray()[0]
        );

        Double num1;
        Double num2;
        try {
            String numStr1 = JOptionPane.showInputDialog("Numero 1");
            String numStr2 = JOptionPane.showInputDialog("Numero 2");

            num1 = Double.parseDouble(numStr1);
            num2 = Double.parseDouble(numStr2);
        } catch (NumberFormatException | NullPointerException e) {
            JOptionPane.showMessageDialog(null, "Numero invalido!");
            return;
        }

        double total = 0;
        switch (option) {
            case "+" -> total = num1 + num2;
            case "-" -> total = num1 - num2;
            case "*" -> total = num1 * num2;
            case "/" -> total = num1 / num2;
        }

        String msg = "Resultado: " + total;
        JOptionPane.showMessageDialog(null, msg);
    }  
}
