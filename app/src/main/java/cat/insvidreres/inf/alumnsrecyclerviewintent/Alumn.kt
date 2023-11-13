package cat.insvidreres.inf.alumnsrecyclerviewintent

import android.os.Parcel
import android.os.Parcelable

data class Alumn(val nom: String, val edat: Int) : Parcelable {
    constructor(parcel: Parcel) : this(
        parcel.readString() ?: "",
        parcel.readInt()
    )

    override fun writeToParcel(parcel: Parcel, flags: Int) {
        parcel.writeString(nom)
        parcel.writeInt(edat)
    }

    override fun describeContents(): Int {
        return 0
    }

    companion object CREATOR : Parcelable.Creator<Alumn> {
        override fun createFromParcel(parcel: Parcel): Alumn {
            return Alumn(parcel)
        }

        override fun newArray(size: Int): Array<Alumn?> {
            return arrayOfNulls(size)
        }
    }
}
