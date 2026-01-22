///////////////////////////////////////////////////
//Monster
///////////////////////////////////////////////////
package com.zetcode.sprite;



import javax.swing.ImageIcon;

import com.zetcode.Commons;

public class Monster extends Sprite {

    public Monster(int x, int y) {
        initMonster(x, y);
    }

    private void initMonster(int x, int y) {
        this.x = x;
        this.y = y;

        var monsterImg = "image/skull.png"; // Adjust this path according to your image
        var ii = new ImageIcon(monsterImg);

        setImage(ii.getImage());
    }

     public void act() {
        x += dx;
        // Move down if at the bottom or when reaching the edges
        if (x >= Commons.BOARD_WIDTH - Commons.BORDER_RIGHT && dx != -2) {
            dx = -2;
            y += Commons.GO_DOWN;
        }

        if (x <= Commons.BORDER_LEFT && dx != 2) {
            dx = 2;
            y += Commons.GO_DOWN;
        }
    }
    
}
