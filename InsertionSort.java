import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Random;

public class InsertionSort {
  void InsertionSort(List<Integer> nums){
    for(int i = 1; i < nums.size(); i++){
        int value = nums.get(i);
        int j = i - 1;
        while(j >= 0 && nums.get(j) > value){
        nums.set(j+1, nums.get(j));
        j = j - 1;
        }
        nums.set(j+1, value);
    }
  }
    
    static List<Integer> generateRandomArray(int n){
        ArrayList<Integer> list = new ArrayList<Integer>(n);
        Random random = new Random();
        
        for (int i = 0; i < n; i++)
        {
            list.add(random.nextInt(1000));
        }
    return list;
    }  

	// Method to test above
    public static void main(String args[])
    {
        InsertionSort ob = new InsertionSort();
        List<Integer> nums = generateRandomArray(10);
        System.out.println("Original Array:");
        System.out.println(nums.toString());
        ob.InsertionSort(nums);
        System.out.println("Sorted Array");
        System.out.println(nums.toString());
    }
}