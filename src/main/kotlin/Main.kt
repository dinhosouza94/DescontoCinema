fun main(args: Array<String>) {

    print("Digite a sua idade: ")
    var idade = readLine()!!.toInt()

    var precoIng = 18.00
    var desc = 0.0
    var precoFinal = 0.0
    var cont = 0

    if(idade < 5) {
        desc = 0.6
    }else if(idade > 60) {
        desc = 0.55
    }else{
        print("quantos ingressos você deseja comprar: ")
        cont = readLine()!!.toInt()

        if(cont >= 2){
            desc = 0.3
        }else{
            desc = 0.0
        }

        precoFinal = precoIng - (precoIng * desc)
        if(cont > 0) {
            var precoTudo = precoFinal * cont
            println("você pagará R$$precoFinal em cada ingresso")
            println("você pagará R$$precoTudo em todos os ingressos")
        }else{
            println("Você pagará R$$precoFinal em cada ingresso")
        }



    }
}
