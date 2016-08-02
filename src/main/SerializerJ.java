package main;

import java.io.*;

/**
 * Created by Ali on 8/2/2016.
 */
public class SerializerJ {
    public static byte[] serializer(Object obj) throws IOException {
        ByteArrayOutputStream byteOut = new ByteArrayOutputStream();
        ObjectOutputStream objOut = new ObjectOutputStream(byteOut);
        objOut.writeObject(obj);
        objOut.close();
        byteOut.close();
        return byteOut.toByteArray();
    }

    public static Object deserialize(byte[] data) throws IOException, ClassNotFoundException {
        ByteArrayInputStream in = new ByteArrayInputStream(data);
        ObjectInputStream is = new ObjectInputStream(in);
        return is.readObject();
    }
}