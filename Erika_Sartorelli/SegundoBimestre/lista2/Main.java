package SegundoBimestre.lista2;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.Map;
import java.util.function.Function;
import java.util.stream.Collectors;

public class Main {
        private static List<Produto> produtos = new ArrayList<>();
    public static void main(String[] args) {
        atv01();
        atv02();
        atv03();
        atv04();
        atv05();
        atv06();
    }

    private static void atv01() {
        List<Integer> numeros = new ArrayList<>(List.of(1, 2, 3, 4, 5, 6, 7, 8, 9, 10));

        List<Integer> numerosPares = numeros.stream().filter(n -> (n % 2) == 0).toList();

        System.out.println(numerosPares);
    }

    private static void atv02() {
        List<String> nomes = new ArrayList<>(List.of("roberto", "josé", "caio", "vinicius"));

        List<String> nomesMaiuculos = nomes.stream().map(String::toUpperCase).toList();

        System.out.println(nomesMaiuculos);
    }

    private static void atv03() {
        List<String> palavras = new ArrayList<>(List.of("se", "talvez", "hoje", "sábado", "se", "quarta", "sábado"));

        Map<String, Long> contadorDeRepeticao = palavras.stream().collect(Collectors.groupingBy(Function.identity(), Collectors.counting()));

        System.out.println(contadorDeRepeticao);
    }

    private static void atv04() {
        produtos.add(new Produto("a", 99.49));
        produtos.add(new Produto("b", 123.25));
        produtos.add(new Produto("c", 112.75));
        produtos.add(new Produto("d", 105.51));

        List<Produto> produtosPrecoMaiorCem = produtos.stream().filter(p -> p.getPreco() > 100).toList();
        System.out.println(produtosPrecoMaiorCem);
    }

    private static void atv05() {
        double somaProdutos = produtos.stream().mapToDouble(Produto::getPreco).sum();
        System.out.println(somaProdutos);
    }

    private static void atv06() {
        List<String> linguagens = new ArrayList<>(List.of("Java", "Python", "C", "JavaScript", "Ruby"));

        List<String> linguagensOrdenadaPorTamanho = linguagens.stream().sorted(Comparator.comparing(String::length)).toList();

        System.out.println(linguagensOrdenadaPorTamanho);
    }
}
