package com.zhnlk.snake.view;

import java.awt.Color;
import java.awt.Graphics;

import javax.swing.JPanel;

import com.zhnlk.snake.entities.Food;
import com.zhnlk.snake.entities.Ground;
import com.zhnlk.snake.entities.Snake;
import com.zhnlk.snake.util.Global;

public class GamePanel extends JPanel{
	
	private Snake snake;
	private Food food;
	private Ground ground;
	
	public void dispay(Snake snake,Food food,Ground ground){
//		System.out.println("GamePanel's dispaly");
		this.snake = snake;
		this.food = food;
		this.ground = ground;
		this.repaint();
	}

	@Override
	protected void paintComponent(Graphics g) {
		// TODO Auto-generated method stub
		//÷ÿ–¬œ‘ æ
		g.setColor(new Color(0xcfcfcf));
		g.fillRect(0, 0, Global.WIDTH * Global.CELL_SIZE, 
				Global.HEIGHT * Global.CELL_SIZE);
		
		if (ground != null && snake != null && food != null){
			this.ground.drawME(g);
			this.snake.drawMe(g);
			this.food.drawMe(g);
		}
	}

}
