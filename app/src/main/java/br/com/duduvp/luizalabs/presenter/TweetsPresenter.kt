package br.com.duduvp.luizalabs.presenter

import br.com.duduvp.luizalabs.presenter.contract.TweetsContract
import br.com.duduvp.luizalabs.ui.TweetsActivity

class TweetsPresenter(tweetsView : TweetsActivity) : TweetsContract.Presenter {

    private var view: TweetsActivity = tweetsView

}