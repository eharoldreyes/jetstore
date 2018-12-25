package com.eharoldreyes.jetstore.repository.remote.api.adapter

import okhttp3.Request
import retrofit2.Call
import retrofit2.Callback
import retrofit2.Response
import java.io.IOException


interface CallAdapter<T>  {

    /**
     * Returns true if this call has been either [executed][.execute] or [ ][.enqueue]. It is an error to execute or enqueue a call more than once.
     */
    val isExecuted: Boolean

    /** True if [.cancel] was called.  */
    val isCanceled: Boolean

    /**
     * Synchronously send the request and return its response.
     *
     * @throws IOException if a problem occurred talking to the server.
     * @throws RuntimeException (and subclasses) if an unexpected error occurs creating the request
     * or decoding the response.
     */
    @Throws(IOException::class)
    fun execute(): Response<T>

    /**
     * Asynchronously send the request and notify `callback` of its response or if an error
     * occurred talking to the server, creating the request, or processing the response.
     */
    fun enqueue(callback: Callback<T>)

    /**
     * Cancel this call. An attempt will be made to cancel in-flight calls, and if the call has not
     * yet been executed it never will be.
     */
    fun cancel()

    /**
     * Create a new, identical call to this one which can be enqueued or executed even if this call
     * has already been.
     */
    public override fun clone(): Call<T>

    /** The original HTTP request.  */
    fun request(): Request
}