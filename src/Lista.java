
public class Lista<T> {

    protected Nodo<T> root;

    public Lista() {
        root = null;
    }

    public void add(Nodo<T> newnode) {
        if (root==null) {
            root = newnode;
        } else {
            Nodo<T> temp = root;
            while (temp.getSucc()!=null) temp=temp.getSucc();
            temp.setSucc(newnode);
        }
    }

    public void add(T newval) {
        Nodo<T> newnode = new Nodo<>(newval);
        this.add(newnode);
    }

    public void addHead( T newval) {
        Nodo<T> nuovonodo = new Nodo<>(newval);
        nuovonodo.setSucc(root);
        root = nuovonodo; 
    }

    @Override
    public String toString() {
        String result = "Lista: ";
        Nodo<T> tmp = root;
        while (tmp!=null) {
            result += " --> " + tmp;
            tmp = tmp.getSucc();      
        }
        return result;
    }

    public int getLength() {
        int n = 0;
        Nodo<T> tmp;
        for (n=0, tmp=root; tmp!=null; n++, tmp=tmp.getSucc());
        return n;
    }

    public void removePosition( int pos ) {
        if ( pos<=0 || root==null || pos>getLength() ) {
            System.out.println("Impossibile rimuovere un nodo in una posizione inesistente");
            return;
        }
        if (pos==1) { root = root.getSucc(); return; }
        Nodo<T> tmp = root;
        for (int i=2; i<pos; i++) tmp = tmp.getSucc();
    	tmp.setSucc( tmp.getSucc().getSucc() );
    }

}
