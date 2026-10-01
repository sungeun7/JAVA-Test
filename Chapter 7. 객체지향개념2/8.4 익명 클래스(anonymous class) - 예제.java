import java.awt.*;
import java.awt.event.*;

class InnerEx7{
    public static void main(String[] args) {
        Button b = new Button("Start");
        b.addActionListener(new EventHandler() );
    }
}

class EventHandler implements ActionListener{
    public void actionPerformed(ActionEvent e){
        System.out.println("ActionEvent occurred!!!");
    }
}


class InnerEx8{
    public static void main(String[] args) {
        Button b = new Button("Start");
        b.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e){
                System.out.println("ActionEvent occurred!!!");
            }
        } // 익명 클래스의 끝
    );
    } // main메서드의 끝
} // InnerEx8 클래스의 끝