package thuchanh4;


public interface iTree<E> {
    boolean insert(E e);
    void inorder();
    int getSize();
}
