package ThreadsRace;

import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        ArrayList<Integer> originalList = new ArrayList<>();
        for (int i = 1; i <= 10000; i++) {
            originalList.add(i);
        }

        ArrayList<Integer> evenNumbersList = new ArrayList<>();
        ArrayList<Integer> oddNumbersList = new ArrayList<>();

        int sublistSize = 2500;
        ArrayList<ArrayList<Integer>> subLists = new ArrayList<>();

        // Split the originalList into 4 equal sublists
        for (int i = 0; i < originalList.size(); i += sublistSize) {
            int endIndex = Math.min(i + sublistSize, originalList.size());
            ArrayList<Integer> subList = new ArrayList<>(originalList.subList(i, endIndex));
            subLists.add(subList);
        }

        // Create and start 4 threads
        ArrayList<Thread> threads = new ArrayList<>();
        for (int i = 0; i < subLists.size(); i++) {
            Thread thread = new Thread(new NumberProcessor(subLists.get(i), evenNumbersList, oddNumbersList, i + 1));
            thread.start();
            threads.add(thread);
        }

        // Wait for all threads to finish
        for (Thread thread : threads) {
            try {
                thread.join();
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }
}

class NumberProcessor implements Runnable {
    private ArrayList<Integer> inputList;
    private ArrayList<Integer> evenNumbersList;
    private ArrayList<Integer> oddNumbersList;
    private int threadNumber;

    public NumberProcessor(ArrayList<Integer> inputList, ArrayList<Integer> evenNumbersList,
                           ArrayList<Integer> oddNumbersList, int threadNumber) {
        this.inputList = inputList;
        this.evenNumbersList = evenNumbersList;
        this.oddNumbersList = oddNumbersList;
        this.threadNumber = threadNumber;
    }

    @Override
    public void run() {
        for (int number : inputList) {
            if (number % 2 == 0) {
                synchronized (evenNumbersList) {
                    evenNumbersList.add(number);
                    System.out.print(number + " ");
                }
            } else {
                synchronized (oddNumbersList) {
                    oddNumbersList.add(number);
                    System.out.print(number + " ");
                }
            }
        }
    }
}
