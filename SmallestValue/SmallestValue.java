class SmallestValue{
    public static void main(String[] args) {
        int num[] = new int[]{1,2,3};
        System.out.println(Test(num));
    }



    public static int[] Test(int arr[]){
        //if array is empty, return empty array
        if(arr.length == 0){
            int newArr[] = new int[]{};
            return newArr;
        }
        //store smallest number index
        int smallestIndex = 0;
        for (int i = 1; i < arr.length; i++) {
            //if current value is less than current small value
            if(arr[smallestIndex] > arr[i]){     
                //set smallest index to current index
                smallestIndex = i; 
            }
        }

 
        return arr;
    }
}