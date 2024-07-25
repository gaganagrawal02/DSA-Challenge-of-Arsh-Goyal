package String;

public class firstoccurence {
    public static int Firstoccurence(String haystack , String needle){
        // If needle is empty, return 0 as per problem statement
        if (needle.isEmpty()) {
            return 0;
        }

        // Get lengths of both strings to use in loop condition
        int haystackLength = haystack.length();
        int needleLength = needle.length();

        // If needle is longer than haystack, it can't be contained within
        if (needleLength > haystackLength) {
            return -1;
        }

        // Iterate through haystack
        for (int i = 0; i <= haystackLength - needleLength; i++) {
            // Check if the current substring of haystack equals needle
            if (haystack.substring(i, i + needleLength).equals(needle)) {
                return i; // Found the needle, return its starting index
            }
        }

        // Needle not found in haystack
        return -1;
    }
    public static void main(String[] args) {
       String haystack = "leetcode" ;
       String needle = "leeto";
        System.out.println("First occurrence " +  Firstoccurence(haystack,needle));
    }
}
