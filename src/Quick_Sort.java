public class Quick_Sort {

    public Quick_Sort(int dizi[]){
        quickSort(dizi, 0, dizi.length-1);
    }
    
    private void quickSort(int dizi[], int first, int last){
        if(first>= last){
            return;
        }
                
        int pivot = dizi[last];
        int j = first-1;
        
        for(int i = first; i<last; i++){
            if(dizi[i]< pivot){
                ++j;
                swap(dizi, i,j);
            }
        }
        ++j;
        swap(dizi, last,j);
        quickSort(dizi, first, j-1);
        quickSort(dizi, j+1, last);
        
    }
    
    private void swap(int arr[], int i, int j) {
        int temp = arr[i];
        arr[i] = arr[j];
        arr[j] = temp;
    }
}
