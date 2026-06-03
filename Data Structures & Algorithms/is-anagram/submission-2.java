class Solution {
    public boolean isAnagram(String s, String t) {
       HashMap<Character, Integer> se = new HashMap();
       HashMap<Character, Integer> te = new HashMap();

       for(int i = 0; i <s.length(); i++){
        se.put(s.charAt(i), se.getOrDefault(s.charAt(i), 0)+1);
       }
        for(int i = 0; i <t.length(); i++){
        te.put(t.charAt(i), te.getOrDefault(t.charAt(i), 0)+1);
       }
       return se.equals(te);



      
    }
}
