package thuchanh4;

public class Main {
    public static void main(String[] args) {
        BTS<String> tree = new BTS<>();
        tree.insert("nhan");
        tree.insert("khoa");
        tree.insert("tan");
        tree.insert("nam");
        tree.insert("hieu");
        tree.insert("khiet");
        tree.insert("chinh");
        System.out.println("Inorder  (sorted):  ");
        tree.inorder();
        System.out.println("the number of nodes is: "+ tree.size);
    }
}
