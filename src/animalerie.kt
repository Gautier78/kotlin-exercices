fun main(args: Array<String>) {
    val Animalerie = Animalerie()
    Animalerie.add(Chien())
    Animalerie.add(Chat())
    Animalerie.add(Perroquet())
    Animalerie.afficherqjs()
}

interface Animal{
    fun parler()
    fun quiSuisJe()
}

// -------------CHIEN------------//

class Chien : Animal{
    override fun parler() {
        println("WafWaf")
    }

    override fun quiSuisJe() {
        println("Je suis un Chien.")
    }
}

// ----------CHAT---------------//

class Chat : Animal{
    override fun parler() {
        println("MiaouMiaou")
    }

    override fun quiSuisJe() {
      println("Je suis un Chat.")
    }
}

// -------------PERROQUET--------------//

class Perroquet : Animal{
    override fun parler() {
        println("SkrtSkrt")
    }

    override fun quiSuisJe() {
        println("Je suis un Perroquet.")
    }
}


class Animalerie{
    var nbrAnimal = mutableListOf<Animal>()
    fun add(animal: Animal) {
        nbrAnimal.add(animal)
    }
    fun afficherqjs(){
        for(chacun in nbrAnimal){
            chacun.quiSuisJe()
        }

    }