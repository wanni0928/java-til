package homework.day10;
/**
 * List<T> 제네릭 인터페이스를 구현하여 ArrayList<T> 제네릭을 완성하시오.
 *
 * List는 순서가 있는 연속된 값으로, List 인터페이스에 선언되어 있는 메소드의 기능은 아래와 같다.
 *
 * - append(): List의 마지막에 value를 삽입한다.
 * - prepend(): List의 시작점에 value를 삽입한다. 기존의 데이터를 한 칸씩 뒤로 옮긴다.
 * - insert(): index에 value를 삽입한다. 기존 데이터를 한 칸씩 뒤로 옮긴다.
 * - remove(): index의 value를 삭제한다. 기존 데이터를 한 칸씩 앞으로 당긴다.
 * - get(): index의 value를 반환한다.
 * - length(): List의 길이를 출력한다.
 *
 * ArrayList<T>는 Object []를 이용하여 List<T>를 구현한다.
 * - 생성자에서는 capacity를 입력받으며, 배열의 크기가 부족할 때마다 2배씩 증가시킨다.
 */

interface List<T> {
    void append(T value);
    void prepend(T value);
    void insert(int index, T value);
    void remove(int index);
    T get(int index);
    int length();
}

class ArrayList<T> implements List<T>{
    private int capacity;
    private int length;
    private Object[] list;

    public ArrayList(int capacity) {
        this.capacity = capacity;
        this.length = 0;
        this.list = new Object[capacity];
    }

    private void expandCapacity(int offset) {
        Object[] newList = new Object[capacity * 2];
        System.arraycopy(list, 0, newList, offset, capacity);
        list = newList;
        capacity *= 2;
    }

    private void expandCapacity() {
        expandCapacity(0);
    }

    @Override
    public void append(T value) {
        if(length == capacity){
            expandCapacity();
        }
        list[length++] = value;
    }

    @Override
    public void prepend(T value) {
        if(length == capacity){
            expandCapacity(1);
        }else {
            if(length >= 0) System.arraycopy(list, 0, list, 1, length);
        }
        list[0] = value;
        length++;
    }

    @Override
    public void insert(int index, T value) {
        if(length == capacity){
            System.out.println("expand");
            expandCapacity();
        }
        if (index <= length && length >= 0) {
            System.arraycopy(list, index, list, index + 1, length - index);
        }
        list[index] = value;
        length++;
    }

    @Override
    public void remove(int index) {
        if(index < length && length >= 0){
            System.arraycopy(list, index + 1, list, index, length - index - 1);
        }
        length--;
    }

    @Override
    public T get(int index) {
        if(index < length){
            return (T) list[index];
        } else {
            return null;
        }
    }

    @Override
    public int length() {
        return length;
    }
}


public class GenericList {
    public static void printList(ArrayList<Integer> list) {
        for (int i = 0; i < list.length(); i++) {
            System.out.printf("%d ", list.get(i));
        }
        System.out.println("");
    }
    public static void main(String[] args) {
        ArrayList<Integer> list = new ArrayList<Integer>(10);
        for (int i = 0; i < 20; i++) {
            list.append(i);
        }
        printList(list);

        list.remove(5);
        printList(list);

        list.prepend(1);
        list.prepend(2);
        list.prepend(3);
        printList(list);
        list.insert(5, 100);
        printList(list);
    }
}