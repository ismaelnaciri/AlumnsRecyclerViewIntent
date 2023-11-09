package cat.insvidreres.inf.alumnsrecyclerviewintent.adapter

import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import cat.insvidreres.inf.alumnsrecyclerviewintent.R
import cat.insvidreres.inf.alumnsrecyclerviewintent.Alumn

class AlumnAdapter(private val alumnList: List<Alumn>) : RecyclerView.Adapter<AlumnViewHolder>() {

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): AlumnViewHolder {
        val layoutInflater = LayoutInflater.from(parent.context)
        return AlumnViewHolder(layoutInflater.inflate(R.layout.item_alumn, parent, false))
    }

    override fun onBindViewHolder(holder: AlumnViewHolder, position: Int) {
        val item = alumnList[position]
        holder.render(item)
    }

    override fun getItemCount(): Int {
        return alumnList.size
    }
}