fun main (){

    val produtos = mutableListOf<String>()

    while(true){
        println("Escolha uma opção: ")
        println("1 - Adicionar produtos")
        println("2 - Remover produtos")
        println("3 - Atualizar produtos")
        println("4 - Listar produtos")
        println("5 - Sair\n")

        print("Opção: ")
        val opcao = readln().toInt()

        when(opcao){

            1 -> {
                println("Digite o nome do produto: ")
                val prod = readln()

                if(prod != ""){
                    produtos.add(prod)
                    println("Produto $prod cadastrado.\n")
                }else{
                    println("O nome do produto não pode ser vazio.")
                }
            }

            2 -> {
                println("Digite o produto a ser deletado: ")
                val deletado = readln()

                if(produtos.contains(deletado)){
                    produtos.remove(deletado)
                    println("Produto $deletado removido com sucesso!")
                }else{
                    println("Produto não existe na lista\n")
                }

            }

            3 -> {
                println("Lista de produtos\n")

                produtos.forEach{
                    println(it)
                }

                println("\nDigite um produto a ser atualizado: ")
                val atualizado = readln()

                if(produtos.contains(atualizado)){
                    val index = produtos.indexOf(atualizado)

                    println("Digite o nome produto: ")
                    val valor = readln()

                    produtos[index] = valor

                }
            }

            4 -> {
                println("Lista de produtos\n")

                produtos.forEach{
                    println(it)
                }

                println()
            }

            5 -> break

            else -> println("Valor inválido!")

        }
    }
}