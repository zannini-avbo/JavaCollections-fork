
public class ListaOrdinata<T extends Comparable<T>> extends Lista<T> {

    @Override
    public void add(T newval) {
        Nodo<T> newnode = new Nodo<>(newval);
        if (root==null) { root = newnode; return; }
        Nodo<T> temp = root;
        if ( root.getValore().compareTo(newval) > 0 ) {
            newnode.setSucc(root);
            root = newnode;
            return;
        }
        while ( temp.getSucc()!=null && temp.getSucc().getValore().compareTo(newval)<0 ) {
            temp=temp.getSucc();
        }
        newnode.setSucc(temp.getSucc());
        temp.setSucc(newnode);
    }

    @Override
    public String toString() {
        return "Stringa ordinata - " + super.toString();
    }

    
} 
