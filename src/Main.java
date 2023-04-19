public class Main {
    public static void main(String[] args) {
        MyArrayList myArrayList = new MyArrayList();
        myArrayList.add(1);
        myArrayList.add("nurali");
        myArrayList.add(1, 1);
        System.out.println(myArrayList.get(1));
        myArrayList.add(2, 1);
        myArrayList.add(3, 1);
        myArrayList.add(2, 1);
        System.out.println(myArrayList.get(1));
        System.out.println(myArrayList.indexOf(2));
        System.out.println(myArrayList.lastIndexOf(2));
        myArrayList.clear();
        System.out.println(myArrayList.size());
        myArrayList.sort();
        System.out.println(myArrayList.contains("asda"));
        MyLinkedList myLinkedList = new MyLinkedList();
        System.out.println(myLinkedList.size());
        System.out.println(myLinkedList.size());
        myLinkedList.add(1);
        myLinkedList.add("nurali");
        myLinkedList.add(3);
        myLinkedList.add(3);
        myLinkedList.add(3);
        myLinkedList.add(4);
        System.out.println(myLinkedList.size());
        System.out.println(myLinkedList.get(2));
        System.out.println(myLinkedList.contains(2));
        System.out.println(myLinkedList.remove("nurali"));
        System.out.println(myLinkedList.get(2));
        System.out.println(myLinkedList.indexOf(3));
        System.out.println(myLinkedList.lastIndexOf(3));
        myLinkedList.sort();
        myLinkedList.clear();
        System.out.println(myLinkedList.size());


    }
}