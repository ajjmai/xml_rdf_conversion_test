public class CustomFunctions {
  public static String parsePointLat(String s) {
    return s.replace("POINT ", "").replace('(', ' ').replace(')', ' ').trim().split("\\s+")[0];
  }
}