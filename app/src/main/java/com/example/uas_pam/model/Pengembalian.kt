package com.example.uas_pam.model

import kotlinx.serialization.SerialName
import kotlinx.serialization.Serializable

@Serializable
data class Pengembalian (

    @SerialName("id_pengembalian")
    val idPengembalian: Int,

    @SerialName("id_peminjaman")
    val idPeminjaman: Int,

    val nama: String,
    val judul: String,

    @SerialName("tanggal_dikembalikan")
    val tanggalDikembalikan: String,

    val denda: String
)