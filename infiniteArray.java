// find the position of an element in an infinite sorted array(BS), gfg question
//package BinarySearch;

class infiniteArray{

    static int ans(int arr[], int target){
        int s = 0;
        int e = 1;
        while(target > arr[e]){
            int temp = e + 1;
            e = e + (e -s + 1); //double the value or size of box
            s = temp;
        }
        return BinarySearch(arr, target, s, e);
    }

    static int BinarySearch(int arr[], int target, int s, int e){
        int m = 0;
        while(s <= e){
            m = s + (e - s)/2;
            if(target <= arr[m]){
                e = m - 1;
            }
            else if(target >= arr[m]){
                s = m + 1;
            }
        }
        return m;
    }
    public static void main(String args[]){
        infiniteArray bs = new infiniteArray();
        int arr[] = {1, 3, 5, 7, 9, 11, 15, 21, 24};
        int target = 7; //3
        //int s = arr[0];
        //int e = arr[arr.length - 1];
        int r = bs.ans(arr, target);
        System.out.println(r);
    }
}