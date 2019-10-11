package mx.edu.utng.appmenu

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.os.Handler
import android.view.animation.AnimationUtils

class MainActivity : AppCompatActivity() {
    private val SPLASH_TIME_OUT:Long=6000

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        //Código en una sola linea
       // val animacion: Animation = AnimationUtils.loadAnimation( this,R.anim,animacion)
        //txvUno.startAnimation(animacion)


        //Se inicia la actividad principal(PrincipalActivity)
        Handler().postDelayed({
            startActivity(Intent(this,PrincipalActivity::class.java))
            finish()
        },SPLASH_TIME_OUT)
    }
}
