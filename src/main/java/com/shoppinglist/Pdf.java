package com.shoppinglist;
import com.itextpdf.text.*;
import com.itextpdf.text.pdf.PdfWriter;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.util.ArrayList;


public class Pdf {
    Document document = new Document();
    List list = new List(List.ORDERED);

    public void createPdf(ArrayList<String> shoppinglist) {
        try {
            PdfWriter.getInstance(document, new FileOutputStream("shoppinglist.pdf"));
            document.open();
            Paragraph paragraph = new Paragraph("Lista zakupow");
            paragraph.setAlignment(Element.ALIGN_CENTER);
            document.add(paragraph);
            for (String line : shoppinglist){
                list.add(line + "\n");
            }
            document.add(list);
            document.close();
        } catch (DocumentException e) {
            e.printStackTrace();
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }
    }
}
