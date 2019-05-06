package br.com.duduvp.luizalabs.presenter

import br.com.duduvp.luizalabs.data.model.MainRepository
import br.com.duduvp.luizalabs.presenter.contract.MainContract
import br.com.duduvp.luizalabs.ui.MainActivity

class MainPresenter(mainView : MainActivity) : MainContract.Presenter {

    private var view : MainActivity = mainView
    private var model : MainRepository = MainRepository()

    init {

    }

}