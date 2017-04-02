package de.gellien.marsrover
import org.specs2.mutable._

class RoverSpec extends SpecificationWithJUnit {
  "A Rover must be able to turn:" >> {
    val start = Point(10, 10)
    "turnLeft moves from N to W" >> {
      val rover = new Rover(start, N)
      val expectedDirection = W
      rover.l
      rover.direction must_== expectedDirection
    }
    "turnRight moves from N to E" >> {
      val rover = new Rover(start, N)
      val expectedDirection = E
      rover.r
      rover.direction must_== expectedDirection
    }
  }
  "A Rover must be able to move one step at a time:" >> {
    val start = Point(10, 10)
    "forward moves one step into rover.direction" >> {
      val rover = new Rover(start, N)
      val expectedPosition = Point(10, 11)
      rover.f
      rover.position must_== expectedPosition
    }
  }
}
