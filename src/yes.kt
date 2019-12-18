fun main(args: Array<String>) {
    print("Choisis un chiffre: ")

    val question = readLine()!!
    println("Le chiffre gagnant est $question")

    var reponse = ""

    while ( reponse != question) {

        print("Vous pensez que le chiffre est: ")

        reponse = readLine()!!


            if(reponse > question){
                println("C'est moins")
            }
            else if(reponse < question){
                println("C'est plus")
            }
            else{
                println("C'est bon, vous-avez gagné")
            }

            }

}
/*
while ( reponse != question) {

    print("Vous pensez que le chiffre est: ")

    reponse = readLine()!!

    if (question.equals(reponse)) {
        System.out.println("Vous avez gagnez!");
    } else {
        System.out.println("Rejouez :")
        val reponse = readLine()
        println("$reponse n'est pas la bonne réponse, rejouez");


    }
}
*/