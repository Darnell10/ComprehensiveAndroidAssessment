package c4q.com.comprehensiveandroidassessment.recyclerview;

import java.util.List;

import c4q.com.comprehensiveandroidassessment.puppy_models.Dogs2;

/**
 * Created by D on 2/25/18.
 */

public class DogArray extends Dogs2 {

    private List<Dogs2> dogs2s;

    public DogArray(List<Dogs2> dogs2s) {
        super();
        this.dogs2s = dogs2s;
    }

    public List<Dogs2> getDogs2s() {
        return dogs2s;
    }

    public void setDogs2s(List<Dogs2> dogs2s) {
        this.dogs2s = dogs2s;
    }
}
