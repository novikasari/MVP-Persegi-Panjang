package com.github.nvk.mvppersegipanjang

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import android.widget.TextView
import com.github.nvk.mvppersegipanjang.presenter.KellPresenter
import com.github.nvk.mvppersegipanjang.presenter.LuasPresenter

class MainActivity : AppCompatActivity(), LuasView, KellView {

    private lateinit var presenterLuas: LuasPresenter
    private lateinit var presenterKell: KellPresenter
    private lateinit var panjang: EditText
    private lateinit var lebar: EditText
    private lateinit var btnLuas: Button
    private lateinit var btnKell: Button
    private lateinit var hasilperhitungan: TextView

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        presenterLuas = LuasPresenter(this)
        presenterKell = KellPresenter(this)

        panjang = findViewById(R.id.panjang)
        lebar = findViewById(R.id.lebar)
        btnLuas = findViewById(R.id.btnLuas)
        btnKell = findViewById(R.id.btnKell)
        hasilperhitungan = findViewById(R.id.result1)

        btnLuas.setOnClickListener {
            val panjang = panjang.text.toString().trim().toFloat()
            val lebar = lebar.text.toString().trim().toFloat()

            presenterLuas.hitungLuasPersegiPanjang(panjang, lebar)
        }

        btnKell.setOnClickListener {
            val panjang = panjang.text.toString().trim().toFloat()
            val lebar = lebar.text.toString().trim().toFloat()

            presenterKell.hitungKellPersegiPanjang(panjang, lebar)
        }
    }

    override fun hasilLuasPresegiPanjang(luas: Float) {
        hasilperhitungan.text = luas.toString()
    }

    override fun hasilKellPersegiPanjang(kell: Float) {
        hasilperhitungan.text = kell.toString()
    }
}