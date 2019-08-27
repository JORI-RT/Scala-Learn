/**
  * こんな感じで、フィールドをコンストラクタのみに定義可能
  * まあ確かに、これでいい気もする
  * @param x
  * @param y
  */
class Point(val x: Int, val y: Int) {
  def add(x: Int, y: Int):Int = x+y;


  def +(p: Point): Point ={
    new Point(x + p.x, y + p.y)
  }
}
