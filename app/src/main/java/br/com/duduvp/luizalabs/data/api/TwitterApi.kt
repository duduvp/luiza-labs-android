package br.com.duduvp.luizalabs.data.api

import br.com.duduvp.luizalabs.data.model.Reaction
import br.com.duduvp.luizalabs.data.model.dto.TweetsDTO
import br.com.duduvp.luizalabs.data.model.dto.UsersDTO
import io.reactivex.Observable

class TwitterApi : TwitterApiContract {

    override fun getUser(): Observable<UsersDTO> {
        TODO("not implemented") //To change body of created functions use File | Settings | File Templates.
    }

    override fun getTweets(): Observable<TweetsDTO> {
        TODO("not implemented") //To change body of created functions use File | Settings | File Templates.
    }

    override fun getReaction(): Observable<Reaction> {
        TODO("not implemented") //To change body of created functions use File | Settings | File Templates.
    }

}