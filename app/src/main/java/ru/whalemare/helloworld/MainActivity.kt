package ru.whalemare.helloworld

import android.os.Bundle
import android.support.design.widget.Snackbar
import android.support.v7.app.AppCompatActivity
import android.widget.Toast
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        var snackbar: Snackbar

        fab.setOnClickListener { view ->
            snackbar = Snackbar.make(view, "Сообщение пришло! Нажми на экран, пидор! ААААААААААААААААА", Snackbar.LENGTH_INDEFINITE)
            snackbar.show()

            root.setOnClickListener {
                Toast.makeText(this, "Нажатие на экран!", Toast.LENGTH_SHORT).show()
                snackbar.dismiss()
            }
        }


    }

}
