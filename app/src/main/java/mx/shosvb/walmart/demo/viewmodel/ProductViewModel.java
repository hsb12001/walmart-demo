package mx.shosvb.walmart.demo.viewmodel;

import android.app.Application;
import android.arch.lifecycle.AndroidViewModel;
import android.arch.lifecycle.LiveData;
import android.arch.lifecycle.ViewModel;
import android.arch.lifecycle.ViewModelProvider;
import android.databinding.ObservableField;
import android.support.annotation.NonNull;

import mx.shosvb.walmart.demo.service.model.Product;
import mx.shosvb.walmart.demo.service.repository.ProductRepository;

public class ProductViewModel extends AndroidViewModel {
    private final LiveData<Product> productObservable;
    private String productId;

    public ObservableField<Product> product = new ObservableField<>();

    public ProductViewModel(@NonNull Application application,
                            final String productId) {
        super(application);
        this.productId = productId;
        productObservable = ProductRepository.getInstance().getProductDetails();



    }


    public LiveData<Product> getObservableProduct() {
        return productObservable;
    }

    public void setProduct(Product product) {
        this.product.set(product);
    }


    public static class Factory extends ViewModelProvider.NewInstanceFactory {

        @NonNull
        private final Application application;

        private final String productID;

        public Factory(@NonNull Application application, String productID) {
            this.application = application;
            this.productID = productID;
        }

        @Override
        public <T extends ViewModel> T create(Class<T> modelClass) {
            //noinspection unchecked
            return (T) new ProductViewModel(application, productID);
        }
    }
}
