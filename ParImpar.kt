
import kotlin.math.*

// 4- Faça um programa em que permita a entrada de um número qualquer e exiba se este
//número é par ou ímpar. Se for par exiba também a raiz quadrada do mesmo; se for
//ímpar exiba o número elevado ao quadrado.


fun main(){
    var raiz = 0
    var quadrado = 0

    println("Digite um número: ")
    var num = readln().toDouble()


    if(num%2.0==0.0){
        raiz = sqrt(num).toInt()
        println("O numero $num é par e sua raiz quadrada é $raiz")
    }else{
        quadrado = num.pow(2).toInt()
        println("O numero $num é impar e seu quadrado é $quadrado.")
    }
}