public class Main {
    public static void main(String[] args) {
        MyArrayList myArrayList = new MyArrayList();
        System.out.println(myArrayList.size());
        myArrayList.add(123);
        System.out.println(myArrayList.get(0));
        System.out.println(myArrayList.size());
        myArrayList.clear();
        myArrayList.add(3213);
        System.out.println(myArrayList.get(0));
        myArrayList.add("True",0 );
        System.out.println(myArrayList.get(0));
        System.out.println(myArrayList.contains("asdasd"));


    }
}