package org.example;

import java.util.Scanner;

public class Main {
    private int[] elements;
    private int size;
    private static final int INITIAL_CAPACITY = 10;

    public Main() {
        elements = new int[INITIAL_CAPACITY];
        size = 0;
    }

    public void add(int element) {
        if (size == elements.length) {
            expandCapacity();
        }
        elements[size++] = element;
    }

    private void expandCapacity() {
        int[] newElements = new int[elements.length * 2];
        System.arraycopy(elements, 0, newElements, 0, size);
        elements = newElements;
    }

    public int get(int index) {
        if (index < 0 || index >= size) {
            throw new IndexOutOfBoundsException("Index out of bounds: " + index);
        }
        return elements[index];
    }

    public int size() {
        return size;
    }
    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);
        Main list = new Main();
        int n=0;
        while (n>=0){
            System.out.print("Enter number: ");n=input.nextInt();
            if(n>=0){
                list.add(n);
            }
        }
        System.out.println("List size: " + list.size());
        for (int i = 0; i < list.size(); i++) {
            System.out.print(list.get(i)+" ");
        }

    }
}