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
        int count = 0;
        for (int i = 0; i < arr.length; i++){
            if(o == arr[i]){
                count++;
            }
        }
        if (count > 0){
            return true;
        }
        else{
            return false;
        }
    }

    @Override
    public void add(Object item) {
        if(size == arr.length){
            increaseBuffer();
        } else {
            arr[size++] = item;
        }

    }

    @Override
    public void add(Object item, int index) {
        if(size == arr.length) {
            increaseBuffer();
        }
        else {
            this.size +=1;
            arr[index]= item;
        }
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
        for(int i= index + 1; i<size; i++){
            arr[i-1] = arr[i];
        }
        return size--;
    }

    @Override
    public void clear(){
        this.arr = new Object[5];
        this.size = 0;
    }

    @Override
    public Object get(int index) {
        checkIndex(index);
        return arr[index];
    }
    public void checkIndex(int index){
        if(index < 0 || index>=size){
            throw new IndexOutOfBoundsException();
        }
    }

    @Override
    public int indexOf(Object o) {
        int count = 0;
        for (int i = 0; i < arr.length; i++) {
            if (o == arr[i]) {
                break;
            }
            else{
                count++;
            }
        }
        return count;
    }

    @Override
    public int lastIndexOf(Object o) {
        int count = 0;
        for (int i = size; i > 0; i--) {
            if (o == arr[i]) {
                break;
            }
            else{
                count++;
            }
        }
        return count;
    }

    @Override
    public void sort() {


    }
}
