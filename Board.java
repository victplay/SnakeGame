
import java.awt.Color;
import java.awt.Dimension;
import java.awt.Graphics;
import javax.swing.JPanel;


public class Board extends JPanel {

    private int boardWidth;
    private int boardHeight;
    private final int tileSize = 25;

    public Board(int boardWidth, int boardHeight){

        this.boardWidth = boardWidth;
        this.boardHeight = boardHeight;
    }

    @Override
    public void paintComponent(Graphics g){
        
        super.paintComponent(g);
        setPreferredSize(new Dimension(this.boardWidth, this.boardHeight));
        setBackground(Color.black);
    }
}
