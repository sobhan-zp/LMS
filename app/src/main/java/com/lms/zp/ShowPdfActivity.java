package com.lms.zp;


import android.content.Intent;
import android.os.Bundle;
import android.os.Environment;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;


import com.joanzapata.pdfview.PDFView;
import com.joanzapata.pdfview.listener.OnPageChangeListener;

import java.io.File;


import static java.lang.String.format;

public class ShowPdfActivity extends AppCompatActivity implements OnPageChangeListener {

    PDFView pdfView;
    Integer pageNumber = 1;
    String pdfName = "";


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_show_pdf);



        findView();
        displayFromAsset("jozve1.pdf");
    }


    private void findView() {
        pdfView = (PDFView) findViewById(R.id.pdfview);
    }

    private void displayFromUri(File file) {
        pdfView.fromFile(file)
                .defaultPage(0)
                .onPageChange(this)
                .load();
    }

    private void displayFromAsset(String file) {
        pdfView.fromAsset(file)
                .defaultPage(0)
                .onPageChange(this)
                .load();

    }


    @Override
    public void onPageChanged(int page, int pageCount) {
        pageNumber = page;
        setTitle(format("%s %s / %s", pdfName, page, pageCount));
    }
}
