package uz.artikov.servicepractice

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import uz.artikov.servicepractice.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {

    lateinit var binding: ActivityMainBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)

        binding.StartButtonId.setOnClickListener {

            val intent = Intent(this, MediaService::class.java)
            startService(intent)

        }

        binding.StopButtonId.setOnClickListener {

            val intent = Intent(this, MediaService::class.java)
            stopService(intent)

        }

    }
}