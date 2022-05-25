package animal

class Preguica : Animal {
    var name: String
    var idade: Int

    constructor(
        classe: String,
        ordem: String,
        familia: String,
        genero: String,
        especie: String,
        name: String,
        idade: Int
    ) : super(classe, ordem, familia, genero, especie) {
        this.name = name
        this.idade = idade
    }

    override fun emiteSom() {
        println("Grunhindo.")
    }

    override fun habilidade() {
        println("Escalando árvore.")
    }
}