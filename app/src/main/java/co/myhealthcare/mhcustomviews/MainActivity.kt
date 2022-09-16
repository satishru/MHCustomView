package co.myhealthcare.mhcustomviews

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import co.myhealthcare.customviews.ToasterMessage
import co.myhealthcare.mhcustomviews.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {

    private lateinit var binding: ActivityMainBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)

        setSupportActionBar(binding.toolbar)

        ToasterMessage.showToast(this, "TEST")
    }
}