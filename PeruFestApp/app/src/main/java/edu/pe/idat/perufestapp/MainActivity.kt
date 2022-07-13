package edu.pe.idat.perufestapp

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import edu.pe.idat.perufestapp.databinding.ActivityMainBinding
import edu.pe.idat.perufestapp.databinding.ActivityPfregistroBinding
//pantalla sin logeo
class MainActivity : AppCompatActivity(), View.OnClickListener  {
    private lateinit var binding: ActivityMainBinding

    override fun onCreate(savedInstanceState: Bundle?) {

        Thread.sleep(2000)
        setTheme(R.style.Theme_PeruFestApp)

        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)
        //setContentView(R.layout.activity_main)
        binding.btndloginpg.setOnClickListener(this)
    }
    override fun onClick(v: View) {
        when(v.id) {
            R.id.btndloginpg-> DireLogin()
        }
    }
    private fun DireLogin() {
        val intentActivity = Intent(this,IniciarActivity ::class.java)
        startActivity(intentActivity)
    }
}