import controller.TaskManager;
import ui.MainFrame;

import javax.swing.SwingUtilities;

public class Main {
    public static void main(String[] args) {
        
        SwingUtilities.invokeLater(new Runnable() {
            @Override
            public void run() {
                
                TaskManager manager = new TaskManager();

                
                MainFrame frame = new MainFrame(manager);
                frame.setVisible(true);
            }
        });
    }

}
