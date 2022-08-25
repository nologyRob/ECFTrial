package com.nology.ECF;import org.springframework.beans.factory.annotation.Autowired;import org.springframework.http.HttpStatus;import org.springframework.http.ResponseEntity;import org.springframework.web.bind.annotation.*;@RestController@CrossOriginpublic class MarketItemController {    @Autowired    MarketItemRepository marketItemRepository;    @ExceptionHandler    public ResponseEntity<String> handleException(Exception exception){        return ResponseEntity.status(HttpStatus.NOT_FOUND).body(exception.getMessage());    }    @GetMapping("/marketItem/{id}")    public ResponseEntity<MarketItem> getMarketItemById(@PathVariable String id){        MarketItem marketItem = marketItemRepository.getMarketItemById(id);        return ResponseEntity.status(HttpStatus.FOUND).body(marketItem);    }    @PostMapping("/marketItem")    public ResponseEntity<MarketItem> createArticleCard(@RequestBody MarketItem marketItem){        marketItemRepository.addMarketItem(marketItem);        return ResponseEntity.status(HttpStatus.FOUND).body(marketItem);    }}