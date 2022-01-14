/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package MenuContents;

import com.itextpdf.text.Document;
import com.itextpdf.text.DocumentException;
import com.itextpdf.text.Image;
import com.itextpdf.text.PageSize;
import com.itextpdf.text.Paragraph;
import com.itextpdf.text.pdf.PdfWriter;
import java.io.FileOutputStream;
import java.io.IOException;
import javax.swing.JFileChooser;

/**
 *
 * @author Denilson
 */
public class CreatePDF {
    public CreatePDF(){
        //doc vazio
        Document pdf = new Document();
        
        try{
            //instancia do doc
            PdfWriter.getInstance(pdf, new FileOutputStream("C:\\Users\\Denilson\\Documents\\Bob\\Fatura.pdf"));
            
            //abrir doc
            pdf.open();
            
            //tamanho da pagina do doc
            pdf.setPageSize(PageSize.A4);
            
            Image logo = Image.getInstance("C:\\Users\\Denilson\\Documents\\NetBeansProjects\\Oficina\\src\\oficina\\imagens\\carLogo2.png");
            logo.scaleToFit(300, 44);
            
            //add imagen no documento
            pdf.add(logo);
            
            //add paragrafo
            pdf.add(new Paragraph("\nMorada: Praia (Palmarejo Grande)                                                           Denilson Semedo Tavares"));
            pdf.add(new Paragraph("Telef./Fax: Praia-2609000/2609020                                                          NIF:148484816"));
            pdf.add(new Paragraph("NIF: 551773529"));
            pdf.add(new Paragraph("\n\nSERVIÇO                                                                                                                         PREÇO"));
            pdf.add(new Paragraph("Pintura.............................................................................................................................12.000 CVE"));
            pdf.add(new Paragraph("Lavagem..........................................................................................................................500 CVE"));
            pdf.add(new Paragraph("Trocar Pneu.....................................................................................................................9.000 CVE"));
            pdf.add(new Paragraph("\nTOTAL.............................................................................................................................21.500 CVE"));
            pdf.add(new Paragraph("Extenso:...........................................................VINTE E UM MIL E QUINHENTOS ESCUDOS CVE"));
            
            pdf.add(new Paragraph("\n\nNº fatura:00001                  Data emissão:10/01/2022                  Data validade:10/02/2022"));
            
        }catch(IOException e){
            e.printStackTrace();
        }catch(DocumentException eDoc){
            eDoc.printStackTrace();
        }finally{
            pdf.close();
        }
    }
}
