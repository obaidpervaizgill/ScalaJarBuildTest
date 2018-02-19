package bobsdelights

/**
  * Created by z3470247 on 19/02/2018.
  */
import org.scalatest.FunSuite

class FruitSuite extends FunSuite {
  object Cherry extends Fruit("Cherry", "Red")
  assert("Cherry" == Cherry.name)
  assert("Red" == Cherry.color)
}
