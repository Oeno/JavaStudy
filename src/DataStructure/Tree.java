package DataStructure;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by oeno on 2017. 4. 16..
 */
public class Tree<T> {
    private TreeNode root;

    public Tree(T rootData) {
        root.data = rootData;
        root.parent = null;
        root.child = new ArrayList();
    }

    public void add(T data) {
        TreeNode treeNode = new TreeNode(data);
        treeNode.parent = root;

        switch(root.child.size()) {
            case 0:
                root.child.add(0, treeNode);
                break;
            case 1:
                root.child.add(1, treeNode);
                break;
            default:
                add(data);

        }
    }

    public static class TreeNode<T> {
        private T data;
        private TreeNode parent;
        private List<TreeNode> child;

        private TreeNode(T data) {
            this.data = data;
        }
    }
}
