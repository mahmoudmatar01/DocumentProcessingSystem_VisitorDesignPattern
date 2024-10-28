package org.DocumentProcessingSystem_VisitorDesignPattern;

public class SpreadSheets implements DocumentProcessor{

    @Override
    public void countingWords() {
        System.out.println("Counting words for spread sheets");
    }

    @Override
    public void extractingText() {
        System.out.println("Extracting spread sheets");
    }

    @Override
    public void analyzingFormatting() {
        System.out.println("Analyzing formatting of spread sheets");
    }

    @Override
    public void accept(DocumentProcessorVisitor documentProcessorVisitor) {
        documentProcessorVisitor.visit(this);
    }

}
