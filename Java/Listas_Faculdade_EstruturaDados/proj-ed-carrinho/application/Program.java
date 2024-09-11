package application;

import entities.Carrinho;
import entities.ItemCompra;
import entities.Produto;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Program {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        List<Produto> produtos = new ArrayList<>();
        popular(produtos);
        System.out.println("Produtos: ");
        for(Produto p : produtos) {
            System.out.printf("\nCódigo: %d | Descrição: %s | Preço: %.2f",p.getCodigo(), p.getDescricao(), p.getPreco());
        }
        Carrinho carrinho = new Carrinho(buscarProduto(produtos, sc), 0.10);
        carrinho.mostraCarrinho();
    }

    public static List<ItemCompra> buscarProduto(List<Produto> produtos, Scanner sc) {
        List<ItemCompra> itensC = new ArrayList<>();
        System.out.println("\nDigite um código (ou 99999 para fim): ");
        int cod = sc.nextInt();
        while (cod != 99999) {
            for (Produto p : produtos) {
                if (p.getCodigo() == cod) {
                    System.out.println("Produto Encontrado!");
                    System.out.println("Quantidade: ");
                    int qtdeProdutos = sc.nextInt();
                    itensC.add(new ItemCompra(p.getDescricao(), qtdeProdutos, p.getPreco()));
                }
            }
            System.out.printf("\nDigite um novo código (ou 99999 para fim): ");
            cod = sc.nextInt();
        }
        return itensC;
    }

    public static void popular(List<Produto> produtos) {
        String path = "C:\\Users\\Duqo\\Desktop\\Estudo\\Java\\Listas_Faculdade_EstruturaDados\\proj-ed-carrinho\\PRODUTOS.txt";
        try (BufferedReader br = new BufferedReader(new FileReader(path))) {
            String temp = br.readLine();
            String[] campos;
            while (temp != null) {
                campos = temp.split(";");
                produtos.add(new Produto(Integer.parseInt(campos[0]), campos[1], Double.parseDouble(campos[2])));
                temp = br.readLine();
            }

        } catch (IOException e) {
            System.out.println(e.getMessage());
        }
    }
}
