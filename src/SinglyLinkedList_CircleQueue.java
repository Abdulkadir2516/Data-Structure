/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */


/**
 *
 * @author yesil
 */
public class SinglyLinkedList_CircleQueue<T> {
    
    private node son;
    private node bas;
    private int size;
    private int count;
    private int index;
    
    public SinglyLinkedList_CircleQueue() {
        son = bas = null;
        size = 0;
    }
    
    public void add(T data) {
        
        if (son == null) {
            first_add(data);
        } else {
            last_add(data);
        }
        
    }
    
    public void first_add(T data) {
        if (son != null) {
            throw new IllegalArgumentException("First_add");
        }
        
        node Node = new node(data);
        
        son = bas = Node;
        son.next = bas;
        
        ++size;
        
    }
    
    public void last_add(T data) {
        
        if (son == null) {
            throw new IllegalArgumentException("Last_add");
        }
        
        node Node = new node(data);
        
        son.next = Node;
        son = Node;
        son.next = bas;
        
        ++size;
        
    }
    
    public void front_add(T data) {
        
        if (son == null) {
            throw new IllegalArgumentException("front_add");
        }
        
        node Node = new node(data);
        
        Node.next = bas;
        bas = Node;
        son.next = bas;
        
        ++size;
        
    }
    
    public void insert(T data, int yer) {
        
        node Node = new node(data);
        node arama = bas;
        node önceki = null;
        
        if (yer > size+1) {
            throw new IllegalArgumentException("insert");
        }
        
        if (yer == 0 && son == null) {
            first_add(data);
        } else if (yer == 0) {
            front_add(data);
        } else if (yer == size) {
            last_add(data);
        } else {
            
            for (int i = 0; i < yer; ++i, arama = arama.next) {
                önceki = arama;
            }
            
            if (arama != null && önceki != null) {
                önceki.next = Node;
                Node.next = arama;
            }
        }
        ++size;
        
    }
    
    public void remove(int sayi) {
        
        node arama = bas;
        node önceki = null;
        
        if (sayi > size) {
            throw new IllegalArgumentException("Remove");
        }
        
        for (int i = 0; i < sayi; ++i, arama = arama.next) {
            önceki = arama;
        }
        
        System.out.println(arama.data + " Diziden Çýkarýlýyor");
        
        if (arama != bas) {
            önceki.next = arama.next;
        } else {
            bas = bas.next;
            son.next = bas;
        }
        
        --size;
        
    }
    
    public void remove(T data) {
        remove(find(data));
    }
    
    public int find(T data) {
        index = -1;
        
        node gecici = null;
        
        for (node traveler = bas; traveler != gecici; traveler = traveler.next) {
            
            gecici = bas;
            
            ++index;
            
            if (traveler.data.equals(data)) {
                break;
            }
        }
        return index;
    }
    
    public String find(int indis) {
        
        node arama = bas;
        node önceki = null;
        
        if (indis > size) {
            throw new IllegalArgumentException("Remove");
        }
        
        for (int i = -1; i < indis; ++i, arama = arama.next) {
            önceki = arama;
        }
        
        return önceki.data.toString();
    }
    
    public int count() {
        
        node gecici = null;
        count = 0;
        
        for (node traveler = bas; traveler != gecici; traveler = traveler.next) {
            
            gecici = bas;
            
            count++;
        }
        
        return count;
    }
    
    public int lenght() {
        return size;
    }
    
    public class node {
        
        public T data;
        public node next;
        
        public node(T data) {
            next = null;
            this.data = data;
            
        }
    }
    
}
