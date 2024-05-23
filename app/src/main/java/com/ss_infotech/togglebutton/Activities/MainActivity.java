package com.ss_infotech.togglebutton.Activities;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import com.ss_infotech.togglebutton.Activities.Auth.SharedPreferenceActivity;
import com.ss_infotech.togglebutton.Activities.DOMParser.DOMParserActivity;
import com.ss_infotech.togglebutton.Activities.Menus.ContextActivity;
import com.ss_infotech.togglebutton.Activities.Menus.PopupActivity;
import com.ss_infotech.togglebutton.Activities.SAX_Parser.SAXParserActivity;
import com.ss_infotech.togglebutton.Activities.Services.ServiceActivity;
import com.ss_infotech.togglebutton.R;

public class MainActivity extends AppCompatActivity {

    Button btnAlert, btnCheckBox, btnDatePicker, btnHorizontalScrollView,
            btnImageSlider, btnImageSwitcher, btnLifeCycle, btnList, btnProgressBar,
            btnRatingBar, btnSearchView, btnSeekBar, btnStartResult, btnTabLayout, btnAutoCompleteTextView,
            btnToggleButton, btnVerticalScrollView, btnViewStub, btnPopupMenu, btnContextMenu, btnServices,
            btnAuth, btnSAXParser, btnDOMParser;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        btnAlert = findViewById(R.id.btnAlert);
        btnCheckBox = findViewById(R.id.btnCheckBox);
        btnDatePicker = findViewById(R.id.btnDatePicker);
        btnHorizontalScrollView = findViewById(R.id.btnHorizontalScrollView);
        btnImageSlider = findViewById(R.id.btnImageSlider);
        btnImageSwitcher = findViewById(R.id.btnImageSwitcher);
        btnLifeCycle = findViewById(R.id.btnLifeCycle);
        btnList = findViewById(R.id.btnList);
        btnProgressBar = findViewById(R.id.btnProgressBar);
        btnRatingBar = findViewById(R.id.btnRatingBar);
        btnSearchView = findViewById(R.id.btnSearchView);
        btnSeekBar = findViewById(R.id.btnSeekBar);
        btnStartResult = findViewById(R.id.btnStartResult);
        btnTabLayout = findViewById(R.id.btnTabLayout);
        btnAutoCompleteTextView = findViewById(R.id.btnAutoCompleteTextView);
        btnToggleButton = findViewById(R.id.btnToggleButton);
        btnVerticalScrollView = findViewById(R.id.btnVerticalScrollView);
        btnViewStub = findViewById(R.id.btnViewStub);
        btnPopupMenu = findViewById(R.id.btnPopupMenu);
        btnContextMenu = findViewById(R.id.btnContextMenu);
        btnServices = findViewById(R.id.btnServices);
        btnAuth = findViewById(R.id.btnAuth);
        btnSAXParser = findViewById(R.id.btnSAXParser);
        btnSAXParser = findViewById(R.id.btnSAXParser);

