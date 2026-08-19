class Solution {
    public boolean isNStraightHand(int[] hand, int groupSize) {
        if(hand.length % groupSize != 0)return false;
        //ab treemap, bcz we need to count the freq, as well as maintain sorted order
        TreeMap<Integer, Integer> handMap = new TreeMap<>();
        for (int card : hand) {
            handMap.put(card, handMap.getOrDefault(card, 0) + 1);
        }

        while(!handMap.isEmpty()){
            int first = handMap.firstKey();
            for(int i = 0; i < groupSize; i++){
                int currCard = first + i;
                if(!handMap.containsKey(currCard)){
                    return false;
                }

                int count = handMap.get(currCard);
                if(count == 1){
                    handMap.remove(currCard);
                }
                else{
                    handMap.put(currCard, count -1);
                }
            }
        }
     return true;
    }
}
