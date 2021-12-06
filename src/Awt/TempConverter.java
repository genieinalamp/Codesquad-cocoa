package Awt;
import java.awt.event.*;
import javax.swing.*;

public class TempConverter extends JFrame implements ActionListener {
    public TempConverter(){
        JPanel panel = new JPanel();
        add(panel);

        JLabel label1 = new JLabel("화씨 온도");
        JLabel label2 = new JLabel("섭씨 온도");
        // JLabel 객체 두 개 생성,  ()안은 라벨에 들어갈 내용

        JTextField field1 = new JTextField(15);
        JTextField field2 = new JTextField(15);
        JButton button = new JButton("변환");
        // 15px 크기의 문자열을 받을 수 있는 JTextField 객체 두 개와 변환 버튼 생성!

        panel.add(label1);
        panel.add(label2);
        panel.add(field1);
        panel.add(field2);
        panel.add(button);

        setSize(300,150);

        setTitle("온도변환기");
        setVisible(true);
        button.addActionListener(this);

    }

    public static void main(String[] args){
        TempConverter f = new TempConverter();
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        System.exit(0);
    }
}
