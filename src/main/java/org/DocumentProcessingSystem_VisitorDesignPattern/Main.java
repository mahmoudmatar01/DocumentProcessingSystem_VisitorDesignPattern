package org.DocumentProcessingSystem_VisitorDesignPattern;


import java.util.List;

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