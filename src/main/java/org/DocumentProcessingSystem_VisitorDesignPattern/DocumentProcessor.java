package org.DocumentProcessingSystem_VisitorDesignPattern;

public interface DocumentProcessor {

    void countingWords();
    void extractingText();
    void analyzingFormatting();
    void accept(DocumentProcessorVisitor documentProcessorVisitor);

}

