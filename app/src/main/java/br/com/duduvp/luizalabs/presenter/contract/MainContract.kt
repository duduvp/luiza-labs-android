package br.com.duduvp.luizalabs.presenter.contract

import android.content.Intent

interface MainContract {
    interface View{
        fun initViews()
        fun searchIntent(intent: Intent)
        fun userNotFound()
        fun showTweets(user : String)
    }

    interface Presenter{
        fun searchUser(user : String)
    }
}