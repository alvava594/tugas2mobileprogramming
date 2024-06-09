package com.example.kalkulatorsederhana

import android.os.Bundle
import android.widget.Toast
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat
import com.example.kalkulatorsederhana.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {

    private lateinit var main: ActivityMainBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        main = ActivityMainBinding.inflate(layoutInflater)
        val view = main.root
        setContentView(view)

        val input1 = main.input1
        val input2 = main.input2
        val tambah = main.tambah
        val kurang = main.kurang
        val kali = main.kali
        val bagi = main.bagi
        val hasil = main.nilaihasil

        tambah.setOnClickListener {
            var nilai1 = input1.text.toString()
            var nilai2 = input2.text.toString()
            if (nilai1.isEmpty() || nilai2.isEmpty()) {
                Toast.makeText(this, "Kolom tidak boleh kosong", Toast.LENGTH_SHORT).show()
            }
            else {
                var total = Integer.parseInt(nilai1) + Integer.parseInt(nilai2)
                hasil.text = total.toString()
                input1.text.clear()
                input2.text.clear()
            }
        }

        kurang.setOnClickListener {
            var nilai1 = input1.text.toString()
            var nilai2 = input2.text.toString()
            if (nilai1.isEmpty() || nilai2.isEmpty()) {
                Toast.makeText(this, "Kolom tidak boleh kosong", Toast.LENGTH_SHORT).show()
            }
            else {
                var total = Integer.parseInt(nilai1) - Integer.parseInt(nilai2)
                hasil.text = total.toString()
                input1.text.clear()
                input2.text.clear()
            }
        }

        kali.setOnClickListener {
            var nilai1 = input1.text.toString()
            var nilai2 = input2.text.toString()
            if (nilai1.isEmpty() || nilai2.isEmpty()) {
                Toast.makeText(this, "Kolom tidak boleh kosong", Toast.LENGTH_SHORT).show()
            }
            else {
                var total = Integer.parseInt(nilai1) * Integer.parseInt(nilai2)
                hasil.text = total.toString()
                input1.text.clear()
                input2.text.clear()
            }
        }

        bagi.setOnClickListener {
            var nilai1 = input1.text.toString()
            var nilai2 = input2.text.toString()
            if (nilai1.isEmpty() || nilai2.isEmpty()) {
                Toast.makeText(this, "Kolom tidak boleh kosong", Toast.LENGTH_SHORT).show()
            }
            else {
                var total = nilai1.toFloat() / nilai2.toFloat()
                hasil.text = total.toString()
                input1.text.clear()
                input2.text.clear()
            }
        }
        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main)) { v, insets ->
            val systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars())
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom)
            insets
        }
    }
}