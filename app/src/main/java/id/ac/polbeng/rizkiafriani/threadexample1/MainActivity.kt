package id.ac.polbeng.rizkiafriani.threadexample1

import android.os.Bundle
import android.util.Log
import androidx.appcompat.app.AppCompatActivity
import id.ac.polbeng.rizkiafriani.threadexample1.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {
    private val TAG = "MainActivity"
    private lateinit var binding: ActivityMainBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)

        binding.btnStartThread.setOnClickListener {
            startThread()
        }
    }

    private fun startThread(){
        for (i in 1..10) {
            Log.d(TAG, "startThread: $i")
            try {
                Thread.sleep(1000)
            } catch (ie: InterruptedException) {
                ie.printStackTrace()
            }
        }
    }
}