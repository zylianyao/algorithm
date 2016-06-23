import java.util.Random;

/**
 * 拿客 www.coderknock.com
 * 三产 创建于 2016年06月23日 22:47:00。
 * 冒泡排序Java版本
 */
public class BubbleSort {
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
        //从第一位开始，与相邻每位进行比较、交换，确保最下一位盘最后
        for (int i = 0; i < sortArray.length; i++) {
            for (int j = i + 1; j < sortArray.length; j++) {
                if (sortArray[j] > sortArray[i]) {
                    sortArray[i] = sortArray[i] ^ sortArray[j];
                    sortArray[j] = sortArray[i] ^ sortArray[j];
                    sortArray[i] = sortArray[i] ^ sortArray[j];
                }
            }
        }
        System.out.println();
        System.out.println("排序结果：");
        for (int i : sortArray) {
            System.out.print(i + " ");
        }

    }
}
