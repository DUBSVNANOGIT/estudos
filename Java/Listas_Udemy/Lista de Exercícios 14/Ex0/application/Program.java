package application;

import entities.Product;
import services.ProductService;
import util.ProductConsumer;
import util.ProductFunction;
import util.ProductPredicate;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.function.Consumer;
import java.util.function.Function;
import java.util.function.Predicate;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class Program {

    public static void main(String[] args) {
//        List<Product> list = new ArrayList<>();
//
//        list.add(new Product("Tv", 900.00));
//        list.add(new Product("Mouse", 50.00));
//        list.add(new Product("Tablet", 350.50));
//        list.add(new Product("HD Case", 80.90));


        //Método tradicional
//        list.sort(new MyComparator());

        //Método Função Anonima
//      Comparator<Product> comp = new Comparator<Product>() {
//          @Override
//          public int compare(Product p1, Product p2) {
//              return p1.getName().toUpperCase().compareTo(p2.getName().toUpperCase());
//          }
//      };

        //Método Arrow Function
//      Comparator<Product> comp = (p1,p2) -> {
//          return p1.getName().toUpperCase().compareTo(p2.getName().toUpperCase());
//      };

        //Arrow Function Melhorada
//      Comparator<Product> comp = (p1,p2) ->  p1.getName().toUpperCase().compareTo(p2.getName().toUpperCase());
//
//      list.sort(comp);

        //Função Lambda Melhorada
        //list.sort((p1,p2) ->  p1.getName().toUpperCase().compareTo(p2.getName().toUpperCase()));

// Predicate
        //Forma tradicional
        //list.removeIf(new ProductPredicate());

        //Reference method utilizando método estático, ver classe
        //list.removeIf(Product::staticProductPredicate);

        //Reference method com método não estático, ver classe
        //list.removeIf(Product::nonStaticProductPredicate);

        //Expressão lambda declarada
        //double min = 100;
        //Predicate<Product> pred = (p) -> p.getPrice() >= min;
        //list.removeIf(pred);

        //Expressão lambda inline
        //list.removeIf(p -> p.getPrice() >= 100);

//Consumer
        //Implementação de interface
        //list.forEach(new ProductConsumer());
        //list.forEach(System.out::println);

        //Reference method com método estático
        //list.forEach(Product::staticPriceUpdate);

        //Reference method com método não estático
        //list.forEach(Product::nonStaticPriceUpdate);

        //Expressão Lambda Declarada
        //Consumer<Product> cons = p -> {p.setPrice(p.getPrice() * 1.1);};
        //list.forEach(cons);

        //Expressão Lambda não Declarada
        //list.forEach(p -> p.setPrice(p.getPrice() * 1.1));

//Function
        //Implementação da interface
        //List<String> names = list.stream().map(new ProductFunction()).collect(Collectors.toList());
        //criamos uma nova lista com os elementos alterados
        //names.forEach(System.out::println);

        //Reference method com método estático
        //List<String> names = list.stream().map(Product::staticUpperCaseName).collect(Collectors.toList());
        //names.forEach(System.out::println);

        //Reference method sem método estático
        //List<String> names = list.stream().map(Product::nonStaticUpperCaseName).collect(Collectors.toList());
        //names.forEach(System.out::println);

        //Expressão Lambda Declarada
        //Function<Product, String> function = p -> p.getName().toUpperCase();
        //List<String> names = list.stream().map(function).collect(Collectors.toList());
        //names.forEach(System.out::println);

        //Expressão Lambda não Declarada
        //List<String> names = list.stream().map(p -> p.getName().toUpperCase()).collect(Collectors.toList());
        //names.forEach(System.out::println);

 //Função que recebe Função como argumento
        //ProductService ps = new ProductService();
        //double sum = ps. filteredSum(list, p -> p.getName().charAt(0) == 'T');
        //System.out.println("Sum: " + String.format("%.2f", sum));

// Stream
        //List<Integer> list = Arrays.asList(3, 4, 5, 10, 7);
        //Stream<Integer> st1 = list.stream().map(x -> x * 10);
        //System.out.println(Arrays.toString(st1.toArray()));

        //Stream<String> st2 = Stream.of("Maria", "Alex", "Bob");
        //System.out.println(Arrays.toString(st2.toArray()));

        //Stream<Integer> st3 = Stream.iterate(0, x -> x + 2);
        //System.out.println(Arrays.toString(st3.limit(10).toArray()));

        //Stream de Sequencia de fibonacci
        //Stream<Long> st4 = Stream.iterate(new Long[] {0L, 1L}, p -> new Long[] {p[1], p[0]+p[1]}).map(p -> p[0]);
        //System.out.println(Arrays.toString(st4.limit(10).toArray()));

//Pipeline
        List<Integer> list = Arrays.asList(3, 4, 5, 10, 7);
        Stream<Integer> st1 = list.stream().map(x-> x*10);
        System.out.println(Arrays.toString(st1.toArray()));

        int sum = list.stream().reduce(0, (x,y) -> x+y);
        System.out.println("Sum =" + sum);

        List<Integer> newList = list.stream()
                .filter(x -> x % 2 == 0)
                .map(x -> x * 10)
                .collect(Collectors.toList());

        System.out.println(Arrays.toString(newList.toArray()));

    }
}
