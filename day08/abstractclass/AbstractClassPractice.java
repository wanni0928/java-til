package com.classs.recap.abstractclass;

/**
 * AbstractStack
 * -> Stack (LIFO) 정책
 * -> 한쪽 끝에서만 자료를 넣거나 뺄 수 있는 구조.
 *
 * is_empty()   : 스택의 데이터가 비었는지 확인하는 메소드.
 * push()       : 제일 마지막 인덱스(top)에 데이터 삽입하는 메소드.
 * pop()        : 제일 마지막 인덱스(top)를 뱉어내는 메소드.
 * peek()       : 제일 마지막 인덱스(top)을 뱉진않고, 살펴보기만 하는 메소드.
 */

abstract class AbstractStack {
    protected int capacity;
    protected int top;

    public AbstractStack(int capacity) {
        this.capacity = capacity;
        this.top = 0;
    }

    public boolean isEmpty(){
        return this.top == 0;
    }

    public abstract void push(int value);
    public abstract int pop();
    public abstract int peek();
}

class ArrayStack extends AbstractStack{
    private int[] array;

    public ArrayStack(int capacity) {
        super(capacity);
        array = new int[capacity];
    }

    @Override
    public void push(int value) {
        if(top == capacity){
            int[] new_array = new int[capacity * 2];
            System.arraycopy(array, 0, new_array, 0, array.length);
            array = new_array;
            capacity *= 2;
        }
        array[top++] = value;
    }

    @Override
    public int pop() {
        if(isEmpty()){
            return -1;
        }
        return array[--top];
    }

    @Override
    public int peek() {
        if(isEmpty()){
            return -1;
        }
        return array[top - 1];
    }
}

public class AbstractClassPractice {
    public static void main(String[] args) {
        ArrayStack stack = new ArrayStack(10);
        for (int i = 0; i < 15; i++) {
            stack.push(i);
        }

        System.out.println(stack.peek());
        System.out.println(stack.peek());

        for (int i = 0; i < 20; i++) {
            System.out.println(stack.pop());
        }
    }
}
