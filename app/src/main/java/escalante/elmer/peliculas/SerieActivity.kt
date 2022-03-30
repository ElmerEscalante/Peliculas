package escalante.elmer.peliculas

import android.os.Bundle
import android.widget.ImageView
import android.widget.TextView
import androidx.appcompat.app.AppCompatActivity

class SerieActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_serie)

        val tv_nombre: TextView = findViewById(R.id.tv_nombre_serie)
        val tv_desc: TextView = findViewById(R.id.tv_desc_serie)
        val iv_img: ImageView = findViewById(R.id.img_serie)

        val bundle = intent.extras

        if(bundle != null){
            var nombre: String = bundle.getString("nombre","")
            var desc: String = bundle.getString("sinopsis","")
            val img: Int = bundle.getInt("img")

            tv_nombre.setText(nombre)
            tv_desc.setText(desc)
            iv_img.setImageResource(img)
        }

    }
}