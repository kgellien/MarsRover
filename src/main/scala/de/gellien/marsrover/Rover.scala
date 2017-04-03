package de.gellien.marsrover

sealed trait Command
case object f extends Command
case object b extends Command
case object l extends Command
case object r extends Command

class Rover(val startPosition: Point, val startDirection: Direction, grid: Grid = Mars) {
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
    case N => grid.north(position)
    case E => grid.east(position)
    case S => grid.south(position)
    case W => grid.west(position)
  }
  def back = pos = direction match {
    case N => grid.south(position)
    case E => grid.west(position)
    case S => grid.north(position)
    case W => grid.east(position)
  }
  def commands(cmds: List[Command]) = for (cmd <- cmds) cmd match {
    case `f` => forward
    case `b` => back
    case `l` => turnLeft
    case `r` => turnRight
  }
}
