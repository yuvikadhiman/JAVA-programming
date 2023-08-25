// public class JavaStrings {
//     public static void main(String[] args) {
//         String input = "Hello, World!";
//         String reversed = reverseString(input);
//         System.out.println("Original: " + input);
//         System.out.println("Reversed: " + reversed);
//     }

//     public static String reverseString(String input) {
//         char[] charArray = input.toCharArray();
//         int start = 0;
//         int end = input.length() - 1;
        
//         while (start < end) {
//             char temp = charArray[start];
//             charArray[start] = charArray[end];
//             charArray[end] = temp;

//             start++;
//             end--;
//         }
        
//         return new String(charArray);
//     }
// }

public class JavaStrings {
    public static void main(String[] args) {
         String str = "racecar";
         if(palindrome(str)){
            System.out.println("Is Palindrome");
         }
         else 
         System.out.println("Not Palindrome");
    }
    public static boolean palindrome(String str) {
       for(int i=0;i<str.length()/2;i++){
        int n=str.length();

        if(str.charAt(i)!=str.charAt(n-1-i)){
            return false;
        }
     }
       return true;
    }
}

