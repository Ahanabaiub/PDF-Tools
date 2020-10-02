package main.java;

import org.apache.pdfbox.multipdf.PDFMergerUtility;

import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Scanner;

public class MargePdf {
    public static void main(String[] args) {
        Scanner input=new Scanner(System.in); 


        System.out.print("Enter No of PDF :");
        int n=input.nextInt();
        input.nextLine();
        String pdfLocation;

        PDFMergerUtility pdu=new PDFMergerUtility();


        for(int i=0; i<n; i++)
        {

            System.out.print("PDF Location : ");
            pdfLocation=input.nextLine();
            //input.nextLine();
            try {
                pdu.addSource(pdfLocation);
            } catch (FileNotFoundException e) {
                System.out.println("File Not Found...");
            }
        }

        String name="merged-file.pdf";

        pdu.setDestinationFileName("F:\\"+name);

        try {
            pdu.mergeDocuments();
        } catch (IOException e) {
            e.printStackTrace();
        }


    }

}
