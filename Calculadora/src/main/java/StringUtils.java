public class StringUtils {

    public boolean isPalindrome(String s){
        if (s.isEmpty()){
            return false;
        }
        String clean = s.replace(" ", "").toLowerCase();
        String reverse = new StringBuilder(clean).reverse().toString();
        return clean.equals(reverse);
    }

    public String reverse(String s){
        if (s.isEmpty()){
            return null;
        }
        return new StringBuilder(s).reverse().toString().toLowerCase().replace(" ","");
    }

    public String toUpperCase(String s){
        if(s.isEmpty()){
            return null;
        }
        return s.toUpperCase();
    }
}
