import java.util.Scanner;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.ArrayList;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Collections;

class EX2108 {
  public static void main(String[] args) throws Exception {
    Scanner sc = new Scanner(System.in);
    int n = sc.nextInt();
    int[] nums = new int[n];
    Map<Integer, Integer> map = new HashMap<>();
    
  
    for(int i = 0; i < n; i++){
      nums[i] = sc.nextInt();
      
      if(map.containsKey(nums[i])){
        map.put(nums[i], map.get(nums[i]) + 1);
      }else{
        map.put(nums[i], 1);
      }
    }
    
    Arrays.sort(nums);
    
    // 산술 평균(첫째자리 반올림)
    int sum = Arrays.stream(nums).sum();
    double mean = (double)sum/(double)n;
    System.out.println(String.format("%.0f", mean));
    
    // 중앙값
    int mid = n == 1 ? nums[0] : nums[n/2];
    System.out.println(mid);
    
    // 최빈값
    List<Entry<Integer, Integer>> listEnt = new ArrayList<>(map.entrySet());
    Collections.sort(listEnt, 
          (Entry<Integer, Integer> obj1, Entry<Integer, Integer> obj2) -> obj2.getKey().compareTo(obj1.getKey()));
    
    
    int min = Integer.MAX_VALUE;
    int pre = 0;
    int maxCnt = Collections.max(map.values());
    int tmpCnt = 0;
    for(Entry<Integer, Integer> ent : listEnt){
      if(maxCnt == ent.getValue()){
        tmpCnt++;
        if(ent.getKey() < min){
          pre = min;
          min = ent.getKey();
        }
      }
    }
    System.out.println(tmpCnt > 1 ? pre : min);
    
    // 범위
    int range = nums[nums.length - 1] - nums[0];
    System.out.println(range);
    
  }
  
}