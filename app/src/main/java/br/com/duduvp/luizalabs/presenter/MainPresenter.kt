package br.com.duduvp.luizalabs.presenter

import br.com.duduvp.luizalabs.presenter.contract.MainContract
import br.com.duduvp.luizalabs.ui.MainActivity

class MainPresenter(mainView: MainActivity) : MainContract.Presenter {

    private var view: MainActivity = mainView

    override fun searchUser(user: String) {
        when {
            true -> view.showTweets(user)
            else -> view.userNotFound()
        }
    }

}