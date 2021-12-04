package castillo.leonel.myapplication

import android.content.DialogInterface
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.Button

class MainActivity : AppCompatActivity(), View.OnClickListener {

    lateinit var btnuno : Button
    lateinit var btndos : Button
    lateinit var btntres : Button

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        btnuno = findViewById(R.id.btnuno)
        btndos = findViewById(R.id.btndos)
        btntres = findViewById(R.id.btntres)

        btnuno.setOnClickListener(this)
        btndos.setOnClickListener(this)
        btntres.setOnClickListener(this)
    }

    override fun onClick(v: View?) {
         when(v!!.id){
             R.id.btnuno->supportFragmentManager.beginTransaction().replace(R.id.fragmentContainerView2, BlankFragment2.newInstance("", "")).commitNow()
             R.id.btndos->supportFragmentManager.beginTransaction().replace(R.id.fragmentContainerView2, BlankFragment.newInstance("", "")).commitNow()

         }
    }
}