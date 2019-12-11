public enum  Status { //статусы заявок

    project (10, "Проект"),
    agree (30,"На согласовании"),
    sign (40,"Подписана"),
    register(50,"Зарегистрирована"),
    reject (20,"Отклонена"),
    execute (60,"Исполнена");

    private  Integer type;
    private String nameStatus;
    Status (Integer type, String nameStatus) {
        this.type=type;
        this.nameStatus=nameStatus;
    }
    public String getType()
    {
        return type;
    }
    public String getnameStatus()
    {
        return nameStatus;
    }


}
