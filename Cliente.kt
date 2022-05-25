class Cliente (
    var dinheiro: Double,
    var cartaoCredito: Boolean,
    var cartaoDebito: Boolean,
    var cheque: Boolean,
    var carrinho: Int
        ){

    //Métodos - escolhe, paga

    var escolhendo = false
    var pagando = false

    fun escolher(){
        if(escolhendo){
            println("Produto adicionado ao carrinho")
        }else{
            escolhendo = true
            println("Escolha um produto para adicioná-lo ao carrinho.")
        }
    }



    fun pagar(){
        if(pagando){
            println("Pagamento finalizado. Obrigado por comprar conosco.")
        }else{
            pagando = true
            println("Termine o pagamento para finalizar a compra.")
        }
    }

}
