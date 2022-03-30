package escalante.elmer.peliculas.ui.gallery

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ListView
import android.widget.TextView
import androidx.fragment.app.Fragment
import androidx.lifecycle.Observer
import androidx.lifecycle.ViewModelProviders
import escalante.elmer.peliculas.AdaptadorSeries
import escalante.elmer.peliculas.Pelicula
import escalante.elmer.peliculas.R
import escalante.elmer.peliculas.Serie

class GalleryFragment : Fragment() {
    var series: ArrayList<Serie> = ArrayList()
    private lateinit var galleryViewModel: GalleryViewModel

    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        val galleryViewModel =
            ViewModelProviders.of(this).get(GalleryViewModel::class.java)
        val root = inflater.inflate(R.layout.fragment_gallery, container, false)
        //val textView: TextView = root.findViewById(R.id.text_gallery)
        //galleryViewModel.text.observe(this, Observer {
        //    textView.text = it
        //})

        llenar_series()

        var adaptador = AdaptadorSeries(root.context, series)

        var listview: ListView = root.findViewById(R.id.listview_series)

        listview.adapter = adaptador

        return root
    }

    fun llenar_series(){
        val serie1 = Serie(1, getString(R.string.serie1), getString(R.string.serie1_sinop), 120, R.drawable.hawkeye)
        series.add(serie1)

        val serie2 = Serie(2, getString(R.string.serie2), getString(R.string.serie2_sinop), 120, R.drawable.whatif)
        series.add(serie2)

        val serie3 = Serie(3, getString(R.string.serie3), getString(R.string.serie3_sinop), 120, R.drawable.wandavision)
        series.add(serie3)

        val serie4 = Serie(4, getString(R.string.serie4), getString(R.string.serie4_sinop), 120, R.drawable.loki)
        series.add(serie4)

        val serie5 = Serie(5, getString(R.string.serie5), getString(R.string.serie5_sinop), 120, R.drawable.mandalorian)
        series.add(serie5)

        val serie6 = Serie(6, getString(R.string.serie6), getString(R.string.serie6_sinop), 120, R.drawable.starwars)
        series.add(serie6)
    }
}