package de.gellien.marsrover

sealed trait Command
case object f extends Command
case object b extends Command
case object l extends Command
case object r extends Command

class Rover(val startPosition: Point, val startDirection: Direction) {
  private var pos = startPosition
  private var dir = startDirection
  def position = pos
  def direction = dir
  def turnLeft = dir = direction match {
    case N => W
    case E => N
    case S => E
    case W => S
  }
  def turnRight = dir = direction match {
    case N => E
    case E => S
    case S => W
    case W => N
  }
  def forward = pos = direction match {
    case N => Mars.north(position)
    case E => Mars.east(position)
    case S => Mars.south(position)
    case W => Mars.west(position)
  }
  def back = pos = direction match {
    case N => Mars.south(position)
    case E => Mars.west(position)
    case S => Mars.north(position)
    case W => Mars.east(position)
  }
  def commands(cmds: List[Command]) = for (cmd <- cmds) cmd match {
    case `f` => forward
    case `b` => back
    case `l` => turnLeft
    case `r` => turnRight
  }
}
