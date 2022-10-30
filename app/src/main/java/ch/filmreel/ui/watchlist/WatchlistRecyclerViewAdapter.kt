package ch.filmreel.ui.watchlist

import androidx.recyclerview.widget.RecyclerView
import android.view.LayoutInflater
import android.view.ViewGroup
import android.widget.TextView

import ch.filmreel.databinding.FragmentWatchlistItemBinding
import ch.filmreel.model.Movie

/**
 * [RecyclerView.Adapter] that can display a [Movie].
 */
class WatchlistRecyclerViewAdapter(private val values: List<Movie>) :
    RecyclerView.Adapter<WatchlistRecyclerViewAdapter.ViewHolder>() {

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ViewHolder {

        return ViewHolder(
            FragmentWatchlistItemBinding.inflate(
                LayoutInflater.from(parent.context),
                parent,
                false
            )
        )

    }

    override fun onBindViewHolder(holder: ViewHolder, position: Int) {
        val movie = values[position]
        holder.title.text = movie.title
        holder.year.text = movie.year.toString()
        holder.description.text = movie.description
        holder.duration.text = movie.duration.toString()
        holder.seen = movie.seen
    }

    override fun getItemCount(): Int = values.size

    inner class ViewHolder(binding: FragmentWatchlistItemBinding) :
        RecyclerView.ViewHolder(binding.root) {

        var title : TextView = binding.movieTitle
        var year : TextView = binding.movieYear
//        var genre : TextView = binding.movieGenres
        var description : TextView = binding.movieShortDescription
        var duration : TextView = binding.movieDuration
//        var rating : TextView = binding.movieRating
//        var questions : MutableList<Question>
        var seen: Boolean = false


        override fun toString(): String {
            return super.toString() + " '" + title.text + "'"
        }
    }

}