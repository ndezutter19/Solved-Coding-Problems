
//Determine if the string ransomNote can be constructed using letters from magazine, 
//where each letter from magazine can only be used once.

import java.util.*;

class ransomNote {
    public boolean canConstruct(String ransomNote, String magazine) {
        HashMap<Character, Integer> map = new HashMap<>();
        for (char c : magazine.toCharArray())
            map.put(c, map.getOrDefault(c, 0) + 1);

        for (char c : ransomNote.toCharArray()) {
            if (!map.containsKey(c) || map.get(c) < 1)
                return false;
            map.put(c, map.get(c) - 1);
        }

        return true;
    }
}
