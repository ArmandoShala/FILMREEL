package ch.filmreel.ui.watchlist

import android.net.Uri
import android.view.LayoutInflater
import android.view.ViewGroup
import android.widget.ImageView
import android.widget.TextView
import android.widget.Toast
import androidx.recyclerview.widget.RecyclerView
import ch.filmreel.R
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
        holder.thumbnail.setImageURI(assemblyUrlForThumbnail(movie.id))
        holder.title.text = movie.title
        holder.description.text = movie.description
        holder.year.text = movie.year.toString()
        holder.duration.text = movie.duration.toString()
        holder.checkmark.setImageResource(R.drawable.ic_baseline_check_circle_outline_24)
        holder.checkmark.setColorFilter(determineCheckmarkColor(movie.seen))
        holder.checkmark.setOnClickListener {
            Toast.makeText(
                holder.checkmark.context,
                "${holder.checkmark.colorFilter}",
                Toast.LENGTH_SHORT
            ).show()
        }
    }

    override fun getItemCount(): Int = values.size

    private fun determineCheckmarkColor(seen: Boolean): Int {
        return when (seen) {
            true -> android.R.color.holo_green_dark
            false -> android.R.color.holo_purple
        }
    }

    private fun assemblyUrlForThumbnail(movieId: String): Uri {
        return Uri.parse("https://m.media-amazon.com/images/M/${movieId}@._V1_.jpg")
    }

    inner class ViewHolder(binding: FragmentWatchlistItemBinding) :
        RecyclerView.ViewHolder(binding.root) {

        var thumbnail: ImageView = binding.movieThumbnail
        var title: TextView = binding.movieTitle
        var description: TextView = binding.movieShortDescription
        var year: TextView = binding.movieYear
        var duration: TextView = binding.movieDuration
        var checkmark: ImageView = binding.movieCheckmark
        var seen: Boolean = binding.movieSeen.isActivated

        override fun toString(): String {
            return super.toString() + " '" + title.text + "'"
        }

        init {
            checkmark.setOnClickListener {
                val movie = values[bindingAdapterPosition]
                movie.seen = !movie.seen
                checkmark.setColorFilter(determineCheckmarkColor(movie.seen))
            }
        }

    }

}