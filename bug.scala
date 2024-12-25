```scala
class MyClass[T](val value: T) {
  def myMethod(x: T): T = {
    // Incorrect comparison using == for generics
    if (x == value) value 
    else value
  }
}

val myInstance = new MyClass(5)
println(myInstance.myMethod(5)) //Prints 5

val myInstance2 = new MyClass("hello")
println(myInstance2.myMethod("hello")) //Prints hello

val myInstance3 = new MyClass(new java.util.Date())
println(myInstance3.myMethod(new java.util.Date())) //Prints current Date, not the same object
```