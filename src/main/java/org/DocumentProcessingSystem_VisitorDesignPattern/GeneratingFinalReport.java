package org.DocumentProcessingSystem_VisitorDesignPattern;

public class GeneratingFinalReport implements DocumentProcessorVisitor{

    @Override
    public void visit(TextFile textFile) {
        System.out.println("Generating Final Report... for text file");
    }

    @Override
    public void visit(SpreadSheets spreadSheets) {
        System.out.println("Generating Final Report... for spread sheets");

    }

    @Override
    public void visit(PresentationFile presentationFile) {
        System.out.println("Generating Final Report... for presentation file");

    }
}
