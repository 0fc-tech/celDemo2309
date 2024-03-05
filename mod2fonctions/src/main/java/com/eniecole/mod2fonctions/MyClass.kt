package com.eniecole.mod2fonctions

import java.time.LocalDateTime
import java.time.format.DateTimeFormatter
import java.util.Locale

fun demarrageVehicule() : Boolean {
    val vitesseMoteur = 0
    val SoCVehicule = 98
    if(SoCVehicule> 2)
        return true
    return false
}

fun LocalDateTime.showDateTimeInFrench(): String {
    //Création format conversionde date pour
    val formatter = DateTimeFormatter.ofPattern(
        "le d MMMM 'à' HH'h'mm", Locale.FRENCH)
    // Formatage du LocalDateTime avec le format donnée
    return this.format(formatter)
}

//Fonction générique
fun <T> concatenate(list: List<T>, separator: String = ", "): String {
    val stringBuilder = StringBuilder()
    for ((index, item) in list.withIndex()) {
        //Si ce n'est pas le premier élément, ajouter le séparateur
        if (index > 0) stringBuilder.append(separator)
        stringBuilder.append(item)
    }
    return stringBuilder.toString()
}


fun collections() {
    val listProducts = mutableListOf(
        "Bureau avec vérins","Chaise de travail Herman Miller",
        "Bureau Steelcase chêne","Bureau Ikea SEKØVA",
        "Bureau blanc","Chaise Think V1", "Armoire métal haute"
    )
    //Ajout avec l'opérateur +=
    listProducts += "Armoire basse"
    //ou avec la méthode add
    listProducts.add("Canapé accueil")
    val ikeaCount = listProducts.filter { it.startsWith("Bureau") }
        .sortedBy { it }
        .count { it.contains("Ikea") }
    print("NbBureaux Ikea $ikeaCount")
}
fun main() {
    print(concatenate(listOf("Chocolat","Scotch","Stylo")))
}
