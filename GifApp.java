import javax.swing.*;
import javax.swing.event.DocumentEvent;
import javax.swing.event.DocumentListener;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.IOException;
import java.io.InputStream;
import java.net.HttpURLConnection;
import java.net.URL;
import java.util.Scanner;

public class GifApp {

    private static final String API_KEY = "Urd8wiJquT5hp5yjvof0UKui4zSIiM5b";
    private static final String SEARCH_ENDPOINT = "https://api.giphy.com/v1/gifs/search";

    public static void main(String[] args) {
        SwingUtilities.invokeLater(() -> createAndShowGUI());
    }

  private static void createAndShowGUI() {
        JFrame frame = new JFrame("GIF Search App");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setSize(500, 400);

        JPanel panel = new JPanel();
        JTextField searchField = new JTextField(20);
        JButton searchButton = new JButton("Search");
        JLabel gifLabel = new JLabel();

        searchField.getDocument().addDocumentListener(new DocumentListener() {
            @Override
            public void insertUpdate(DocumentEvent e) {
                searchGifAndUpdateLabel(searchField.getText().trim(), gifLabel);
            }

            @Override
            public void removeUpdate(DocumentEvent e) {
                searchGifAndUpdateLabel(searchField.getText().trim(), gifLabel);
            }

            @Override
            public void changedUpdate(DocumentEvent e) {
                
            }
        });
   

 private static void createAndShowGUI() {
        JFrame frame = new JFrame("GIF Search App");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setSize(500, 400);

        JPanel panel = new JPanel();
        JTextField searchField = new JTextField(20);
        JButton searchButton = new JButton("Search");
        JLabel gifLabel = new JLabel();
searchField.getDocument().addDocumentListener(new DocumentListener() {
            @Override
            public void insertUpdate(DocumentEvent e) {
                searchGifAndUpdateLabel(searchField.getText().trim(), gifLabel);
            }

            @Override
            public void removeUpdate(DocumentEvent e) {
                searchGifAndUpdateLabel(searchField.getText().trim(), gifLabel);
            }

            @Override
            public void changedUpdate(DocumentEvent e) {
}
        });
  String imagesField = jsonResponse.substring(jsonResponse.indexOf("\"images\":") + 10);
            String gifUrl = imagesField.substring(imagesField.indexOf("\"url\":\"") + 7);
            gifUrl = gifUrl.substring(0, gifUrl.indexOf("\""));
    
            return gifUrl;
        } catch (IOException e) {
            e.printStackTrace();
            return null;
        }
    }
 private static String convertStreamToString(InputStream inputStream) {
        Scanner scanner = new Scanner(inputStream).useDelimiter("\\A");
        return scanner.hasNext() ? scanner.next() : "";
    }

private static void displayGif(String gifUrl, JLabel gifLabel) {
        try {
            URL url = new URL(gifUrl);
            ImageIcon imageIcon = new ImageIcon(url);
            gifLabel.setIcon(imageIcon);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
