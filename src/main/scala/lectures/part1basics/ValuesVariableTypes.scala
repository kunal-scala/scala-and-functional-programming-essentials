package lectures.part1basics

object ValuesVariableTypes extends App {
  val aInt: Int = 10 // 4 byte number
  // x = 20 => val's are immutable, you can't reassign the values
  // they are just like const or final in java.
  println(aInt)
  val bInt = 20
  //types of val's are optional, in this case compiler will infer the type automatically.
  val aString: String = "hello"
  val bString: String = "hello"; val cString: String = "world"
  //you can give a semicolon, but its optional.
  //in case you want to write two expression on the same line, they should be separated by semicolon.
  val aBoolean: Boolean = true
  val aChar: Char = 'a'
  val aShort: Short = 1419 // 2 bytes number
  val along: Long = 1234567890L // 8 byte number
  val aFloat: Float = 2.0f
  val aDouble: Double = 2.0

  //variables
  var cInt: Int = 10
  cInt = 20;// variables unlike val's can be reassigned.
  // variables are also known as side effects.
}