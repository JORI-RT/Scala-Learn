class Calc {
  /** 整数の配列を取得し、それらを出し合わせた整数を返す
    *
    * Intの最大を上回った際にはオーバーフローする
    */
  def sum(seq: Seq[Int]): Int = seq.foldLeft(0)(_ + _)

}

