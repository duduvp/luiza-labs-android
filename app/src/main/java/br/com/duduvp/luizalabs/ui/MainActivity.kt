package br.com.duduvp.luizalabs.ui

import android.app.SearchManager
import android.content.Context
import android.content.Intent
import android.os.Bundle
import android.view.Menu
import android.widget.Toast
import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.SearchView
import br.com.duduvp.luizalabs.R
import br.com.duduvp.luizalabs.presenter.MainPresenter
import br.com.duduvp.luizalabs.presenter.contract.MainContract

import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity(), MainContract.View {

    private lateinit var presenter: MainPresenter

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        setSupportActionBar(toolbar)
        initViews()
    }

    override fun onCreateOptionsMenu(menu: Menu): Boolean {
        menuInflater.inflate(R.menu.main, menu)
        val searchManager = getSystemService(Context.SEARCH_SERVICE) as SearchManager
        (menu.findItem(R.id.action_search).actionView as SearchView).apply {
            setSearchableInfo(searchManager.getSearchableInfo(componentName))
        }
        return true
    }

    override fun onNewIntent(intent: Intent) {
        super.onNewIntent(intent)
        searchIntent(intent)
    }

    override fun initViews() {
        presenter = MainPresenter(this)
        searchIntent(intent)
    }

    override fun searchIntent(intent: Intent) {
        if (Intent.ACTION_SEARCH == intent.action) {
            val query = intent.getStringExtra(SearchManager.QUERY)
            presenter.searchUser(query)
        }
    }

    override fun userNotFound() {
        Toast.makeText(this, "User not found! Try again!", Toast.LENGTH_LONG).show()
    }

    override fun showTweets(user : String) {
        val intent = Intent(this, TweetsActivity::class.java)
        intent.putExtra("user", user)
        startActivity(intent)
    }


}
