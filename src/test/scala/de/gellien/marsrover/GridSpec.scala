package de.gellien.marsrover
import org.specs2.mutable._

class GridSpec extends Specification {
  "For movements in the four directions inside of the grid" >> {
    "movement to the north should increment the y-coordinate only" >> {
      val grid = new Grid(100, 100)
      val start = Point(10, 10)
      val expectedPosition = Point(10, 11)
      grid.north(start) must_== expectedPosition
    }
  }
}
