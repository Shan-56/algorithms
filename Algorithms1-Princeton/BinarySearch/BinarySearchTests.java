public class BinarySearchTests{

    public static void main(String[] args){

        // Instance of binary search:
        BinarySearch binarySearch = new BinarySearch();

        // Declare some arrays:
        int[] array1 = new int[] {3, 6, 9, 12, 15, 18};
        int[] array2 = new int[] {2, 15, 17, 24, 35, 46, 57, 100, 1000, 2333};
    
        System.out.println(binarySearch.binarySearch(array1, 6));  
    }
}