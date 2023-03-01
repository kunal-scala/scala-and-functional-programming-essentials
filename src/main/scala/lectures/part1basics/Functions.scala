package lectures.part1basics

object Functions extends App{
  // compiler infer the return types of functions, if they are not provided.
  def aFunction(a: String, b: Int): String =
    a + " " + b

  // function with code block, because block is also an expression
  def bFunction(a: String, b: Int): String = {
    a + " " + b
  }
  println(aFunction("hello", 3))

  def aParameterlessFunction(): Int = 42
  println(aParameterlessFunction())
  // println(aParameterlessFunction) // only works in Scala 2 - parameterless functions are invoked without parentheses

  // recursive function
  // compiler doesn't infer the return type of recursive function, you have to manually provide it.
  def aRepeatedFunction(aString: String, n: Int): String = {
    if (n == 1) aString
    else aString + aRepeatedFunction(aString, n-1)
  }
  println(aRepeatedFunction("hello",3))

  // WHEN YOU NEED LOOPS, USE RECURSION.

  // we normally need functions with side effects, if we want something that has nothing to do with the computation itself,
  // ex. printing something to the console, displaying something on the screen, logging something or writing to a file etc.
  def aFunctionWithSideEffects(aString: String): Unit = println(aString)

  // code blocks also allows you to define functions inside it.
  def aBigFunction(n: Int): Int = {
    def aSmallerFunction(a: Int, b: Int): Int = a + b

    aSmallerFunction(n, n-1)
  }

  /*
    Exercises:
    1.  A greeting function (name, age) => "Hi, my name is $name and I am $age years old."
    2.  Factorial function 1 * 2 * 3 * .. * n
    3.  A Fibonacci function
        f(1) = 1
        f(2) = 1
        f(n) = f(n - 1) + f(n - 2)
    4.  Tests if a number is prime.
   */

  // Exercises solution practise
  // 1.
  def aGreeting(name: String, age: Int): String =
    "Hi, my name is "+ name + " and i'm " + age + " years old"
  println(aGreeting("kunal", 30))

  // 2.
  def aFactorial(n: Int): Int =
    if (n == 1) n
    else n * aFactorial(n-1)
  println(aFactorial(4))

  // 3.
  def aFibonacci(n: Int): Int = {
    var current: Int = 1
    var count: Int = 1
    var last: Int = 0
    def aCalculatFib(): Int = {
      if(n < 2)
        n
      else if(n == count)
        current
      else
        val temp = current
        current = last + current; last = temp; count += 1; aCalculatFib()
    }
    aCalculatFib()
  }
  println("f(10) = " + aFibonacci(10))

  // 4.
  def aPrime(n: Int): Boolean = {
    def defCalculatePrime(m: Int): Boolean = {
      if(m == 1) true
      else if((n % m) == 0) false
      else defCalculatePrime(m-1)
    }
    defCalculatePrime(n-1)
  }
  println("is 10 prime? : " + aPrime(10))

  
  // Exercises solution original
  // 1.
  def greetingForKids(name: String, age: Int): String =
    "Hi, my name is " + name + " and I am " + age + " years old."
  println(greetingForKids("David", 12))

  // 2.
  def factorial(n: Int): Int =
    if (n <= 0) 1
    else n * factorial(n-1)
  println(factorial(5))

  // 3.
  def fibonacci(n: Int): Int =
    if (n <= 2) 1
    else fibonacci(n-1) + fibonacci(n-2)
  // 1 1 2 3 5 8 13 21
  println(fibonacci(8))

  // 4.
  def isPrime(n: Int): Boolean = {
    def isPrimeUntil(t: Int): Boolean =
      if (t <= 1) true
      else n % t != 0 && isPrimeUntil(t-1)
    isPrimeUntil(n / 2)
  }
  println(isPrime(37))
  println(isPrime(2003))
  println(isPrime(37 * 17))
}
