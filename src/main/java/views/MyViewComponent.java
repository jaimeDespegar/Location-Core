package views;

import javax.swing.*;
import java.util.List;

public interface MyViewComponent {

    List<JComponent> getComponents(View context);

}