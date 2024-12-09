package meet6.hw;

import static meet6.hw.Node.print;
import static meet6.hw.Node.reverse;

/*Задача 2:
Обращение связанного списка (Reverse Linked List):
Обратите связанный список.

Пример:
Вход: 1->2->3->4->5->NULL
Выход: 5->4->3->2->1->NULL
*/
public class ReverseLinkedList {
    public static void main(String[] args) {
        Node head = new Node(1);
        head.next = new Node(2);
        head.next.next = new Node(3);
        head.next.next.next = new Node(4);
        head.next.next.next.next = new Node(5);

        print(head);
        //print(reverse(head));
        head = reverse(head);
        print(head);
    }
}

class Node {
    Node next;
    int value;

    Node(int value) {
        this.value = value;
    }

    public static Node reverse(Node head) {
        //  Node(prev) <- Node(cur) -> Node(next)
        Node prev = null;
        Node cur = head;
        Node next;

        while (cur != null) {
            next = cur.next;
            cur.next = prev;
            prev = cur;
            cur = next;
        }
        return prev;
    }

    public static void print(Node head) {
        while (head != null) {
            System.out.printf("%d->", head.value);
            head = head.next;
        }
        System.out.println("NULL");
    }
}
