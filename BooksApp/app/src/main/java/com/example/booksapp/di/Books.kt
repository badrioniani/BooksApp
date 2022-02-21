package com.example.booksapp.di

import com.example.booksapp.presentation.search.SearchViewModel
import org.koin.dsl.module

val Books = module {
    single {
        SearchViewModel()
    }
    //using next time for application :D
}