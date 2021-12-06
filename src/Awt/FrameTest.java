package Awt;
import javax.swing.*;

public class FrameTest extends JFrame {
    public FrameTest() {
        setSize(300,200);
        setTitle("MyFrame");
        setVisible(true);
    }
    public static void main(String args[]) {
        FrameTest f = new FrameTest();
    }
}
