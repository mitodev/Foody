package com.example.foody.bindingAdapters

import android.view.View
import android.widget.ImageView
import android.widget.TextView
import androidx.core.content.ContextCompat
import androidx.databinding.BindingAdapter
import coil.load
import com.example.foody.R

class RecipesRowBinding {
    companion object{

        @BindingAdapter("setNumOfLikes")
        @JvmStatic
        fun setNumOfLikes(
            texteView: TextView,
            likes: Int
        ){
            texteView.text = likes.toString()
        }

        @BindingAdapter("setNumOfMins")
        @JvmStatic
        fun setNumOfMins(
            texteView: TextView,
            likes: Int
        ){
            texteView.text = likes.toString()
        }

        @BindingAdapter("setImageFromUrl")
        @JvmStatic
        fun loudimageUrl(imageView: ImageView, url: String){
            imageView.load(url)
            {
                crossfade(600)
            }
        }

        @BindingAdapter("isVegan")
        @JvmStatic
        fun isVegan(view: View, vegan:Boolean){
            if (vegan){
                when(view){
                    is TextView->{
                        view.setTextColor(
                            ContextCompat.getColor(
                                view.context,
                                R.color.green
                            )
                        )
                    }
                    is ImageView->{
                        view.setColorFilter(
                            ContextCompat.getColor(
                                view.context,
                                R.color.green
                            )
                        )
                    }

                }
            }
        }
    }
}