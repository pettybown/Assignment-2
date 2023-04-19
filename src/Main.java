public class Main {
    public static void main(String[] args) {
        MyArrayList myArrayList = new MyArrayList();
        myArrayList.add(1);
        myArrayList.add("nurali");
        myArrayList.add(1, 1);
        System.out.println(myArrayList.get(1));
        myArrayList.add(2, 1);
        System.out.println(myArrayList.get(1));
        System.out.println(myArrayList.get(2));
        myArrayList.sort();
        MyLinkedList myLinkedList = new MyLinkedList();
        System.out.println(myLinkedList.size());
        myLinkedList.add("nurali");
        System.out.println(myLinkedList.size());

    }
}