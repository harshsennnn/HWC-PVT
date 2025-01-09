package example; // This passes

import java.util.*; // AvoidStarImport - Importing all classes from java.util
import java.util.HashMap; // RedundantImport - Already imported via `java.util.*`

public class BadJavaFile { // TypeName - Class names should be in PascalCase (e.g., BadJavaFile)

    public int badMethod() { // MethodName - Methods should follow camelCase (e.g., badMethod)
        return 42;
    }

    // EmptyBlock - Empty block is not allowed
    public void emptyBlockExample() {}

    public void anotherBadMethod() {
        // LineLength - Exceeds maximum line length
        System.out.println("This is an extremely long line that exceeds the maximum allowed length of 120 characters in the Checkstyle configuration.");
    }

    public void methodWithUnusedImports() {
        Map<String, String> map = new HashMap<>(); // UnusedImports - HashMap import is not used
    }

    public void badSpacing() { // WhitespaceAround and WhitespaceAfter issues
        if(true){System.out.println("Missing proper spacing.");} // NoWhitespaceAfter and NoWhitespaceBefore
    }

    public void badBraces() // NeedBraces - Requires braces for control structures
        System.out.println("No braces here!");
    
    public void badCurly() { if (true) System.out.println("Curly brace issues"); } // LeftCurly and RightCurly

    // MethodLength - Method exceeds the maximum length of 50 lines
    public void veryLongMethod() {
        for (int i = 0; i < 51; i++) {
            System.out.println("Line " + i);
        }
    }
}
