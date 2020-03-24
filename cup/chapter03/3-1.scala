// val greetString = new Array[String](3)
// greetString(0) = "Hello"
// greetString(1) = ","
// greetString(2) = "world!\n"
// for(i <- 0 to 2)
//   print(greetString(i))

// 上と下のコードは同じ
val greetStrings = new Array[String](3)
  greetStrings.update (0,"Hello")
  greetStrings.update (1,", ")
  greetStrings.update (2,"world!\n")
  for(i <- 0 to 2)
    print(greetStrings.apply(i))