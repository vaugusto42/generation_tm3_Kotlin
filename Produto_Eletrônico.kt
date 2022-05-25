class Produto_Eletronico (
    var tipo: String,
    var marca: String,
    var modelo: String,
    var valorCusto: Double,
    var valorMercado: Double
        ){

    var ligado = false

    fun ligaDesliga(){
        if(ligado){
            println("Off")
        }else{
            ligado = true
            println("On")
        }
    }
}