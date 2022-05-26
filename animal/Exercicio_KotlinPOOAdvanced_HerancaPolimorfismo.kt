package animal

fun main(){

    var doggineo = Cachorro(
        "Mammalia",
        "Carnivora",
        "Canidae",
        "Canis",
        "C.lupus",
        "cachorro",
        15
    )

    doggineo.emiteSom()
    doggineo.habilidade()

    var potranca = Cavalo(
        "Mammalia",
        "Carnivora",
        "Canidae",
        "Canis",
        "C.lupus",
        "cavalo",
        15
    )

    potranca.emiteSom()
    potranca.habilidade()

    var preguicite = Preguica(
        "Mammalia",
        "Carnivora",
        "Canidae",
        "Canis",
        "C.lupus",
        "preguiça",
        15
    )

    preguicite.emiteSom()
    preguicite.habilidade()

}