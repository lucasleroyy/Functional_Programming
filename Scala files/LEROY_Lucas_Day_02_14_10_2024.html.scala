// Databricks notebook source
// MAGIC %md
// MAGIC ##Programming paradigms
// MAGIC ####Paradigm
// MAGIC - A way of struturing programs. An approach to solve computational problems
// MAGIC ####Main programming paradigms
// MAGIC - `Imperative` 
// MAGIC - `Fonctionnal`
// MAGIC - `Logic`
// MAGIC - `Object Oriented`
// MAGIC ####Functional Programming (FP)
// MAGIC - Function: In FP paradigm, function is a main building block.
// MAGIC - Immutable : FP avoids mutable variables, loops and other imperative control structure.
// MAGIC - Less code: FP enables to solve a problem with fewer lines of code compared to imperative languages.
// MAGIC - Parallelism: FP makes it easier to write concurrent or multithreaded applications.
// MAGIC

// COMMAND ----------

// MAGIC %md
// MAGIC ##Composable
// MAGIC - concept of a combining simple functions to create a complex one  
// MAGIC - for example, two composable fucntions can be combiened to create a third fucntion
// MAGIC `f(x) = x * 2`  
// MAGIC `g(x) = x + 2`  
// MAGIC
// MAGIC a new function can be composed using f and g  
// MAGIC `h(x) = f(g(x))`  
// MAGIC =  ` f(x + 2)`  
// MAGIC  =  ` (x+ 2) * 2`  

// COMMAND ----------

// MAGIC %md
// MAGIC

// COMMAND ----------

def f(x: Int): Int = x + 2
def g(x: Int): Int = x + 2
def h(x: Int): Int = f(g(x))

// COMMAND ----------

// Test the composed function h with an input
val input = 2
println(s"g(Sinput) = ${g(input)}")
println(s"f(g(Sinput)) = ${f(g(input))}")
println(s"h($input) = ${h(input)}")

// COMMAND ----------

// MAGIC %md
// MAGIC ##Scala Programming language

// COMMAND ----------

// MAGIC %md
// MAGIC `Hybrid` support `both` OIP and FP.

// COMMAND ----------

val name: String = "Scala"
val age: Int = 25

// COMMAND ----------

val name: String = "Scala"

val age: Int = "25"


// COMMAND ----------

// MAGIC %md
// MAGIC don't work in scala 

// COMMAND ----------

// MAGIC %md
// MAGIC ##Operator
// MAGIC
// MAGIC - Arithmetic
// MAGIC - Relational
// MAGIC - Logical 

// COMMAND ----------

val x = 10
val y = 20
val z = x + y

// COMMAND ----------

// MAGIC %md
// MAGIC `+` is not a built-in operator in Scala. It is a method defined in class Int

// COMMAND ----------

val z = x.+ (y)
val z1 = x.*(y)

// COMMAND ----------

// MAGIC %md
// MAGIC ##Traits
// MAGIC Trait in scala is a way to define ` an interface ` that a set of related classes can `share `.

// COMMAND ----------

trait Shape {
  def area(): Int
}

class Square(length: Int) extends Shape {
  def area = length * length
}

class Rectangle(length: Int, width: Int) extends Shape {
  def area = length * width
}

val square = new Square(10)
val area = square.area

val rectangle = new Rectangle(5, 4)
val area2 = rectangle.area

// COMMAND ----------

// MAGIC %md
// MAGIC ##Tuples
// MAGIC - A tuples is a `container` for storing elements of differents types
// MAGIC - It is immutable; it cannot be modified after it has been created. 

// COMMAND ----------

val twoElementContainer = (10, true )
val threeElementContainer = ("15", "Harry", true)

// COMMAND ----------

// MAGIC %md
// MAGIC - a tuple is usefull in a situation where we want to group `non-related element`
// MAGIC - if the element are the same type we can use collection such as an `array` or a `list`
// MAGIC - a tuple may be more appropriate to use when we have a function that return 'more than one value'
// MAGIC - an element in a tuple has a `one-based inex`
// MAGIC - the followinf code ....: 
// MAGIC

// COMMAND ----------

val first = threeElementContainer._1
val second = threeElementContainer._2
val third = threeElementContainer._3

// COMMAND ----------

