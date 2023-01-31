interface Greets {
    public String greet();
}

public class Greeter implements Greets{
    String formality;

    public String greet() {
        if (this.formality == "formal") {
            return "Good evening";
        } else if (this.formality == "casual") {
            return "Goodday?";
        } else if (this.formality == "intimate") {
            return "Hello darling!";
        } else {
            return "Hello.";
        }
    }

    public void setFormality(String formality) {
        this.formality = formality;
    }
}
