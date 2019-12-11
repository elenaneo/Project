import java.util.Date;

public class Request {
//класс заявка
    String number; //номер заявки
    User user; //сотрудник
    Status status; // статус заявки
    public Request (Request request) //конструктор для создания заявки
    {
        Number = request.number;
        User = request.user;
        status = request.status;
    }
    public Request (String newNumber, User newUser, HistStatus newStatus)//конструктор для создания заявки с параметрами
    {
        number=newNumber;
        user=newUser;
        status=newStatus;
    }

    public void setNumber(String number) {
        Number = number;
    }

    public void setStatus(HistStatus status) {
        this.status = status;
    }

    public void setUser(User user) {
        this.user = user;
    }

    public HistStatus getStatus() {
        return status;
    }

    public String getLastNumber() {
        return Number;
    }

}
public class ReqTravel extends Request {
    //класс заявка на командировку
    Date dateBegin; //дата начала командировки
    Date dateEnd; //дата окончания командировки
    City cityBegin; // город выезда в командировку
    City cityNazn; // город командирования
    Target target; // цель командировки
    String text; // расшифровка цели и примечания

    public ReqTravel (ReqTravel travel) { //конструктор

        super(travel);
        dateBegin = travel.dateBegin;
        dateEnd = travel.dateEnd;
        cityBegin = travel.cityBegin;
        cityNazn = travel.cityNazn;
        target = travel.target;
        text = travel.text;
    }
        // Конструктор, используемый
        // при указании всех параметров
        public ReqTravel (String newNumber, User newUser, HistStatus newStatus, Date newDateBegin,
                          Date newDateEnd, City newCityBegin, City neCityNazn,
                          Target newtarget, String newText) {
            super(newNumber,newUser,newStatus); // вызов конструктора суперкласса
            dateBegin = dateBegin;
            dateEnd = dateEnd;
            cityBegin = cityBegin;
            cityNazn = cityNazn;
            target = target;
            text = text
        }

}
public class ReqAvans extends Request {
    //класс заявка на командировку
    double summa; //сумма аванса
    Date datePayment; // дата выплаты аванса
    ReqTravel reqTravel; // вопрос что лучше ссылка на объект или номер командировки

    public ReqAvans (ReqAvans avans) { //конструктор

        super(avans);
        datePayment = avans.datePayment;
        reqTravel =avans.reqTravel;

    }
    // Конструктор, используемый
    // при указании всех параметров
    public ReqTravel (String newNumber, User newUser, HistStatus newStatus, Date newDatePayment,
                      ReqTravel newReqTravel) {
        super(newNumber,newUser,newStatus); // вызов конструктора суперкласса
        datePayment = newDatePayment;
        reqTravel =newReqTravel;
    }

}
public class ReqReservat extends Request {
    //заявка на бронирование
    ReqTravel reqTravel; //ссылка на  командировку
    TypeReservat typeReservat;//тип брони c его условиями

    public ReqReservat (ReqReservat reservat) { //конструктор

        super(avans);
        TypeReservat = avans.TypeReservat;
        reqTravel =avans.reqTravel;

    }
}




