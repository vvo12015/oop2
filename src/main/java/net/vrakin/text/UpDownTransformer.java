package net.vrakin.text;

public class UpDownTransformer extends TextTransformer {

    @Override
    public String transform(String text) {
        StringBuilder sb = new StringBuilder();

        for (int i = 0; i < text.length(); i++) {
            String c = text.substring(i, i + 1);
            if (i%2 == 0) {
                sb.insert(i, c.toUpperCase());
            }else {
                sb.insert(i, c);
            }
        }

        return sb.toString();
    }
}
