package socialdistancing;
import java.awt.Graphics;

public class Walls {
    Wall[] walls;
    int addedWalls = 0;
    int numWalls;
    Building view;
    Walls(int numWalls, Building view) {
        this.numWalls = numWalls;
        walls = new Wall[this.numWalls];
        this.view = view;
    }
    
    public void add(Wall wall) {
        walls[addedWalls] = wall;
        addedWalls++;
    }
    
    public void paintWalls(Graphics g) {
        for (int i = 0; i < numWalls; i++) {
            g.drawImage(walls[i].getImage(), walls[i].getX(), walls[i].getY(), view);
        }
    }
    
    public boolean getVert(int i) {
        boolean result = walls[i].vertical;
        return result;
    }
    
    public int length() {
        return numWalls;
    }
}