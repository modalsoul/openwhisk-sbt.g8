package $package$.$name;format="lower,word"$

import com.google.gson.JsonObject

object $name;format="Camel"$ {
  def main(args:JsonObject):JsonObject = {
    val obj = new JsonObject()
    obj.addProperty("greeting", s"Hello $name$!")
    obj
  }
}
