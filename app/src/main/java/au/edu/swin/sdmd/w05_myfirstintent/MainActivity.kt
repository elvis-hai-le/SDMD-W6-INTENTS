package au.edu.swin.sdmd.w05_myfirstintent

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.TextView
import kotlin.random.Random

/**
 * Your task: create an intent that opens the DetailActivity when the image in MainActivity
 * is clicked.
 *
 * Note only a few lines of code are needed for this task. You will also need to carefully
 * read any errors that occur.
 *
 * There is a UI test in MainActivityTest to check whether your code works.
 */

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val product1 = Random.nextInt(from = 1, until = 13)
        val product2 = Random.nextInt(from = 1, until = 13)

        val showP1 = findViewById<TextView>(R.id.productOne)
        val showP2 = findViewById<TextView>(R.id.productTwo)

        val result = product1 * product2

        showP1.text = product1.toString()
        showP2.text = product2.toString()

        val multiply = findViewById<Button>(R.id.multiplyBtn)
        multiply.setOnClickListener {
            val intent = Intent(this, DetailActivity::class.java)
            intent.putExtra("result", result.toString())
            startActivity(intent)
        }

    }
}