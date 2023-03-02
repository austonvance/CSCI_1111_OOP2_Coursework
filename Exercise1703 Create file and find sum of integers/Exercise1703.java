import java.io.*;

public class Exercise1703 {
  public static void main(String[] args) throws IOException {
    
      // Get the file for this exercise
      File file = new File("Exercise17_03.dat");
    
      // if file doesn't exist create the file and write a random number of integers
      if (!file.exists() || true) {
        try (DataOutputStream out =
              new DataOutputStream(new BufferedOutputStream(new FileOutputStream(file)))) {
                
          int random = (int) (Math.random() * 200);
                
          for (int i = 0; i < random; i++) {
            out.writeInt((int)(Math.random() * 200));
          }
        }
      }
    
      // Read the file and display the sum
      try (DataInputStream input = new DataInputStream(new BufferedInputStream(new FileInputStream(file)))) {
        
        int sum = 0;
        int count = input.available() / 4;
        System.out.println(count);
        while (count > 0) {
          sum += input.readInt();
          count--;
        }
        System.out.println("The sum is " + sum);
      }
    
    
    }
  }