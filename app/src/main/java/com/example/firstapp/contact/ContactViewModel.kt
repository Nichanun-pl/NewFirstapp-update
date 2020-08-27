package com.example.firstapp.contact

import android.app.Application
import androidx.lifecycle.AndroidViewModel
import com.example.firstapp.database.DatabaseDAO
import com.example.firstapp.databinding.FragmentContactBinding

class ContactViewModel(
    val database: DatabaseDAO,
    private val binding: FragmentContactBinding,
    application: Application
) : AndroidViewModel(application) {
}