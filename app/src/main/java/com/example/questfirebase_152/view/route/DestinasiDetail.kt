package com.example.questfirebase_152.view.route


import com.example.questfirebase_152.R

object DestinasiDetail : DestinasiNavigasi {
    override val route: String = "detail_siswa"
    override val titleRes: Int = R.string.detail_siswa
    const val itemIdArg = "idSiswa"
    val routeWithArgs = "$route/${itemIdArg}"
}