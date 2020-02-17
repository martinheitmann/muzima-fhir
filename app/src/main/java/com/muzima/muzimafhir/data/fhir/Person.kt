package com.muzima.muzimafhir.data.fhir


import com.muzima.muzimafhir.data.fhir.types.*
import java.util.*

data class Person(
        var identifier: MutableList<Identifier>? = null,
        var name: MutableList<HumanName>? = null,
        var telecom: MutableList<ContactPoint>? = null,
        var gender: String? = null,
        var birthDate: Date? = null,
        var address: MutableList<Address>? = null,
        var photo: Attachment? = null,
        var active: Boolean? = null
){
    fun getFieldsAndValues() : MutableMap<String, String>{
        return mutableMapOf(
        "identifier" to identifier.toString(),
        "name" to name.toString(),
        "telecom" to telecom.toString(),
        "gender" to gender.toString(),
        "birthDate" to birthDate.toString(),
        "address" to address.toString(),
        "photo" to photo.toString(),
        "active" to active.toString())
    }

    fun mGetFieldsAndValues() : MutableMap<String, String?> {
        return mutableMapOf(
                "nameUse1" to name?.get(0)?.use,
                "nameFamily1" to name?.get(0)?.family,
                "nameUse2" to name?.get(1)?.use,
                "addressLine" to address?.get(0)?.line?.get(0).toString(),
                "birthDate" to birthDate.toString(),
                "gender" to gender.toString(),
                "active" to active.toString()
        )
    }

    override fun toString(): String {
        return "identifier :" + identifier.toString() + "\n" +
                "name :" + name.toString() + "\n" +
                "telecom :" + telecom.toString() + "\n" +
                "gender :" + gender.toString() + "\n" +
                "birthDate :" + birthDate.toString() + "\n" +
                "address :" + address.toString() + "\n" +
                "photo :" + photo.toString() + "\n" +
                "active :" + active.toString()
    }
}