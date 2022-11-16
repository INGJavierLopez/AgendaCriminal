package lopez.contreras.javier.agendacriminal

import androidx.room.Entity
import androidx.room.PrimaryKey
import java.util.*
@Entity
data class Crime (
    @PrimaryKey val id : UUID,
    val title : String,
    val date : Date,
    val isSolved : Boolean
    )