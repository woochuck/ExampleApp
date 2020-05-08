package com.luczak.m.coreapp.view.details

import com.luczak.m.coreapp.model.Post
import com.luczak.m.coreapp.model.User

interface PostDetailMvpView {
    fun showProgress(show: Boolean)
    fun setAuthorData(user: User)
    fun setComments(it: Post)
    fun setPostDetails(post: Post)
}