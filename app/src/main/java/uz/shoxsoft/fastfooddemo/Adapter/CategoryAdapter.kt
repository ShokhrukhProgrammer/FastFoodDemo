package uz.shoxsoft.fastfooddemo.Adapter

import android.content.Context
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import android.widget.TextView
import androidx.constraintlayout.widget.ConstraintLayout
import androidx.recyclerview.widget.RecyclerView
import uz.shoxsoft.fastfooddemo.Domain.CategoryDomain
import uz.shoxsoft.fastfooddemo.R


class CategoryAdapter(
    private var context: Context,
    private var categoryDomains: ArrayList<CategoryDomain>
) :
    RecyclerView.Adapter<CategoryAdapter.CategoryViewHolder>() {


    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): CategoryViewHolder {
        val categoryItems =
            LayoutInflater.from(context).inflate(R.layout.viewholder_cat, parent, false)
        return CategoryViewHolder(categoryItems)
    }

    override fun onBindViewHolder(holder: CategoryViewHolder, position: Int) {
        holder.categoryName.text = categoryDomains[position].title
        val imageId: Int = context.resources.getIdentifier(
            categoryDomains[position].pic, "drawable", context.packageName
        )
        holder.categoryPic.setImageResource(imageId)
//        var picUrl = ""
/*        when (position) {
            0 -> {
                picUrl = "cat_1"
                holder.mainLayout.background = ContextCompat.getDrawable(
                    holder.itemView.context,
                    R.drawable.category_background1
                )
            }
            1 -> {
                picUrl = "cat_2"
                holder.mainLayout.background = ContextCompat.getDrawable(
                    holder.itemView.context,
                    R.drawable.category_background2
                )
            }
            2 -> {
                picUrl = "cat_3"
                holder.mainLayout.background = ContextCompat.getDrawable(
                    holder.itemView.context,
                    R.drawable.category_background3
                )
            }
            3 -> {
                picUrl = "cat_4"
                holder.mainLayout.background = ContextCompat.getDrawable(
                    holder.itemView.context,
                    R.drawable.category_background4
                )
            }
            4 -> {
                picUrl = "cat_5"
                holder.mainLayout.background = ContextCompat.getDrawable(
                    holder.itemView.context,
                    R.drawable.category_background5
                )
            }
        }

        holder.categoryPic.setImageResource(
            context.resources.getIdentifier(
                categoryDomains[position].pic, "drawable", context.packageName
            )
        )*/
/*
        holder.categoryPic.setImageResource(
            context.resources.getIdentifier(
                picUrl, "drawable", context.packageName
            )
        )

//        val drawableResourceId = holder.itemView.context.resources.getIdentifier(
//            picUrl,
//            "drawable",
//            holder.itemView.context.packageName
//        )
//
//        Glide.with(holder.itemView.context).load(drawableResourceId).into(holder.categoryPic)
//
*/

    }

    override fun getItemCount(): Int {
        return categoryDomains.size
    }

    class CategoryViewHolder(itemView: View) : RecyclerView.ViewHolder(itemView) {
        var categoryName: TextView = itemView.findViewById(R.id.categoryName)
        var categoryPic: ImageView = itemView.findViewById(R.id.categoryPic)
        var mainLayout: ConstraintLayout = itemView.findViewById(R.id.mainLayout)
    }


}