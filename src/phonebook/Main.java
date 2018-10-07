package phonebook;

import java.util.Scanner;
import java.util.ArrayList;

/**
 * Classe Principal
 * @author Victtor da Silva Mendes - RA: 22.217.024-3
 */
public class Main {

    /**
     * Função que printa o menu de opções
     */
    public static void printTela() {
        System.out.println("Entre com uma das seguintes opções:");
        System.out.println("n [nova entrada]");
        System.out.println("d [apaga registro da agenda]");
        System.out.println("p [imprime toda a agenda]");
        System.out.println("q [sai do programa]");
    }

    /**
     * Função que printa todas pessoas e seus telefones
     * @param arr ArrayList com todas as pessoas
     */
    public static void printPhoneBook(ArrayList<PhoneBook> arr) {
        for (int i = 0; i < arr.size(); i++) {
            arr.get(i).print();
            System.out.println("--------------------");
        }
    }

    /**
     * Função que verifica se um nome está na lista
     * @param arr ArrayList com todas as pessoas
     * @param nome nome que vai se procurar
     * @return indice em que se encontra a pessoa procurada, ou -1 se não foi
     * encontrada
     */
    public static int containsName(ArrayList<PhoneBook> arr, String nome) {
        for (int i = 0; i < arr.size(); i++) {
            if (arr.get(i).getNome().equals(nome)) {
                return i;
            }
        }
        return -1;
    }

    /**
     * Função main
     * @param args args
     */
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        ArrayList<PhoneBook> p = new ArrayList<PhoneBook>();
        char op;
        do {
            printTela();
            op = input.next().charAt(0);
            if (op == 'n') {
                System.out.println("Entre com o nome:");
                String nome = input.next();
                System.out.println("Entre com o telefone:");
                String telefone = input.next();
                p.add(new PhoneBook(nome, telefone));
            } else if (op == 'd') {
                System.out.println("Entre com o nome:");
                String nome = input.next();
                int index = containsName(p, nome);
                if (index != -1) {
                    p.remove(index);
                    System.out.println("Registro removido");
                } else {
                    System.out.println("Este nome não está na lista telefonica");
                }
            } else if (op == 'p') {
                printPhoneBook(p);
            }
        } while (op != 'q');
        input.close();
    }

}
