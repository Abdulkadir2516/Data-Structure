/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */



/**
 *
 * @author yesil
 */
public class stack {

    private final Integer[] arr;
    
    private int index = -1;

    public stack(int capacity) {
        arr = new Integer[capacity];
    }

    public void Push(int value) {
        
        if (index == arr.length - 1) {
            throw new IndexOutOfBoundsException("Push");
        }

        arr[++index] = value;
    }

    public int Pop() {
        if (index == -1) {
            throw new IndexOutOfBoundsException("Pop");
        }

        return arr[index--];
    }

    public int Peek() {
        if (index == -1) {
            throw new IndexOutOfBoundsException("Peek");
        }

        return arr[index];
    }

    public int Count() {
        return index + 1;
    }

    public void Clear() {
        index = -1;
    }

    public boolean IsEmpty() {
        return index == -1;
    }

    
}
