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

 private static void createAndShowGUI() {
        JFrame frame = new JFrame("GIF Search App");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setSize(500, 400);

        JPanel panel = new JPanel();
        JTextField searchField = new JTextField(20);
        JButton searchButton = new JButton("Search");
        JLabel gifLabel = new JLabel();
