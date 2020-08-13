package views;

import javax.swing.*;

public interface View {

    void show();
    void repaint();
    void openViewConfiguration();
    void closeViewConfiguration();
    JPanel getMainPanel();

}