import org.scalatest.{DiagrammedAssertions, FlatSpec}

class PointSpec extends FlatSpec with DiagrammedAssertions {
  val p = new Point(1, 1);

  "プライマリコンストラクタのテスト" should "生成関数のテスト" in {
    assert(p.x === 1)
  }
  "add" should "addテスト" in {
    assert(p.add(1,1) === 2)
    assert(p.add(3,1) === 4)
    assert(p.add(1,3) === 4)
    assert(p.add(1,3) === 4)
    assert(p.add(1,1) === 2)
  }
}
