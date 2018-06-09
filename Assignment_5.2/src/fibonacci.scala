

object Loop_fibonacci {
  
  def fib_recursive(n: Int):Int = {
    if(n==1){
      0
    }
    else if(n==2){
      1
    }
    else {
      fib_recursive(n-1)+fib_recursive(n-2)
    }
  }
  
  def fib_loop(n :Int) : Int = {
    if(n == 1){
      return 0
    }
    else
    if(n == 2){
        return 1
      }
    var a = 0
    var b = 1
    var i = 1
    while(i<n){
      val c = a+b
      a = b
      b = c
      i = i+1
    }
    return a
  }
  def main(args: Array[String]){
    println(args(0)+" position in fibonacci series is "+fib_loop(args(0).toInt)+" using loop")
    println(args(0)+" position in fibonacci series is "+fib_recursive(args(0).toInt)+" using recusrion")
  }
}