package gui;

import javax.swing.*;

public class Cell extends JPanel {

    private boolean alive = false;
    private int id;

    public Cell(){

    }

    private void initializeListener(){

    }

    private void initializeLayout(){

    }

    public boolean isAlive(){
        return alive;
    }

    public void setAlive(boolean alive){
        this.alive = alive;
    }

    @Override
    public String toString() {
        return "Cell" + id;
    }
}
