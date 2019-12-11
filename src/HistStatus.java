import java.util.Date;
public class HistStatus {
    //класс статусов заявок
    String number; //номер заявки
    User user; //сотрудник
    Status oldStatus; // предыдущий статус заявки
    Status newStatus; // новый статус заявки
    Date date; //дата
    String metod; //метод
    String History; //истрия изменения параметров заявки в виде параметр-старое значение - новое значение;
    public HistStatus(){ //конструктор

    }

    public void setHist() {//метод записи в историю изменений

    }

    public void getHist() {//получение истории изменений

    }

}
