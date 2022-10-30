package ch.filmreel.model

import android.annotation.SuppressLint
import android.content.Context
import android.media.Image
import android.net.Uri
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.BaseAdapter
import ch.filmreel.databinding.FragmentWatchlistItemBinding


class MovieAdapter(val movies: MutableList<Movie>, val context: Context) : BaseAdapter() {

    var layoutInflater: LayoutInflater
    private var _binding: FragmentWatchlistItemBinding? = null
    private val binding get() = _binding!!
    private var bindings = mutableMapOf<View, FragmentWatchlistItemBinding>()

    init { layoutInflater = LayoutInflater.from(context) }

    override fun getCount(): Int {
        return movies.size
    }

    override fun getItem(position: Int): Any {
        return movies[position]
    }

    override fun getItemId(position: Int): Long {
        return movies[position].id.hashCode().toLong()
    }


    override fun getView(position: Int, convertView: View?, parent: ViewGroup?): View {
        var view: View
       if (convertView == null) {
            _binding = FragmentWatchlistItemBinding.inflate(layoutInflater, parent, false)
            view = binding.root
            view.tag = binding
        } else {
            view = convertView
            _binding = bindings[view]
        }
        val movie = movies[position]
        binding.movieTitle.text = movie.title
        binding.movieYear.text = movie.year.toString()
        binding.movieDuration.text = movie.duration.toString()
        binding.movieShortDescription.text = movie.description
        binding.movieCheckmark.setColorFilter(determineCheckmarkColor(movie.seen))
        binding.movieThumbnail.setImageURI(assemblyUrlForThumbnail(movie.id))

        return view
    }

    private fun determineCheckmarkColor(seen: Boolean): Int {
        return when (seen) {
            true -> context.getColor(android.R.color.holo_green_dark)
            false -> context.getColor(android.R.color.white)
        }
    }

    private fun assemblyUrlForThumbnail(movieId: String): Uri {
        return Uri.parse("https://m.media-amazon.com/images/M/${movieId}@._V1_.jpg")
    }
}