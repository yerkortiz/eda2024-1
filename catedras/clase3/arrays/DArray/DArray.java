package DArray;

public class DArray<T> {
    T[] array;
    int last;
    int capacity;

    @SuppressWarnings("unchecked")
    public DArray(int capacity) throws Exception{
        if (this.last > capacity) {
            throw new DynamicArrayException("error: dynamic array error, size greater than capacity");
        }

        this.last = 0;
        this.capacity = capacity;
        this.array = (T[]) new Object[this.capacity];
    }
    
    @SuppressWarnings("unchecked")
    public DArray() {
        this.last = 0;
        this.capacity = 1;
        this.array = (T[]) new Object[this.capacity];
    }
    
    @SuppressWarnings("unchecked")
    public void append(T element){
        if (this.last + 1 >= this.capacity) {
            T[] temp = (T[]) new Object[2 * this.capacity];
            System.arraycopy(this.array, 0, temp, 0, this.capacity);
            this.capacity = 2 * this.capacity;
            this.array = temp;
        }
        this.array[last++] = element;
    }

    public T getAt(int i) throws Exception {
        if (i > last || i < 0) {
            throw new DynamicArrayException("error: append received invalid i argument. I must be positive and lesser than last element.");
        } 
        return this.array[i];
    }

    public void setAt(int i, T element) throws Exception {
        if (i > last || i < 0) {
            throw new DynamicArrayException("error: append received invalid i argument. I must be positive and lesser than last element.");
        } 
        this.array[i] = element;
    }

    public int size(){
        return this.last;
    }
}

