package calculadora
import kotlin.math.pow
import kotlin.math.sqrt

class Calculadora {

    companion object {
        fun soma(n1:Int, n2: Int): Int{
            return n1 + n2
        }
        fun soma(n1:Double, n2: Double): Double{
            return n1 + n2
        }
        fun subtracao(n1:Int, n2: Int): Int{
            return n1 - n2
        }
        fun subtracao(n1:Double, n2: Double): Double{
            return n1 - n2
        }
        fun multiplicacao(n1:Int, n2: Int): Int{
            return n1 * n2
        }
        fun divisao(n1:Int, n2: Int): Int{
            return n1 / n2
        }
        fun potencia(n1:Double, n2: Double): Double{
            return n1.pow(n2)
        }
        fun raiz(n1: Double): Double{
            return sqrt(n1)
        }
    }


}