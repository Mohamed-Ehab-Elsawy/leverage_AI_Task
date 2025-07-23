package com.example.leverageaitask.viewmodel

import androidx.lifecycle.LiveData
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import com.example.leverageaitask.data.model.MockData
import com.example.leverageaitask.data.model.Product

class ProductsViewModel : ViewModel() {

    private val _products = MutableLiveData<List<Product>>().apply {
        value = MockData.products
    }
    val products: LiveData<List<Product>> = _products
}