package de.gellien.marsrover
import org.specs2.mutable._

class GridSpec extends SpecificationWithJUnit {
  "For movements in the four directions inside of the grid" >> {
    val maxX = 100
    val maxY = 100
    val grid = new Grid(maxX, maxY)
    "movement to the north should increment the y-coordinate only" >> {
      val start = Point(10, 10)
      val expectedPosition = Point(10, 11)
      grid.north(start) must_== expectedPosition
    }
    "movement to the north wraps when start has y == maxY-1 the y-coordinate" >> {
      val start = Point(10, maxY - 1)
      val expectedPosition = Point(10, 0)
      grid.north(start) must_== expectedPosition
    }
  }
}
