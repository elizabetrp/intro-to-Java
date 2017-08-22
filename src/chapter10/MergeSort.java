package chapter10;

public class MergeSort {
	private int[] array;
    private int[] tempMergArr;
    private int length;
 
//    Реализирайте алгоритъма "сортиране чрез сливане" (merge-sort). При
//    него началният масив се разделя на две равни по големина части, които
//    се сортират (чрез merge-sort) и след това двете сортирани части се
//    сливат, за да се получи целият масив в сортиран вид.

    //Do not leave more than one empty line
    public static void main(String[] args){
         
        int[] inputArr = {45, 23, 11, 89, 77, 98, 4, 28, 65, 43};
        MergeSort ms = new MergeSort();
        ms.sort(inputArr);
        for(int i:inputArr){
            //You can make this in one print
            System.out.print(i);
            System.out.print(" ");
        }
    }
     
    public void sort(int inputArr[]) {
        this.array = inputArr;
        this.length = inputArr.length;
        this.tempMergArr = new int[length];
        doMergeSort(0, length - 1);
    }
 
    private void doMergeSort(int lowerIndex, int higherIndex) {
         
        if (lowerIndex < higherIndex) {
            int middle = (lowerIndex + higherIndex) / 2;
            doMergeSort(lowerIndex, middle);
            doMergeSort(middle + 1, higherIndex);
            mergeParts(lowerIndex, middle, higherIndex);
        }
    }
 
    private void mergeParts(int lowerIndex, int middle, int higherIndex) {
 
        for (int i = lowerIndex; i <= higherIndex; i++) {
            tempMergArr[i] = array[i];
        }
        int i = lowerIndex;
        int j = middle + 1;
        int k = lowerIndex;
        while (i <= middle && j <= higherIndex) {
            if (tempMergArr[i] <= tempMergArr[j]) {
                array[k] = tempMergArr[i];
                i++;
            } else {
                array[k] = tempMergArr[j];
                j++;
            }
            k++;
        }
        while (i <= middle) {
            array[k] = tempMergArr[i];
            k++;
            i++;
        }
    }
}
