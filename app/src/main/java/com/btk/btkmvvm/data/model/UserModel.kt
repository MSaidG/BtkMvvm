package com.btk.btkmvvm.data.model

import com.google.gson.annotations.SerializedName


class UserResponse : ArrayList<UserModelItem>()

data class UserModelItem(
    @SerializedName("address")
    val address: Address?,
    @SerializedName("email")
    val email: String?,
    @SerializedName("id")
    val id: Int?,
    @SerializedName("name")
    val name: String?,
    @SerializedName("phone")
    val phone: String?,
    @SerializedName("username")
    val username: String?,
    @SerializedName("website")
    val website: String?
)

data class Address(
    @SerializedName("city")
    val city: String?,
    @SerializedName("geo")
    val geo: Geo?,
    @SerializedName("street")
    val street: String?,
    @SerializedName("suite")
    val suite: String?,
    @SerializedName("zipcode")
    val zipcode: String?
)


data class Geo(
    @SerializedName("lat")
    val lat: String?,
    @SerializedName("lng")
    val lng: String?
)