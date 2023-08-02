package com.example.bottomsheetdialogxml

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.TextView
import com.example.bottomsheetdialogxml.dialogs.BottomSheetDialog

class MainActivity : AppCompatActivity(), BottomSheetDialog.BottomSheetListener {

    private lateinit var openDialogSheet: Button
    private lateinit var textViewButton: TextView

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)


        openDialogSheet = findViewById(R.id.btn_open_dialog)
        textViewButton = findViewById(R.id.textView)

        openDialogSheet.setOnClickListener {
            val myBottomSheetDialog = BottomSheetDialog()
            myBottomSheetDialog.show(supportFragmentManager, "Dialog")
        }

    }

    override fun onButtonClicked(input: String) {
        textViewButton.text = input
    }
}