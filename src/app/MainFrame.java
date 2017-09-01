package app;

import callbacks.ButtonListener;
import constants.Constants;
import gui.Board;
import gui.TimePanel;
import gui.Toolbar;

import javax.swing.*;
import java.awt.*;
import java.util.concurrent.ExecutorService;

public class MainFrame extends JFrame implements ButtonListener{

    private static final long serialVersionUID = 1L;
    private Board board;
    private Toolbar toolbar;
    private TimePanel timePanel;
    private ExecutorService executor;

    public MainFrame(){
        super(Constants.APPLICATION_NAME);
        initializeMenu();
        initializeMainLayout();
    }

    private void initializeMainLayout() {
        toolbar = new Toolbar();
        timePanel = new TimePanel();
        board = new Board(timePanel);

        toolbar.setButtonListener(this);

        add(board, BorderLayout.CENTER);

    }


    @Override
    public void startClicked() {

    }

    @Override
    public void restartClicked() {

    }
}
