package ReadAgain.设计模式.结构型.Proxy;

import java.net.URL;

public class HighResolutionImage implements Image {
    private URL imageURL;
    private long startTime;private int height;
    private int width;
    public int getHeight() {
        return height;
    }
    public int getWidth() {
        return width;
    }
    public HighResolutionImage(URL imageURL) {
        this.imageURL = imageURL;
        this.startTime = System.currentTimeMillis();
        this.width = 600;
        this.height = 600;
    }
    public boolean isLoad() {
// 模拟图片加载，延迟 3s 加载完成
        long endTime = System.currentTimeMillis();
        return endTime - startTime > 3000;
    }
    @Override
    public void showImage() {
        System.out.println("Real Image: " + imageURL);
    }
}
