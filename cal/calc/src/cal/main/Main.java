package cal.main;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.util.ArrayList;
import java.util.List;

public class Main {

	public static void main(String[] args) {
		List<String> a = new ArrayList<String>();
		List<String> b = new ArrayList<String>();
		List<String> c = new ArrayList<String>();
		List<String> d = new ArrayList<String>();
		List<String> e = new ArrayList<String>();

		a.add(0, "0");
		a.add(1, "1");
		a.add(2, "2");
		a.add(3, "3");
		a.add(4, "4");
		a.add(5, "5");

		b.add(0, "Empty");
		b.add(1, "1");
		b.add(2, "asdf");
		b.add(3, "asdfasdfasdfasdfasd");
		b.add(4, "asdfasdfasdfasdfasdf");
		b.add(5, "asdfasdfasdfasdfasdfa");
		b.add(6, "あああああああああああああああああああ");
		b.add(7, "ああああああああああああああああああああ");
		b.add(8, "あああああああああああああああああああああ");
		b.add(9, "ｶﾀｶﾅ");
		b.add(10, "ぜんかく");
		b.add(11, "!\"#$");

		c.add(0, "Empty");
		c.add(1, "1");
		c.add(2, "asdf");
		c.add(3, "asdfasdfasdfasdfasdfasd");
		c.add(4, "asdfasdfasdfasdfasdfasdf");
		c.add(5, "asdfasdfasdfasdfasdfasdfa");
		c.add(6, "ああああああああああああああああああああああああ");
		c.add(7, "あああああああああああああああああああああああああ");
		c.add(8, "ああああああああああああああああああああああああああ");
		c.add(9, "ｶﾀｶﾅ");
		c.add(10, "ぜんかく");
		c.add(11, "!\"#$");

		d.add(0, "Empty");
		d.add(1, "1");
		d.add(2, "asdf");
		d.add(3, "asdfasdfasdfasdfasdfasdfasdfasdfasdfasdfasdfasdfasasdfasdfasdfasdfasdfasdfasdfasdfasdfasdfasdfasdfasasdfasdfasdfasdfasdfasdfasdfasdfasdfasdfasdfasdfasasdfasdfasdfasdfasdfasdfasdfasdfasdfasdfasdfasdfasasdfasdfasdfasdfasdfasdfasdfasdfasdfasdfasdfasdfa");
		d.add(4, "asdfasdfasdfasdfasdfasdfasdfasdfasdfasdfasdfasdfasasdfasdfasdfasdfasdfasdfasdfasdfasdfasdfasdfasdfasasdfasdfasdfasdfasdfasdfasdfasdfasdfasdfasdfasdfasasdfasdfasdfasdfasdfasdfasdfasdfasdfasdfasdfasdfasasdfasdfasdfasdfasdfasdfasdfasdfasdfasdfasdfasdfas");
		d.add(5, "asdfasdfasdfasdfasdfasdfasdfasdfasdfasdfasdfasdfasasdfasdfasdfasdfasdfasdfasdfasdfasdfasdfasdfasdfasasdfasdfasdfasdfasdfasdfasdfasdfasdfasdfasdfasdfasasdfasdfasdfasdfasdfasdfasdfasdfasdfasdfasdfasdfasasdfasdfasdfasdfasdfasdfasdfasdfasdfasdfasdfasdfasd");
		d.add(6, "あああああああああああああああああああああああああああああああああああああああああああああああああああああああああああああああああああああああああああああああああああああああああああああああああああああああああああああああああああああああああああああああああああああああああああああああああああああ");
		d.add(7, "ああああああああああああああああああああああああああああああああああああああああああああああああああああああああああああああああああああああああああああああああああああああああああああああああああああああああああああああああああああああああああああああああああああああああああああああああああああああ");
		d.add(8, "あああああああああああああああああああああああああああああああああああああああああああああああああああああああああああああああああああああああああああああああああああああああああああああああああああああああああああああああああああああああああああああああああああああああああああああああああああああああ");
		d.add(9, "ｶﾀｶﾅ");
		d.add(10, "ぜんかく");
		d.add(11, "!\"#$");

		e.add(0, "Empty");
		e.add(1, "1.png");
		e.add(2, "1234512345123451.png");
		e.add(3, "1.jpg");
		e.add(4, "1.jpeg");
		e.add(5, "1.pngpng");
		e.add(6, "499kb.jpg");
		e.add(7, "500kb.jpg");
		e.add(8, "501kb.jpg");
		e.add(9, "1.jpe");

		List<String> temp1 = new ArrayList<String>();
		List<String> temp2 = new ArrayList<String>();
		List<String> result = new ArrayList<String>();

		for (int i = 0; i < b.size(); i++) {
			temp1.addAll(a);
		}

		for (int i = 0; i < b.size(); i++) {
			for (int j = 0; j < temp1.size() / b.size(); j++) {
				temp2.add(b.get(i));
			}
		}

		for (int i = 0; i < temp1.size(); i++) {
			temp1.set(i, temp1.get(i) + " " + temp2.get(i));
		}

		result.addAll(temp1);
		temp1.clear();
		temp2.clear();

		for (int i = 0; i < c.size(); i++) {
			temp1.addAll(result);
		}

		for (int i = 0; i < c.size(); i++) {
			for (int j = 0; j < temp1.size() / c.size(); j++) {
				temp2.add(c.get(i));
			}
		}

		for (int i = 0; i < temp1.size(); i++) {
			temp1.set(i, temp1.get(i) + " " + temp2.get(i));
		}

		result.clear();
		result.addAll(temp1);
		temp1.clear();
		temp2.clear();

		for (int i = 0; i < d.size(); i++) {
			temp1.addAll(result);
		}

		for (int i = 0; i < d.size(); i++) {
			for (int j = 0; j < temp1.size() / d.size(); j++) {
				temp2.add(d.get(i));
			}
		}

		for (int i = 0; i < temp1.size(); i++) {
			temp1.set(i, temp1.get(i) + " " + temp2.get(i));
		}

		result.clear();
		result.addAll(temp1);
		temp1.clear();
		temp2.clear();

		for (int i = 0; i < e.size(); i++) {
			temp1.addAll(result);
		}

		for (int i = 0; i < e.size(); i++) {
			for (int j = 0; j < temp1.size() / e.size(); j++) {
				temp2.add(e.get(i));
			}
		}

		for (int k = 0; k < temp1.size(); k++) {
			temp1.set(k, temp1.get(k) + " " + temp2.get(k));
		}

		result.clear();
		result.addAll(temp1);
		temp1.clear();
		temp2.clear();

		for (int i = 0; i < result.size(); i++) {
			System.out.println(result.get(i));
		}

		System.out.println(result.size());

        String fileName = "C:\\result.txt" ;

        try{

            BufferedWriter fw = new BufferedWriter(new FileWriter(fileName, true));

            for(int i = 0; i<result.size();i++) {
            	fw.write(result.get(i)+"\r\n");
            }

            fw.flush();

            fw.close();


        }catch(Exception e1){
            e1.printStackTrace();
        }




	}

}
