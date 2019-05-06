package br.com.duduvp.luizalabs.data.api

import br.com.duduvp.luizalabs.data.model.Reaction
import br.com.duduvp.luizalabs.data.model.dto.TweetsDTO
import br.com.duduvp.luizalabs.data.model.dto.UsersDTO
import io.reactivex.Observable
import retrofit2.http.GET

interface TwitterApiContract {
    @GET("users/lookup")
    fun getUser(): Observable<UsersDTO>

    @GET("statuses/user_timeline")
    fun getTweets(): Observable<TweetsDTO>

    @GET("")
    fun getReaction(): Observable<Reaction>
}