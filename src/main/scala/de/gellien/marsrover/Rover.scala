package de.gellien.marsrover

class Rover(var position: Point, var direction: Direction) {
  def turnLeft = direction = direction match {
    case N => W
    case E => N
    case S => E
    case W => S
  }
  def turnRight = direction = direction match {
    case N => E
    case E => S
    case S => W
    case W => N
  }
  def forward = position = direction match {
    case N => Mars.north(position)
    case E => Mars.east(position)
    case S => Mars.south(position)
    case W => Mars.west(position)
  }
  def back = position = direction match {
    case N => Mars.south(position)
    case E => Mars.west(position)
    case S => Mars.north(position)
    case W => Mars.east(position)
  }
}
