public class Findlargest {
    public static void main (String [] args){
        int [] arr ={1,2,3,4,6,7,9};
        int largest = arr [0];
        for(int i = 1; i<arr.length; i++){
            if(arr [i] > largest){
                largest = arr[i]; 
            }
        }
        System.out.println("the largest element in the array :" +largest);
    }
}