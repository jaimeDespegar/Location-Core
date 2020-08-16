package views;

import javax.swing.*;

public interface View {

    void show();
    void repaint();
    JPanel getMainPanel();

}