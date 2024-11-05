// Databricks notebook source
print("Hello World")

// COMMAND ----------

// MAGIC %md
// MAGIC #Variable
// MAGIC

// COMMAND ----------

var x=10

// COMMAND ----------

x=10

// COMMAND ----------

val y=20

// COMMAND ----------

y=20

// COMMAND ----------

def add(firstInput: Int, secondInput: Int): Int = {
  val sum = firstInput + secondInput
  return sum
}


// COMMAND ----------

val addNumbers= add(7,6)

// COMMAND ----------

def addSimple(fInput: Int, sInput: Int) = fInput + sInput

// COMMAND ----------

addSimple(7,6)

// COMMAND ----------

// MAGIC %md
// MAGIC #Higher-Order Function
// MAGIC

// COMMAND ----------

def encode(n:Int, f:(Int) => Long): Long = {
  val x = n*20
  f(x)
}

// COMMAND ----------

encode(5, (x:Int) => (x+100))


// COMMAND ----------

encode(5, _ + 100)

// COMMAND ----------

// MAGIC %md
// MAGIC #Classes

// COMMAND ----------

class Car(mk: String, ml: String, cr:String){
  val make = mk
  val model = ml
  var color = cr
  def repaint(newColor: String) = {
    color = newColor
  }
}

// COMMAND ----------

val mustang = new Car("Ford", "Mustang", "Red")
mustang.repaint("Jaune")

// COMMAND ----------

// MAGIC %md
// MAGIC #Case Class
// MAGIC

// COMMAND ----------

case class Message(from:String, to:String, content:String)

// COMMAND ----------

// MAGIC %md
// MAGIC #Pattern Matching = Switch

// COMMAND ----------

def colorNumber (color:String): Int = {
  val num = color match {
    case "Red" => 1
    case "Green" => 2
    case "Yellow" => 3
    case _ => 0
  }
  num
}

// COMMAND ----------

val colorName= "Red"
val colorCode = colorNumber(colorName)

println( s"$colorName : $colorCode" )
