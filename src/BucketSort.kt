import java.util.*

/**
 * 拿客 www.coderknock.com
 * 三产 2016年06月22日
 * 桶排序
 */
fun main(args: Array<String>) {
    //进行排序时使用的桶
    val array = IntArray(11)
    var ra = Random()
    //存储随机数
    var randomArray = Array(5, { i ->
        ra.nextInt(10)
    })
    println("要排序的数组：")
    randomArray.forEach { i ->
        print("${i} ")
        array[i]++
    }
    println()
    println("正序排序后的结果：")//输出完成后
    for (i in array.indices) {
        for (idx in 0..(array[i] - 1)) {
            print("${i} ")
        }
    }
    println()
    println("倒序排序后的结果：")//输出完成后
    for (i in array.size - 1 downTo 0) {  //依次判断a[0]~a[10]
        for (j in 0..array[i] - 1) {  //出现了几次就打印几次
            print("${i} ")
        }
    }
}