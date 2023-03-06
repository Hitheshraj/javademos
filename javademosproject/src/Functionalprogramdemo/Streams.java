package Functionalprogramdemo;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.stream.Collector;
import java.util.stream.Collectors;

public class Streams {
	public static void main(String[] args) {
		List<Integer> list=new ArrayList<>();
		for(int i=0;i<=10;i++) {
			list.add(i);
		}
		System.out.println(list);
		List<Integer> filterlist=list.stream().filter(i->i%2==0).collect(Collectors.toList());
		System.out.println(filterlist);
		List<Integer> multipied=list.stream().map(i->i*2).collect(Collectors.toList());
		System.out.println(multipied);
		List<String> names=new ArrayList<>();
		names.add("MAX");
		names.add("VARSHA");
		names.add("HARSHA");
		List<String> lnames=names.stream().map(s->s.toLowerCase()).collect(Collectors.toList());
		System.out.println(lnames);
	}

}
