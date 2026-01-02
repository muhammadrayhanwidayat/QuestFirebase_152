package com.example.questfirebase_152.modeldata

/**
 * Model data yang merepresentasikan entitas Siswa.
 *
 * @property id ID unik siswa (Long)
 * @property nama Nama lengkap siswa
 * @property alamat Alamat tempat tinggal siswa
 * @property telpon Nomor telepon siswa
 */
data class Siswa(
    val id: Long = 0,
    val nama: String = "",
    val alamat: String = "",
    val telpon: String = ""
)

