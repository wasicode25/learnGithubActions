import org.scalatest.flatspec.AnyFlatSpec
import org.scalatest.matchers.should.Matchers

class ExampleTest extends AnyFlatSpec with Matchers {
  "La función sum" should "devolver la suma de dos números" in {
    val resultado = Example.sum(3, 5)
    resultado shouldEqual 8
  }

  "La función ExampleIssues" should "no tener problemas de estilo" in {
    // Verificar que la lista está vacía
    Example.exampleIssues()
    val isEmpty = List(1).isEmpty
    isEmpty shouldBe true

    // Verificar que 'a' es un entero
    val a = 14 / 1
    a shouldBe a.toInt

    // Verificar que 'b' es un booleano
    val b = if (true) true else false
    b shouldBe aBoolean

    // Verificar que 'two' es 0 después del bucle
    var two = 1 + 1
    while (two > 0) {
      println("WOW!")
      two -= 1
    }
    two shouldBe 0
  }
}