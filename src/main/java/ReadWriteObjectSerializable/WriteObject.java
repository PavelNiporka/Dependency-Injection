package ReadWriteObjectSerializable;

import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;

public class WriteObject {

    public static void main(String[] args) {

        Person person1 = new Person(1, "Bob");
        //ReadWriteObject.Person person2 = new ReadWriteObject.Person(2, "Mike");
        //   ReadWriteObject.Person[] people = {new ReadWriteObject.Person(1, "Bob"), new ReadWriteObject.Person(2, "Mike"), new ReadWriteObject.Person(3, "Tom")};

        try (ObjectOutputStream oos = new ObjectOutputStream(new FileOutputStream("people.bin"))) {
            //  FileOutputStream fos = new FileOutputStream("people.bin");
            //  ObjectOutputStream oos = new ObjectOutputStream((fos));

            //  oos.writeObject(person1);
            // oos.writeObject(person2);
            //  oos.close();
            // oos.writeInt(people.length);
            // for (ReadWriteObject.Person person : people) {
            //      oos.writeObject(person);
            //   }
            oos.writeObject(person1);
            //  fos.close();

        } catch (IOException e) {
            e.printStackTrace();
        }

    }
}
