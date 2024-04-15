package 排序;

public class 插入排序 {
    /**
     * 将数组分成有序部分与无序部分
     * 刚开始有序部分只有一个元素，每次从无序表中取一个元素放入到有序表中
     * O（n^2）
     * */

    public void insertSort(int[] sums){
        for(int i=1; i< sums.length; i++){
            //如果无序表的第一个数值比有序表的最大值小才可以进行操作，否则保持原装
            if(sums[i] < sums[i-1]){
                int j;
                int tmp = sums[i];//保存下，后面要进行插入
                //遍历有序表部分,并且只后移比i的值大的元素
                for(j=i-1; j>=0 && sums[j] > tmp; j--){
                    sums[j+1] = sums[j];//有序表是有序的，所以大于元素都在一起
                }
                //最后遍历完的j+1位置就是需要插入的地方
                sums[j+1] = sums[i];
            }
        }
    }
}
