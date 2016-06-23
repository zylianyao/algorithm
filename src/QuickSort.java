import java.util.Random;

/**
 * 拿客 www.coderknock.com
 * 三产 创建于 2016年06月23日 23:49:34。
 * 快速排序Java版
 */
public class QuickSort {
    public static void main(String[] args) {
        //要进行排序的数组
        int[] sortArray = new int[10];
        Random ra = new Random();
        //生成随机数，对这个随机数数组进行排序
        System.out.println("随机数组：");
        for (int i = 0; i < sortArray.length; i++) {
            sortArray[i] = ra.nextInt(100);
            System.out.print(sortArray[i] + " ");
        }

    }
}
