package com.example.kotlinpractice

fun main(){

//    ********* difference between var and val*********
    val name = "frank"
    // name = "harry"  we cannot overwrite the val while we overwrite the var
    var myName = "frank"
    myName = "harry";
    print("hello " + myName +"\n");

//    ******** DataTypes **********
    var hisName: String = "harry" // type string
    println(hisName[2]);
    println(hisName[hisName.lastIndex]);
    println(hisName[hisName.length-1]);
    var age: Int = 56 // type int
//    integers--> byte(8 bit),Short(16 bit), int(32 bit), long(64 bit)
    var char: Char = 'A' // type character(only contains one sign)
    var bool: Boolean = true // type boolean
//    float and double
    var myFloat: Float = 56.45f
    var myDouble: Double = 345.56


}
