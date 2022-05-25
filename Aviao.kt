class Aviao (
    var assentos: Int,
    var classes: Int,
    var companiaAerea: String,
    var modelo: String,
    var vooInternacional: Boolean
        ){

    //Métodos - Assentos disponíveis
    
    var assentosRestantes = 100
    fun assentosDisponiveis(assentosSolicitados: Int){
        assentosRestantes -= assentosSolicitados
        if(assentosSolicitados > assentosRestantes){
            println("Não há assentos disponíveis para este vôo.")
        }else{
            println("A quantidade de assentos solicitada está dispinível. Gostaria de realizar a compra?")
            var compra = readln().toBoolean()
            if(compra){
                println("Operador, prossiga para a próxima etapa de compra.")
            }else{
                println("Operação cancelada.")
            }
        }
        
    }
}