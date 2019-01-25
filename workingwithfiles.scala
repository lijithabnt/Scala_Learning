//Read a file and provide the count of columns in each line based on delimiter(provided csv as sample file)

import scala.io.Source

val samplefile = Source.fromFile("/Users/c_labbavaram/Documents/learning/scala/FL_insurance_sample.csv")
  .getLines.drop(1).map(x => x.count(x => x == ',')+1).foreach(println)

//or

val samplefile1 = Source.fromFile("/Users/c_labbavaram/Documents/learning/scala/FL_insurance_sample.csv")
  .getLines.drop(1).map(x => x.split(",")).map(y => y.length).toList
