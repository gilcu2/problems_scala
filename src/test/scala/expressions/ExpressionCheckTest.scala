package expressions

import org.scalatest._
import flatspec._
import org.scalatest.matchers.should.Matchers._

class ExpressionCheckTest extends AnyFlatSpec with GivenWhenThen {

  "An string with a pair" should "be a valid expresion" in {
    Given("The string")
    val s = "()"

    When("Validated")
    val valid = ExpressionCheck.check_pairs(s)

    Then("it must be valid")
    valid shouldBe true
  }

  "An string with not a pair" should "be a valid expresion" in {
    Given("The string")
    val s = "(("

    When("Validated")
    val valid = ExpressionCheck.check_pairs(s)

    Then("it must be valid")
    valid shouldBe false
  }

}
