package com.eniecole.mod2structuredeclasse

data class Travail(
    val intitulePoste :String,
    var salaireAnnuel : Int,
    var isCadre: Boolean,
    var ville: String?
)

fun main() {
    val developpeurNantais = Travail("Développeur", 34000,true,"Nantes")
    val designerTeleTravail = Travail("Designer", 44000,true,null)
    val dirigeantESN = Travail("PDG",74000,true,"Paris")
    val developpeurRennais = developpeurNantais.copy(
        ville = "Rennes"
    )
    println(developpeurNantais)
}
class AppareilBluetooth(val macAdress:String){
    fun connecter(){
    }
}
