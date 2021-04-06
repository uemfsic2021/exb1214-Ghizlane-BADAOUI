public class Palindrome{
  public static boolean is_palindrome(String s) {
    int i=0;
    int j=s.length() - 1;

    while ( (i<j) && (s.charAt(i)==s.charAt(j))) {
      i=i+1; j=j-1;
    }
    if (s.charAt(i)!=s.charAt(j))
      return false;
    else
      return true;
    }
}
