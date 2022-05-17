// 3- Faça um programa que receba a idade de uma pessoa e mostre na saída em qual
//categoria ela se encontra:
//10-14 infantil
//15-17 juvenil
//18-25 adulto

fun main (){
    println("Por favor, digite sua idade: ")
    var idade = readln().toInt()

    when(idade){
        in 10..14 -> println("infantil")
        in 15..17 -> println("infantil")
        in 18..25 -> println("infantil")

        else -> println("Too old for that!")
    }
}