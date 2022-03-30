package escalante.elmer.peliculas

import android.content.Context
import android.content.Intent
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.BaseAdapter
import android.widget.ImageView
import android.widget.TextView
import java.security.AccessControlContext

class AdaptadorSeries: BaseAdapter {
    lateinit var context: Context
    var series: ArrayList<Serie> = ArrayList()


    constructor(context: Context, series: ArrayList<Serie>){
        this.context = context
        this.series = series
    }

    override fun getView(p0: Int, p1: View?, p2: ViewGroup?): View {
        //obtener un inflador
        val inflador = LayoutInflater.from(context)
        var vista = inflador.inflate(R.layout.serie_view, null)

        var iv_img: ImageView = vista.findViewById(R.id.img_view)
        var tv_nombre: TextView = vista.findViewById(R.id.tv_nombre)

        var serie: Serie = series[p0]

        iv_img.setImageResource(serie.img)
        tv_nombre.setText(serie.nombre)

        vista.setOnClickListener{
            val intent: Intent = Intent(context, SerieActivity::class.java)

            intent.putExtra("nombre", serie.nombre)
            intent.putExtra("sinopsis", serie.sinopsis)
            intent.putExtra("img", serie.img)

            context.startActivity(intent)
        }

        return vista
    }

    override fun getItem(p0: Int): Any {
        //indica el elemento individual con el cual puedo interactuar
        return series[p0]
    }

    override fun getItemId(p0: Int): Long {
        //pide el id del elemento que estamos trabajando
        return p0.toLong()
    }

    override fun getCount(): Int {
        //indica el numero de objetos en mi lista
        return series.size
    }
}