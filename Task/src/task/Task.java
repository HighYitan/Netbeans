/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package task;

import javax.swing.JFrame;

/**
 *
 * @author dam2a10
 */
public class Task extends JFrame{
    private Viewer viewer;
    private ControlPanel controlPanel;
    //private MyBufferedImage image;
    Task(String title){
        super(title);
        setSize(1000,600);
        <
    }
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Task task = new Task("Hola amigos");
    }
    
}
