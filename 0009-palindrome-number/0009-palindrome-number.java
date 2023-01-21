class Solution {
    public boolean isPalindrome(int x) {
        String val = Integer.toString(x);
        String a = "";
        String b = "";
        
        if (x < 0) return false;
        
        for (int i=0; i < val.length(); i++) {
            a += val.charAt(i);
        }
        
        for (int j=val.length()-1; j >= 0; j--) {
            b += val.charAt(j);
        }
        
        if (a.equals(b)) {
            return true;
        } else {
            return false;
        }
    }
}