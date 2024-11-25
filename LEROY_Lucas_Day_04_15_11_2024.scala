// Databricks notebook source
// MAGIC %md
// MAGIC #1. Functional Programming (FP)
// MAGIC
// MAGIC Functional Programming (FP) is a programming paradigm where computation is treated as:
// MAGIC
// MAGIC * the evaluation of mathematical functions
// MAGIC * avoiding changing state and
// MAGIC * mutable data
// MAGIC
// MAGIC It emphasizes the use of functions, immutability, and expressions over statements.
// MAGIC
// MAGIC #Key Concepts
// MAGIC
// MAGIC - Declarative Style:
// MAGIC
// MAGIC * Focuses on what to solve rather than how to solve it.
// MAGIC
// MAGIC - Expressions Over Statements:
// MAGIC
// MAGIC * Builds programs using expressions that evaluate to values.
// MAGIC
// MAGIC - Function Composition:
// MAGIC
// MAGIC * Combining simple functions to build more complex ones.
// MAGIC
// MAGIC - Referential Transparency:
// MAGIC
// MAGIC - An expression can be replaced with its value without changing the program's behavior.

// COMMAND ----------

// MAGIC %md
// MAGIC ## Scala and Functional Programming
// MAGIC
// MAGIC Scala is a hybrid language that supports both object-oriented and functional programming paradigms, making it an excellent choice for learning FP concepts. It provides powerful features like higher-order functions, immutability, and pattern matching.
// MAGIC
// MAGIC ## 2. Pure Functions
// MAGIC
// MAGIC A pure function is a function where:
// MAGIC
// MAGIC * The output value is determined only by its input values.
// MAGIC * It has no side effects (does not alter any state outside the function).
// MAGIC Characteristics
// MAGIC
// MAGIC # Deterministic:
// MAGIC
// MAGIC * Same input always yields the same output.
// MAGIC
// MAGIC # No Side Effects:
// MAGIC
// MAGIC * Doesn’t modify any external state (e.g., no I/O operations, no changing global variables).
// MAGIC
// MAGIC
// MAGIC Example of a Pure Function: 

// COMMAND ----------

// Pure function
def multiply(a: Int, b: Int): Int = a * b

// COMMAND ----------

//Calling the pure function 'multiply'
val result_after_first_call = multiply(3, 4)

// COMMAND ----------

val result_after_second_call = multiply(3, 4)

// COMMAND ----------

//Non-pure function due to side effect (modifying 'total')
var total = 0

def addToTotal(a: Int): Int = {
  total += a
  total
}

// COMMAND ----------

// MAGIC %md
// MAGIC ## Immutability in Scala
// MAGIC
// MAGIC Immutability means that once a data structure is created, it cannot be changed. Any modification results in a new data structure.
// MAGIC
// MAGIC # In Scala
// MAGIC
// MAGIC * val: Immutable reference (cannot be reassigned).
// MAGIC * var: Mutable reference (can be reassigned).
// MAGIC Example:

// COMMAND ----------

//example 
val list = List(1, 2, 3)

// COMMAND ----------

// MAGIC %md
// MAGIC ## Collections
// MAGIC
// MAGIC A collection is a container data structure. It contains zero or more elements.
// MAGIC
// MAGIC Scala collections can be broadly grouped into three categories:
// MAGIC
// MAGIC - Sequences
// MAGIC * Array
// MAGIC * List
// MAGIC * Vector
// MAGIC - Sets
// MAGIC - Maps

// COMMAND ----------

//Attempting to modify 'list' directly will result in a compilation error
list = List(0, 1, 2, 3)

// COMMAND ----------

// MAGIC %md
// MAGIC cons operator or prepend operator ::
// MAGIC
// MAGIC It is used to add an element to the front of a list, creating a new list without modifying the original one.
// MAGIC _::_ takes an element on the left and a list on the right, and it prepends the element to the front of the list.
// MAGIC Prepending _0 ::_ list creates a new list.
// MAGIC

// COMMAND ----------

// MAGIC %md
// MAGIC ## Benefits of Immutability
// MAGIC
// MAGIC * Thread Safety:
// MAGIC Immutable objects are inherently thread-safe.
// MAGIC * Predictability:
// MAGIC Reduces unexpected side effects.
// MAGIC * Easier Debugging:
// MAGIC State changes are explicit.

// COMMAND ----------

// MAGIC %md
// MAGIC # 4. First-Class and Higher-Order Functions
// MAGIC
// MAGIC ### First-Class Functions
// MAGIC
// MAGIC Functions are treated as first-class citizens, meaning they can be:
// MAGIC Assigned to variables.
// MAGIC Passed as arguments to other functions.
// MAGIC Returned from functions.
// MAGIC
// MAGIC ### Higher-Order Functions
// MAGIC
// MAGIC A higher-order function is a function that takes other functions as parameters or returns a function as a result.
// MAGIC Example: Assigning Functions to Variables

// COMMAND ----------

val greet = (name: String) => s"Hello, $name!"

// COMMAND ----------

println(greet("Faaiz"))

// COMMAND ----------

//Example: Passing Functions as Arguments
def applyTwice(f: Int => Int, x: Int): Int = f(f(x))

// COMMAND ----------

val increment = (x: Int) => x + 1

// COMMAND ----------

println(applyTwice(increment, 5))
