class Funcionario (
    var nome: String,
    var cargo: String,
    var departamento: String,
    var salario: Double,
    var gerenteArea: String
        ){

    //Método - avaliação de desempenho


    fun desempenho(nota: Int){
        if(nota >= 80){
            println("Desempenho excelente: Elegivel a promoção.")
        }else if(nota > 60){
            println("Desempenho aceitável: precisa melhorar.")
        }else{
            println("Feedback alerta.")
        }
    }
}