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
  "A Rover must be able to accept a list of commands" >> {
    "an empty command list does nothing" >> {
      val rover = new Rover(start, N)
      val expectedPosition = start
      val expectedDirection = N
      rover.commands(List())
      rover.position must_== expectedPosition
      rover.direction must_== expectedDirection
    }
    "a simple command list gives the expected result" >> {
      val rover = new Rover(start, N)
      val expectedPosition = start
      val expectedDirection = S
      rover.commands(List(f, f, l, b, r, b, b, r, r, r, f, l))
      rover.position must_== expectedPosition
      rover.direction must_== expectedDirection
    }
  }
}
