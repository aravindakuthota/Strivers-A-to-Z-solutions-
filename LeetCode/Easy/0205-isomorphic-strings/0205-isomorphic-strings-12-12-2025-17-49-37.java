// using hashmap 
// o(n) + o(1)

class Solution {
    public boolean isIsomorphic(String s, String t) {
  HashMap<Character, Character> mapST = new HashMap<>();
 HashMap<Character, Character> mapTS = new HashMap<>();

        for (int i = 0; i < s.length(); i++) {
            char a = s.charAt(i);  // from s
            char b = t.charAt(i);  // from t

            // Check s → t mapping
            if (mapST.containsKey(a)) {
                if (mapST.get(a) != b) return false;  // mismatch
            } else {
                mapST.put(a, b);
            }

            // Check t → s mapping
            if (mapTS.containsKey(b)) {
                if (mapTS.get(b) != a) return false;  // mismatch
            } else {
                mapTS.put(b, a);
            }
        }

        return true;
    
    }
        }

       