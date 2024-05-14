package com.jellyfish.rockpaperscissors

import kotlin.random.Random

fun main(args: Array<String>) {

    var rock:Int = 1
    var paper:Int = 2
    var scissors:Int = 3
    var userChoice: String? = null
    println("ROCK PAPER SCISSORS")
    println("--THE GAME--")
    println()
    println("Escolha entre 1: pedra, 2: papel ou 3: tesoura")

    var computerRandomChoice = Random.nextInt(1,4)
    println("Digite o número referente a opção...")
    userChoice = readLine()!!

    println()
    println("computador escolheu: $computerRandomChoice")
    println("você escolheu: $userChoice")
    println()

    if(computerRandomChoice == userChoice.toInt()){
        println("eee......")
        println("EMPATEEEEE!!!!")
    }

    //tesoura(3) > papel(2) > pedra(1) > tesoura(3)
    else if(computerRandomChoice == 3 && userChoice.toInt() == 2 || computerRandomChoice == 2 && userChoice.toInt() == 1 && computerRandomChoice == 1 && userChoice.toInt() == 3){
        println("Computador ganhou sinto muito")
    }
    else if(!(computerRandomChoice == 3 && userChoice.toInt() == 2 || computerRandomChoice == 2 && userChoice.toInt() == 1 && computerRandomChoice == 1 && userChoice.toInt() == 3)){
        println("VOCE GANHOU BICHÃO!!!!")
    }


}