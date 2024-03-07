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