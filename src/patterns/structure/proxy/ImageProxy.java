package patterns.structure.proxy;

public class ImageProxy implements  Image {

    private HighResolutionImage highResolutionImage;


    public ImageProxy(HighResolutionImage highResolutionImage) {
        this.highResolutionImage = highResolutionImage;
    }

    @Override
    public void showImage() {

        if (!highResolutionImage.isLoad()) {

            try{

                System.out.println("temp image"+highResolutionImage.getHeight()+" "+highResolutionImage.getWidth());
                Thread.sleep(3000L);

            }catch (Exception e){
                e.printStackTrace();
            }

           highResolutionImage.showImage();

        }

    }
}
