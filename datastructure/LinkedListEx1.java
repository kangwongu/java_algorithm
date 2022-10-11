package datastructure;

// 노드 클래스 (데이터, 포인터)
class Node<T> {
    T data;
    Node<T> next = null;

    Node(T data, Node<T> next) {
        this.data = data;
        this.next = next;
    }

    Node(T data) {
        this.data = data;
    }
}

public class LinkedListEx1<T> {
    Node<T> head = null;
    int count;

    LinkedListEx1() {}

    LinkedListEx1(Node<T> head) {
        this.head = head;
        this.count = 0;
    }

    // 데이터 삽입
    public void insertAt(int index, T data) {
        try {
            if (index > this.count || index < 0) {
                throw new Exception("삽입 범위 에러");
            }
        } catch (Exception e) {
            e.printStackTrace();
        }

        Node<T> newNode = new Node<>(data);
        if (index == 0) {
            // 헤드노드에 삽입
            newNode.next = this.head;
            this.head = newNode;
        } else {
            // 그 이외 노드에 삽입
            Node<T> currentNode = this.head;
            // index의 전 노드로 이동
            for (int i=0; i<index-1; i++) {
                currentNode = currentNode.next;
            }
            // 참조 변경
            newNode.next = currentNode.next;
            currentNode.next = newNode;
        }
        this.count++;
    }

    // 전체 데이터 조회
    public void printAll() {
        Node<T> currentNode = this.head;

        while (currentNode != null) {
            System.out.println(currentNode.data);
            currentNode = currentNode.next;
        }
    }

    // 전체 데이터 비우기
    public void claer() {
        this.head = null;
        this.count = 0;
    }

    // 마지막에 데이터 삽입
    public void insertLast(T data) {
        insertAt(this.count, data);
    }

    // 데이터 삭제
    public Node<T> deleteAt(int index) {
        try {
            if (index > this.count || index < 0) {
                throw new Exception("삭제 범위 에러");
            }
        } catch (Exception e) {
            e.printStackTrace();
        }

        Node<T> currentNode = this.head;
        if (index == 0) {
            // 헤드 노드 삭제
            Node<T> deleteNode = this.head;
            this.head = this.head.next;
            this.count--;
            return deleteNode;
        } else {
            // 이외 노드 삭제
            // index의 전 노드로 이동
            for (int i=0; i<index-1; i++) {
                currentNode = currentNode.next;
            }
            Node<T> deleteNode = currentNode.next;
            currentNode.next = currentNode.next.next;
            this.count--;
            return deleteNode;
        }
    }

    // 마지막 데이터 삭제
    public Node<T> deleteLast() {
        return deleteAt(count-1);
    }

    // 특정 인덱스의 노드 읽기
    public Node<T> getNodeAt(int index) {
        try {
            if (index > this.count || index < 0) {
                throw new Exception("조회 범위 에러");
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
        Node<T> currentNode = this.head;
        for (int i=0; i<index; i++) {
            currentNode = currentNode.next;
        }
        return currentNode;
    }

    public static void main(String[] args) {
        Node<Integer> node1  = new Node<>(1);
        Node<Integer> node2  = new Node<>(2);
        Node<Integer> node3  = new Node<>(3);

        // 노드 연결
        node1.next = node2;
        node2.next = node3;

        System.out.println(node1.data);
        System.out.println(node1.next.data);
        System.out.println(node1.next.next.data);

        LinkedListEx1<Integer> linkedList = new LinkedListEx1<>();
        System.out.println("==== insertAt() 5번 호출 ====");
        linkedList.insertAt(0, 0);
        linkedList.insertAt(1, 1);
        linkedList.insertAt(2, 2);
        linkedList.insertAt(3, 3);
        linkedList.insertAt(4, 4);
        linkedList.printAll();

        System.out.println("==== clear() 호출 ====");
        linkedList.claer();
        linkedList.printAll();

        System.out.println("==== insertLast() 호출 ====");
        linkedList.insertLast(0);
        linkedList.insertLast(1);
        linkedList.insertLast(2);
        linkedList.printAll();

        System.out.println("==== deleteAt() 호출 ====");
        linkedList.deleteAt(0);
        linkedList.printAll();
        linkedList.deleteAt(1);
        linkedList.printAll();

        System.out.println("==== deleteLast() 호출 ====");
        linkedList.insertLast(5);
        linkedList.deleteLast();
        linkedList.deleteLast();
        linkedList.printAll();

        System.out.println("==== getNodeAt() 호출 ====");
        linkedList.insertLast(1);
        linkedList.insertLast(2);
        linkedList.insertLast(3);
        linkedList.insertLast(4);
        linkedList.insertLast(5);

        Node<Integer> findNode = linkedList.getNodeAt(2);
        System.out.println(findNode.data);
    }
}
