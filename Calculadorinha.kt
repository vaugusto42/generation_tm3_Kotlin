import kotlin.text.toInt as toInt1

fun main(){
    println("***Calculadora***")
    println("Qual operação deseja fazer?")
    println("Digite 1 - soma\n" +
            "Digite 2 - subtração\n" +
            "Digite 3 - divisão\n" +
            "Digite 4 - multiplicação\n" +
            "Digite a opção desejada: ")
    var operacao = readln().toInt1()


    //função soma
    fun soma(){
        var soma = 0
        print("Digite a quantiadade de valores que deseja somar: ")
        var qtdeValores = readln().toInt1()
        for (i in 1.. qtdeValores){
            print("Digite o valor $i: ")
            var valorN = readln().toInt1()
            soma += valorN
        }
        print("Resultado final: $soma")
    }

    //função subtração
    fun subtracao(){
        var subtracao = 0
        print("Digite a quantiadade de valores que deseja subtrair: ")
        var qtdeValores = readln().toInt1()
        for (i in 1.. qtdeValores){
            print("Digite o valor $i: ")
            var valorN = readln().toInt1()
            if(i == 1){
                subtracao += valorN
            }else{
                subtracao -= valorN
            }
        }
        print("Resultado final: $subtracao")
    }

    //função divisão
    fun divisao(){
        var divisao = 0
        print("Digite o dividendo: ")
        var dividendo = readln().toInt1()
        print("Digite o divisor: ")
        var divisor = readln().toInt1()
        divisao = dividendo/divisor
        println("Resultado final: $divisao")

    }

    //função multiplicação
    fun multiplicacao(){
        var multiplicacao = 1
        print("Digite a quantiadade de valores que deseja multiplicar: ")
        var qtdeValores = readln().toInt1()
        for (i in 1.. qtdeValores){
            print("Digite o valor $i: ")
            var valorN = readln().toInt1()
            multiplicacao *= valorN
        }
        print("Resultado final: $multiplicacao")
    }


    when(operacao){
        1 -> println("Soma: ${soma()}")
        2 -> println("Soma: ${subtracao()}")
        3 -> println("Soma: ${divisao()}")
        4 -> println("Soma: ${multiplicacao()}")
    }


}

