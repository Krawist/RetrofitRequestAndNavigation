package cm.seeds.retrofitrequestandnavigation.home.fragment.First

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import androidx.lifecycle.ViewModel
import androidx.recyclerview.widget.DiffUtil
import androidx.recyclerview.widget.ListAdapter
import androidx.recyclerview.widget.RecyclerView
import cm.seeds.retrofitrequestandnavigation.R
import cm.seeds.retrofitrequestandnavigation.home.Image
import com.bumptech.glide.Glide


private val DIFF_IMAGE = object : DiffUtil.ItemCallback<Image>(){
    override fun areItemsTheSame(oldItem: Image, newItem: Image): Boolean {
        return newItem.imageId == oldItem.imageId
    }

    override fun areContentsTheSame(oldItem: Image, newItem: Image): Boolean {
        return oldItem == newItem
    }
}

class AdapterImage : ListAdapter<Image, AdapterImage.ImageViewHolder>(DIFF_IMAGE){

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ImageViewHolder {
        return ImageViewHolder(LayoutInflater.from(parent.context).inflate(R.layout.item_image,parent,false))
    }

    override fun onBindViewHolder(holder: ImageViewHolder, position: Int) {
        holder.bindData(getItem(position))
    }

    inner class ImageViewHolder(view : View) : RecyclerView.ViewHolder(view){

        val imageView = view.findViewById<ImageView>(R.id.image)

        fun bindData(image: Image){
            Glide.with(imageView)
                .load(image.urls.full)
                .into(imageView)
        }
    }
}