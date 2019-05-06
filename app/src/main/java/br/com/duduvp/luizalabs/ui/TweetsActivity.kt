package br.com.duduvp.luizalabs.ui

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import br.com.duduvp.luizalabs.R
import br.com.duduvp.luizalabs.presenter.contract.TweetsContract

class TweetsActivity : AppCompatActivity(), TweetsContract.View {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_tweets)
    }
}
