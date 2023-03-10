package classes;

/**
 * This class contains class (static) methods
 * that will help you test the Picture class 
 * methods.  Uncomment the methods and the code
 * in the main to test.
 * 
 * @author Barbara Ericson 
 */
public class PictureTester
{
  /** Method to test zeroBlue */
  public static void testZeroBlue()
  {
    Picture beach = new Picture("beach.jpg");
    beach.explore();
    beach.zeroBlue();
    beach.explore();
  }
  
  public static void testKeepOnlyBlue() {
      Picture beach = new Picture("beach.jpg");
      beach.explore();
      beach.keepOnlyBlue();
      beach.explore();
  }
  
  public static void testGetCountGreenOverValue() {
      Picture beach = new Picture("beach.jpg");
      beach.explore();
      beach.getCountGreenOverValue(100);
      beach.explore();
  }
  
  public static void testNegate() {
      Picture beach = new Picture("beach.jpg");
      beach.explore();
      beach.negate();
      beach.explore();
  }
  
  public static void testGrayscale() {
      Picture beach = new Picture("beach.jpg");
      beach.explore();
      beach.grayscale();
      beach.explore();
  }
  
  public static void testFixUnderwater() {
      Picture water = new Picture("water.jpg");
      water.explore();
      water.fixUnderwater();
      water.explore();
  }
  
  /** Method to test mirrorVertical */
  public static void testMirrorVertical()
  {
    Picture caterpillar = new Picture("caterpillar.jpg");
    caterpillar.explore();
    caterpillar.mirrorVertical();
    caterpillar.explore();
  }
  
  public static void testMirrorVerticalRightToLeft() {
      Picture huu = new Picture("huu.jpg");
      huu.explore();
      huu.mirrorVerticalRightToLeft();
      huu.explore();
  }
  
  public static void testMirrorHorizontal() {
      Picture huu = new Picture("huu.jpg");
      huu.explore();
      huu.mirrorHorizontal();
      huu.explore();
  }
  
  public static void testMirrorHorizontalBottomToTop() {
      Picture huu = new Picture("huu.jpg");
      huu.explore();
      huu.mirrorHorizontalBottomToTop();
      huu.explore();
  }
  
  public static void testMirrorDiagonal() {
     Picture huu = new Picture("huu.jpg");
     huu.explore();
     huu.mirrorDiagonal();
     huu.explore();
  }
  
  /** Method to test mirrorTemple */
  public static void testMirrorTemple()
  {
    Picture temple = new Picture("temple.jpg");
    temple.explore();
    temple.mirrorTemple();
    temple.explore();
  }
  
  /** Method to test the collage method */
  public static void testCollage()
  {
    Picture canvas = new Picture("640x480.jpg");
    canvas.createCollage();
    canvas.explore();
  }
  
  /** Method to test edgeDetection */
  public static void testEdgeDetection()
  {
    Picture swan = new Picture("swan.jpg");
    swan.edgeDetection(10);
    swan.explore();
  }
  
  /** Main method for testing.  Every class can have a main
    * method in Java */
  public static void main(String[] args)
  {
    // uncomment a call here to run a test
    // and comment out the ones you don't want
    // to run
    testZeroBlue();
    testKeepOnlyBlue();
    testGetCountGreenOverValue();
    //testKeepOnlyRed();
    //testKeepOnlyGreen();
    testNegate();
    testGrayscale();
    testFixUnderwater();
    testMirrorVertical();
    testMirrorVerticalRightToLeft();
    testMirrorHorizontal();
    testMirrorHorizontalBottomToTop();
    testMirrorDiagonal();
    //testMirrorTemple();
    //testMirrorArms();
    //testMirrorGull();
    //testMirrorDiagonal();
    //testCollage();
    //testCopy();
    //testEdgeDetection();
    //testEdgeDetection2();
    //testChromakey();
    //testEncodeAndDecode();
    //testGetCountRedOverValue(250);
    //testSetRedToHalfValueInTopHalf();
    //testClearBlueOverValue(200);
    //testGetAverageForColumn(0);
  }
}