package com.example.beanprovider;

import java.util.ArrayList;
import java.util.List;

import com.example.entity.Detail;
import com.example.entity.Location;
import com.example.entity.Pool;
import com.example.entity.StockItem;
import com.example.entity.User;

public class UserBeanProvider {

	public static List<User> getUsers() {
		List<User> users = new ArrayList<>();
		users.add(new User(new Detail(1), "Varun Parwatikar", "8904565737"));
		users.add(new User(new Detail(2), "Naveen Naik", "9483282967"));
		users.add(new User(new Detail(3), "Ajit Vydula", "8105642836"));
		users.add(new User(new Detail(4), "Ram Hegde", "9449990820"));
		users.add(new User(new Detail(5), "Sumanth Hegde", "8277663093"));
		return users;
	}

	public static List<Pool> getPools() {
		StockItem item1 = new StockItem("MT_111", "Visa Card", 100);
		StockItem item2=new StockItem("MT_112", "Visa Card", 200);
		List<StockItem> items=new ArrayList<StockItem>();
		items.add(item1);
		items.add(item2);
		Location location=new Location("Madrid", 300,items );
		List<Location> locations=new ArrayList<>();
		locations.add(location);
		Pool pool=new Pool("Pool A", 300, locations);
		List<Pool> pools=new ArrayList<>();
		pools.add(pool);
		return pools;
	}
}
