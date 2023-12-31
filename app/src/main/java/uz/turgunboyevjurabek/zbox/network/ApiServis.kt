package uz.turgunboyevjurabek.zbox.network

import retrofit2.Call
import retrofit2.http.Body
import retrofit2.http.GET
import retrofit2.http.POST
import retrofit2.http.Path
import uz.turgunboyevjurabek.zbox.Seller.getSeller
import uz.turgunboyevjurabek.zbox.Seller.getSellers
import uz.turgunboyevjurabek.zbox.madels.Client.Client_Post_Request
import uz.turgunboyevjurabek.zbox.madels.Client.Clients_Get
import uz.turgunboyevjurabek.zbox.madels.Client.Clients_Post
import uz.turgunboyevjurabek.zbox.madels.Order.Order_get
import uz.turgunboyevjurabek.zbox.madels.Product.Product
import uz.turgunboyevjurabek.zbox.madels.Product.Product_Get_with_ID

interface ApiServis {


    //Clientlarni hammasini olish uchun
    @GET("clientlar/")
    fun getClients():Call<ArrayList<Clients_Get>>

    //Client qo'shish uchun
    @POST("clientlar/")
    fun postClient(@Body clientPostRequest: Client_Post_Request):Call<Clients_Post>

    //Client id orqli olish
    @GET("clientlar/{id}/")
    fun getClientId(@Path("id") id :Int):Call<Clients_Get>

    //Mahsulotlarni hammasini olish uchun
    @GET("mahsulotlar/")
    fun getProduct():Call<ArrayList<Product>>

    //  Maxsulot id orqali olish
    @GET("mahsulotlar/{id}/")
    fun getProductId(@Path("id") id :Int):Call<Product_Get_with_ID>

    //Sotuvchilarni hammasini olish uchun
    @GET("sotuvchilar/")
    fun getSellers():Call<ArrayList<getSellers>>

    //sotuchini id orqali olish
    @GET("/sotuvchilar/{id}/")
    fun getSeller(@Path("id") id:Int):Call<getSeller>

    // buyurtmalarni hammasini apidan olib kelish
    @GET("buyurtmalar/")
    fun getOrders():Call<ArrayList<Order_get>>

}