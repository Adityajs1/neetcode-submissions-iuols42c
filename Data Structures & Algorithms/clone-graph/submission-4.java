/*
Definition for a Node.
class Node {
    public int val;
    public List<Node> neighbors;
    public Node() {
        val = 0;
        neighbors = oldnew ArrayList<Node>();
    }
    public Node(int _val) {
        val = _val;
        neighbors = oldnew ArrayList<Node>();
    }
    public Node(int _val, ArrayList<Node> _neighbors) {
        val = _val;
        neighbors = _neighbors;
    }
}
*/

class Solution {
    public Node cloneGraph(Node node) {
       Map<Node, Node> oldnew = new HashMap<>();
       return dfs(node, oldnew);
    }
    private Node dfs(Node node , Map<Node, Node> oldnew){
        if(node == null)return null;
        if(oldnew.containsKey(node)){
            return oldnew.get(node);
        }
        Node copy = new Node(node.val);
        oldnew.put(node, copy);
        for(Node nei : node.neighbors){
            copy.neighbors.add(dfs(nei, oldnew));
        }
        return copy;
    }
}