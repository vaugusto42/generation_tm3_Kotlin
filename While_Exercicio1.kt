//3- Solicitar a idade de várias pessoas e imprimir: Total de pessoas com menos de
//21 anos. Total de pessoas com mais de 50 anos. O programa termina quando
//idade for =-99. (WHILE)


fun main(){
    var verificador = 0
    var menor21 = 0
    var maior50 = 0

    while(verificador!=-99){
        print("Digite uma idade: ")
        var idade = readln().toInt()
        verificador = idade

        if(idade in 0..21){
            menor21++
        }else if(idade > 50){
            maior50++
        }
    }
    println("O total de pessoas menores de 21 anos é de: $menor21. Já o total de pessoas com mais de 50 anos é de: $maior50.")
}