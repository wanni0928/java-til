package homework.day09;

/**
 * List 인터페이스를 구현하여 IntArrayList 클래스를 완성하시오.
 *
 * List는 순서가 있는 연속된 값으로, List 인터페이스에 선언되어 있는 메소드의 기능은 아래와 같다.
 *
 * - append(): List의 마지막에 value를 삽입한다.v
 * - prepend(): List의 시작점에 value를 삽입한다. 기존의 데이터를 한 칸씩 뒤로 옮긴다.v
 * - insert(): index에 value를 삽입한다. 기존 데이터를 한 칸씩 뒤로 옮긴다.v
 * - remove(): index의 value를 삭제한다. 기존 데이터를 한 칸씩 앞으로 당긴다.v
 * - get(): index의 value를 반환한다.v
 * - length(): List의 길이를 출력한다.v
 *
 * IntArrayList는 int []를 이용하여 List를 구현한다.v
 * - 생성자에서는 capacity를 입력받으며, 배열의 크기가 부족할 때마다 2배씩 증가시킨다.v
 */

interface List {
    public void append(int value);
    public void prepend(int value);
    public void insert(int index, int value);
    public void remove(int index);
    public int get(int index);
    public int length();
}

class IntArrayList implements List {
    private int capacity;
    private int lastIndex;
    private int[] array;

    public IntArrayList(int capacity) {
        this.capacity = capacity;
        this.lastIndex = capacity - 1;
        array = new int[capacity];
    }

    @Override
    public void append(int value) {
        if(capacity == lastIndex){
            if(capacity == 0){
                capacity++;
            }
            int[] new_array = new int[capacity * 2];
            System.arraycopy(array, 0, new_array, 0, array.length);
            array = new_array;
            capacity *= 2;
        }
        array[lastIndex++] = value;
    }

    @Override
    public void prepend(int value) {
        if(capacity == lastIndex){
            if(capacity == 0){
                capacity++;
            }
            int[] new_array = new int[capacity * 2];
            System.arraycopy(array, 0, new_array, 1, array.length);
            array = new_array;
            capacity *= 2;
        }else {
            int[] new_array = new int[capacity];
            System.arraycopy(array, 0, new_array, 1, lastIndex);
            array = new_array;
        }
        array[0] = value;
        lastIndex++;
    }

    @Override
    public void insert(int index, int value) {
        if(capacity == lastIndex){
            if(capacity == 0){
                capacity++;
            }
            int[] new_array = new int[capacity * 2];
            System.arraycopy(array, 0, new_array, 0, array.length);
            array = new_array;
            capacity *= 2;
        }
        for (int i = index; i < array.length - 1; i++) {
            if(index == 0){
                prepend(value);
                return;
            }
            array[i] = array[i+1];
        }
        array[index] = value;
        lastIndex++;
    }

    @Override
    public void remove(int index) {
        for (int i = index; i < array.length - 1; i++) {
            array[i] = array[i + 1];
        }
        int[] new_array = new int[capacity - 1];
        System.arraycopy(array, 0, new_array, 0, array.length - 1);
        array = new_array;
        lastIndex--;
        capacity -= 1;
    }

    @Override
    public int get(int index) {
        return array[index];
    }

    @Override
    public int length() {
        return capacity;
    }

    @Override
    public String toString(){
        StringBuilder sb = new StringBuilder();
        sb.append("[ ");
        for (int element : array) {
            sb.append(element).append(" ");
        }
        sb.append("]");
        return sb.toString();
    }
}

public class ListPractice {
    public static void main(String[] args) {
        IntArrayList arrayList = new IntArrayList(10);
        //Append test
//        System.out.println("Prepend Test");
//        for (int i = 0; i < 40; i++) {
//            arrayList.append(i+1);
//            System.out.println(arrayList.toString());
//        }
//        arrayList.length();

        //Prepend test
//        System.out.println("Prepend Test");
//        for (int i = 0; i < 22; i++) {
//            arrayList.prepend(i+1);
//            System.out.println(arrayList.toString());
//            System.out.print("array length : ");
//            arrayList.length();
//        }
//        arrayList.length();

        //insert Test
//        System.out.println("Insert Test");
//        for (int i = 0; i < 999; i++) {
//            System.out.println("Inserted idx : " + i + ", Idx data : " + (99+i));
//            arrayList.insert(i, 99 + i);
//            System.out.println(arrayList.toString());
//        }
//        arrayList.length();

        //Remove Test
//        arrayList.remove(3);
//        System.out.println(arrayList.toString());
//        arrayList.length();
//        arrayList.remove(5);
//        System.out.println(arrayList.toString());
//        arrayList.length();

        //Get Test
//        System.out.println(arrayList.toString());
//        System.out.print("[ ");
//        for (int i = 0; i < arrayList.length(); i++) {
//            System.out.print(arrayList.get(i) + " ");
//        }
//        System.out.print(" ]");
    }
}
