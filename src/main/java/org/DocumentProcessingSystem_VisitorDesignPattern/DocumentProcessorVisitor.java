package org.DocumentProcessingSystem_VisitorDesignPattern;

public interface DocumentProcessorVisitor {
    void visit(TextFile textFile);
    void visit(SpreadSheets spreadSheets);
    void visit(PresentationFile presentationFile);
}
