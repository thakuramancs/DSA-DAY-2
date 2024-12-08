public class LongestPalindromicSubstring {
        public String longestPalindrome(String s) {
            if (s == null || s.length() == 0) {
                return "";
            }
    
            int n = s.length();
            boolean[][] dp = new boolean[n][n];
            int start = 0;
            int maxLen = 1;
    
            for (int i = n - 1; i >= 0; i--) {
                for (int j = i; j < n; j++) {
                    dp[i][j] = s.charAt(i) == s.charAt(j) && (j - i < 3 || dp[i + 1][j - 1]);
    
                    if (dp[i][j] && maxLen < j - i + 1) {
                        maxLen = j - i + 1;
                        start = i;
                    }
                }
            }
    
            return s.substring(start, start + maxLen);
        }
    }
