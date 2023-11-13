package cat.insvidreres.inf.alumnsrecyclerviewintent

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.recyclerview.widget.LinearLayoutManager
import cat.insvidreres.inf.alumnsrecyclerviewintent.adapter.AlumnAdapter
import cat.insvidreres.inf.alumnsrecyclerviewintent.databinding.ActivityResultactivityBinding

class Resultactivity : AppCompatActivity() {

    private lateinit var binding: ActivityResultactivityBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityResultactivityBinding.inflate(layoutInflater)
        setContentView(binding.root)
        initRecyclerView()
    }

    fun initRecyclerView() {
        val alumnes = intent.getParcelableArrayListExtra<Alumn>("Alumnes", Alumn::class.java) as List<Alumn>

        binding.recyclerViewAlumn.layoutManager = LinearLayoutManager(this)
        binding.recyclerViewAlumn.adapter = AlumnAdapter(alumnes)
    }
}