// MAGIC %md
// MAGIC ##Collection
// MAGIC A collection is a `container` data structure, it contains `zero or more` elements.  
// MAGIC Those following collection are `zero-based inex`
// MAGIC - `Sequence`  
// MAGIC   - Array  
// MAGIC   - List  
// MAGIC   - Vector  
// MAGIC - `Sets`
// MAGIC - `Maps`

// COMMAND ----------

// MAGIC %md
// MAGIC ##Array

// COMMAND ----------

val arr = Array(10, 20, 30, 40)
arr(0) = 50
val first = arr(0)

// COMMAND ----------

// MAGIC %md
// MAGIC ##Lists
// MAGIC - is a linear sequence of elements of the `same type`
// MAGIC - it is an `immutable` date struture; it `cannot be modified `after it has been created

// COMMAND ----------

val list = List(10, 20, 30, 40)
val list2 = (1 to 100).toList

// COMMAND ----------

val list3 = arr.toList

// COMMAND ----------

list3.isEmpty

// COMMAND ----------

// MAGIC %md
// MAGIC ###Vector
// MAGIC - The vector is an `hybrid` class of list and array.
// MAGIC - It `combines the performance` of both array and list

// COMMAND ----------

val v1 = Vector(0, 10, 20, 30, 40)
val v2 = v1 :+ 50
val v3 = v2 :+ 60
val v4 = v3(4)
val v5 = v3(5)

// COMMAND ----------

// MAGIC %md
// MAGIC ## Sets
// MAGIC - Sets is an `unordered collection` of `distinct` elements
// MAGIC - It does `no contains ducplicates`
// MAGIC - We can not access element by their index
// MAGIC - Sets support `contains`and `isEmpty`

// COMMAND ----------

val fruits = Set("pomme", "orange", "ananas", "kiwi")
fruits.contains("banana")
fruits.isEmpty

// COMMAND ----------

// MAGIC %md
// MAGIC ## Map
// MAGIC - Map is a collection of key-value pairs
// MAGIC - In other languages, it knows as `dictionnary`, `associative array` or `hash map`
// MAGIC - It is an efficient data structure for `looking up a value by it's key`

// COMMAND ----------

val capitals = Map("France"->"Paris", "Spain"->"Madrid", "UK"->"London")
val FranceCapital = capitals("France")

// COMMAND ----------

// MAGIC %md
// MAGIC ##Higher-Order Methods on Collection Classes
// MAGIC - The real power of Scala collections comes form their higher-order methods
// MAGIC - A higher-order method takes a function as its input parameter
// MAGIC - It is important to note that higher-order method `does not mutate` a collection
// MAGIC - These includes:
// MAGIC   - 1° map
// MAGIC   - 2° flatmap
// MAGIC   - 3° filter
// MAGIC   - 4° foreach
// MAGIC   - 5° reduce
// MAGIC
// MAGIC #### Map
// MAGIC

// COMMAND ----------

val myList = List(1.0, 2.0, 3.0, 4.0)
val myAnotherList = myList.map(_ * 5)

// COMMAND ----------

// MAGIC %md
// MAGIC #### FlatMap
// MAGIC - flatmap is a methopd that is similar to map, but with a key difference: the function you provide to flat map `must return a collection for each element`int the original collection.  
// MAGIC - when flatmap is applied, it reutrns a `flattened` collection, `meaning it combines all the collections into one`.  
// MAGIC - In contrast,if you use `map` it would return `a collection of collection`, without flattening them.

// COMMAND ----------

val line = "Scala is Fun"

// COMMAND ----------

val Singlespace = " "

// COMMAND ----------

val arrayListChars = line.split(Singlespace)

// COMMAND ----------

// MAGIC %md
// MAGIC #### Filter
// MAGIC

// COMMAND ----------

val MyNewList = (1 to 100).toList
val pair = numbers.filter(_%2 == 0)

// COMMAND ----------

// MAGIC %md
// MAGIC #### foreach
// MAGIC this method that is used to applied a function on every element 

// COMMAND ----------

val words = "Scala is fun".split(" ")
val sentence = List("Scala", "is", "fun")
sentence.foreach(println)

// COMMAND ----------

// MAGIC %md
// MAGIC #### Reduce

// COMMAND ----------

// MAGIC %md
// MAGIC the reduce methode return a single value

// COMMAND ----------

val reduceList = List(2, 4, 6, 8, 10)

// COMMAND ----------

val sum = reduceList.reduce{(x, y) => x + y}

// COMMAND ----------

val mult = reduceList.reduce{(x, y) => x * y}
