package uz.shoxsoft.fastfooddemo.activity.Activity

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView
import uz.shoxsoft.fastfooddemo.Domain.CategoryDomain
import uz.shoxsoft.fastfooddemo.Adapter.CategoryAdapter
import uz.shoxsoft.fastfooddemo.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {
    private lateinit var binding: ActivityMainBinding
    private lateinit var categoryAdapter: CategoryAdapter
    private lateinit var recyclerViewCategoryList: RecyclerView

    override fun onCreate(savedInstanceState: Bundle?) {
        binding = ActivityMainBinding.inflate(layoutInflater)
        super.onCreate(savedInstanceState)
        setContentView(binding.root)
        setRecyclerViewCategory()
    }

    private fun setRecyclerViewCategory() {
        val layoutManager: RecyclerView.LayoutManager =
            LinearLayoutManager(this, RecyclerView.HORIZONTAL, false)

        recyclerViewCategoryList = binding.recyclerViewCategoryId
        recyclerViewCategoryList.layoutManager = layoutManager

        val categoryList: ArrayList<CategoryDomain> = ArrayList()
        categoryList.add(CategoryDomain(1, "Pizza", "cat1"))
        categoryList.add(CategoryDomain(2, "Burger", "cat2"))
        categoryList.add(CategoryDomain(3, "HotDog", "cat3"))
        categoryList.add(CategoryDomain(4, "Drink", "cat4"))
        categoryList.add(CategoryDomain(5, "Donut", "cat5"))
    
        categoryAdapter = CategoryAdapter(this, categoryList)
        recyclerViewCategoryList.adapter = categoryAdapter
    }
}