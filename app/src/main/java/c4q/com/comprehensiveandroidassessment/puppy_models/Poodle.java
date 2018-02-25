package c4q.com.comprehensiveandroidassessment.puppy_models;

/**
 * Created by D on 2/25/18.
 */

public class Poodle {

    private String poodle;
    private String poodleImage;

    public Poodle(String poodle, String poodleImage) {
        this.poodle = poodle;
        this.poodleImage = poodleImage;
    }

    public String getPoodle() {
        return poodle;
    }

    public void setPoodle(String poodle) {
        this.poodle = poodle;
    }

    public String getPoodleImage() {
        return poodleImage;
    }

    public void setPoodleImage(String poodleImage) {
        this.poodleImage = poodleImage;
    }
}
