//5- Crie um programa que leia um número do teclado até que encontre um
//número igual a zero. No final, mostre a soma dos números
//digitados.(DO...WHILE)

fun main(){
    var acum = 0.0
    do{
        print("Digite um número qualquer: ")
        var num = readln().toDouble()
        acum += num
    }while(num != 0.0)
    println("$acum")

}