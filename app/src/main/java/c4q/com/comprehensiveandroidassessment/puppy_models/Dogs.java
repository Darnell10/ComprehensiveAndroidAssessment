package c4q.com.comprehensiveandroidassessment.puppy_models;

/**
 * Created by D on 2/25/18.
 */

public class Dogs {

    private Poodle poodle;
    private Retriever retriever;
    private Spaniel spaniel;
    private Terrier terrier;

    public Dogs(Poodle poodle, Retriever retriever, Spaniel spaniel, Terrier terrier) {
        this.poodle = poodle;
        this.retriever = retriever;
        this.spaniel = spaniel;
        this.terrier = terrier;
    }

    public Poodle getPoodle() {
        return poodle;
    }

    public void setPoodle(Poodle poodle) {
        this.poodle = poodle;
    }

    public Retriever getRetriever() {
        return retriever;
    }

    public void setRetriever(Retriever retriever) {
        this.retriever = retriever;
    }

    public Spaniel getSpaniel() {
        return spaniel;
    }

    public void setSpaniel(Spaniel spaniel) {
        this.spaniel = spaniel;
    }

    public Terrier getTerrier() {
        return terrier;
    }

    public void setTerrier(Terrier terrier) {
        this.terrier = terrier;
    }


}
