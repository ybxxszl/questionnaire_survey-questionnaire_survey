package com.tool;

import java.awt.Color;
import java.awt.Font;
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.image.BufferedImage;
import java.io.IOException;
import java.util.Random;

import javax.imageio.ImageIO;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class CodeControl {
	
	@RequestMapping(value = "/changeCode")
	public void changeCode(HttpServletRequest request, HttpServletResponse response, HttpSession session, Model model) {
		
		System.out.println("迟来的验证码。。。");
		
		// 使用java图形界面技术绘制一张图片
		int charNum = 4;
		int width = 30 * 4;
		int height = 30;

		// 1. 创建一张内存图片
		BufferedImage bufferedImage = new BufferedImage(width, height, BufferedImage.TYPE_INT_RGB);

		// 2.获得绘图对象   awt
		Graphics graphics = bufferedImage.getGraphics();

		// 3、绘制背景颜色
		graphics.setColor(Color.WHITE);
		graphics.fillRect(0, 0, width, height);

		// 4、绘制图片边框
		graphics.setColor(Color.BLACK);
		graphics.drawRect(0, 0, width - 1, height - 1);

		// 5、输出验证码内容
		graphics.setColor(Color.BLACK);//字体颜色
		graphics.setFont(new Font("宋体", Font.BOLD, 20));//字体

		// 随机输出4个字符
		Graphics2D graphics2d = (Graphics2D) graphics;
		String s = "ABCDEFGHGKLMNPQRSTUVWXYZ23456789";//验证码的内容
		Random random = new Random();

		String msg = "";
		int x = 5;
		for (int i = 0; i < charNum; i++) {
			int index = random.nextInt(32);
			String content = String.valueOf(s.charAt(index));
			msg += content;
			
			double theta = random.nextInt(45) * Math.PI / 180;
			// 让字体扭曲
			graphics2d.rotate(theta, x, 18);
			//内容
			graphics2d.drawString(content, x, 18);
			graphics2d.rotate(-theta, x, 18);
			
			x += 30;
		}

		//生成了验证码  msg
		//HttpSession session = request.getSession();//创建一个session
		session.setAttribute("code", msg);
		System.out.println("输入验证码：" + msg);

		// 6、绘制干扰线
		graphics.setColor(Color.GRAY);
		for (int i = 0; i < 5; i++) {
			int x1 = random.nextInt(width);
			int x2 = random.nextInt(width);
			int y1 = random.nextInt(height);
			int y2 = random.nextInt(height);
			graphics.drawLine(x1, y1, x2, y2);
		}

		// 释放资源
		graphics.dispose();

		// 图片输出 ImageIO
		try {
			
			ImageIO.write(bufferedImage, "jpg", response.getOutputStream());
			
		} catch (IOException e) {
			// TODO Auto-generated catch block
			System.out.println("IO异常");
			e.printStackTrace();
		}
		
	}

}
