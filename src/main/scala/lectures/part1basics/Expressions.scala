package lectures.part1basics

object Expressions extends App {

  val x = 1 + 2 // EXPRESSION
  println(x)

  println(2 + 3 * 4)
  // + - * / & | ^ << >> >>> (right shift with zero extension)

  println(1 == x)
  // == != > >= < <=

  println(!(1 == x))
  // ! && ||

  var aVariable = 2
  aVariable += 3 // also works with -= *= /= ..... side effects
  println(aVariable)

  // Instructions (DO) vs Expressions (VALUE)

  // IF expression
  val aCondition = true
  val aConditionedValue = if(aCondition) 5 else 3 // IF EXPRESSION
  println(aConditionedValue)
  println(if(aCondition) 5 else 3)
  println(1 + 3)

  var i = 0
  val aWhile: Unit = while (i < 10) {
    println(i)
    i += 1
  }

  // NEVER WRITE THIS AGAIN.

  // EVERYTHING in Scala is an Expression!

  val aWeirdValue: Unit = aVariable = 3 // Unit === void
  println(aWeirdValue)

  // side effects: println(true), whiles, reassigning

  // Code blocks

  val aCodeBlock = {
    val y = 2
    val z = y + 1 // you can't access z outside this code block

    if (z > 2) "hello" else "goodbye" // last line will be returned from the code block
  }

  //Questions =>
  // 1. difference between "hello world" vs println("hello world")?
  // Ans:
  // "hello world" is a String type.
  // println("hello world") is an expression, which is side effect, they are expression returning type Unit

  // 2. What is the output of below code block
  // Ans: true
  val someValue = {
    2 < 3
  }
  println(someValue)

  // 3. What is the output of below code block
  // Ans: 42
  val someOtherValue = {
    if(someValue) 239 else 986
    42
  }
  println(someOtherValue)

}