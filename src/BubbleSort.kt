import java.util.*

/**
 * 拿客 www.coderknock.com
 * 三产 创建于 2016年06月23日 23:26:22。、
 * 冒泡排序Kotlin版本
 */
fun main(args: Array<String>) {
    var ra = Random()
    var sortArray = Array(10, { i ->
        ra.nextInt(100)
    })
    println("要排序的数组：")
    sortArray.forEach { i ->
        print("${i} ")
    }
    for(i in sortArray.indices){
        for(j in (i+1)..(sortArray.size-1)){
            if(sortArray[j]>sortArray[i]){
                sortArray[i] = sortArray[i] xor sortArray[j]
                sortArray[j] = sortArray[i] xor sortArray[j]
                sortArray[i] = sortArray[i] xor sortArray[j]
            }
        }
    }
    println()
    println("排序后的数组：")
    sortArray.forEach { i ->
        print("${i} ")
    }
}
