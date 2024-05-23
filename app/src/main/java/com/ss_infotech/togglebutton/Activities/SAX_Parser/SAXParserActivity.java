package com.ss_infotech.togglebutton.Activities.SAX_Parser;

import android.os.Bundle;
import android.widget.TextView;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;

import com.ss_infotech.togglebutton.R;

import org.xml.sax.Attributes;
import org.xml.sax.SAXException;
import org.xml.sax.helpers.DefaultHandler;

import java.io.InputStream;

import javax.xml.parsers.ParserConfigurationException;
import javax.xml.parsers.SAXParser;
import javax.xml.parsers.SAXParserFactory;

public class SAXParserActivity extends AppCompatActivity {
    TextView txtSAXParser;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_saxparser);

        txtSAXParser = findViewById(R.id.txtSAXParser);

        try {
            SAXParserFactory factory = SAXParserFactory.newInstance();
            SAXParser saxParser = factory.newSAXParser();

            DefaultHandler handler = new DefaultHandler() {
                boolean name = false;
                boolean salary = false;

                public void startElement(String uri, String localName,
                                         String qName, Attributes
                                                 attributes) throws SAXException {
                    if (qName.equalsIgnoreCase("name")) {
                        name = true;
                    }
                    if (qName.equalsIgnoreCase("salary")) {
                        salary = true;
                    }
                }

                @Override
                public void characters(char[] ch, int start, int length) throws SAXException {
                    if (name) {
                        txtSAXParser.setText(txtSAXParser.getText() + "\n\n Name : " +
                                new String(ch, start, length));
                        name = false;
                    }
                    if (salary) {
                        txtSAXParser.setText(txtSAXParser.getText() + "\n Salary : " +
                                new String(ch, start, length));
                        salary = false;
                    }
                }
            };

            InputStream is = getAssets().open("file.xml");
            saxParser.parse(is, handler);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}