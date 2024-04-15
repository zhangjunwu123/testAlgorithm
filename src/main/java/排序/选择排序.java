package 排序;

public class 选择排序 {

    /**
     * 与冒泡排序类似，只不过是内循环遍历一次只交换一次, O(n^2)
     * */
    public void selectSort(int[] sums){
        for(int i=0; i< sums.length; i++){
            int index = i;
            //这样遍历完成后，会得到当前的最小值
            for(int j=i+1; j< sums.length; j++){
                if(sums[j] < sums[index]){
                    index = j;
                }
            }
            //放置在数组最前面，与最前面的数字交换
            if(index != i){
                int tmp = sums[i];
                sums[i] = sums[index];
                sums[index] = tmp;
            }
        }
    }
}
