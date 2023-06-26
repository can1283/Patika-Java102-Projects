public class MyList<T> {
    private T[] array; // Array to store the elements
    private int size; // Current number of elements in the list
    private int capacity; // Current capacity of the list

    public MyList() {
        this.capacity = 10; // Default initial capacity
        this.array = (T[]) new Object[capacity]; // Create the array
        this.size = 0; // No elements initially
    }

    public MyList(int capacity) {
        this.capacity = capacity; // Custom initial capacity
        this.array = (T[]) new Object[capacity]; // Create the array
        this.size = 0; // No elements initially
    }

    public int size() {
        return size; // Return the current number of elements
    }

    public int getCapacity() {
        return capacity; // Return the current capacity of the list
    }

    public void add(T data) {
        if (size == capacity) {
            expandCapacity(); // Expand the capacity if the list is full
        }
        array[size] = data; // Add the element at the next available index
        size++; // Increment the size
    }

    private void expandCapacity() {
        capacity *= 2; // Double the capacity
        T[] newArray = (T[]) new Object[capacity]; // Create a new array with the expanded capacity
        System.arraycopy(array, 0, newArray, 0, size); // Copy the elements to the new array
        array = newArray; // Replace the old array with the new array
    }

    public T get(int index) {
        if (index < 0 || index >= size) {
            return null; // Return null for invalid indices
        }
        return array[index]; // Return the element at the specified index
    }

    public void remove(int index) {
        if (index < 0 || index >= size) {
            return; // Ignore invalid indices
        }
        System.arraycopy(array, index + 1, array, index, size - index - 1); // Shift the elements to the left
        array[size - 1] = null; // Set the last element to null
        size--; // Decrement the size
    }

    public void set(int index, T data) {
        if (index < 0 || index >= size) {
            return; // Ignore invalid indices
        }
        array[index] = data; // Update the element at the specified index
    }

    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("[");
        for (int i = 0; i < size; i++) {
            sb.append(array[i]);
            if (i < size - 1) {
                sb.append(", ");
            }
        }
        sb.append("]");
        return sb.toString(); // Return the elements as a formatted string
    }
}
