package gui;

import constants.Constants;

import javax.swing.*;
import java.awt.*;
import java.util.HashSet;
import java.util.Set;

public class Board extends JPanel {

    private static final long serialVersionUID = 1L;
    private Cell[] cells;
    private Set<Integer> cellsToDie = new HashSet<>();
    private Set<Integer> cellsToBorn = new HashSet<>();
    private int countLiveNeighbours = 0;
    private TimePanel timePanel;

    public Board(TimePanel timePanel){
        this.timePanel = timePanel;

        initializeLayout();
        paintBoard();
    }

    private void initializeLayout() {
        cells = new Cell[Constants.NUMBER_OF_ROWS*Constants.NUMBER_OF_COLUMNS];
        GridLayout gridLayout = new GridLayout(Constants.NUMBER_OF_ROWS, Constants.NUMBER_OF_COLUMNS);
        setLayout(gridLayout);
    }



}
