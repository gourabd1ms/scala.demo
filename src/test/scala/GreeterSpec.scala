import org.scalatest.flatspec.AnyFlatSpec
import org.scalatest.matchers.should.Matchers

class GreeterSpec extends AnyFlatSpec with Matchers {
  "Greeter" should "return the correct greeting" in {
    Greeter.greet() shouldBe "Hello from Scala demo!"
  }
}
