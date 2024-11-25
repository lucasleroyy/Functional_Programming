package fr.umontpellier

import org.apache.spark.sql.SparkSession

object simpleApp {
  def main(args: Array[String]): Unit = {
    val programStartTime = System.nanoTime() // Début du suivi du temps d'exécution
    val logFile = "./data/README.md" // Devrait être un fichier sur ton système
    val spark = SparkSession.builder.appName("Simple Application").master("local[*]").getOrCreate()
    spark.sparkContext.setLogLevel("ERROR")

    // Lecture et mise en cache des données
    val logData = spark.read.textFile(logFile).cache()

    // Comptage des lignes contenant "a"
    val numAs = logData.filter(line => line.contains("a")).count()
    // Comptage des lignes contenant "b"
    val numBs = logData.filter(line => line.contains("b")).count()
    // Comptage des lignes contenant "Spark"
    val numSpark = logData.filter(line => line.contains("Spark")).count()

    // Affichage des résultats
    println(s"Lines with a: $numAs, Lines with b: $numBs, Lines with Spark: $numSpark")

    // Calcul du temps d'exécution
    val programElapsedTime = (System.nanoTime() - programStartTime) / 1e9 // Conversion en secondes
    println(s"\nProgram execution time: $programElapsedTime seconds")

    // Message de fin de programme
    println("\n• Program Completed Successfully...!\n")

    // Fermeture de Spark
    spark.stop()
  }
}
