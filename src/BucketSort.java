import java.util.Random;

/**
 * 拿客 www.coderknock.com
 * 三产 2016年06月22日
 * 桶排序Java版本
 */
public class BucketSort {
    public static void main(String[] args) {
        //进行排序时使用的桶
        int[] array = new int[11];
        int[] sortArray = new int[5];
        Random ra = new Random();
        //生成随机数，对这个随机数数组进行排序
        for (int i = 0; i < sortArray.length; i++) {
            sortArray[i] = ra.nextInt(10);
        }
        System.out.println("要排序的数组：");
        //循环读入要排序的数组
        for (int t : sortArray) {
            System.out.print(t + " ");  //把每一个数读到变量t中
            array[t]++;  //进行计数
        }
        System.out.println();
        System.out.println("正序排序后的结果：");//输出完成后
        for (int i = 0; i < array.length; i++) {  //依次判断a[0]~a[10]
            for (int j = 0; j < array[i]; j++) {  //出现了几次就打印几次
                System.out.print(i + " ");
            }
        }
        System.out.println();
        System.out.println("倒序排序后的结果：");//输出完成后
        for (int i = (array.length - 1); i >= 0; i--) {  //依次判断a[0]~a[10]
            for (int j = 0; j < array[i]; j++) {  //出现了几次就打印几次
                System.out.print(i + " ");
            }
        }
    }
}