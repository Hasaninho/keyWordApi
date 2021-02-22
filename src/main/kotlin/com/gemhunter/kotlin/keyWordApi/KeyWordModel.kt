package com.gemhunter.kotlin.keyWordApi

import javax.persistence.Entity
import javax.persistence.GeneratedValue
import javax.persistence.GenerationType
import javax.persistence.Id

@Entity
data class KeyWordModel(
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    var id: Long = -1,
    var name: String = "",
    var info: String = "",
    var availability: Boolean = false,
    var url: String = ""
) {}