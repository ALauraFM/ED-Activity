package StaticList;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        int option;


        List list = new List();
        Scanner sc = new Scanner(System.in);
        do {
            System.out.println("""
                    Digite uma opção:\s
                    1-)Verificar se a lista está vazia
                    2-)Verificar se a lista está cheia
                    3-)Obter o tamanho da lista
                    4-)Obter/modificar o valor do elemento de uma determinada
                    posição na lista
                    5-)Sair"""
            );

            option = sc.nextInt();

            switch (option) {

                case 1:
                    if (list.empty()) {
                        System.out.println("Lista vazia");
                        break;
                    }
                case 2:
                    if (!list.empty()) {
                        System.out.println("Lista cheia");
                        break;
                    }
                case 3:
                    System.out.println(list.size());
                    break;
                case 4:
                    System.out.println("""
                            Você gostaria de obter ou modificar o valor do elemento de uma determinada posição na lista?
                            1)Obter
                            2)Modificar
                            \s""");
                    int choice;
                    choice = sc.nextInt();

                    if (choice == 1) {
                        System.out.println("De qual posição você gostaria de receber o valor?");
                        int position;
                        position = sc.nextInt();
                        System.out.println("Elemento da posição " + position + "\n" + list.element(position));
                    } else {
                        System.out.println("""
                                Você gostaria de inserir ou retirar um elemento na lista?
                                a)Inserir
                                b)Retirar""");
                        char modify;
                        modify = sc.next().charAt(0);

                        if (modify == 'a') {
                            System.out.println("Qual elemento você gostaria de inserir e em qual posição?");
                            int pos, element;
                            System.out.println("Elemento:");
                            element = sc.nextInt();
                            System.out.println("Posição:");
                            pos = sc.nextInt();
                            System.out.println(list.insert(pos, element));
                        }
                    }

            }

        }while(option != 5);
    }
}