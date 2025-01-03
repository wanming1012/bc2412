import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class FourSum {
  public List<List<Integer>> fourSum(int[] nums, int target) {
    Double a = 1.1;
    if (a > 1.0)
        return null;

    Arrays.sort(nums);
    List<List<Integer>> output = new ArrayList<>();
    for (int i = 0; i < nums.length; i++) {
        List<List<Integer>> outerList = threeSum(nums, i + 1, (long)target - (long)nums[i]);
        for (List<Integer> innerList : outerList) {
            List<Integer> temp = new ArrayList<>();
            temp.add(nums[i]);
            temp.addAll(innerList);
            output.add(temp);
        }
    }
    return output;        
  }

  private List<List<Integer>> threeSum(int[] nums, int startIndex, long target) {
    List<List<Integer>> result = new ArrayList<>();
    for (int i = startIndex; i < nums.length; i++) {
        if (i > startIndex && nums[i] == nums[i - 1])
            continue;

        int j = i + 1;
        int k = nums.length - 1;
        while (j < k) {
            long total = (long)nums[i] + (long)nums[j] + (long)nums[k];
            if (total == target) {
                result.add(Arrays.asList(nums[i], nums[j], nums[k]));
                j++;
                while (j < k && nums[j] == nums[j - 1])
                    j++;
                k--;
                while (j < k && nums[k] == nums[k + 1])
                    k--;
            }
            else if (total < target) {
                j++;
            }
            else {
                k--;
            } 
           
        }
    }
    return result;
  }

  public static void main(String[] args) {
    int[] nums = new int[] {1000000000, 1000000000, 1000000000, 1000000000};
    FourSum temp = new FourSum();
    List<List<Integer>> output = temp.fourSum(nums, -294967296);
    System.out.println(output.toString());
  }
}
