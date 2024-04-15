package 排序;

public class 冒泡排序 {

    public static void main(String[] args) {

    }
    /**
     * 双层遍历，每次交换较大的数字到后面, O(n^2)
     * */
    public void bubbleSort(int[] sums){
        for(int i=0; i< sums.length; i++){
            for(int j=i+1; j < sums.length; j++){
                if(sums[j] > sums[i]){
                    int tmp = sums[j];
                    sums[j] = sums[i];
                    sums[i] = tmp;
                }
            }
        }
    }
}
