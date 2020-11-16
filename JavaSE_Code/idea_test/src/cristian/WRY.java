package cristian;

import java.awt.image.BufferedImage;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;

import javax.imageio.ImageIO;

/**
 * @author 东哥 2016年10月27日
 *
 */
public class WRY {

    /**
     * @param path
     *            图片路径
     */
    public static void createAsciiPic(final String path) {
        //final String base = "\"@#&$%*o!;.";// 字符串由复杂到简单
        final String base = "#8XOHLTI)i=+;:,. ";// 字符串由复杂到简单
        try {
            final BufferedImage image = ImageIO.read(new File("D:qqq.jpg"));  //读取图片
            //输出到指定文件中
            final BufferedWriter fos = new BufferedWriter(new FileWriter("D:qqq.txt",false));   //true表示是否追加
            for (int y = 0; y < image.getHeight(); y += 2) {
                for (int x = 0; x < image.getWidth(); x++) {
                    final int pixel = image.getRGB(x, y);
                    final int r = (pixel & 0xff0000) >> 16, g = (pixel & 0xff00) >> 8, b = pixel & 0xff;
                    final float gray = 0.199f * r + 0.378f * g + 0.014f * b;
                    final int index = Math.round(gray * (base.length() + 1) / 255);
                    String s = index >= base.length() ? " " : String.valueOf(base.charAt(index));
                    System.out.print(s);
                    fos.write(s);
                }
                fos.newLine();
                System.out.println();
            }
            fos.close();
        } catch (final IOException e) {
            e.printStackTrace();
        }
    }

    /**
     * test
     *
     * @param args
     */
    public static void main(final String[] args) {
        WRY.createAsciiPic("D:\\qqq.jpg");
    }

}