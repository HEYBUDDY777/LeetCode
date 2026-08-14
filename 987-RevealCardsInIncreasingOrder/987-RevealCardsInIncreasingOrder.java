// Last updated: 8/14/2026, 10:48:58 AM
class Solution {
    public int[] deckRevealedIncreasing(int[] deck) {
        int n = deck.length;
        Arrays.sort(deck);
        Queue<Integer> q = new LinkedList<>();
        for(int i=0;i<n;i++){
            q.offer(i);
        }
        int[] ans = new int[n];
        for(int card :deck){  // 2 
            int index = q.poll(); // 0
            ans[index] = card;
            if(!q.isEmpty()){
                q.offer(q.poll());
            }
            
        }
        return ans;
    }
}