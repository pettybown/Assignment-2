public class MyArrayList implements MyList{
    private Object[] arr;
    private int size;

    public MyArrayList(){
        this.size = 0;
        this.arr = new Object[5];
    }
    /**
     * @function size выдает длину массива
     * @noparams
     * @return int
     **/
    @Override
    public int size() {
        return this.size;
    }
    /**
     * @function contains true если Object o в массиве
     * @param o объект поиска
     * @return boolean
     **/
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
    /**
     * @function add добавляет объект в массив
     * @param item объект для добавления
     * @return void
     **/
    @Override
    public void add(Object item) {
        if(size == arr.length){
            increaseBuffer();
        } else {
            arr[size++] = item;
        }
    }
    /**
     * @function add добавляет объект на определенный индекс
     * @param item объект для добавления
     * @param index индекс куда нужно добавить item
     * @return void
     **/
    @Override
    public void add(Object item, int index) {
        if(size == arr.length) {
            checkIndex(index);
            increaseBuffer();
        }
        else {
            for(int i = size; i>index; i--) {
                arr[i] = arr[i-1];
            }
            size++;
            arr[index]= item;
        }
    }
    /**
     * @function increaseBuffer увеличиваем буфер массива
     * @noparams
     * @return void
     **/
    public void increaseBuffer(){
        Object[] newArr = new Object[arr.length * 2];
        for(int i=0; i< arr.length; i++){
            newArr[i]=arr[i];
        }
        arr = newArr;
    }
    /**
     * @function remove удаляет объект из массива
     * @param item объект удаления
     * @return boolean
     **/
    @Override
    public boolean remove(Object item) {
        int count = 0;
        for(int i = 0; i < size; i++){
            if(item == arr[i]){
                arr[i - 1] = arr[i];
                size--;
                count++;
                break;
            }
        }
        if (count == 1){
            return true;

        }
        else {
            return false;

        }}
    /**
     * @function remove удаляет объект из массива
     * @param index индекст элемента для удаления
     * @return Object
     **/
    @Override
    public Object remove(int index) {
        for(int i= index + 1; i<size; i++){
            arr[i-1] = arr[i];
        }
        return size--;
    }
    /**
     * @function clear очищает массив
     * @noparam
     * @return void
     **/
    @Override
        public void clear(){
            this.arr = new Object[5];
            this.size = 0;
        }
    /**
     * @function get возвращает объект из массива под его индексом
     * @param index индекс объекта
     * @return Object
     **/
    @Override
    public Object get(int index) {
        checkIndex(index);
        return arr[index];
    }

    /**
     * @function checkIndex проверяет может быть ли такой индекс
     * @param index индекс объекта
     * @return void
     **/
    public void checkIndex(int index){
        if(index < 0 || index>=size){
            throw new IndexOutOfBoundsException();
        }
    }
    /**
     * @function indexOf возвращает индекс первого вхождения объекта
     * @param o объект для поиска
     * @return int
     **/
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
    /**
     * @function lastIndexOf возвращает индекс последнего вхождения объекта в массив
     * @param o объект для поиска
     * @return int
     **/
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
        return size - count;
    }
    /**
     * @function sort сортирует массив (bubble sort)
     * @noparam
     * @return void
     **/
    @Override
    public void sort() {
        try{
        for (int i = 0; i < size; i++) {
            for (int j = i; j < size; j++) {
                if ((int) arr[j] < (int) arr[i]) {
                    Object temp = arr[i];
                    arr[i] = arr[j];
                    arr[j] = temp;
                }}
        }

    }
    catch (Exception e){
        System.out.println("array must be digit");
        }
    }
}
