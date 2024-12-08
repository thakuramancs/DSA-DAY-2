public class SumOfBeautyOfAllSubstrings {
    public int beautySum(String s) {
        int ans = 0;

        for (int i = 0; i < s.length(); i++) {
  
            HashMap<Character, Integer> freqMap = new HashMap<>();

            for (int j = i; j < s.length(); j++) {
                char ch = s.charAt(j);

 
                freqMap.put(ch, freqMap.getOrDefault(ch, 0) + 1);

     
                int max = Integer.MIN_VALUE;
                int min = Integer.MAX_VALUE;


                for (int count : freqMap.values()) {
                    max = Math.max(max, count);
                    min = Math.min(min, count);
                }


                ans += max - min;
            }
        }

        return ans;
    }
}
