import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class CombinationSum2 {
    public static void main(String[] args) {
        int[] arr = {1,1,1,2,2};
        int target = 4;
        combinationSum(arr,target);
    }
    public static void getCombinations(int index, int[] arr, int target, List<List<Integer>> ans, List<Integer> ds){
        if(target == 0){
            ans.add(new ArrayList<>(ds));
            return;
        }
        for(int i=index;i<arr.length;i++){

            if(i>index && arr[i]==arr[i-1]) continue;
            if(arr[i]>target) break;

            ds.add(arr[i]);
            getCombinations(i+1,arr,target-arr[i],ans,ds);
            ds.remove(ds.size()-1);
        }
    }
    public static List<List<Integer>> combinationSum(int[] candidates, int target){
        List<List<Integer>> ans = new ArrayList<>();
        Arrays.sort(candidates);
        getCombinations(0,candidates,target,ans,new ArrayList<>());
        System.out.println(ans);
        return ans;
    }
}
