public class StringToNumber {
        public int myAtoi(String s) {
            int i = 0;
            int num = 0;
            boolean isNegative = false;
            
            
            while (i < s.length() && s.charAt(i) == ' ') {
                i++;
            }
           
            if (i < s.length() && (s.charAt(i) == '+' || s.charAt(i) == '-')) {
                isNegative = s.charAt(i) == '-';
                i++;
            }
          
            while (i < s.length() && Character.isDigit(s.charAt(i))) {
                int digit = s.charAt(i) - '0';
                
               
                if (num > Integer.MAX_VALUE / 10 || (num == Integer.MAX_VALUE / 10 && digit > Integer.MAX_VALUE % 10)) {
                    return isNegative ? Integer.MIN_VALUE : Integer.MAX_VALUE;
                }
                
                num = num * 10 + digit;
                i++;
            }
            
            return isNegative ? -num : num;
        }
    }

