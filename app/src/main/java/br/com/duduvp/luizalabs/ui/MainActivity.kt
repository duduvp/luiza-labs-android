package br.com.duduvp.luizalabs.ui

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import br.com.duduvp.luizalabs.R
import br.com.duduvp.luizalabs.presenter.MainPresenter
import br.com.duduvp.luizalabs.presenter.contract.MainContract

class MainActivity : AppCompatActivity(), MainContract.View {

    private lateinit var presenter : MainPresenter

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        presenter = MainPresenter(this)
    }
}
