fun main(){
    var cont = 0
    var menosDezoitoCalmos = 0
    var maisQuarentaNervosos = 0
    var outrosCalmos = 0
    var mulheresNervosas = 0
    var homensAgressivos = 0
    var calmos = 0

    while(cont < 150){

        print("Digite sua idade: ")
        var idade = readln().toInt()

        print("Digite seu sexo (1-feminino / 2-masculino / 3-Outros): ")
        var sexo = readln().toString()

        print("Digite seu temperamento (1-calmo / 2-nervoso / 3-agressiva): ")
        var temperamento = readln().toString()

        if(idade < 18 && temperamento == "1"){
            menosDezoitoCalmos++
        }else if(idade > 40 && temperamento == "2"){
            maisQuarentaNervosos++
        }else if(sexo == "3" && temperamento == "1"){
            outrosCalmos++
        }else if(sexo == "1" && temperamento == "2"){
            mulheresNervosas++
        }else if(sexo == "2" && temperamento == "3"){
            homensAgressivos++
        }
        if(temperamento == "1"){
            calmos++
        }
        cont++
    }
    println("Menores de 18 anos e calmos: $menosDezoitoCalmos")
    println("Maiores de 40 anos e nervosos: $maisQuarentaNervosos")
    println("Outros e calmos: $outrosCalmos")
    println("Mulheres e nervosas: $mulheresNervosas")
    println("Homens e agressivos: $homensAgressivos")
    println("Calmos: $calmos")
}