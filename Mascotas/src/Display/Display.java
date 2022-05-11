package Display;

import Animals.*;
import ImageHandler.ImageHandler;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Display extends JFrame implements ActionListener {
    JPanel jpanel;
    JButton playButton;
    JButton healButton;
    JButton feedButton;
    JButton sleepButton;
    ImageHandler imgHandler = new ImageHandler();
    JEditorPane editorPane = new JEditorPane();

    JLabel FunnyPercentageLabel;
    JLabel hungerPercentageLabel;
    JLabel energyPercentageLabel;
    JLabel sicknessPercentageLabel;
    JLabel lifetimePercentageLabel;
    private final String panelTitle = "Pet simulator";
    private final int width = 1280, height = 720;
    private final int buttonWidth = 200, buttonHeight = 50;
    private String imageRoute;
    private boolean playButtonPressed = false;
    private boolean healButtonPressed = false;
    private boolean feedButtonPressed = false;
    private boolean sleepButtonPressed = false;

    Animal base;
    public Display(Hamster hamster){
        this.imageRoute = hamster.getImageRoute();
        base = (Hamster)hamster;
        initializePanel();
        initializeScreen();
    }

    private void initializeButtons(){
        playButton = new JButton("Play");
        playButton.setBounds(40, 460, this.buttonWidth, this.buttonHeight);
        add(playButton);
        playButton.addActionListener(this);

        healButton = new JButton("Heal");
        healButton.setBounds(40, 520, this.buttonWidth, this.buttonHeight);
        add(healButton);
        healButton.addActionListener(this);

        feedButton = new JButton("Feed");
        feedButton.setBounds(280, 460, this.buttonWidth, this.buttonHeight);
        add(feedButton);
        feedButton.addActionListener(this);

        sleepButton = new JButton("Sleep");
        sleepButton.setBounds(280, 520, this.buttonWidth, this.buttonHeight);
        add(sleepButton);
        sleepButton.addActionListener(this);
    }

    private void initializeEditorPane1(){
        editorPane.setContentType("text/html");
        editorPane.setText(
                "<font face='bell mt' color = 'yellow' size = '150'> Fun: " +
                        base.getFunPercentage() +" % </font><br>" +
                "<font face='bell mt' color = 'black' size = '150'> Energy: " +
                        base.getEnergyPercentage() +" % </font><br>" +
                "<font face='bell mt' color = 'green' size = '150'> Hunger: " +
                        base.getHungerPercentage() +" %</font><br>" +
                "<font face='bell mt' color = 'yellow' size = '150'> Sickness: " +
                        base.getSicknessPercentage() +" %</font><br>" +
                "<font face='bell mt' color = 'black' size = '150'> Lifetime: " +
                        base.getLifetimePercentage() +" %</font><br>"
        );
        editorPane.setEditable(false);
        JScrollPane scrollPane = new JScrollPane(editorPane);
        scrollPane.setBounds(800, 200, 300, 270);
        add(scrollPane);
    }

    private void initializeEditorPane2(){
        JEditorPane editorPane = new JEditorPane();
        editorPane.setContentType("text/html");
        editorPane.setText(
                "<font face = 'Harrington' color = 'black' size = '80'>"+base.getName()+"</font>"
        );
        editorPane.setEditable(false);
        JScrollPane scrollPane = new JScrollPane(editorPane);
        scrollPane.setBounds(40, 10, 500, 70);
        add(scrollPane);
    }

    private void initializePanel(){
        initializeButtons();
        initializeEditorPane1();
        initializeEditorPane2();
        jpanel = new JPanel();
        add(jpanel);
        jpanel.setPreferredSize(new Dimension(this.width, this.height));
    }

    private void initializeScreen() {
        setTitle(this.panelTitle);
        setSize(this.width, this.height);
        setResizable(false);
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        setVisible(true);
    }

    public void actionPerformed(ActionEvent event){
        if(event.getSource() == playButton){
            base.play();
        } else if (event.getSource() == healButton){
            base.heal();
        } else if(event.getSource() == feedButton){
            base.eat();
        } else if(event.getSource() == sleepButton){
            base.sleep();
        }
        this.imageRoute = imgHandler.setImage(base);
        remove(jpanel);
        add(jpanel);
        revalidate();
        repaint();
        editorPane.setText(
                "<font face='bell mt' color = 'yellow' size = '150'> Fun: " + base.getFunPercentage() +" % </font><br>" +
                "<font face='bell mt' color = 'black' size = '150'> Energy: " + base.getEnergyPercentage() +" % </font><br>" +
                "<font face='bell mt' color = 'green' size = '150'> Hunger: " + base.getHungerPercentage() +" %</font><br>" +
                "<font face='bell mt' color = 'yellow' size = '150'> Sickness: " + base.getSicknessPercentage() +" %</font><br>" +
                "<font face='bell mt' color = 'black' size = '150'> Lifetime: " + base.getLifetimePercentage() +" %</font><br>"
        );
    }

    @Override
    public void paint(Graphics graphics){
        super.paint(graphics);

        Graphics2D graphics2D = (Graphics2D) graphics;

        Toolkit toolkit = Toolkit.getDefaultToolkit();
        Image image = toolkit.getImage(this.imageRoute);
        graphics2D.drawImage(image, 40, 150, Animal.imageResolution, Animal.imageResolution, this);
    }
}
