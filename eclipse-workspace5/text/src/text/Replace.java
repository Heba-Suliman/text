package text;

public class Replace {

	public String cleanText(String text) {
        //clean text
        String result = text.replaceAll("[\"()\n]", " ");

        //remove multiple spaces beginning and end
        result = result.trim();

        //remove multiple spaces within the string
        result = result.replaceAll("( )+", " ");

        return result;
    }
}