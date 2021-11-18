package com.example.BackendCryptoSuggester.utils;

public class Utils {
    public String getExchangeAUrl(int results){
        return "https://api.coingecko.com/api/v3/coins/markets?vs_currency=usd&order=market_cap_desc&per_page="+results+"&page=1&parkline=false";
    }

    public String getExchangeBUrl(String id){
        return "https://api.coinpaprika.com/v1/coins/"+id+"/ohlcv/today";
    }
}
