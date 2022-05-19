//2- Ler 10 números e imprimir quantos são pares e quantos são ímpares. (FOR)

fun main(){
    var pares = 0
    var impares = 0
    for (i in 1..10 step 1){
        if(i%2==0){
            pares++
        }else{
            impares++
        }
    }
    println("Pares: $pares e Ímpares: $impares")
}