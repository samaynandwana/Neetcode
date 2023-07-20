import java.util.*;
class Contains_Duplicate {
    public boolean containsDuplicate(int[] nums) {

        HashSet<Integer> hs = new HashSet(); 
        for (int i = 0; i < nums.length; i++) {
            hs.add(nums[i]);
        }
        return !(hs.size() == nums.length);
    }
}