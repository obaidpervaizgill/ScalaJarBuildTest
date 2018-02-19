package printmenu

/**
  * Created by z3470247 on 19/02/2018.
  */
import bobsdelights.Fruits
import bobsdelights.showFruit
object PrintMenu {
  def main(args: Array[String]) {
    for (fruit <- Fruits.menu) {
      showFruit(fruit)
    }
  }

}
