fun main(){
   greeting(" Joy,")
   remainder()
   var sum = add(3 ,4 ,1 ,3)
    println(sum)
   unique()
}
fun greeting(name: String){
    println("Hello"+" "+ name)
}
fun remainder(){
    var a=55
    var b=2
    var result = a%b
    println(result)

}
fun  add(num1 : Int,num2: Int,num3: Int,num4: Int): Int{
    var sum=num1+num2 +num3+ num4
    return (sum)


}
fun unique(){
    println("I love eating when am stressed")
}