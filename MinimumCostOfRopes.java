class Solution {
    public static int minCost(int[] arr) {
        // code here
         PriorityQueue<Integer> pq = new PriorityQueue<>();

        // Add all ropes to the heap
        for (int rope : arr) {
            pq.add(rope);
        }

        int totalCost = 0;

        // Keep connecting the two smallest ropes until one rope remains
        while (pq.size() > 1) {
            int first = pq.poll();   // smallest
            int second = pq.poll();  // second smallest

            int cost = first + second;  // cost to connect
            totalCost += cost;          // add to total

            pq.add(cost);  // push the new combined rope back to heap
        }

        return totalCost;
    }
}
