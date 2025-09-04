package entities;

import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.concurrent.TimeUnit;

public class Reservation {
	
	private int roomNumber;
	private Date checkIn;
	private Date checkOut;
	
	private static SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");
	// metodo estatico para que nao seja instancia um novo SimpleDateFormat pra cada objeto reservation
	
	public Reservation() {
		
	}

	public Reservation(int roomNumber, Date checkIn, Date checkOut) {
		this.roomNumber = roomNumber;
		this.checkIn = checkIn;
		this.checkOut = checkOut;
	}

	public int getRoomNumber () {
		return roomNumber;
	}

	public void setRoomNumber (int roomNumber) {
		this.roomNumber = roomNumber;
	}

	public Date getCheckin () {
		return checkIn;
	}

	public Date getCheckout () {
		return checkOut;
	}
	
	public long duration () {
		long diff = checkOut.getTime() - checkIn.getTime(); //pega o valor das duas variaves em mlisegundo
		return TimeUnit.DAYS.convert(diff, TimeUnit.MILLISECONDS); //pega o diff e transforma o milisegundo em dias
	}
	
	public String updateDates (Date checkIn, Date checkOut) {
		Date now = new Date();
		if (checkIn.before(now) || checkOut.before(now)) {
			return "Reservation dates for update must be future dates";
		}
		if (!checkOut.after(checkIn)) {
			return "Check-out must be after check-in date";
		}
		this.checkIn = checkIn;
		this.checkOut = checkOut;
		return null;
	}
	@Override
	public String toString(){
		return "Room"
				+ roomNumber
				+ ", check-in: "
				+ sdf.format(checkIn)
				+ ", check-out: "
				+ sdf.format(checkOut)
				+ ", "
				+ duration()
				+ " nights";
	}
}
