package com.example.questfirebase_152.view.route


import com.example.questfirebase_152.R

object DestinasiEdit : DestinasiNavigasi {
    override val route: String = "item_edit"
    override val titleRes: Int = R.string.edit_siswa
    const val itemIdArg = "idSiswa"
    val routeWithArgs = "$route/${itemIdArg}"
}