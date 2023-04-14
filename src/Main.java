public class Main {
    public static void main(String[] args) {
        MyArrayList myArrayList = new MyArrayList();
        System.out.println(myArrayList.size());
        myArrayList.add("True",0);
        System.out.println(myArrayList.get(0));
        myArrayList.add("nurali1", 1);
        myArrayList.add("nurali2", 2);
        myArrayList.add("nurali3", 3);
        System.out.println(myArrayList.get(1));
        System.out.println(myArrayList.contains("asdasd"));
        System.out.println(myArrayList.get(0));
        System.out.println(myArrayList.indexOf("nurali2"));


    }
}