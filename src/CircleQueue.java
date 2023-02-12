/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */


/**
 *
 * @author yesil
 */
public class CircleQueue {
    
    private Integer[] arr;
    
    private int ilk = -1;
    
    private int son = -1;
    
    private int size;
    
    public CircleQueue(int capacity)
    {
        arr = new Integer[capacity];  
        ilk = son = 0;
    }
    
    public void sona_ekleme(int value) throws Exception
    {
        if(arr.length == son)
            throw new Exception("Sona Ekleme");
        
        arr[++son] = value;
        
    }
    
    public int cýkarma() throws Exception
    {
        if(ilk == son+1)
        {
            throw new Exception("Cýkarma");
        }
        
        ilk = (ilk+1) % size;
                
        return arr[++ilk];
        
    }
    
    
    
    
}
