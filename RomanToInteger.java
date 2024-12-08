import java.util.HashMap;

public class RomanToInteger {
    public int romanToInt(String s) {
        if (s == null || s.length() == 0) {
            return 0;
        }

        HashMap<Character, Integer> map = new HashMap<>();
        map.put('I', 1);
        map.put('V', 5);
        map.put('X', 10);
        map.put('L', 50);
        map.put('C', 100);
        map.put('D', 500);
        map.put('M', 1000);

        int total = map.get(s.charAt(s.length() - 1));
        int prevValue = total;

        for (int i = s.length() - 2; i >= 0; i--) {
            char currentChar = s.charAt(i);
            int currentValue = map.get(currentChar);

            if (currentValue < prevValue) {
                total -= currentValue;
            } else {
                total += currentValue;
            }

            prevValue = currentValue;
        }

        return total;
    }
}
