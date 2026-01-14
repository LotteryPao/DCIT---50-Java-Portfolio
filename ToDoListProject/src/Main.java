import controller.TaskManager;
import ui.MainFrame;

import javax.swing.SwingUtilities;

public class Main {
    public static void main(String[] args) {
        // Run UI in the Event Dispatch Thread (good practice for Swing)
        SwingUtilities.invokeLater(new Runnable() {
            @Override
            public void run() {
                // a. Instantiate TaskManager
                TaskManager manager = new TaskManager();

                // b. Pass instance into UI
                MainFrame frame = new MainFrame(manager);
                frame.setVisible(true);
            }
        });
    }
}