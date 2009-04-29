package ch.idsia.java.mario.engine;

import ch.idsia.java.ai.agents.IAgent;
import ch.idsia.java.ai.agents.human.HumanKeyboardAgent;

import java.awt.*;
import javax.swing.*;

public class FrameLauncher
{
    public static void main(String[] args)
    {
        IAgent hka = new HumanKeyboardAgent();
        hka.reset();
        MarioComponent marioComponent = new MarioComponent(330, 250, hka);
        JFrame frame = new JFrame("Mario Test");
        frame.setContentPane(marioComponent);
        frame.pack();
        frame.setResizable(false);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        
        Dimension screenSize = Toolkit.getDefaultToolkit().getScreenSize();
//        frame.setLocation((screenSize.width-frame.getWidth())/2, (screenSize.height-frame.getHeight())/2);
        frame.setLocation(0, 0);

        frame.setVisible(true);
        
        marioComponent.start();
//        frame.addKeyListener(marioComponent);
//        frame.addFocusListener(marioComponent);
    }
}