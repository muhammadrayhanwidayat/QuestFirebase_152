package com.example.questfirebase_152.repositori
import com.example.questfirebase_152.modeldata.Siswa
import com.google.firebase.firestore.FirebaseFirestore
import kotlinx.coroutines.tasks.await

/**
 * Interface repository untuk mengelola operasi data siswa.
 */
interface RepositorySiswa {
    /**
     * Mengambil semua data siswa dari sumber data.
     */
    suspend fun getDataSiswa(): List<Siswa>

    /**
     * Menyimpan data siswa baru atau memperbarui yang sudah ada.
     */
    suspend fun postDataSiswa(siswa: Siswa)
}

class FirebaseRepositorySiswa : RepositorySiswa {
    private val db = FirebaseFirestore.getInstance()
    private val collection = db.collection("siswa")

    override suspend fun getDataSiswa(): List<Siswa> {
        return try {
            collection.get().await().documents.map { doc ->
                Siswa(
                    id = doc.getLong("id")?.toLong() ?: 0,
                    nama = doc.getString("nama") ?: "",
                    alamat = doc.getString("alamat") ?: "",
                    telpon = doc.getString("telpon") ?: ""
                )
            }
        } catch (e: Exception) {
            emptyList()
        }
    }

