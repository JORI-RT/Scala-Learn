import org.scalatest.{DiagrammedAssertions, FlatSpec}

class CalcSpec extends FlatSpec with DiagrammedAssertions{
  val calc = new Calc;

  "sum関数" should "整数の配列を取得し、それらを足し合わせた整数を返すことができる" in {
    assert(calc.sum(Seq(1, 2, 3)) === 4)
    assert(calc.sum(Seq(0)) === 0)
    assert(calc.sum(Seq(-1, 1)) === 0)
    assert(calc.sum(Seq()) === 0)
  }

//  "it" should "" in {
//    val p:Point = new Point(1,1);
//    assert(p.x === 12)
//  }

}
