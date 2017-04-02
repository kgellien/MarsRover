package de.gellien.marsrover

case class Point(x: Int, y: Int)

class Grid(val maxX: Int, val maxY: Int) {
  def north(p: Point): Point = p.copy(y = (p.y + 1) % maxY)
  def south(p: Point): Point = {
    var newY = p.y - 1
    while (newY < 0) newY = newY + maxY
    p.copy(y = newY % maxY) // % maxY bleibt, damit es auch für übergroßes y funktioniert
  }
  def east(p: Point): Point = ???
  def west(p: Point): Point = ???
}
