
public class MyArray<T> {

  T[] v;
  int len, size, delta;

  @SuppressWarnings("unchecked")
  public MyArray( int startSize, int deltaSize ) {
    size = ( startSize<=0 ? 100 : startSize );
    v = (T[]) new Object[size];
    len = 0;
    delta = ( deltaSize<=0 ? 10 : deltaSize );
  }

  public MyArray() {
    this(100, 10);
  }

  @SuppressWarnings("unchecked")
  public void add( T newValue ) {
    if (len>=size) {
      // il nostro array è sold-out
      T[] nuovoV = (T[]) new Object[size + delta];
      for (int i=0; i<len; i++) nuovoV[i]=v[i];
      v = nuovoV;
      size += delta;
    }
    v[len++] = newValue;
  }

    @Override
    public String toString() {
      String s = "Sono un VETTORE grande " + size + " e contengo " + len + " valori: ";
      for (int i=0; i<len; i++) s += v[i] + " - ";
      return s;
    }
  
}
