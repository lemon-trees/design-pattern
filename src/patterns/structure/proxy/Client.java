package patterns.structure.proxy;

import java.net.URL;

/**
 * 代理模式
 */
public class Client {

    public static void main(String[] args)  throws Exception{


        String urlStr="www.image.com";
        URL url = new URL(urlStr);
        HighResolutionImage highResolutionImage = new HighResolutionImage(url);
        ImageProxy imageProxy = new ImageProxy(highResolutionImage);
        imageProxy.showImage();


    }

}
