// 1- Faça um programa que receba três inteiros e diga qual deles é o maior.

fun main() {
    println("Este programa recebe três números e te mostra qual é o maior deles. Vamos começar.")
    println("Digite o primeiro número: ")
    var numero1 = readln().toInt()
    println("Digite o primeiro número: ")
    var numero2 = readln().toInt()
    println("Digite o primeiro número: ")
    var numero3 = readln().toInt()

    if(numero1 > numero2){
        println("O maior numero é: $numero1")
    } else if (numero2 > numero3){
        println("O maior numero é: $numero2")
    }else{
        println("O maior numero é: $numero3")
    }
}