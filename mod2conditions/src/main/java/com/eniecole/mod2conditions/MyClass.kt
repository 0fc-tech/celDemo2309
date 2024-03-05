package com.eniecole.mod2conditions

fun main2() {
    val customerLivingFrance = true
    val customerLivingNl = false
    val shippingCost = if(customerLivingFrance)
        5
    else if(customerLivingNl)
        8
    else 78

}
fun main(){
    val idCategorie = 9832
    val categorieGenerale = when(idCategorie){
        in 1..1000 -> "Alimentaire"
        in 1001..4500 -> "Culture"
        else -> "Santé"
    }
    print(categorieGenerale)
}

