public class Box<T> {
    public T content;
    private T t;

    public boolean compare(Box<T> other){
        boolean result = content.equals(other.content);
        return result;
    }

    public T get(){
        return t;
    }

    public void set(T t){
        this.t = t;
    }
}
