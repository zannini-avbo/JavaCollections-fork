public class Tree<T extends Comparable<T>> {

    protected Treenode<T> root;

    public Tree() {
        root = null;
    }

    private void recursiveAdd( Treenode<T> p, T value ) {
        if (p.getValue().compareTo(value)>0) {
            if (p.getLeft()==null) {
                p.setLeft(new Treenode<>(value));
            } else recursiveAdd( p.getLeft(), value );
        } else {
            if (p.getRight()==null) {
                p.setRight(new Treenode<>(value));
            } else recursiveAdd( p.getRight(), value );
        }
    }

    public void add( T value ) {
        if (root==null) root = new Treenode<>(value);
        recursiveAdd( root, value );
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("Tree [");
        visitaSottoAlbero(root, sb);
        if (sb.length() > 6) sb.setLength(sb.length() - 2); // Rimuove l'ultima virgola e spazio
        sb.append("]");
        return sb.toString();
    }

    private void visitaSottoAlbero(Treenode<T> node, StringBuilder sb) {
        if (node == null) return;
        visitaSottoAlbero(node.getLeft(), sb);
        sb.append(node.getValue()).append(", ");
        visitaSottoAlbero(node.getRight(), sb);
    }

}
