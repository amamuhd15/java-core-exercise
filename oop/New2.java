public class New2 {
    public static int linearSearch(int[] arr, int key){
        for(int i = 0; i < arr.length; i++){
            if (arr[i] == key) {
                return i;
            }
        }
        return -1;
    }
    public static void main(String [] args){
        int[] arr = {80,89,79,99,87,98,100};
        int key = 79;
        int result = linearSearch(arr, key);
        System.out.println(result);
    }
}
//this is for searching array index