        listenOnService();
        listenOnPopupMenu();
        listenOnContextMenu();
        listenOnAlertDialog();
        listenOnCheckBox();
        listenOnDatePicker();
        listenOnHorizontalScrollView();
        listenOnImageSlider();
        listenOnImageSwitcher();
        listenOnLifeCycle();
        listenOnList();
        listenOnProgressBar();
        listenOnRatingBar();
        listenOnSearchView();
        listenOnSeekbar();
        listenOnStartResult();
        listenOnTabLayout();
        listenOnAutoCompleteTextView();
        listenOnToggleButton();
        listenOnVerticalScrollView();
        listenOnViewStub();
        listenOnAuth();
        listenOnSAXParser();
        listenOnDOMParser();
    }

    private void listenOnDOMParser() {
        btnDOMParser.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i = new Intent(MainActivity.this, DOMParserActivity.class);
                startActivity(i);
            }
        });
    }

    private void listenOnSAXParser() {
        btnSAXParser.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i = new Intent(MainActivity.this, SAXParserActivity.class);
                startActivity(i);
            }
        });
    }

    private void listenOnAuth() {
        btnAuth.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i = new Intent(MainActivity.this, SharedPreferenceActivity.class);
                startActivity(i);
            }
        });
    }

    private void listenOnService() {
        btnServices.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i = new Intent(MainActivity.this, ServiceActivity.class);
                startActivity(i);
            }
        });
    }

    private void listenOnPopupMenu() {
        btnPopupMenu.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i = new Intent(MainActivity.this, PopupActivity.class);
                startActivity(i);
            }
        });
    }

    private void listenOnContextMenu() {
        btnContextMenu.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i = new Intent(MainActivity.this, ContextActivity.class);
                startActivity(i);
            }
        });
    }

    private void listenOnAlertDialog() {
        btnAlert.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i = new Intent(MainActivity.this, AlertDialogActivity.class);
                startActivity(i);
            }
        });
    }

    private void listenOnCheckBox() {
        btnCheckBox.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i = new Intent(MainActivity.this, CheckBoxActivity.class);
                startActivity(i);
            }
        });
    }

    private void listenOnDatePicker() {
        btnDatePicker.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i = new Intent(MainActivity.this, DatePickerActivity.class);
                startActivity(i);
            }
        });
    }

    private void listenOnHorizontalScrollView() {
        btnHorizontalScrollView.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i = new Intent(MainActivity.this, HorizontalScrollViewActivity.class);
                startActivity(i);
            }
        });
    }

    private void listenOnImageSlider() {
        btnImageSlider.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i = new Intent(MainActivity.this, ImageSliderActivity.class);
                startActivity(i);
            }
        });
    }

    private void listenOnImageSwitcher() {
        btnImageSwitcher.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i = new Intent(MainActivity.this, ImageSwitcherActivity.class);
                startActivity(i);
            }
        });
    }

    private void listenOnLifeCycle() {
        btnLifeCycle.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i = new Intent(MainActivity.this, LifeCycleActivity.class);
                startActivity(i);
            }
        });
    }

    private void listenOnList() {
        btnList.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i = new Intent(MainActivity.this, ListActivity.class);
                startActivity(i);
            }
        });
    }

    private void listenOnProgressBar() {
        btnProgressBar.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i = new Intent(MainActivity.this, ProgressBarActivity.class);
                startActivity(i);
            }
        });
    }

    private void listenOnRatingBar() {
        btnRatingBar.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i = new Intent(MainActivity.this, RatingBarActivity.class);
                startActivity(i);
            }
        });
    }

    private void listenOnSearchView() {
        btnSearchView.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i = new Intent(MainActivity.this, SearchViewActivity.class);
                startActivity(i);
            }
        });
    }

    private void listenOnSeekbar() {
        btnSeekBar.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i = new Intent(MainActivity.this, SeekBarActivity.class);
                startActivity(i);
            }
        });
    }

    private void listenOnStartResult() {
        btnStartResult.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i = new Intent(MainActivity.this, StartResultActivity.class);
                startActivity(i);
            }
        });
    }

    private void listenOnTabLayout() {
        btnTabLayout.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i = new Intent(MainActivity.this, TabLayoutActivity.class);
                startActivity(i);
            }
        });
    }

    private void listenOnAutoCompleteTextView() {
        btnAutoCompleteTextView.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i = new Intent(MainActivity.this, AutoCompleteTextViewActivity.class);
                startActivity(i);
            }
        });
    }

    private void listenOnToggleButton() {
        btnToggleButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i = new Intent(MainActivity.this, ToggleButtonActivity.class);
                startActivity(i);
            }
        });
    }

    private void listenOnVerticalScrollView() {
        btnVerticalScrollView.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i = new Intent(MainActivity.this, VerticalScrollViewActivity.class);
                startActivity(i);
            }
        });
    }

    private void listenOnViewStub() {
        btnViewStub.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i = new Intent(MainActivity.this, ViewStubActivity.class);
                startActivity(i);
            }
        });
        
    }
}