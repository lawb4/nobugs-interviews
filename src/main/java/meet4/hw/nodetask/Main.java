package meet4.hw.nodetask;

import static meet4.hw.nodetask.Node.print;
import static meet4.hw.nodetask.Node.reverse;

public class Main {

    public static void main(String[] args) {
        //Создадим узлы списка 1 → 2 → 3 → 4 → 5 → null
        Node head = new Node(1);
        head.next = new Node(2);
        head.next.next = new Node(3);
        head.next.next.next = new Node(4);
        head.next.next.next.next = new Node(5);

        System.out.println("Дефолтный список: ");
        print(head);

        System.out.println("Разворачиваем список...");
        head = reverse(head);

        System.out.println("Перевёрнутый список: ");
        print(head);
    }
}
