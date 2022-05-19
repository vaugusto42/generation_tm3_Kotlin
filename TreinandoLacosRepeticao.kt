fun main(){
    var soma = 0.0
    var num = 1.0

    while(num != 0.0){
        print("Digite um número diferente de 0 (se digitar 0 o programa para): ")
        num = readln().toDouble()
        soma+=num
    }
    println("A soma de todos os números digitados é: $soma.")
}