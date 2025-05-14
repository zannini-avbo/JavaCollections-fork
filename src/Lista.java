public class Lista<T> {

    private Nodo<T> root;

    public Lista() {
        root = null;
    }

    public void add(T newval) {
        if (root==null) {
            root = new Nodo<>(newval);
        } else {
            Nodo<T> temp = root;
            while (temp.getSucc()!=null) temp=temp.getSucc();
            temp.setSucc(new Nodo<>(newval));
        }
    }
}
