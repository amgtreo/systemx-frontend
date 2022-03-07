/*
   Copyright 2009-2021 PrimeTek.

   Licensed under PrimeFaces Commercial License, Version 1.0 (the "License");
   you may not use this file except in compliance with the License.
   You may obtain a copy of the License at

   Licensed under PrimeFaces Commercial License, Version 1.0 (the "License");

   Unless required by applicable law or agreed to in writing, software
   distributed under the License is distributed on an "AS IS" BASIS,
   WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
   See the License for the specific language governing permissions and
   limitations under the License.
 */
package com.noble.team.showcase.omega.view;

import com.noble.team.showcase.omega.domain.Customer;
import com.noble.team.showcase.omega.service.CustomerService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import javax.annotation.PostConstruct;
import javax.faces.bean.RequestScoped;
import java.util.List;

@Component
@RequestScoped
public class OverlayDemoView {

    private List<Customer> customers;

    private Customer selectedCustomer;

    @Autowired
    private CustomerService service;

    @PostConstruct
    public void init() {
        this.customers = this.service.getCustomers(10);
    }
    
    public List<Customer> getCustomers() {
        return customers;
    }


    public Customer getSelectedCustomer() {
        return selectedCustomer;
    }

    public void setSelectedCustomer(Customer selectedCustomer) {
        this.selectedCustomer = selectedCustomer;
    }
}