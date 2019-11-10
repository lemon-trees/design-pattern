package patterns.structure.proxy;

import java.net.URL;

public class HighResolutionImage implements Image {


    private URL url;
    private Long startTime;

    private int height;
    private int width;

    public HighResolutionImage(URL url) {
        this.url = url;
        this.startTime = System.currentTimeMillis();
        this.height=600;
        this.width=600;
    }

    public boolean isLoad(){
        long endTime = System.currentTimeMillis();
        return endTime -startTime > 3000;

    }

    @Override
    public void showImage() {

        System.out.println("real image:"+url);

    }

    public int getHeight() {
        return height;
    }

    public int getWidth() {
        return width;
    }
}
