import java.util.ArrayList;

public class lineraSearch {
    public static void main(String[] args) {
        int[] arr = {11, 22, 33, 33, 44, 55};
        int target = 33;
        int n = arr.length;
        System.out.println(solve(arr, target, 0));
        System.out.println(findIndex(arr, target, 0));
        System.out.println(reverseIndex(arr, target, n - 1));
        findAllIndex(arr, target, 0);
        System.out.println(list);
        System.out.println(listSorted(arr, target, 0));
    }

    // it is returning the boolean value as if the value is their or not
    static boolean solve(int[] arr, int target, int index){
        if(index == arr.length) return false;
        return arr[index] == target || solve(arr, target, index + 1);
    }

    //it is returning the index at which the element lies
    static int findIndex(int[] arr, int target, int index){
        if(index == arr.length) return -1;
        if(arr[index] == target) return index;
        else return findIndex(arr, target, index + 1);
    }
    
    static int reverseIndex(int[] arr, int target, int index){
        if(index == -1) return -1;
        if(arr[index] == target) return index;
        else return reverseIndex(arr, target, index - 1);
    }

    static ArrayList<Integer> list = new ArrayList<>();
    static void findAllIndex(int[] arr, int target, int index){
        if(index == arr.length) return;
        if(arr[index] == target) list.add(index);
        findAllIndex(arr, target, index + 1);
    }

    static ArrayList<Integer> listSorted(int[] arr, int target, int index){
        if (index == arr.length) return list;
        if (arr[index] == target) list.add(index);
        return listSorted(arr, target, index + 1);
    }

}
