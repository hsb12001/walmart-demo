package mx.shosvb.walmart.demo.service.repository;

import android.arch.lifecycle.LiveData;
import android.arch.lifecycle.MutableLiveData;
import android.util.Log;

import mx.shosvb.walmart.demo.service.model.Product;

import java.io.IOException;

import okhttp3.Interceptor;
import okhttp3.OkHttpClient;
import okhttp3.Request;
import okhttp3.logging.HttpLoggingInterceptor;
import retrofit2.Call;
import retrofit2.Callback;
import retrofit2.Response;
import retrofit2.Retrofit;
import retrofit2.converter.gson.GsonConverterFactory;



public class ProductRepository {
    private WalmartService walmartService;
    private static ProductRepository projectRepository;

    private ProductRepository() {


        HttpLoggingInterceptor logging = new HttpLoggingInterceptor();
        logging.setLevel(HttpLoggingInterceptor.Level.BASIC);
        OkHttpClient client = new OkHttpClient.Builder()
                .addInterceptor(logging)
                .addInterceptor(new Interceptor() {

                    @Override
                    public okhttp3.Response intercept(Chain chain) throws IOException {
                        Request.Builder builder = chain.request().newBuilder();
                        builder.addHeader("Cookie", "akavpau_vp_walmart_ss=1550701157~id%3D737392ca362c36d8b2b8e385d7841c8d;dtCookie=9%24FBF59E104C96CB8B4F035817F8CB37CE%7Cmexico__groceries%7C0;TS01c7b722=0130aff23274df544e2c6807728eaf1c936b08dfc7156232f08464bd134011cf03ec49693c5137d930010c2befae9857082d1fe0b8;TS01f4281b=01c5a4e2f9ce179cff8d522b6dbe8a4a86c105570b84865e43cb959717e43c08a4f5972b05180d448ed33633a8504e63aaf7389baa");
                        builder.addHeader( "accept", "application/json");
                        builder.addHeader( "connection", "keep-alive");
                        return chain.proceed(builder.build());
                    }
                })
                .build();
        //TODO this gitHubService instance will be injected using Dagger in part #2 ...
        Retrofit retrofit = new Retrofit.Builder()
                .client(client)
                .baseUrl(WalmartService.HTTPS_API_URL)
                .addConverterFactory(GsonConverterFactory.create())


                .build();

        walmartService = retrofit.create(WalmartService.class);
    }

    public synchronized static ProductRepository getInstance() {
        //TODO No need to implement this singleton in Part #2 since Dagger will handle it ...
        if (projectRepository == null) {
            if (projectRepository == null) {
                projectRepository = new ProductRepository();
            }
        }
        return projectRepository;
    }


    public LiveData<Product> getProductDetails() {
        final MutableLiveData<Product> data = new MutableLiveData<>();

        walmartService.getProductDetails().enqueue(new Callback<Product>() {
            @Override
            public void onResponse(Call<Product> call, Response<Product> response) {

                Log.d("ProjectRepository", "Search success");
                data.setValue(response.body());
            }

            @Override
            public void onFailure(Call<Product> call, Throwable t) {
                // TODO better error handling in part #2 ...
                Log.d("ProjectRepository", "Error on get product");
                data.setValue(null);
            }
        });

        return data;
    }


}
