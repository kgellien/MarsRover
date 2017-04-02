package de.gellien.marsrover
import org.specs2.mutable._

class RoverSpec extends SpecificationWithJUnit {
  val start = Point(10, 10)
  "A Rover must be able to turn:" >> {
    "turnLeft moves from N to W" >> {
      val rover = new Rover(start, N)
      val expectedDirection = W
      rover.turnLeft
      rover.direction must_== expectedDirection
    }
    "turnRight moves from N to E" >> {
      val rover = new Rover(start, N)
      val expectedDirection = E
      rover.turnRight
      rover.direction must_== expectedDirection
    }
  }
  "A Rover must be able to move one step at a time:" >> {
    "forward moves one step into rover.direction" >> {
      val rover = new Rover(start, N)
      val expectedPosition = Point(10, 11)
      rover.forward
      rover.position must_== expectedPosition
    }
    "back moves one step opposite to rover.direction" >> {
      val rover = new Rover(start, S)
      val expectedPosition = Point(10, 11)
      rover.back
      rover.position must_== expectedPosition
    }
  }
}
