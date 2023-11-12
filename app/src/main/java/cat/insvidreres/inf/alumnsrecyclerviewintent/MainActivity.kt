package cat.insvidreres.inf.alumnsrecyclerviewintent

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Toast
import cat.insvidreres.inf.alumnsrecyclerviewintent.databinding.ActivityMainBinding
import java.util.logging.Logger

class MainActivity : AppCompatActivity() {

    private lateinit var binding: ActivityMainBinding
    private val alumnList = arrayListOf<Alumn>()
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)

        binding.addButton.setOnClickListener{
            val name = binding.nameEditText.text.toString()
            val age = binding.AgeEditText.text.toString().toInt()

            alumnList.add(Alumn(name, age))

            binding.nameEditText.text.clear()
            binding.AgeEditText.text.clear()

            Toast.makeText(this, "Alumn ${alumnList[alumnList.size - 1].nom} added", Toast.LENGTH_SHORT).show()
        }
    }


}