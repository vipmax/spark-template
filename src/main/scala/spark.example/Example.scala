import org.apache.spark.{SparkConf, SparkContext}


object Example {
  def main(args: Array[String]): Unit = {
    /* only for windows, dir where winutil.exe located */
//    System.setProperty("hadoop.home.dir", ".")

    val sparkConf = new SparkConf().setMaster("local[*]").setAppName("Example")
    val sc = new SparkContext(sparkConf)

    sc
      .parallelize(List(1,2,3,4,5,6,7,8,9))
      .foreach(println)
  }
}