# DocumentProcessingSystem_VisitorDesignPattern

This project demonstrates the **Visitor Design Pattern** within a document processing system. The system can perform various operations on different document types (Text files, Spreadsheets, and Presentation files) without modifying their underlying structures.

## Project Structure

The project consists of the following classes and interfaces:

1. **DocumentProcessor (Interface)**
   - Defines common operations for different document types.
   - Declares methods for counting words, extracting text, analyzing formatting, and accepting a visitor.

2. **TextFile**
   - Implements `DocumentProcessor` for text files.
   - Contains specific implementations for counting words, extracting text, and analyzing formatting.
   - Accepts visitors to perform additional operations on text files.

3. **SpreadSheets**
   - Implements `DocumentProcessor` for spreadsheet files.
   - Similar to `TextFile`, providing unique implementations for spreadsheet documents.

4. **PresentationFile**
   - Implements `DocumentProcessor` for presentation files.
   - Contains specific implementations for counting words, extracting text, and analyzing formatting.

5. **DocumentProcessorVisitor (Interface)**
   - Declares visit methods for each document type, allowing visitors to operate on different document processors.

6. **GeneratingFinalReport**
   - Implements `DocumentProcessorVisitor` to generate final reports for each document type.

7. **Main**
   - Demonstrates the use of the visitor pattern by creating instances of different document types.
   - Applies the `GeneratingFinalReport` visitor to each document type while performing common document operations.

## How It Works

1. **Visitor Pattern Implementation**:
   - Each document type (TextFile, SpreadSheets, PresentationFile) implements `DocumentProcessor` and provides specific behavior for common operations.
   - The visitor (`GeneratingFinalReport`) encapsulates the operation of generating reports and can be applied to different document types.

2. **Applying Visitors**:
   - The `Main` class creates a list of `DocumentProcessor` instances and applies the `GeneratingFinalReport` visitor to each one.
   - This structure allows for new operations to be added as separate visitor classes without modifying the document classes.

## Usage

### Setup

1. Clone the repository and import it into your Java IDE.
2. Compile and run the `Main` class to see the Visitor Design Pattern in action.

### Example Code

Here’s an example code snippet demonstrating the system:

```java
public class Main {
    public static void main(String[] args) {

        List<DocumentProcessor> documentProcessors = List.of(
                new TextFile(),
                new SpreadSheets(),
                new PresentationFile()
        );

        documentProcessors.forEach(
                documentProcessor -> {
                    documentProcessor.countingWords();
                    documentProcessor.analyzingFormatting();
                    documentProcessor.extractingText();
                    documentProcessor.accept(new GeneratingFinalReport());
                }
        );

    }
}
```

### Sample Output

```plaintext
Counting words for text files
Analyzing formatting of text file
Extracting text file
Generating Final Report... for text file

Counting words for spread sheets
Analyzing formatting of spread sheets
Extracting spread sheets
Generating Final Report... for spread sheets

Counting words for presentation file
Analyzing formatting of presentation file
Extracting presentation file
Generating Final Report... for presentation file
```
