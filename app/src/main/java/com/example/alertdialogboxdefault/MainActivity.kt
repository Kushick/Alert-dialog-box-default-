package com.example.alertdialogboxdefault

import android.os.Bundle
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AlertDialog
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContentView(R.layout.activity_main)
    }

    //writing the back pressing code out from the oncreate function
    override fun onBackPressed() {
        val dialog= AlertDialog.Builder(this)

        //alert dialog box content
        dialog.setTitle("Exit")
        dialog.setMessage("Do you want to exit the app!")
        dialog.setIcon(R.drawable.exit_the_app)

        //positive button information
        dialog.setPositiveButton("YES"){dialogInterface,which ->
            finish()
            dialogInterface.dismiss()
        }

        //negative button information
        dialog.setNegativeButton("NO"){dialogInterface,which ->
            dialogInterface.dismiss()
        }

        //creating the alert dialog object
        val alertDialog=dialog.create()

        //preventing the alert dialog box to be closing by clicking without
        alertDialog.setCancelable(false)

        //showing the alert dialog box
        alertDialog.show()
    }
}
