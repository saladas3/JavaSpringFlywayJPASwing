package com.example.demo;

import com.example.demo.services.CharacteristicsService;
import com.example.demo.services.PlantsService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import javax.swing.*;
import java.awt.*;

@Component
public class MainMenu {

    private PlantsService plantsService;
    private CharacteristicsService characteristicsService;

    @Autowired
    public MainMenu(PlantsService plantsService, CharacteristicsService characteristicsService) {
        this.plantsService = plantsService;
        this.characteristicsService = characteristicsService;
        initFrame();
    }

    private void initFrame() {
        //TODO: DELETE THIS
        System.out.println(plantsService.plantsToString());
        System.out.println(characteristicsService.characteristicsToString());
        System.out.println(plantsService.getPlant(1));

        JFrame frame = new JFrame("PAI 2020");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setSize(400, 400);

        JMenuBar menuBar = AddMenuBar();

        JPanel mainPanel = new JPanel();
        mainPanel.setLayout(new GridLayout(4, 1));

        JButton StartQuizButton = new JButton("Start Quiz");
        JButton DatabaseButton = new JButton("Change Database");
        JButton AboutButton = new JButton("About");
        JButton ExitButton = new JButton("Close");

        mainPanel.add(StartQuizButton);
        mainPanel.add(DatabaseButton);
        mainPanel.add(AboutButton);
        mainPanel.add(ExitButton);

        frame.getContentPane().add(BorderLayout.NORTH, menuBar);
        frame.getContentPane().add(BorderLayout.CENTER, mainPanel);

        frame.setVisible(true);
    }

    private JMenuBar AddMenuBar() {
        JMenuBar mb = new JMenuBar();

        JMenu m1 = new JMenu("File");
        JMenu m2 = new JMenu("Help");
        mb.add(m1);
        mb.add(m2);

        JMenuItem m11 = new JMenuItem("Open");
        JMenuItem m22 = new JMenuItem("Save as");
        m1.add(m11);
        m1.add(m22);

        return mb;
    }

}
