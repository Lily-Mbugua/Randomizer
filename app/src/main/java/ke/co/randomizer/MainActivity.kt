package ke.co.randomizer

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.SeekBar
import android.widget.TextView
import kotlin.random.Random as Random1
import kotlin.run as run1

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val rollButton =findViewById<Button>(R.id.rollButton)
        val resultsTextView = findViewById<TextView>(R.id.resultsTextView)
        val seekBar =findViewById<SeekBar>(R.id.seekBar)

        rollButton.setOnClickListener{
            val rand = this.Run1().nextInt(seekBar.progress)
            resultsTextView.text = rand.toString()
        }
    }

    inner class Run1 {

    }
}

private fun MainActivity.Run1.nextInt(progress: Int): Any {
    TODO("Not yet implemented")
}
