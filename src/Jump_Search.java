
public class Jump_Search {
    
    public int jumpSearch(int[] arr, int x)
    {
        int n = arr.length;
  
        // Adýmý dizinin boyutuna göre belirliyoruz 9 ise 3 adým mesela
        int adým = (int)Math.floor(Math.sqrt(n));
  
        
        int prev = 0; // son atlama noktasý
        
        /* adým sürekli arttýðý için dizi boyutunu geçmemesi lazým 
        math minde geçtiyse dizinin son elemanýna bakýyor
        dizi 10 elemanlý step = 3 
        0-10, 3-10, 6-10 ,9-10 ,12-10 enson 12 olduðunda 10 seçiliyor 
        
        x aranan deðer 
        */
        
        while(arr[Math.min(adým, n)-1] < x)
        {
            prev = adým; // son atlama noktasý
            adým += adým; // kendisi kadar atlýyor
            if (prev >= n)
                return -1; // bu deðer listede yok
        }
  
        // atlamalý bitti doðrusal aramaya geçtik
        // son atladýðýmýz yer prev oradan aramaya baþlýyacaðýz
        while (arr[prev] < x)
        {
            prev++;
  
            // yukarýdaki ile ayný mantýk
            if (prev == Math.min(adým, n))
                return -1;
        }
  
        // elemaný bulursak geri döndürüyoruz
        if (arr[prev] == x)
            return prev;
  
        return -1;
    }
  
}
