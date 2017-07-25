import java.io.*;
class MultipleException {
 public static void main (String s []) {
     try {
          file = new FileInputStream(fileName);
          x = (byte) file.read();
          }
     catch(IOException i) {
      i.printStackTrace();
       return -1;
      }
     catch(FileNotFoundException f) { 
     f.printStackTrace();
      return -1;
      }
    }
  }