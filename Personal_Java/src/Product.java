public class Product<K, M> {

    private K kind;
    private M model;

    public K getKind(){return this.kind;}
    public M getModel(){return  this.model;}
    public void setKind(K kind){this.kind = kind;}
    public void setModel(M model){this.model = model;}
}
