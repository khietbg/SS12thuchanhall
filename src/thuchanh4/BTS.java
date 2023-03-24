package thuchanh4;

import javax.xml.soap.Node;

public class BTS<E extends Comparable<E>> extends AbstractTree<E>{
    protected TreeNode<E> root;
    protected int size = 0;

    public BTS() {
    }

    public BTS(E[] object) {
        for (int i = 0; i < object.length; i++) {
            insert(object[i]);
        }
    }

    @Override
    public boolean insert(E e) {
        if (root==null){
            root = createNewNode(e);
        }else {
            TreeNode<E> parent = null;
            TreeNode<E> current = root;
            while (current !=null){
                if (e.compareTo(current.element)<0){
                    parent = current;
                    current=current.left;
                }else if (e.compareTo(current.element)>0){
                    parent = current;
                    current=current.right;
                }else
                    return false;
            }
            if (e.compareTo(parent.element)<0){
                parent.left = createNewNode(e);
            }
            else
                parent.right = createNewNode(e);
        }
        size++;
        return true;
    }
    protected TreeNode<E> createNewNode(E e){
        return new TreeNode<>(e);
    }
    @Override
    public void inorder(){
        inorder(root);
    }
    protected void inorder(TreeNode<E> root){
    if (root==null) return;
        inorder(root.left);
        System.out.println(root.element + " ");
        inorder(root.right);
    }
    @Override
    public int getSize() {
        return size;
    }
    public void delete(E e){

    }
    public void printPostOrder(TreeNode<E> root){
        printPostOrder(this.root);
    }
    private void printPostOrder(Node node){
        if (node == null){

        }
    }
}
