package cat.insvidreres.inf.alumnsrecyclerviewintent.adapter

import android.view.View
import androidx.recyclerview.widget.RecyclerView.ViewHolder
import cat.insvidreres.inf.alumnsrecyclerviewintent.Alumn
import cat.insvidreres.inf.alumnsrecyclerviewintent.databinding.ItemAlumnBinding

class AlumnViewHolder(view: View) : ViewHolder(view) {

    val binding = ItemAlumnBinding.bind(view)

    fun render(alumnModel: Alumn) {
        binding.tvAlumnName.text = alumnModel.nom
        binding.tvAlumnAge.text = alumnModel.edat.toString()
    }
}