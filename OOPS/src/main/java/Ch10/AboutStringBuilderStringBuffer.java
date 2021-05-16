package Ch10;

public class AboutStringBuilderStringBuffer {
    public static void main(String[] args) {
//        Constructs a string builder with no characters in it and an initial capacity of 16 characters.
//        If a string does not require any change, use String rather than StringBuilder. Java
//        can perform some optimizations for String, such as sharing interned strings.
        StringBuilder str = new StringBuilder("Hello World");
        System.out.println(str);
//        metadata
//        capacity
//        length
//        charAt
        System.out.println("functions which give some info about a string");
        System.out.println(str.capacity());
        System.out.println(str.length());
        System.out.println(str.charAt(3));

//        Searching
//        indexOf
//        lasIndexOf
        System.out.println("functions which can search in a string");
//        indexOf
        System.out.println(str.indexOf("W"));
        System.out.println(str.indexOf("W", 7));
//        lastIndexOf
        System.out.println(str.lastIndexOf("l"));
        System.out.println(str.lastIndexOf("l", 7));

//        Modifiers
//        append
//        insert
//        delete
//        deleteCharAt
//        getChars
//        replace
//        reverse
//        setCharAt
//        setlength
//        subSequence
//        substring
//        trimToSize
        System.out.println("functions which can modify a given string");
//        append
        System.out.println("About append method");
        str = new StringBuilder("New World");
        str.append("op");
        System.out.printf("str.append(\"op\"):%s\n", str);
        str.append(true);
        System.out.printf("str.append(true):%s\n", str);
        str.append('w');
        System.out.printf("str.append('w'):%s\n", str);
        str.append(10);
        System.out.printf("str.append(10):%s\n", str);
        str.append(new char[]{'l', 'i'});
        System.out.printf("str.append(new char[] {'l','i'}):%s\n", str);
//        str - the characters to be appended.
//        offset - the index of the first char to append.
//        len - the number of chars to append.
        str.append(new char[]{'A', 'd', 'i', 't', 'y', 'a', ' ', 'C', 'h'}, 3, 3);
        System.out.printf("str.append(new char[]{'A','d','i','t','y','a',' ','C','h'},4,3):%s\n", str);

//        insert
        System.out.println("About insert method");
        str = new StringBuilder("String for insertion");
        str.insert(str.indexOf("for") + 3, " new");
        System.out.printf("str.insert(str.indexOf(\"for\") + 2, \"new \"):%s\n", str);
//        Same variations can be performed for insert which can be performed for append

//        delete
        str = new StringBuilder("A very long string");

//        Conversion
//        toString


    }
}
