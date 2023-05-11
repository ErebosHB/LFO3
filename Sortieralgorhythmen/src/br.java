

public class br {
    public static void main(String[] args) {
        
        double list[] = {3,4,6,5,10,7.5};
         BubbleSort bubbleSort = new BubbleSort();
         InsertionSort insertionSort = new InsertionSort();

         bubbleSort.sortiereAufsteigend(list);
        System.out.println("---");
         bubbleSort.sortiereAbsteigend(list);
        System.out.println("---Insertion");
        insertionSort.sortiereAufsteigend(list);
        System.out.println("---");
        insertionSort.sortiereAbsteigend(list);

    }

}
