import java.io.*;

public class HTMLBuilder extends Builder {
    private String filename;                            // File name
    private PrintWriter writer;                         // File writer
    public void makeTitle(String title) {
        filename = title + ".html";                     // Make file name
        try {
            writer = new PrintWriter(new FileWriter(filename));
        } catch (IOException e) {
            e.printStackTrace();
        }
        writer.println("<html><head><title>" + title + "</title></head><body>"); // Write title
        writer.println("<h1>" + title + "</h1>");
    }

    public void makeString(String str) {
        writer.println("<p>" + str + "</p>");           // Write string
    }
    public void makeItems(String[] items) {
        writer.println("<ul>");                         // Write items
        for (int i = 0; i < items.length; i++) {
            writer.println("<li>" + items[i] + "</li>");
        }
        writer.println("</ul>");
    }
    public void close() {
        writer.println("</body></html>");               // Write close
        writer.close();                                 // Close file
    }
    public String getResult() {                         // Get file name
        return filename;
    }
    
}
