package Exercise1

fun main(){
//     Write a loop that prints numbers from 1 to 100, increasing by 2 (so 1, 3, 5...).
//     Use two different printing functions for values below 50 and values above 50.
     for (i in 1..100 step 2){
         if (i<50){
             printNumbersBelow50(i)
         } else {
             printNumbersAbove50(i)
         }
     }

 }

 fun printNumbersBelow50(number: Int){
     println("Number below 50 :$number")
 }

 fun printNumbersAbove50(number: Int){
     println("Number above 50 : $number")
 }