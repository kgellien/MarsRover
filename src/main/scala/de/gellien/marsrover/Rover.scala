package de.gellien.marsrover

class Rover(var position: Point, var direction: Direction) {
  def l = direction = direction match {
    case N => W
    case E => N
    case S => E
    case W => S
  }
  def r = direction = direction match {
    case N => E
    case E => S
    case S => W
    case W => N
  }
}
