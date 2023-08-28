import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class KlimaArayuzu extends JFrame {

    private JLabel icSicaklikLabel, disSicaklikLabel, basincLabel;
    private JLabel icSicaklikDeger, disSicaklikDeger, basincDeger;
    private JButton[] isiticiButtons, kompresorButtons, fanButtons;
    private JButton kondenserButton;
    private JButton kondenserButton1;
    private JButton fanlarButton;

    public KlimaArayuzu() {
        setTitle("Air Conditioner");
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        setSize(500, 500);
        getContentPane().setBackground(Color.ORANGE);
        setLayout(new GridLayout(0, 2));

        icSicaklikLabel = new JLabel("İç Sıcaklık:");
        disSicaklikLabel = new JLabel("Dış Sıcaklık:");
        basincLabel = new JLabel("Basınç:");

        icSicaklikDeger = new JLabel("0°C");
        disSicaklikDeger = new JLabel("0°C");
        basincDeger = new JLabel("0 Pascal");

        isiticiButtons = new JButton[3];
        kompresorButtons = new JButton[2];
        fanButtons = new JButton[2];
        kondenserButton = new JButton("Kondenser1");
        kondenserButton1 = new JButton("Kondenser2");
        fanlarButton = new JButton("Fanlar");

        for (int i = 0; i < 3; i++) {
            isiticiButtons[i] = new JButton("Isıtıcı " + (i + 1));
            final int index = i;
            isiticiButtons[i].addActionListener(new ActionListener() {
                @Override
                public void actionPerformed(ActionEvent e) {
                    // Isıtıcı butonuna tıklandığında yapılacaklar
                }
            });
        }

        add(icSicaklikLabel);
        add(icSicaklikDeger);
        add(disSicaklikLabel);
        add(disSicaklikDeger);
        add(basincLabel);
        add(basincDeger);

        for (int i = 0; i < 3; i++) {
            add(isiticiButtons[i]);
        }

        add(kondenserButton);
        add(kondenserButton1);
        add(fanlarButton);

        setVisible(true);
    }

    public static void main(String[] args) {
        SwingUtilities.invokeLater(new Runnable() {
            @Override
            public void run() {
                new KlimaArayuzu();
            }
        });
    }
}
