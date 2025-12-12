//Convert both strings to character arrays

//Sort them using built-in Arrays.sort()

//Compare them using Arrays.equals()


// time and space -> O( n log n ) + O(n);

class Solution {
    public boolean isAnagram(String s, String t) {

    if(s.length() != t.length()) return false ;

       char[] charArray1 = s.toLowerCase().toCharArray();
        char[] charArray2 = t.toLowerCase().toCharArray();
        Arrays.sort(charArray1);
        Arrays.sort(charArray2);
        return Arrays.equals(charArray1, charArray2);

    }
}