package pathfreq

import scala.io.Source
import scala.util.Using

object PathFreq extends App {
  @throws(classOf[java.io.IOException])
  def getPage() =
    Using(Source.fromURL("https://httpbin.org/get/1")) { result =>
      result.mkString
    }

}
