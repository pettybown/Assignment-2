public class MyArrayList implements MyList{
    private Object[] arr;
    private int size;

    public MyArrayList(){
        this.size = 0;
        this.arr = new Object[5];
    }

    @Override
    public int size() {
        return arr.length;
    }

    @Override
    public boolean contains(Object o) {

        return false;
    }

    @Override
    public void add(Object item) {
        if(size == arr.length){
            increaseBuffer();
        }
        else {
            arr[size++] = item;
        }

    }

    @Override
    public void add(Object item, int index) {
    }
    public void increaseBuffer(){
        Object[] newArr = new Object[arr.length * 2];
        for(int i=0; i< arr.length; i++){
            newArr[i]=arr[i];
        }
        arr = newArr;
    }

    @Override
    public boolean remove(Object item) {
        return false;
    }

    @Override
    public Object remove(int index) {
        return null;
    }

    @Override
    public void clear() {

    }

    @Override
    public Object get(int index) {
        return arr[index];
    }

    @Override
    public int indexOf(Object o) {
        return 0;
    }

    @Override
    public int lastIndexOf(Object o) {
        return 0;
    }

    @Override
    public void sort() {

    }
}
