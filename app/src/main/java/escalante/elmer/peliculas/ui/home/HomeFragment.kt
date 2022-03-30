package escalante.elmer.peliculas.ui.home

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ListView
import android.widget.TextView
import androidx.fragment.app.Fragment
import androidx.lifecycle.Observer
import androidx.lifecycle.ViewModelProviders
import escalante.elmer.peliculas.AdaptadorMovies
import escalante.elmer.peliculas.Pelicula
import escalante.elmer.peliculas.R
import kotlinx.android.synthetic.main.fragment_home.view.*

class HomeFragment : Fragment() {
    var peliculas: ArrayList<Pelicula> = ArrayList()
    private lateinit var homeViewModel: HomeViewModel

    //private var _binding: FragmentHomeBinding? = null

    private val binding get() = _binding!!

    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        val homeViewModel =
            ViewModelProviders.of(this).get(HomeViewModel::class.java)

        _binding = FragmentHomeBinding.inflate(inflater, container, false)
        val root = inflater.inflate(R.layout.fragment_home, container, false)
        //val textView: TextView = root.findViewById(R.id.text_home)
        //homeViewModel.text.observe(this, Observer {
           // textView.text = it
        //})

        llenar_peliculas()

        var adaptador = AdaptadorMovies(root.context, peliculas)

        var listview: ListView = root.findViewById(R.id.listview_peliculas)

        listview.adapter = adaptador

        return root
    }

    override fun onDestroyView() {
        super.onDestroyView()
        //_binding = null
    }


    fun llenar_peliculas(){
        val pelicula1 = Pelicula(1, getString(R.string.peli1), getString(R.string.peli1_sinop), 120, R.drawable.spidermannowayhomeposter)
        peliculas.add(pelicula1)

        val pelicula2 = Pelicula(2, getString(R.string.peli2), getString(R.string.peli2_sinop), 120, R.drawable.doctor)
        peliculas.add(pelicula2)

        val pelicula3 = Pelicula(3, getString(R.string.peli3), getString(R.string.peli3_sinop), 120, R.drawable.thebatman)
        peliculas.add(pelicula3)

        val pelicula4 = Pelicula(4, getString(R.string.peli4), getString(R.string.peli4_sinop), 120, R.drawable.shangshi)
        peliculas.add(pelicula4)

        val pelicula5 = Pelicula(5, getString(R.string.peli5), getString(R.string.peli5_sinop), 120, R.drawable.jackass)
        peliculas.add(pelicula5)

        val pelicula6 = Pelicula(6, getString(R.string.peli6), getString(R.string.peli6_sinop), 120, R.drawable.exorcismodedios)
        peliculas.add(pelicula6)
    }

}