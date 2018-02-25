package c4q.com.comprehensiveandroidassessment.puppy_models;

/**
 * Created by D on 2/25/18.
 */

public class Retriever {

    private String ret;
    private String retImage;

    public Retriever(String ret, String retImage) {
        this.ret = ret;
        this.retImage = retImage;
    }

    public String getRet() {
        return ret;
    }

    public void setRet(String ret) {
        this.ret = ret;
    }

    public String getRetImage() {
        return retImage;
    }

    public void setRetImage(String retImage) {
        this.retImage = retImage;
    }
}
