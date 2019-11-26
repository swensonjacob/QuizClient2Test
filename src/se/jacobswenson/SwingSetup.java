package se.jacobswenson;

import javax.swing.*;
import javax.swing.border.Border;
import javax.swing.border.CompoundBorder;
import javax.swing.border.EmptyBorder;
import javax.swing.border.LineBorder;
import java.awt.*;
import java.io.File;
import java.io.IOException;

public class SwingSetup {

    private static String coolvetica = "src/se/jacobswenson/Resources/coolveticarg.ttf";

    public static JButton createButton(String text) {
        JButton button = new JButton(text);
        button.setForeground(new Color(200, 57, 65));
        button.setBackground(Color.white);
        button.setOpaque(true);
        Border line = new LineBorder(new Color(200, 57, 65));
        Border margin = new EmptyBorder(5, 15, 5, 15);
        Border compound = new CompoundBorder(line, margin);
        button.setBorder(compound);
        button.setPreferredSize(new Dimension(150,100));
        button.setFont(applyFont(coolvetica));
        return button;
    }

    public static JPanel createPanel() {
        JPanel panel = new JPanel();
        panel.setBackground(new Color(246, 235, 219));
        return panel;
    }


    public static JLabel createLabel(String text) {
        JLabel jLabel = new JLabel(text,JLabel.CENTER);
        jLabel.setForeground(new Color(200, 57, 65));
        jLabel.setFont(applyFont(coolvetica));
        jLabel.setAlignmentX(Component.CENTER_ALIGNMENT);
        return jLabel;
    }

    public static JLabel createPointLabel(String text) {
        JLabel jLabel = new JLabel(text,JLabel.CENTER);
        jLabel.setForeground(new Color(200, 57, 65));
        Font font = applyFont(coolvetica);
        Font sizedFont = font.deriveFont(210f);
        jLabel.setFont(sizedFont);
        jLabel.setVerticalAlignment(JLabel.TOP);
        jLabel.setAlignmentX(Component.CENTER_ALIGNMENT);
        jLabel.setBorder(new EmptyBorder(10, 10, 60, 10));
        return jLabel;
    }

    private static Font applyFont(String path) {
        File font_file = new File(path);
        Font font=null;
        try {
            font = Font.createFont(Font.TRUETYPE_FONT, font_file);
        } catch (FontFormatException | IOException e) {
            e.printStackTrace();
        }
        Font sizedFont = font.deriveFont(18f);
        return sizedFont;
    }

    public static JLabel createLogo() {
        String logoPath = "src/se/jacobswenson/Resources/logoTwoSmall.png";
        JLabel logoGame = new JLabel(new ImageIcon(logoPath));
        logoGame.setBorder(new EmptyBorder(10, 10, 10, 10));
        return logoGame;
    }

    public static Border getEmptyBorder() {
        return new EmptyBorder(10, 10, 10, 10);
    }

    public static JLabel getLoaderLabel () {
        JLabel loader = new JLabel(new ImageIcon("src/se/jacobswenson/Resources/loadingLazy.gif"));
        loader.setVerticalAlignment(JLabel.BOTTOM);
        loader.setBorder(getEmptyBorder());
        return loader;
    }

}
