package StyleInterfaces;

import java.awt.*;

public interface CustomWindow {
    Toolkit toolkit = Toolkit.getDefaultToolkit();
    Dimension dimension = toolkit.getScreenSize();
    int FULL_HEIGHT = dimension.height-100;
    int FULL_WIDTH = dimension.width;
    int HALF_HEIGHT = dimension.height/2;
    int HALF_WIDTH = dimension.width/2;
    int QUARTER_HEIGHT = dimension.height/4;
    int QUARTER_WIDTH = dimension.width/4;
    int TOOLBAR_HEIGHT = 100;
    int TOOLBAR_WIDTH = FULL_WIDTH;
    Dimension FULL_SCREEN = new Dimension(dimension.width,dimension.height-120);
    Dimension HALF_SCREEN = new Dimension(dimension.width/2,dimension.height/2);
    Dimension QUARTER_SCREEN = new Dimension(dimension.width/4,dimension.height/4);
    Dimension H800W1200 = new Dimension(1200,800);
    Dimension H1200W800 = new Dimension(800,1200);
    Dimension H600W800 = new Dimension(800,600);
    Dimension H600W1000 = new Dimension(1000,600);
    Dimension H400W800 = new Dimension(800,400);
    Dimension H400W600 = new Dimension(600,400);
    Dimension H350W550 = new Dimension(550,350);
    Dimension H500W550 = new Dimension(550,500);
    Dimension H250W450 = new Dimension(450,250);
    Dimension H300W300 = new Dimension(300,300);
    Dimension H400W400 = new Dimension(400,400);
    Dimension H500W400 = new Dimension(400,500);
    Dimension H450W350 = new Dimension(350,450);
    default Rectangle BOUNDS(int width, int height){
        return new Rectangle(dimension.width/2-width/2,dimension.height/2-height/2,width,height);
    }
    default GridBagConstraints GRID_BAG_CONSTRAINTS(int x_position, int y_position){
        GridBagConstraints gbc = new GridBagConstraints();
        gbc.gridx = x_position;
        gbc.gridy = y_position;
        gbc.insets = new Insets(2,2,2,2);
        return gbc;
    }
}
