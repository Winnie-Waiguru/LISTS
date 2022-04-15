fun main (){
    var y= evenIndicies(listOf("Winfred", "Beatrice", "Faith", "Gumato", "Jane", "Christine", "Esther", "Nelius", "Grace", "Juliet"))
    println(y)
    var x= averagesOfHeight(listOf(5.6, 3.0, 4.0, 6.7, 2.9))
    println(x)

    var a= Person("Winfred", 30, 5.9, 60)
    var b= Person("Grace", 50, 4.3, 50)
    var c=Person("Nelius", 40, 5.2, 45)
    var sorted = mutableListOf(a, b, c)
    println(sorted.sortedByDescending { n -> n.age })


    }


fun evenIndicies(names:List<String>):List<String>{
    var nList= mutableListOf<String>()

    names.forEachIndexed(){index, name ->
        if((index %2)==0){
            nList.add(name)
        }
    }
    return nList
}

fun averagesOfHeight(heights:List<Double>):String{

    var sum = heights.sum()
    var average= heights.average()

    var result= "$sum, $average"

    return result
}

data class Person(var name:String, var age:Int, var height:Double, var weight:Int){

}

data class Person2(var name:String, var age:Int, var height:Double, var weight:Int){

}
