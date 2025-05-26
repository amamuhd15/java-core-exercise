public class New3 {
    public static void bubbleSort(int[]arr, int numberOfelements){
       if(numberOfelements ==1){
        return;
       } 
    
        for(int i = 0; i < numberOfelements -1; i++){

             if(arr[i] > arr[i + 1] ){
                int temp = arr[i];
                arr[i] = arr [i +1];
                arr[i + 1] = temp;
        
            
            }
        }

       bubbleSort(arr, numberOfelements -1);

    }
    public static void main(String [] args){
        int[] arr = {90,98,97,96,95,94,93};
        int n = arr.length;

bubbleSort(arr, n);

         for(int aa: arr){
            System.out.println(aa);
         }
    }
}
   