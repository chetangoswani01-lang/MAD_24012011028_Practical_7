package com.example.mad_24012011028_practical_7

import java.io.Serializable

class Person(
    val id: String?,
    val name: String,
    val phone: String,
    val email: String,
    val address: String,
) : Serializable{}