# 02 Scalaプログラミングの大一歩
## 2.1 [ステップ1]Scalaインタープリターの使い方を学ぶ

-   コマンドプロンプトでscalaと入力することでインタープリターモードに
    +   日本語を使いたい場合は、
    ```
    scala -Xnojiline
    ```
    とコマンド
-   Int型はscalaパッケージのIntクラスに名前を与える
    +    グローバルな名前空間を分割し、情報隠蔽のメカニズムを提供
        *   クラスに完全名を提供するもの　Intはscalaパッケージのメンバーなので
            *   Intはクラスの単純名
            *   Scala.Intは完全名である

## 2.2 [ステップ2]変数を定義する
-   val 初期化後に別の値を代入することはできない(Javaのfinal変数と似ている)
-   var 変数が有効であれば何度でも代入し直すことができる(Javaの非final変数と似ている)
```
scala> val msg = "Hello, world"
msg: String = Hello, world
```
valに代入し直すことができない
```
scala> msg = "Goodbye cruel world"
<console>:12: error: reassignment to val
       msg = "Goodbye cruel world
```


## 2.3  [ステップ3]関数を定義する
Scalaの関数の書き方
```
scala> def max(x: Int, y:Int): Int(結果型) = {
     | if (x > y) x
     | else y
     | }
max: (x: Int, y: Int)Int
```
-   コンパイラーが関数の結果型の指定を要求する場合がある
    +   例えば、再帰的な関数は関数の結果型を指定しなければならない
    +   関数が1文の場合は{}を省略できる
```
scala> def max(x:Int, y: Int) = if(x > y) x else y
max: (x: Int, y: Int)Int
```
結果型Unitは、関数が意味のある値を返してこないことを示す。
-   結果型Unitのメソッドは副作用のためにのみ実行される
```
scala> def greet() = println("Hello World")
greet: ()Unit
```
インタープリター終了の際は、
```
scala> :quit
```
または
```
:q
```
と入力する

## 2.4[ステップ4]簡単なScalaスクリプトを書く
helloarg.scala　
argsという名前のScala配列を介してアクセスできる
-   先頭は0
-   要素内には()内に添字を指定してアクセスする
    +   例えば、stepsという配列の先頭要素はsteps(0)
```
$ scala helloarg.scala  planet
Hello, planet!
```

## 2.5[ステップ5]whileによるループ、ifによる分岐
```
var i = 0 (型推論によりscala.Intが与えられる)
while(i < args.length\*ここの論理式が偽になるまで実行*\) {
    println(args(i))
    i += 1
}
```
-   Scalaでは++iやi++は使えない

echoargs.scala
-   print printlnと違い、全ての引数が同じ行に出力される

-   Scalaは;で文を区切る
    +   が、省略できる

## 2.6[ステップ6]foreachとforによる反復実行
- 命令型のスタイル
    +   ループで反復処理を実行し、異なる関数の間で共有する状態を変更する
- 関数型のスタイル

pa.scala
```
args.foreach(arg => println(arg))
```

関数リテラルが一個の引数をとる1文から構成される場合は、引数を明示的に指定しなくて済む
```
args.foreach(println)
```

-   for式
    +   7.3節にて詳細が書いてある

```
for(arg(これはval) <- args)
println(arg)
```