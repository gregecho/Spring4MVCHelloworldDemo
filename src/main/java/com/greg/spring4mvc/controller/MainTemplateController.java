package com.greg.spring4mvc.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/items")
public class MainTemplateController {
     
    @RequestMapping(value="/computers")
    public String getComputersTemplate() {
        return "item_computers";   
    }
 
    @RequestMapping(value="/phones")
    public String getPhonesTemplate() {
        return "item_phones";  
    }
 
    @RequestMapping(value="/printers")
    public String getPrintersTemplate() {
        return "item_printers";    
    }
 
    @RequestMapping(value="/computerdetails")
    public String getComputerDetailsTemplate() {
        return "item_computer_details";    
    }
 
    @RequestMapping(value="/phonedetails")
    public String getPhoneDetailsTemplate() {
        return "item_phone_details";   
    }
 
    @RequestMapping(value="/printerdetails")
    public String getPrinterDetailsTemplate() {
        return "item_printer_details"; 
    }
 
}