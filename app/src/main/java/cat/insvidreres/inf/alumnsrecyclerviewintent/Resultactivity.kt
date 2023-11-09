package cat.insvidreres.inf.alumnsrecyclerviewintent

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.recyclerview.widget.LinearLayoutManager
import cat.insvidreres.inf.alumnsrecyclerviewintent.databinding.ActivityResultactivityBinding

class Resultactivity : AppCompatActivity() {

    private lateinit var binding: ActivityResultactivityBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityResultactivityBinding.inflate(layoutInflater)
        setContentView(binding.root)
    }

    fun initRecyclerView() {
        binding.recyclerViewAlumn.layoutManager = LinearLayoutManager(this)
//        binding.recyclerViewAlumn.adapter = AlumnAdapter()
    }
}