/*
 * @Description: 
 * @Logo:                                                               ▄   ▄
 * ░██████╗██╗░░██╗░█████╗░░██╗░░░░░░░██╗███╗░░██╗  ░█████╗░░█████╗░██╗ █▀█▀█
 * ██╔════╝██║░░██║██╔══██╗░██║░░██╗░░██║████╗░██║  ██╔══██╗██╔══██╗██║ █▄█▄█
 * ╚█████╗░███████║███████║░╚██╗████╗██╔╝██╔██╗██║  ██║░░╚═╝███████║██║ ███  ▄▄
 * ░╚═══██╗██╔══██║██╔══██║░░████╔═████║░██║╚████║  ██║░░██╗██╔══██║██║ ████▐█ █
 * ██████╔╝██║░░██║██║░░██║░░╚██╔╝░╚██╔╝░██║░╚███║  ╚█████╔╝██║░░██║██║ ████   █
 * ╚═════╝░╚═╝░░╚═╝╚═╝░░╚═╝░░░╚═╝░░░╚═╝░░╚═╝░░╚══╝  ░╚════╝░╚═╝░░╚═╝╚═╝ ▀▀▀▀▀▀▀
 * @Author: Shawn C
 * Copyright (c) 2022 by Shawn C., All Rights Reserved. 
 */
import java.awt.*;
public class GameUtil {
    static int RAY_MAX = 100;
    static int MAP_W = 36;
    static int MAP_H = 17;
    static int OFFSET = 45;
    static int SQUARE_LENGTH = 50;
    static int FLAG_NUM = 0;
    static int MOUSE_X;
    static int MOUSE_Y;
    static boolean LEFT = false;
    static boolean RIGHT = false;
    static int state = 3;
    static int level;
    static long START_TIME;
    static long END_TIME;
    static int[][] DATA_BOTTOM = new int[MAP_W + 2][MAP_H + 2];
    static int[][] DATA_TOP = new int[MAP_W + 2][MAP_H + 2];
    static Image lei = Toolkit.getDefaultToolkit().getImage("img/lei.png");
    static Image top = Toolkit.getDefaultToolkit().getImage("img/top.gif");
    static Image flag = Toolkit.getDefaultToolkit().getImage("img/flag.gif");
    static Image noflag = Toolkit.getDefaultToolkit().getImage("img/noflag.png");
    static Image face = Toolkit.getDefaultToolkit().getImage("img/face.png");
    static Image over = Toolkit.getDefaultToolkit().getImage("img/over.png");
    static Image win = Toolkit.getDefaultToolkit().getImage("img/win.png");
    static Image[] images = new Image[9];
    static {
        for (int i = 1; i <= 8; i++) {
            images[i] = Toolkit.getDefaultToolkit().getImage("img/num/" + i + ".png");
        }
    }
    static void drawWord(Graphics g, String str, int x, int y, int size, Color color) {
        g.setColor(color);
        g.setFont(new Font("Cursive", Font.BOLD, size));
        g.drawString(str, x, y);
    }
}
