package model.entities;

import model.exceptions.DomainException;

import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.concurrent.TimeUnit;

public class Reservation {
    private Integer roomNumber;
    private Date checkin;
    private Date checkout;

    public Reservation() {
    }

    private static SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");

    public Reservation(Integer roomNumber, Date checkin, Date checkout) throws DomainException {
        if (!checkout.after(checkin)) {
            throw new DomainException("Check-out date must be after check-in date");
        }
        this.roomNumber = roomNumber;
        this.checkin = checkin;
        this.checkout = checkout;
    }

    public Integer getRoomNumber() {
        return roomNumber;
    }

    public void setRoomNumber(Integer roomNumber) {
        this.roomNumber = roomNumber;
    }

    public Date getCheckin() {
        return checkin;
    }

    public Date getCheckout() {
        return checkout;
    }

    public long duration() {
        long diff = checkout.getTime() - checkin.getTime(); //devolve a quantidade de milisegundos da data
        return TimeUnit.DAYS.convert(diff, TimeUnit.MILLISECONDS); // .convert() converte o timeUNit que estava em milisegundos para dias
    }

    public void updateDates(Date checkin, Date checkout) {
        Date now = new Date();
        if (checkin.before(now) || checkout.before(now)) {
            throw new DomainException("Resevation dates for update must be future dates");
        }
        if (!checkout.after(checkin)) {
            throw new DomainException("Check-out date must be after check-in date.");
        }
        this.checkin = checkin;
        this.checkout = checkout;
    }

    @Override
    public String toString() {
    return "Room: "
            + roomNumber
            + ", check-in: "
            + sdf.format(checkin)
            + ", check-out: "
            + sdf.format(checkout)
            + ", "
            + duration()
            + " nights.";
    }
}

