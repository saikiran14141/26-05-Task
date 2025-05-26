package com.main3;
import com.publisher.*;
import com.book.*;
public class Main {

	public static void main(String[] args) {
		Publisher pb = Publisher.getManufacturerObject("Kiran", "Hyd", "A018");
		Book bk = Book.getProductObject("One8", "Kiran", pb, 2000.0);
		System.out.println(bk);
		System.out.println(pb);
	}
}
