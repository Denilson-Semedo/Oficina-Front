/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package MenuContents;

import javax.swing.JPanel;

/**
 *
 * @author Denilson
 */
public class SwitchMenu {
    
    private JPanel container;
    private JPanel content;

    /**
     * Constructor
     */
    public SwitchMenu(JPanel container, JPanel content) {
        this.container = container;
        this.content = content;
        this.container.removeAll();
        this.container.revalidate();
        this.container.repaint();
        
        this.container.add(this.content);
        this.container.revalidate();
        this.container.repaint();
    }

}
