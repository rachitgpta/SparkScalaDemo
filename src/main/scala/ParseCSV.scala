import org.apache.spark.sql.SparkSession

object ParseCSV extends App{

  val spark = SparkSession.builder().master("local").appName("ParseCSV").getOrCreate()
  spark.sql("select 'hello' as msg").show

}
