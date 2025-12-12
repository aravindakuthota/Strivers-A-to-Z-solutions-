  // concatinating first string and checking second string is part of it or not 

  // time and space -> O(N)+ O(N)


class Solution {
    public boolean rotateString(String s, String goal) {

      if (s == null || goal == null || s.length() != goal.length()) {
            return false;
        }

        // Concatenate the first string with itself
        String concatenated = s + s;
        
        // Check if the goal string is a substring of the concatenated string
        // The contains() method handles substring search efficiently
        return concatenated.contains(goal);
    }
}

