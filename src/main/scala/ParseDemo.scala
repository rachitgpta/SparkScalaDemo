import org.apache.spark.sql.SparkSession

object ParseDemo extends  App {
  print("test11")
    val spark = SparkSession.builder().master("local").getOrCreate()

  try{
    spark.sql("select 1 as f,2 as c,33 as d").show
  }




  finally {
    spark.close()
  }

}
