/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */


/**
 *
 * @author yesil
 */
public class SimpleQueue {

    private Integer arr[];

    private int ilk;

    private int son = -1;

    public SimpleQueue(int capacity) {
        arr = new Integer[capacity];
    }

    public void ekleme(int value) {
        if (arr.length - 1 == son) {
            throw new IndexOutOfBoundsException("Push");
        }

        arr[++son] = value;

    }

    public int dequeue() throws Exception {

        if (son == -1) {
            throw new Exception("Dequeue");
        }

        int r = arr[ilk];

        for (int i = 0; i < son; ++i) {
            arr[i] = arr[i + 1];
        }

        --son;

        return r;

    }

    public int cikan_deger() throws Exception {
        if (son == -1) {
            throw new Exception("peek");
        }

        return arr[ilk];

    }

    public boolean IsEmpty() {
        return son == -1;

    }
    
    public void clear()
    {
        son = -1;
    }
    
    public int Count()
    {
        return son+1;
    }
    

}
