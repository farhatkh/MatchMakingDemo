package com.yuyakaido.android.cardstackview.sample.NetworkCall

import com.yuyakaido.android.cardstackview.sample.model.Root
import retrofit2.Call
import retrofit2.http.GET
import java.util.*

interface RetrofitAPI {
    // as we are making get request so we are displaying
    // GET as annotation.
    // and inside we are passing last parameter for our url.
    @GET("api/?results=10")
    fun  // as we are calling data from array so we are calling
    // it with array list and naming that method as getAllCourses();
    getAllProfiles(): Call<ArrayList<Root?>?>?
}