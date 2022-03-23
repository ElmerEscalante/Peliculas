package escalante.elmer.peliculas

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.ListView

class MainActivity : AppCompatActivity() {

    var peliculas: ArrayList<Pelicula> = ArrayList()

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        llenar_peliculas()

        var adaptador = AdaptadorMovies(this, peliculas)

        var listview: ListView = findViewById(R.id.listivew)

        listview.adapter = adaptador
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
