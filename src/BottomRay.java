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
public class BottomRay {
    static int[] rays = new int[GameUtil.RAY_MAX * 2];
    int x, y;
    boolean isPlace = true;
    void newRay() {
        for (int i = 0; i < GameUtil.RAY_MAX * 2; i = i + 2) {
            x = (int) (Math.random() * GameUtil.MAP_W + 1);
            y = (int) (Math.random() * GameUtil.MAP_H + 1);
            for (int j = 0; j < i; j = j + 2) {
                if (x == rays[j] && y == rays[j + 1]) {
                    i = i - 2;
                    isPlace = false;
                    break;
                }
            }
            if (isPlace) {
                rays[i] = x;
                rays[i + 1] = y;
            }
            isPlace = true;
        }
        for (int i = 0; i < GameUtil.RAY_MAX * 2; i = i + 2) {
            GameUtil.DATA_BOTTOM[rays[i]][rays[i + 1]] = -1;
        }
    }
}
