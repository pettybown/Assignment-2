# __Assignment2 Documentation__
## myArrayList.java
## __Size__
> __Description:__ This method returns the number of elements in the array.

    public int size() {
        return this.size;
    }
## __Contains__
> __Description:__ This method checks if the array contains the specified object. It returns true if the array contains the object and false otherwise.

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
## __Add__
> __Description:__ This method adds an element to the end of the array. If the array is full, it calls the increaseBuffer() method to increase the size of the array.

    public void add(Object item) {
            if(size == arr.length){
                increaseBuffer();
            } else {
                arr[size++] = item;
            }
        }
## __Add__
> __Description:__ This method adds an element at a specified index in the array. If the array is full, it calls the increaseBuffer() method to increase the size of the array. It shifts all the elements from the specified index to the end of the array one position to the right before inserting the new element.

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
## __IncreaseBuffer__
> __Description:__  It creates a new array with twice the length of the current array, copies the elements of the old array to the new array, and replaces the old array with the new array.

    public void increaseBuffer(){
        Object[] newArr = new Object[arr.length * 2];
        for(int i=0; i< arr.length; i++){
            newArr[i]=arr[i];
        }
        arr = newArr;
    }
## __Remove__
>__Decription:__ This method removes the element at the specified index from the array. It shifts all the elements from the specified index to the end of the array one position to the left after removing the element.

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

        }
    }
## __Remove__
>__Decription:__ This method removes the element at the specified index from the array. It shifts all the elements from the specified index to the end of the array one position to the left after removing the element.

    public Object remove(int index) {
            for(int i= index + 1; i<size; i++){
                arr[i-1] = arr[i];
            }
            return size--;
        }

## __Clear__
>__Decription:__ This method clears the array by setting its size to 0 and creating a new array of length 5.

    public void clear(){
        this.arr = new Object[5];
        this.size = 0;
    }
## __Get__
>__Decription:__ This method returns the element at the specified index in the array.

    public Object get(int index) {
            checkIndex(index);
            return arr[index];
        }
## __CheckIndex__
>__Decription:__ This method checks if there is such an index, if not, it will throw an exception

public void checkIndex(int index){
        if(index < 0 || index>=size){
            throw new IndexOutOfBoundsException();
        }
    }

## __IndexOf__
>__Decription;__ This method returns the index of the first occurrence of the specified object in the array.

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
## __LastIndexOf__
>__Decription:__ This method returns the index of the last occurrence of the specified object in the array.

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
## __Sort__
> __Description:__ This method sorts the elements of the array in ascending order using the bubble sort algorithm. It only works for arrays of Integer type.

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
## myLinkedList.java
## __Size__
> __Description:__ This method returns the number of elements in the array.

    public int size() {
            return this.size;
        }


## __Contains__ 
> __Description:__ This method checks if the array contains the specified object. It returns true if the array contains the object and false otherwise.

    public boolean contains(Object o) {
        for (int i = 0; i < size; i++) {
            if (get(i) == o) {
                return true;
            }
        }
        return false;
    }

## __Add__
> __Description:__  This method adds an element to the end of the array.
    
    public void add(Object item) {
        Node newNode = new Node(item);
        if (head == null) {
            newNode.next = null;
            newNode.previous = null;
            head = newNode;
            tail = newNode;
        } else {
            tail.next = newNode;
            newNode.previous = tail;
            tail = newNode;
        }
        size++;
    }

## __Add__
> __Description:__ This method adds an element at a specified index in the array.

    public void add(Object item, int index) {
        if (index < 0 || index > size) {
            throw new IndexOutOfBoundsException();
        }
        Node newNode = new Node(item);
        if (index == 0) {
            newNode.next = head;
            head = newNode;
        } else {
            Node current = head;
            for (int i = 0; i < index - 1; i++) {
                current = current.next;
            }
            newNode.next = current.next;
            current.next = newNode;
        }
        size++;
    }

## __Remove__
> __Description:__ This function removes the given object from the linked list, if it exists.

    public boolean remove(Object item) {
        if (head == null) {
            return false;
        }
        if (head.item.equals(item)) {
            head = head.next;
            return true;
        }
        Node current = head;
        while (current.next != null) {
            if (current.next.item.equals(item)) {
                current.next = current.next.next;
                return true;
            }
            current = current.next;
        }
        return false;
    }

## __Remove__
> __Description:__ This function removes the element at the given index from the linked list.

    public Object remove(int index) {
        if (head == null) {
            return null;
        }
        if (index == 0) {
            Node removedNode = head;
            head = head.next;
            return removedNode;
        }
        Node current = head;
        int count = 0;
        while (current != null && count < index - 1) {
            current = current.next;
            count++;
        }
        if (current == null || current.next == null) {
            return null;
        }
        Node removedNode = current.next;
        current.next = current.next.next;
        return removedNode;
    }

## __Clear__
> __Description:__  This function removes all elements from the linked list.

    public void clear() {
        head = null;
        tail = null;
        size = 0;
    }

## __Get__
> __Description:__  This function returns the element at the given index in the linked list.

    public Object get(int index) {
        if (index < 0 || index >= size) {
            throw new IndexOutOfBoundsException();
        }
        Node current = head;
        for (int i = 0; i < index; i++) {
            current = current.next;
        }
        return current.item;
    }

## __IndexOf__
> __Description:__ This function returns the index of the first occurrence of the given object in the linked list, or -1 if not found.

    public int indexOf(Object o) {
            Node current = head;
            int index = 0;
            while (current != null) {
                if (current.item.equals(o)) {
                    return index;
                }
                current = current.next;
                index++;
            }
            return -1;
        }
## __LastIndexOf__
> __Description:__ This function returns the index of the first occurrence of the given object in the linked list

    public int lastIndexOf(Object o) {
        Node current = head;
        int lastIndex = -1;
        int index = 0;
        while (current != null) {
            if (current.item.equals(o)) {
                lastIndex = index;
            }
            current = current.next;
            index++;
        }
        return lastIndex;
    }
## __Sort__
> __Description:__ This function sorts the elements of the linked list in ascending order using bubble sort. Note: this function will only work if all the elements in the linked list are integers.

    public void sort() {
        if (head == null || head.next == null) {
            return;
        }
        boolean swapped;
        do {
            swapped = false;
            Node prev = null;
            Node current = head;
            Node next = head.next;
            while (next != null) {
                if (((Comparable)current.item).compareTo(next.item) > 0) {
                    if (prev != null) {
                        prev.next = next;
                    } else {
                        head = next;
                    }
                    current.next = next.next;
                    next.next = current;
                    prev = next;
                    next = current.next;
                    swapped = true;
                } else {
                    prev = current;
                    current = next;
                    next = next.next;
                }
            }
        } while (swapped);
    }


