package com.kh.exam17;

import java.sql.Date;
import java.util.Calendar;
import java.util.GregorianCalendar;

public class Sample2 {
	
	class RNumber{
		private int number;
		private Date date;
		
		public RNumber(int number, Date date) {
			this.number = number;
			this.date = date;
		}
		public int getNumber() {
			return number;
		}
		public void setNumber(int number) {
			this.number = number;
		}

		public Date getDate() {
			return date;
		}
		public void setDate(Date date) {
			this.date = date;
		}
		@Override
		public String toString() {
			return "RNumber [number=" + number + ", date=" + date + "]";
		}

	}

	public static void main(String[] args) {
		SimpleDateFormat df = new SimpleDateFormat("yyy-MM-dd hh:mm:ss");
		GregorianCalendar gcStrat = new GregorianCalendar();
		GregorianCalendar gcEnd = null();
		Random rd = new Random();
		List<RNumber> iList = new ArrayList<RNumber>();
		while(iList.size() < 10 ) {
			gcEnd = new GregorianCalendar();
			if(((gc.Start.get(Calendar.SECOND) + 3 ) % 60) == gcEnd.get(calendar.SECOND)))
		}
	}

}
