package com.cjss.deva.CarAPI.service;

import com.cjss.deva.CarAPI.model.DealerDetails;
import org.springframework.stereotype.Service;

import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

@Service
public class CarService {
    Map<String, DealerDetails> dealerDetailsMap = new HashMap<>();

    public void add(DealerDetails details) {
        dealerDetailsMap.put(details.getName(), details);
    }

    public void addAll(DealerDetails[] details) {
        Arrays.stream(details).forEach(details1 ->
                dealerDetailsMap.put(details1.getName(), details1));
    }

    public DealerDetails getOneDealer(String name) {
        return dealerDetailsMap.get(name);
    }

    public List<DealerDetails> getAllDealers() {
        return dealerDetailsMap.values().stream().collect(Collectors.toList());
    }

    public String removeOneDealer(String name) {
        dealerDetailsMap.remove(name);
        return name;
    }

    public String removeAllDealers() {
        dealerDetailsMap.forEach(
                (s, details) -> dealerDetailsMap.remove(s));
        return "remove all";
    }

    public String updateDealerDeatails(String name, DealerDetails details) {
        if (details.getName() != null)
            dealerDetailsMap.remove(details.getName());

        dealerDetailsMap.remove(details.getName());
        dealerDetailsMap.put(name, details);
        return name + " upadated";
    }
}
