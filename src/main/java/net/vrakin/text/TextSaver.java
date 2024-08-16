package net.vrakin.text;

import java.io.File;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.Objects;

public class TextSaver {

    private TextTransformer textTransformer;

    private File file;

    public void saveTextToFile(String text) {
        String newText = textTransformer.transform(text);

        try(PrintWriter out = new PrintWriter(file)) {
            out.println(newText);
        }catch (IOException e) {
            e.printStackTrace();
        }
        System.out.printf("saved %s to %s is successfully%n"
                , newText
                , file.getAbsolutePath());
    }

    public TextTransformer getTextTransformer() {
        return textTransformer;
    }

    public void setTextTransformer(TextTransformer textTransformer) {
        this.textTransformer = textTransformer;
    }

    public File getFile() {
        return file;
    }

    public void setFile(File file) {
        this.file = file;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        TextSaver textSaver = (TextSaver) o;
        return Objects.equals(textTransformer, textSaver.textTransformer) && Objects.equals(file, textSaver.file);
    }

    @Override
    public int hashCode() {
        return Objects.hash(textTransformer, file);
    }

    @Override
    public String toString() {
        return "TextSaver{" +
                "textTransformer=" + textTransformer +
                ", file=" + file +
                '}';
    }
}
