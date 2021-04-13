package com.br.pedro;

import com.br.pedro.entities.Client;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

public class Main {
    public static void main(String[] args) {
        /*
            Filtrar os clientes do tipo pessoa física com filter
            Ordenar os clientes por limite de forma decrescente com sorted.reversed
            Limitar aos 5 primeiros clientes usando limit
            Obter o nome de cada cliente com map
            Armazenar o resultado em uma lista com collect

         */

        List<Client> clientList = new ArrayList<>();

        clientList.add(new Client("Ronaldo Alves", "PF", 10000.00));
        clientList.add(new Client("Renato Alves", "PF", 5000.00));
        clientList.add(new Client("Renata Alves", "PJ", 2000.00));
        clientList.add(new Client("Luke Alves", "PF", 25000.00));
        clientList.add(new Client("Renata Alves", "PJ", 2000.00));
        clientList.add(new Client("Daiane Aline", "PJ", 75000.00));
        clientList.add(new Client("Thomas Vicente", "PF", 38000.00));
        clientList.add(new Client("Débora Amanda", "PJ", 20000.00));

        List<Client> pessoaFisicaList = clientList.stream().filter(client -> client.getTypeReceivingUser().equalsIgnoreCase("PF")).collect(Collectors.toList());

        List<Client> ordernarList = clientList.stream().sorted(Comparator.comparing(Client::getBalance).reversed()).collect(Collectors.toList());

        List<Client> limitList = clientList.stream().limit(5).collect(Collectors.toList());

        List<String> nameList = clientList.stream().map(Client::getName).collect(Collectors.toList());

        clientList.stream().filter(client -> client.getTypeReceivingUser().equalsIgnoreCase("PF")).sorted(Comparator.comparing(Client::getBalance).reversed()).limit(5).map(Client::getName).collect(Collectors.toList()).forEach(System.out::println);
    }
}

