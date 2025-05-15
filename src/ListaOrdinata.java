
public class ListaOrdinata<T extends Comparable<T>> extends Lista<T> {

    @Override
    public void add(T newval) {
        Nodo<T> newnode = new Nodo<>(newval);
        if (root==null) {
            root = newnode;
        } else {
            Nodo<T> temp = root;
            while ( temp.getValore().compareTo(newval)>0 && temp.getSucc()!=null ) temp=temp.getSucc();
            newnode.setSucc(temp.getSucc());
            temp.setSucc(newnode);
        }
    }

    
} 
