/*
// Definition for a Node.
class Node {
    public int val;
    public List<Node> children;

    public Node() {}

    public Node(int _val) {
        val = _val;
    }

    public Node(int _val, List<Node> _children) {
        val = _val;
        children = _children;
    }
};
*/

class Solution {
    List<Integer> arr=new ArrayList<Integer>();
    public List<Integer> postorder(Node root) {
        if (root==null) {
            return arr;
        } else {
            recursion(root);
            return arr;
        }
    }
    public void recursion(Node root) {
        if (root.children!=null) {
            for (Node n : root.children) {
                if (n!=null) {
                    recursion(n);
                }
            }
        }
        arr.add(root.val);
    }
}
