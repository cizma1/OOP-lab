package Week13.task3;

interface TextFormatter{
    String formatText(String text);
}

class UpperCaseFormatter implements TextFormatter{
    @Override
    public String formatText(String text){
        return text.toUpperCase();
    }
}

class LowerCaseFormatter implements TextFormatter{
    @Override
    public String formatText(String text){
        return text.toLowerCase();
    }
}

class CamelCaseFormatter implements TextFormatter{
    @Override
    public String formatText(String text){
        String[] words=text.split(" ");
        StringBuilder result=new StringBuilder();
        for(String word : words){
            result.append(word.substring(0, 1).toUpperCase())
                    .append(word.substring(1).toLowerCase())
                    .append(" ");
        }
        return result.toString().trim();
    }
}

class TextEditor{
    private TextFormatter textFormatter;

    public void setFormatter(TextFormatter textFormatter) {
        this.textFormatter = textFormatter;
    }

    public String formatText(String text){
        if(textFormatter==null){
            throw new IllegalStateException("Text formatter not set.");
        }
        return textFormatter.formatText(text);
    }
}
public class Start {
    public static void main(String[] args) {
        TextEditor textEditor=new TextEditor();

        textEditor.setFormatter(new UpperCaseFormatter());
        System.out.println(textEditor.formatText("This is a Sample Text"));

        textEditor.setFormatter(new LowerCaseFormatter());
        System.out.println(textEditor.formatText("This is a Sample Text"));

        textEditor.setFormatter(new CamelCaseFormatter());
        System.out.println(textEditor.formatText("This is a Sample Text"));
    }
}
