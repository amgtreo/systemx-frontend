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

import com.noble.team.showcase.omega.domain.Product;
import com.noble.team.showcase.omega.service.ProductService;

import javax.annotation.PostConstruct;
import javax.faces.bean.RequestScoped;
import java.util.ArrayList;
import java.util.List;
import org.primefaces.model.ResponsiveOption;
import com.noble.team.showcase.omega.domain.Photo;
import com.noble.team.showcase.omega.service.PhotoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
@RequestScoped
public class MediaDemoView {

    private List<Product> products;

    private List<ResponsiveOption> responsiveOptions;

    private List<Photo> photos;

    @Autowired
    private ProductService productService;

    @Autowired
    private PhotoService photoService;

    @PostConstruct
    public void init() {
        products = productService.getProducts(9);
        responsiveOptions = new ArrayList<>();
        responsiveOptions.add(new ResponsiveOption("1024px", 3, 3));
        responsiveOptions.add(new ResponsiveOption("768px", 2, 2));
        responsiveOptions.add(new ResponsiveOption("560px", 1, 1));

        photos = photoService.getPhotos();
    }

    public List<Product> getProducts() {
        return products;
    }

    public void setProductService(ProductService productService) {
        this.productService = productService;
    }

    public void setPhotoService(PhotoService photoService) {
        this.photoService = photoService;
    }

    public List<ResponsiveOption> getResponsiveOptions() {
        return responsiveOptions;
    }

    public void setResponsiveOptions(List<ResponsiveOption> responsiveOptions) {
        this.responsiveOptions = responsiveOptions;
    }

    public List<Photo> getPhotos() {
        return photos;
    }

}