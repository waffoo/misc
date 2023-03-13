public class Director {
    private Builder builder;
    public Director(Builder builder) {              // Builder is passed by constructor
        this.builder = builder;
    }
    public void construct() {                       // Construct a document
        builder.makeTitle("Greeting");              // Title
        builder.makeString("From morning to afternoon"); // String
        builder.makeItems(new String[]{             // Items
            "Good morning.",
            "Hello.",
        });
        builder.makeString("At night");             // Another String
        builder.makeItems(new String[]{             // Another Items
            "Good evening.",
            "Good night.",
            "Goodbye.",
        });
        builder.close();                            // Close
    }
}
