
public class Jump_Search {
    
    public int jumpSearch(int[] arr, int x)
    {
        int n = arr.length;
  
        // Ad�m� dizinin boyutuna g�re belirliyoruz 9 ise 3 ad�m mesela
        int ad�m = (int)Math.floor(Math.sqrt(n));
  
        
        int prev = 0; // son atlama noktas�
        
        /* ad�m s�rekli artt��� i�in dizi boyutunu ge�memesi laz�m 
        math minde ge�tiyse dizinin son eleman�na bak�yor
        dizi 10 elemanl� step = 3 
        0-10, 3-10, 6-10 ,9-10 ,12-10 enson 12 oldu�unda 10 se�iliyor 
        
        x aranan de�er 
        */
        
        while(arr[Math.min(ad�m, n)-1] < x)
        {
            prev = ad�m; // son atlama noktas�
            ad�m += ad�m; // kendisi kadar atl�yor
            if (prev >= n)
                return -1; // bu de�er listede yok
        }
  
        // atlamal� bitti do�rusal aramaya ge�tik
        // son atlad���m�z yer prev oradan aramaya ba�l�yaca��z
        while (arr[prev] < x)
        {
            prev++;
  
            // yukar�daki ile ayn� mant�k
            if (prev == Math.min(ad�m, n))
                return -1;
        }
  
        // eleman� bulursak geri d�nd�r�yoruz
        if (arr[prev] == x)
            return prev;
  
        return -1;
    }
  
}
