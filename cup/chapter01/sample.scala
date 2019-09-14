// 1.1
var capital = Map("US" -> "Washington", "France"->"Paris") //首都を導くMapをセットアップ
capital += ("Japan"->"Tokyo")// Japanを追加
println(capital("France")) 
 
// 連想マップにより、簡潔に書ける。しかし、プログラムで使うマップの属性を細かく指定する必要がある場合も
// Scalaではマップは言語構文ではなく、拡張、修正できるライブラリーになっている。
// 必要な時には細かい操作を加えられる。

// Scalaは書きやすさと柔軟性を両立させる。
// 手軽に書ける単純性＆必要な時には拡張できる柔軟性

// 1.1.1
// 新しい型を作れる言語

// Eric Raymond「伽藍(がらん)とバザール」
// 伽藍：建設に時間のかかる完璧な建物
// バザール；日々修正、拡張される→オープンソースソフトウェアの比喩

//  Scala not 
// def factorial(x: BigInt): BigInt = if (x == 0) 1 else x * factorial(x -1)

// println(factorial(10))
// println(factorial(30))

import java.math.BigInteger

def factorial(x: BigInteger): BigInteger =
if(x == BigInteger.ZERO)
    BigInteger.ONE
else
    x.multiply(factorial(x.subtract(BigInteger.ONE)))
// BigInteger bigint = new BigInteger("30")
// println(factorial(bigint))
// println(factorial(30))
