/**
 * @author: wangpeilei
 * @date: 2021/05/30 23:17
 **/
public class A116 {

    private static class Solution {
        public Node connect(Node root) {
            if (root == null) {
                return null;
            }

            connectTwoNode(root.left, root.right);

            return root;
        }

        private void connectTwoNode(Node left, Node right) {
            if (left == null || right == null) {
                return;
            }

            left.next = right;

            connectTwoNode(left.left, left.right);
            connectTwoNode(right.left, right.right);
            connectTwoNode(left.right, right.left);
        }
    }

    private static class Node {
        public int val;
        public Node left;
        public Node right;
        public Node next;

        public Node() {
        }

        public Node(int _val) {
            val = _val;
        }

        public Node(int _val, Node _left, Node _right, Node _next) {
            val = _val;
            left = _left;
            right = _right;
            next = _next;
        }
    }
}
