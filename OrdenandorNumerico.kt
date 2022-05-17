// 2- Faça um programa que entre com três números e coloque em ordem crescente.

fun main() {
    var maiorNumero = 0
    var medioNumero = 0
    var menorNumero = 0

    println("Este programa recebe três números e te mostra qual é o maior deles. Vamos começar.")
    println("Digite o primeiro número: ")
    var numero1 = readln().toInt()
    println("Digite o primeiro número: ")
    var numero2 = readln().toInt()
    println("Digite o primeiro número: ")
    var numero3 = readln().toInt()

    if(numero1 >= numero2 && numero1 >= numero3){
        maiorNumero = numero1
        if(numero2 >= numero3){
            medioNumero = numero2
            menorNumero = numero3
        }else if(numero3 >= numero2){
            medioNumero = numero3
            menorNumero = numero2
        }
    }else if (numero2 >= numero1 && numero2 >= numero3){
        maiorNumero = numero2
        if(numero1 >= numero3){
            medioNumero = numero1
            menorNumero = numero3
        }else if(numero3 >= numero1){
            medioNumero = numero3
            menorNumero = numero1
        }
    }else if (numero3 >= numero1 && numero3 >= numero2){
        maiorNumero = numero3
        if(numero1 >= numero2){
            medioNumero = numero1
            menorNumero = numero3
        }else if(numero2 >= numero1){
            medioNumero = numero2
            menorNumero = numero1
        }
    }
    println("A sequência crescente dos números digitados é: $menorNumero, $medioNumero, $maiorNumero")

}