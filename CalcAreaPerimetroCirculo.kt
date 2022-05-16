import kotlin.math.*

fun main(args: Array<String>){



    // 1 - Faça um programa em que o usuário digite o diâmetro de um círculo e calcule a área e o perímetro dele

    // recebe diâmetro e calcula a área e o perímetro do círculo

    // area = pi*(raio)^2
    // perimetro = 2*pi*raio
    // raio = diametro/2

    println("Digite o diâmetro: ")
    var diametro = readln().toDouble()

    var raio = diametro/2

    var area = Math.PI * Math.pow(raio, 2.0)

    var perimetro = 2 * Math.PI * raio

    println("O valor da área é de: $area, e o perimetro (ou comprimento) equivale à $perimetro .")


}