package com.example.myapplication

import com.auth0.android.jwt.JWT
import org.junit.Test

import org.junit.Assert.*
import java.util.*
import kotlin.properties.ReadOnlyProperty
import kotlin.reflect.KProperty

/**
 * Example local unit test, which will execute on the development machine (host).
 *
 * See [testing documentation](http://d.android.com/tools/testing).
 */

class ExampleUnitTest {
    enum class Example {
        A,B,C,D;
        companion object {
            private val instances = values()
            fun findInstance(viewType: Int): Example = instances[viewType]
        }
    }

    @Test
    fun works() {
        val viewType = 3
        val actual = Example.findInstance(viewType)
        assertEquals(Example.D, actual)
    }


}



enum class MessageCenterViewType {
    WELCOME,
    SHOW_ME_MORE,
    ESIGN,
    CLAIMS,
    BILLING_NUMBER,
    BILLING_ICON,
    LIVE_CONTENT,
    HEADER,
    TWO_BUTTON
}