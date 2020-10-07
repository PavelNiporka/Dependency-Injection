package ReadWriteObjectSerializable;

import java.io.FileInputStream;
import java.io.IOException;
import java.io.ObjectInputStream;

public class ReadObject {
    public static void main(String[] args) {

        try (ObjectInputStream ois = new ObjectInputStream(new FileInputStream("people.bin"))) {
           // FileInputStream fis = new FileInputStream("people.bin");
           // ObjectInputStream ois = new ObjectInputStream(fis);

            Person person1 = (Person) ois.readObject();
            //  ReadWriteObject.Person person2 = (ReadWriteObject.Person) ois.readObject();
            //    int personCount = ois.readInt();
            //    ReadWriteObject.Person[] people = new ReadWriteObject.Person[personCount];
            //    for (int i = 0; i < personCount; i++) {
            //        people[i] = (ReadWriteObject.Person) ois.readObject();
            //     }
            //  ReadWriteObject.Person[] people = (ReadWriteObject.Person[]) ois.readObject();
            //  ois.readObject(person1);
            System.out.println(person1);
           // ois.close();
            //  System.out.println(person1);
            //  System.out.println(person2);

        } catch (IOException e) {
            e.printStackTrace();
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        }

    }

}
