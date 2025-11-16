class array
{
    public static void main( String args[]){

        // int arr[];   //c++
        // int []arr = new int[5];      //java


        int arr[] = {10,20,30,40,50};
        // int mid = arr.length/2;
        // System.out.println(arr[mid]);
        
        for(int i= 0; i<arr.length; ++i){
          if(i==arr.length/2){
            System.out.println(arr[i]);
          }

        }

        

    }
}