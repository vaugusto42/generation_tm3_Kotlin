package animal

abstract class Animal (
     var classe: String,
     var ordem: String,
     var familia: String,
     var genero: String,
     var especie: String,
){

    abstract fun emiteSom()
    abstract fun habilidade()


}