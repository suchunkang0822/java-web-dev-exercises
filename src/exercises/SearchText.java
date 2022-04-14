package exercises;

public class SearchText {
    public static boolean search(String text,String search){
        String[] array = text.toLowerCase().split(" ");
        String search_lc = search.toLowerCase();
        for(int i = 0; i<array.length; i++){
            if(search_lc.equals(array[i])){
                return true;
            }
        }
        System.out.println(array[14].length());
        return false;
    }
    public static void remove(String text, String word){
        String[] array = text.split(" ");
        int l = word.length();
        int index = 0;
        for(int i = 0; i<array.length; i++){
            index += array[i].length();
            if(word.equals(array[i])){
                System.out.println("The index is " + (index+i-l) +" it's length is "+l);
                System.out.println(text.substring(0,index+i-l)+text.substring(index+i+1));
            }
        }
        System.out.println("The text does not contain "+word);
    }
    public static void main(String[] args) {
        String text = "Alice was beginning to get very tired " +
                "of sitting by her sister on the bank, and of having nothing " +
                "to do: once or twice she had peeped into the book her sister was " +
                "reading, but it had no pictures or conversations in it, 'and what is " +
                "the use of a book,' thought Alice 'without pictures or conversation?'";

        System.out.println(text.substring(0,6)+text.substring(10));
        remove(text,"was");

    }
}
