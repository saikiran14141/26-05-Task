package com.main2;
import com.manufacturer.*;
import com.product.*;
public class Main {

	public static void main(String[] args) {
		Manufacturer mf = Manufacturer.getManufacturerObject("kiran", "Hyd", "123");
		Product pd = Product.getProductObject("Laptop", "Electronic", mf, 70000.0);
		System.out.println(pd);
		System.out.println(mf);
		

	}

}
