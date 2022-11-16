package lopez.contreras.javier.agendacriminal.database

import androidx.room.Dao
import androidx.room.Query
import kotlinx.coroutines.flow.Flow
import lopez.contreras.javier.agendacriminal.Crime
import java.util.*

@Dao
interface CrimeDao {
    @Query("SELECT * FROM crime")
     fun getCrimes(): Flow<List<Crime>>
    @Query("SELECT * FROM crime WHERE id=(:id)")
    suspend fun getCrime(id: UUID): Crime
}