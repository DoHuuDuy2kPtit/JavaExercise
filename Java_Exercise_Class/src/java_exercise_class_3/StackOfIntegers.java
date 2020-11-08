/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package java_exercise_class_3;

/**
 *
 * @author admin
 */

public class StackOfIntegers {

    private int element[];
    private int size;

    public StackOfIntegers() {
        this.element = new int[16];
        this.size = 0;
    }

    public StackOfIntegers(int capital) {
        this.element = new int[capital];
        this.size = 0;
    }

    public boolean isEmpty() {
        return size == 0;
    }

    public boolean isFull() {
        return size == this.element.length;
    }

    public int peak() {
        return this.element[size];
    }

    public void push(int value) {
        if (isFull()) {
            System.out.println("Stack is full");
        } else {
            size = size + 1;
            element[size] = value;
        }
    }

    public int pop() {
        int temp = 0;
        if (isEmpty()) {
            return temp;
        } else {
            temp = element[size];
            size = size - 1;
        }
        return temp;
    }

    public int getSize() {
        return this.size;
    }
}
