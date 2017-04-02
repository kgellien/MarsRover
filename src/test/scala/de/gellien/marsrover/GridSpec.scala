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
    "movement to the north wraps the y-coordinate when start has y == maxY-1" >> {
      val start = Point(10, maxY - 1)
      val expectedPosition = Point(10, 0)
      grid.north(start) must_== expectedPosition
    }
    "movement to the south should decrement the y-coordinate only" >> {
      val start = Point(10, 10)
      val expectedPosition = Point(10, 9)
      grid.south(start) must_== expectedPosition
    }
    "movement to the south wraps the y-coordinate when start has y == 0" >> {
      val start = Point(10, 0)
      val expectedPosition = Point(10, maxY - 1)
      grid.south(start) must_== expectedPosition
    }

    "movement to the east should increment the x-coordinate only" >> {
      val start = Point(10, 10)
      val expectedPosition = Point(11, 10)
      grid.east(start) must_== expectedPosition
    }
    "movement to the east wraps the x-coordinate when start has x == maxX-1" >> {
      val start = Point(maxX - 1, 10)
      val expectedPosition = Point(0, 10)
      grid.east(start) must_== expectedPosition
    }
    "movement to the west should decrement the x-coordinate only" >> {
      val start = Point(10, 10)
      val expectedPosition = Point(9, 10)
      grid.west(start) must_== expectedPosition
    }
    "movement to the west wraps the x-coordinate when start has x == 0" >> {
      val start = Point(0, 10)
      val expectedPosition = Point(maxX - 1, 10)
      grid.west(start) must_== expectedPosition
    }
  }
}
