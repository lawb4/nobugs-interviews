package meet4.hw.nodetask;

class Node {
    int value; // значение ноды
    Node next; // ссылка на следующую ноду

    Node(int value) {
        this.value = value;
    }

    public static Node reverse(Node head) {
        Node prev = null; //предыдущая нода не существует в самом начале
        Node cur = head; //начинаем с самого начала (головы) -- 1
        Node next; //временная переменная (хранилище) для ноды

        //пока cur нода не стала null, производим операцию по разворачиванию нод
        while (cur != null) {
            next = cur.next; //next нода = та нода, на которую указывает cur нода -- 2,3,4,5,null
            //меняем _ссылочный указатель_ next (направление ссылки (стрелки)). Указываем на prev ноду
            cur.next = prev; // -- 1 → null, 2 → 1, 3 → 2, 4 → 3, 5 → 4
            prev = cur; //предыдущая нода становится текущей нодой -- 1,2,3,4,5
            cur = next; //текущая нода становится следующей нодой -- 2,3,4,5,null
        }
        return prev; //возвращаем ноду prev, так как после разворачивания она становится cur (или head) нодой
    }

    public static void print(Node head) {
        Node cur = head; //начинаем с самого начала (головы)
        //пока current нода не стала null, выводим на экран ноды
        while (cur != null) {
            System.out.printf("%d → ", cur.value); //выводим на экран значение текущей ноды
            //для следующей итерации берём следующую ноду, из которой потом также будем доставать значение
            cur = cur.next;
        }
        System.out.println("null");
    }
}