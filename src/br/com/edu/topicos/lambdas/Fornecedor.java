package br.com.edu.topicos.lambdas;

import java.util.Arrays;
import java.util.List;
import java.util.function.Supplier;

public class Fornecedor {
    public static void main(String[] args) {
        Supplier<List<String>> lista = () -> Arrays.asList("camila", "bia","ana");
        System.out.println(lista.get());
    }
}
