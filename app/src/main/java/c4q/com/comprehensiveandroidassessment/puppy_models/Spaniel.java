package c4q.com.comprehensiveandroidassessment.puppy_models;

/**
 * Created by D on 2/25/18.
 */

public class Spaniel {

    private String span;
    private String spanImage;

    public Spaniel(String span, String spanImage) {
        this.span = span;
        this.spanImage = spanImage;
    }

    public String getSpan() {
        return span;
    }

    public void setSpan(String span) {
        this.span = span;
    }

    public String getSpanImage() {
        return spanImage;
    }

    public void setSpanImage(String spanImage) {
        this.spanImage = spanImage;
    }
}
