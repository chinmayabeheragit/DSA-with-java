public class Findsmallest {
    public  static void main (String[] args){
        int [] arr = {1,2,3,4,5,6,7,8,9};
        int smallest = arr[0];
        for (int i=1; i<arr.length;i++){
            if(arr[i] < smallest){
                smallest = arr[i];
            }
        }
        System.out.println("the smallest element of the array is : " +smallest);
    }
}