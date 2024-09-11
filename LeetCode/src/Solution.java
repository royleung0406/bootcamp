import java.util.ArrayList;
import java.util.List;

class Solution {
  public int[] relativeSortArray(int[] arr1, int[] arr2) {
      List<Integer> ans = new ArrayList<>();
      int n1 = arr1.length;
      int n2 = arr2.length;
      
      for (int i = 0; i < n2; i++) {
          for (int j = 0; j < n1; j++) {
              if (arr1[j] == arr2[i]) {
                  ans.add(arr1[j]);
                  arr1[j] = -1;
              }
          }
      }
      
      List<Integer> remaining = new ArrayList<>();
      for (int i = 0; i < n1; i++) {
          if (arr1[i] > -1) {
              remaining.add(arr1[i]);
          }
      }
      
      
      remaining.sort(null);;
      ans.addAll(remaining);
      
      
      int[] res = new int[ans.size()];
      for (int i = 0; i < ans.size(); i++) {
          res[i] = ans.get(i);
      }
      
      return res;
  }
}