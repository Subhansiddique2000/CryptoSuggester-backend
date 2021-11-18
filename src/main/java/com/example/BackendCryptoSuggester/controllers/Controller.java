package com.example.BackendCryptoSuggester.controllers;
import com.example.BackendCryptoSuggester.utils.Utils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

import java.util.Arrays;
import java.util.List;

@CrossOrigin
@RestController
public class Controller {

    private final Utils utils = new Utils();

    @Autowired
    private RestTemplate restTemplate;

    @GetMapping("/exchangeAData")
    public List<Object> getData(){
        final int results = 2;
        Object[] data = restTemplate.getForObject(utils.getExchangeAUrl(results),Object[].class);
        assert data != null;
        return Arrays.asList(data);
    }

    @GetMapping("/exchangeBbitcoin")
    public Object getBitcoinPrice(){
        String id = "btc-bitcoin";
        Object data = restTemplate.getForObject(utils.getExchangeBUrl(id),Object.class);
        assert data!=null;
        return data;
    }
    @GetMapping("/exchangeBethereum")
    public Object getEthPrice(){
        String id = "eth-ethereum";
        Object data = restTemplate.getForObject(utils.getExchangeBUrl(id),Object.class);
        assert data!=null;
        return data;
    }

}
