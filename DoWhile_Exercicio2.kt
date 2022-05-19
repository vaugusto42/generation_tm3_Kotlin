fun main(){
    var somatorio = 0
    var cont = 0
    var media = 0
    do{
        print("Digite qualquer número e o programa te dará apenas a média dos multiplos de 3. Digite 0 para sair: ")
        var num = readln().toInt()
        if(num%3==0 && num!=0){
            somatorio += num
            cont++
        }
    }while (num != 0)
    //println("$somatorio e $cont")
    media = somatorio/cont
    println("A média dos multiplos de 3 digitados é de: $media")
}