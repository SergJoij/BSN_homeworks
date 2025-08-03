package task1;

import java.util.Collection;

class UserNode<E>{
    E data;
    UserNode<E> next;
    UserNode<E> previous;

    public UserNode(E data) {
        this.data = data;
    }
}

public class UserLL<E> {
    private UserNode<E> head;
    private UserNode<E> tail;
    private int size;

    public UserLL(){
        this.size = 0;
    }

    public void add(E element) {
        UserNode<E> newNode = new UserNode<>(element);
        if (this.head != null) {
            newNode.previous = this.tail;
            this.tail.next = newNode;
            this.tail = newNode;
        }
        else{
            this.head = newNode;
            this.tail = newNode;
        }
        this.size++;
    }

    public void add(int index, E element) {
        if (index < 0 || index >= this.size) {
            this.add(element);
        }
        else if (index == 0){ // вставка в начало
            UserNode<E> curr = this.head;
            UserNode<E> newNode = new UserNode<E>(element);
            this.head = newNode;
            newNode.next = curr;
            curr.previous = newNode;
            this.size++;
        }
        else {   // вставка в середину
            UserNode<E> newNode = new UserNode<E>(element);
            UserNode<E> curr = this.head;
            int ind = 0;
            while (ind != index - 1) {
                curr = curr.next;
                ind++;
            }
            UserNode<E> oldLink = curr.next;
            curr.next = newNode;
            newNode.previous = curr;
            newNode.next = oldLink;
            oldLink.previous = newNode;
            this.size++;
        }
    }

    private boolean checkPositionIndexForGet(int index){
        if (index < 0 || index >= this.size) {
            System.out.println("Задан неверный индекс");
            return false;
        }
        else
            return true;
    }

    public E get(int index) {
        if (!checkPositionIndexForGet(index))
            return null;
        UserNode<E> curr = this.head;
        for (int i = 0; i < index; i++) {
            curr = curr.next;
        }
        return curr.data;
    }

    public UserNode<E> getNode(int index) {
        if (!checkPositionIndexForGet(index))
            return null;
        UserNode<E> curr = this.head;
        for (int i = 0; i < index; i++) {
            curr = curr.next;
        }
        return curr;
    }

    public void remove(E data) {
        if (this.head == null)
            return;
        else if (this.head.data.equals(data)) {
            this.head = this.head.next;
            if (this.head == null)
                this.tail = null;
            else
                this.head.previous = null;
            this.size--;
        }
        else {
            UserNode<E> curr = this.head;
            // пока этот не последний или след. не искомый
            while (curr.next != null && !curr.next.data.equals(data)) {
                curr = curr.next;
            }
            if (curr.next != null) { // если найденный элемент не последний
                curr.next = curr.next.next;
                if (curr.next == null)
                    this.tail = curr;
                else
                    curr.next.previous = curr;
            }
            this.size--;
        }
    }

    public void addAll(Collection<? extends E> c) {
        this.addAll(this.size, c);
    }

    public void addAll(int index, Collection<? extends E> c) {
        if (index < 0 || index > this.size) {
            System.out.println("Задан неверный индекс");
            return;
        }
        // Object[] a = c.toArray();
        if (c.toArray().length == 0)
            return;

        // Вставка
        if (index == this.size)
            for (E element : c)
                this.add(element);
        else{
            int localIndex = index;
            for (E element : c) {
                this.add(localIndex, element);
                localIndex++;
            }
        }
    }

    public void values() {
        UserNode<E> curr = this.head;
        if (curr.next == null)
            System.out.println("Пустой");
        else
            while (curr != null) {
                System.out.printf("%s %s %s %s\n", curr, curr.data, curr.previous, curr.next);
                curr = curr.next;
            }
    }

    public int length(){
        return this.size;
    }
}
