package com.github.nvk.mvppersegipanjang.presenter

import com.github.nvk.mvppersegipanjang.LuasView

class LuasPresenter (
    private val luasView: LuasView
    ){
        fun hitungLuasPersegiPanjang(panjang: Float, lebar: Float){
            val hasil = panjang * lebar

            luasView.hasilLuasPresegiPanjang(hasil)
        }
}