package org.DocumentProcessingSystem_VisitorDesignPattern;

public class TextFile implements DocumentProcessor{

    @Override
    public void countingWords() {
        System.out.println("Counting words for text files");
    }

    @Override
    public void extractingText() {
        System.out.println("Extracting text file");
    }

    @Override
    public void analyzingFormatting() {
        System.out.println("Analyzing formatting of text file");
    }

    @Override
    public void accept(DocumentProcessorVisitor documentProcessorVisitor) {
        documentProcessorVisitor.visit(this);
    }

}
