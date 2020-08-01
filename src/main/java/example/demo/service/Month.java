package example.demo.service;

enum Month {
    JANUARY("ЯНВАРЬ"),
    FEBRUARY("ФЕВРАЛЬ"),
    MARCH("МАРТ"),
    APRIL("АПРЕЛЬ"),
    MAY("МАЙ"),
    JUNE("ИЮНЬ"),
    JULY("ИЮЛЬ"),
    AUGUST("АВГУСТ"),
    SEPTEMBER("СЕНТЯБРЬ"),
    OCTOBER("ОКТЯБРЬ"),
    NOVEMBER("НОЯБРЬ"),
    DECEMBER("ДЕКАБРЬ");

    private final String rusMonth;

    Month(String rusMonth) {
        this.rusMonth = rusMonth;
    }

    String getRusMonth() {
        return rusMonth;
    }
}