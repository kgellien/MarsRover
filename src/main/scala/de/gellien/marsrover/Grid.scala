package de.gellien.marsrover

sealed trait Direction
case object N extends Direction
case object S extends Direction
case object E extends Direction
case object W extends Direction

case class Point(x: Int, y: Int)

class Grid(val maxX: Int, val maxY: Int) {
  def north(p: Point): Point = p.copy(y = (p.y + 1) % maxY)
  def south(p: Point): Point = {
    var newY = p.y - 1
    while (newY < 0) newY = newY + maxY
    p.copy(y = newY % maxY) // % maxY bleibt, damit es auch für übergroßes y funktioniert
  }
  def east(p: Point): Point = p.copy(x = (p.x + 1) % maxX)
  def west(p: Point): Point = {
    var newX = p.x - 1
    while (newX < 0) newX = newX + maxX
    p.copy(x = newX % maxX) // % maxX bleibt, damit es auch für übergroßes y funktioniert
  }
}
