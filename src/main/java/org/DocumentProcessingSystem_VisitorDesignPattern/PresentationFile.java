package org.DocumentProcessingSystem_VisitorDesignPattern;

public class PresentationFile implements DocumentProcessor{

    @Override
    public void accept(DocumentProcessorVisitor documentProcessorVisitor) {
        documentProcessorVisitor.visit(this);
    }

    @Override
    public void countingWords() {
        System.out.println("Counting words for presentation file");
    }

    @Override
    public void extractingText() {
        System.out.println("Extracting presentation file");
    }

    @Override
    public void analyzingFormatting() {
        System.out.println("Analyzing formatting of presentation file");
    }
}
