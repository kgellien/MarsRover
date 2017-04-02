package de.gellien.marsrover

case class Point(x: Int, y: Int)

class Grid(val maxX: Int, val maxY: Int) {
  def north(p: Point): Point = p.copy(y = (p.y + 1) % maxY)
  def south(p: Point): Point = ???
  def east(p: Point): Point = ???
  def west(p: Point): Point = ???
}
