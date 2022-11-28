fun main(args: Array<String>) {

    val pow = getPower(2,8)
    println("2 to the power of 8 is $pow")
    sumOfValues(10)
    val list = listOf(1,5,2,4,6,9,6,8,3,2,5,7,9,9,2,3,4,3)
    println("The list is $list")
    println("Search for this number: ")
    val search = readLine()?.toInt()
    if (search != null){
        println("The index of $search is ${printIndex(list, search)}")
    }
    searchFor("How to play chess")
    searchFor(search = "How to cook chapati", searchEngine = "BRAVE")
    val max = getMax(1,2,3,5,3,34,6,7,34,55,8, 78,990,45,35,34,46)
    println("The maximum is $max")
}
fun printIndex(list: List<Int>, value: Int) : Int  {
    for(i in 0..list.size -1){
        if (list[i] == value){
            return i
        }
    }
    return -1
}
fun getPower(base: Int, power: Int): Int{
    var result = 1
    for (i in 1..power){
        result *= base
    }
    return result
}
fun sumOfValues(value: Int){
    var result = 0
    for(i  in 1..value){
        result += i
    }
    println("The sum of values from 1 to $value is  $result")
}
fun searchFor(search: String, searchEngine: String = "Google"){
    println("Searching for '$search' on $searchEngine")
}
fun getMax(vararg numbers: Int): Int{
    var max = numbers[0]
    for (number in numbers){
        if (number > max){
            max = number
        }
    }
    return max
}