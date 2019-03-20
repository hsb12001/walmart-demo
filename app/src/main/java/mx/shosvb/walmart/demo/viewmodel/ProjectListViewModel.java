package mx.shosvb.walmart.demo.viewmodel;

import android.app.Application;
import android.arch.lifecycle.AndroidViewModel;
import android.util.Log;

public class ProjectListViewModel extends AndroidViewModel {



    public ProjectListViewModel(Application application) {
        super(application);
    }

    /*private final LiveData<List<Project>> projectListObservable;

    public ProjectListViewModel(Application application) {
        super(application);

        // If any transformation is needed, this can be simply done by Transformations class ...
        projectListObservable = ProjectRepository.getInstance().getProjectList("Google");
    }


    public LiveData<List<Project>> getProjectListObservable() {
        return projectListObservable;
    }*/

    public void searchProducts(){
        Log.d( "ProjectListViewModel", "searchProducts...");
    }

}
