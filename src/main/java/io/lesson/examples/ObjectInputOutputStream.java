package io.lesson.examples;

import java.io.*;

public class ObjectInputOutputStream {


    public static void main(String[] args) throws IOException, ClassNotFoundException {

        // Serialize
        ObjectOutputStream os = new ObjectOutputStream(new FileOutputStream("src/main/java/io/files/object.txt"));
        User user = new User();
        os.writeObject(user);

        // Deserialize
        ObjectInputStream in = new ObjectInputStream(new FileInputStream("src/main/java/io/files/object.txt"));
        User user1 = (User) in.readObject();

        System.out.println(user1.toString());


    }
}
