package Interviews;

// \n\n abcd \t erererf \t\n\n abc - 3 words, 2 lines, 14 characters
// no of words, no of characters and no of lines.
//
//
// abcd erererf
//
// abc
public class Project44Question {

    public static void main(String[] args) {
        Container container = countLineWordAndCharacters("\n\n abcd\terererf \t \n\n abc");
        System.out.println(container);
    }

    public static Container countLineWordAndCharacters(String s) {
        s = s.replace("\t", " ");
        String[] setString = s.split(" ");
//        for (String string:
//             setString) {
//            System.out.println("string:"+" "+string);
//        }

        // ["\n\n", "abcd", "ereref","","", "\n\n", "abc"];
        int wordCount = 0, lineCount = 0, charCount = 0;
        int noofCharactersInCurrentLine = 0;
        for(int i=0; i<setString.length;i++) {
            int count = 0;
            boolean isWord = false;
            // "\n", " " , 'b'
            while(count<setString[i].length()) {
                if(setString[i].charAt(count) == '\n') {
                    if(noofCharactersInCurrentLine>0) {
                        lineCount++;
                    }
                    noofCharactersInCurrentLine = 0;
                } else {
                    charCount++;
                    noofCharactersInCurrentLine++;
                    isWord = true;
                }
                count++;
            }
            if(isWord) {
                wordCount++;
            }
        }
        if(noofCharactersInCurrentLine>0) {
            lineCount++;
        }
        return new Container(lineCount, wordCount, charCount);
    }


    public static class Container {
        int lineCount;
        int wordCount;
        int characterCount;

        public Container(int lineCount, int wordCount, int characterCount) {
            this.lineCount = lineCount;
            this.wordCount = wordCount;
            this.characterCount = characterCount;
        }

        @Override
        public String toString() {
            return "Container{" +
                    "lineCount=" + lineCount +
                    ", wordCount=" + wordCount +
                    ", characterCount=" + characterCount + "}";
        }
    }
}
