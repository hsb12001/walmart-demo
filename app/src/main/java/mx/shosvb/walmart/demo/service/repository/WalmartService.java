package mx.shosvb.walmart.demo.service.repository;

import mx.shosvb.walmart.demo.service.model.Product;

import retrofit2.Call;
import retrofit2.http.GET;

public interface WalmartService {
    String HTTPS_API_URL = "https://www.walmart.com.mx/";


    //Call<Product> getProductDetails(@Header("Cookie") String cookie);
    @GET("api/rest/model/atg/commerce/catalog/ProductCatalogActor/getProduct?id=00750940180662")
    Call<Product> getProductDetails();

}
