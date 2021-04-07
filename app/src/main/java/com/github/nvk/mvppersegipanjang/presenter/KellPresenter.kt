package com.github.nvk.mvppersegipanjang.presenter

import com.github.nvk.mvppersegipanjang.KellView

class KellPresenter (
    private val kellVeiw: KellView
    ){
        fun hitungKellPersegiPanjang(panjang: Float, lebar: Float){
            val hasil = 2*(panjang+lebar)

            kellVeiw.hasilKellPersegiPanjang(hasil)
        }
}