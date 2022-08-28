import org.apache.spark.sql.SparkSession
import org.apache.spark.SparkContext
import org.apache.spark.ml.stat.Summarizer

object Main extends App {
//   val spark = SparkSession.builder.appName("Simple Application").getOrCreate()
  println("Zozo")
  val spark = SparkSession.builder
    .appName("Simple Application")
    .master("local")
    .getOrCreate()

  val path = "data/weatherAUS.csv"
  val df = spark.read.option("header", "true").csv(path)
  val summary =  df.summary().show()
}
