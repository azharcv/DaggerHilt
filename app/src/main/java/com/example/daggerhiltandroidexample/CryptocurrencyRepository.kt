package com.example.daggerhiltandroidexample

interface CryptocurrencyRepository {
    fun getCryptoCurrency():List<Cryptocurrency>
}