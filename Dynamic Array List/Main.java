public class Main {
    public static void main(String[] args) {
        MyList<Integer> list = new MyList<>();
        list.add(1);
        list.add(2);
        list.add(3);
        list.add(4);
        list.add(5);
        list.remove(3); // Deletes the 3rd index
        System.out.println(list.get(3)); // Accesses the 3rd index
        list.set(1, 50); // Update the element at index 1 with the value 50
        System.out.println("Number of Elements in the List: " + list.size());
        System.out.println("Capacity of the List: " + list.getCapacity());
    }
}
