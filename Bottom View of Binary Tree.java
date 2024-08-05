
class Solution
{
    //Function to return a list containing the bottom view of the given tree.
    public ArrayList <Integer> bottomView(Node root)
    {
        // Code here
        ArrayList<Integer> result = new ArrayList<>();
        if (root == null) {
            return result;
        }
        
        // TreeMap to store the horizontal distance (hd) and the corresponding node's value
        TreeMap<Integer, Integer> hdNodeMap = new TreeMap<>();
        
        // Queue to hold nodes and their horizontal distances
        Queue<Pair> queue = new LinkedList<>();
        queue.add(new Pair(root, 0));
        
        while (!queue.isEmpty()) {
            Pair pair = queue.poll();
            Node node = pair.node;
            int hd = pair.hd;
            
            // Update the TreeMap with the node's data for its horizontal distance
            hdNodeMap.put(hd, node.data);
            
            // If the node has a left child, add it to the queue with horizontal distance hd-1
            if (node.left != null) {
                queue.add(new Pair(node.left, hd - 1));
            }
            
            // If the node has a right child, add it to the queue with horizontal distance hd+1
            if (node.right != null) {
                queue.add(new Pair(node.right, hd + 1));
            }
        }
        
        // Extract the values from the map sorted by horizontal distance
        for (Integer value : hdNodeMap.values()) {
            result.add(value);
        }
        
        return result;
    
    }
    class Pair {
        Node node;
        int hd;
        
        Pair(Node node, int hd) {
            this.node = node;
            this.hd = hd;
        }
    }

}
