package com.eniecole.mod5testunitaire

import org.junit.Assert.assertEquals
import org.junit.Test

class EmailTest {
    @Test
    fun IsEmailTest(){
        assertEquals(emailCheck("Quentin@0fc.tech"), true)
        assertEquals(emailCheck("joghndoe11"), false)
        assertEquals(emailCheck("elonmusl.com"), false)
        assertEquals(emailCheck("tonystark@hotmail.com"), true)
    }
}

fun fetchUsernameByID(id : Long?) = when (id){
    null -> "Introuvable"
    in Int.MIN_VALUE .. 0 -> "Impossible"
    in 0..1000 -> "John Doe"
    else -> "Tony Stark"
}
