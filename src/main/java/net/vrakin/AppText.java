package net.vrakin;

import net.vrakin.animal.Cat;
import net.vrakin.animal.Dog;
import net.vrakin.animal.Veterinarian;
import net.vrakin.text.InverseTransformer;
import net.vrakin.text.TextSaver;
import net.vrakin.text.TextTransformer;
import net.vrakin.text.UpDownTransformer;

import java.io.File;

/**
 * Hello world!
 *
 */
public class AppText
{
    public static void main( String[] args )
    {
        TextSaver ts = new TextSaver();

        TextTransformer tt = new TextTransformer();
        File fileForTextTransform = new File("transform.txt");

        ts.setFile(fileForTextTransform);
        ts.setTextTransformer(tt);
        ts.saveTextToFile("hello");

        InverseTransformer it = new InverseTransformer();
        File fileForInverseText = new File("inverseText.txt");

        ts.setFile(fileForInverseText);
        ts.setTextTransformer(it);
        ts.saveTextToFile("hello");

        UpDownTransformer ut = new UpDownTransformer();
        File fileForUpDownText = new File("upDownText.txt");

        ts.setFile(fileForUpDownText);
        ts.setTextTransformer(ut);
        ts.saveTextToFile("hello");
    }
}
