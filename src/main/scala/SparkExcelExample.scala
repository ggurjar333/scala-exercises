import org.apache.spark.sql.SparkSession
import com.crealytics.spark.excel._

object SparkExcelExample {
  def main(args: Array[String]): Unit = {
    val spark = SparkSession.builder()
      .appName("Spark Excel Example")
      .master("local[*]")
      .getOrCreate()

    val excelFile = "path/to/your/excel/file.xlsx"

    val df = spark.read
      .format("com.crealytics.spark.excel")
      .option("useHeader", "true")
      .option("inferSchema", "true")
      .load(excelFile)

    df.show()
    spark.stop()
  }
}
