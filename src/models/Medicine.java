package models;

public class Medicine {
    private Long id;
    private String name;
    private int price;
    private String count;

    public Medicine(Long id, String name, int price, String count) {
        this.id = id;
        this.name = name;
        this.price = price;
        this.count = count;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getPrice() {
        return price;
    }

    public void setPrice(int price) {
        this.price = price;
    }

    public String getCount() {
        return count;
    }

    public void setCount(String count) {
        this.count = count;
    }

    @Override
    public String toString() {
        return "id=" + id +
                "\n name:" + name +
                "/n price:" + price +
                " count:" + count;
    }
}
