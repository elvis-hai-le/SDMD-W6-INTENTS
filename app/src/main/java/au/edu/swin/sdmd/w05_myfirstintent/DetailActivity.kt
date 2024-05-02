package au.edu.swin.sdmd.w05_myfirstintent

import android.os.Build
import android.os.Bundle
import android.util.Log
import android.widget.TextView
import androidx.annotation.RequiresApi
import androidx.appcompat.app.AppCompatActivity

class DetailActivity : AppCompatActivity() {
    @RequiresApi(Build.VERSION_CODES.TIRAMISU)
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_detail)

        val showResult = findViewById<TextView>(R.id.productResult)

        val answer = intent.getParcelableExtra("result", Result::class.java)

        Log.i("result","$answer")

        showResult.text = answer?.opResult.toString()
    }
}