package com.shoppinglist;
import com.itextpdf.text.*;
import com.itextpdf.text.pdf.PdfWriter;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.util.ArrayList;


public class Pdf {
    //korzystaj z access modifierów:)
    private Document document;
    private PdfWriter writter;
    private List list;

    //pisz konstruktory!
    public Pdf() {
        this.document = new Document();
        this.list = new List(List.ORDERED);
    }

    public void createPdf(ArrayList<String> shoppinglist) {
        try {
            //nie znam tego frameworka, ale tworzysz instancję PffWritera i z niej wcale nie korzstasz. Co więcej ma on metodę close()
            //którą najpewniej też trzeba wywołać przy zamykaniu resourceów
            this.writter = PdfWriter.getInstance(this.document, new FileOutputStream("shoppinglist.pdf"));
            this.document.open();

            Paragraph paragraph = new Paragraph("Lista zakupow");
            paragraph.setAlignment(Element.ALIGN_CENTER);
            this.document.add(paragraph);
            for (String line : shoppinglist){
                list.add(line + "\n");
            }
            this.document.add(list);
        } catch (DocumentException e) {
            e.printStackTrace();
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } finally { //resoucey zamykamy w finally, nigdy w tryu! Jak poleci Ci błąd, to będziesz miał niedomknięte resourcey!
            this.document.close();
            this.writter.close();
        }
    }
}
