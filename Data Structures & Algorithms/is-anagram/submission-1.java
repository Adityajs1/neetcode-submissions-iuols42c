class Solution {
    public boolean isAnagram(String s, String t) {
     Map<Character, Integer> map = new HashMap<>();
    for(int i = 0; i < s.length(); i++) {
    map.put(s.charAt(i), map.getOrDefault(s.charAt(i), 0) + 1);
}
     Map<Character, Integer> map2 = new HashMap<>();
    for(int i = 0; i < t.length(); i++) {
    map2.put(t.charAt(i), map2.getOrDefault(t.charAt(i), 0) + 1);
}   
  return map.equals(map2);
    }
}
