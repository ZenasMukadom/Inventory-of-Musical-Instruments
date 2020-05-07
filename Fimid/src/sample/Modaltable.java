package sample;

public class Modaltable {

    String id,family,brand,modal,price,shopname,shoploc,avail;

    public Modaltable(String id, String family, String brand, String modal, String price, String shopname, String shoploc, String avail) {
        this.id = id;
        this.family = family;
        this.brand = brand;
        this.modal = modal;
        this.price = price;
        this.shopname = shopname;
        this.shoploc = shoploc;
        this.avail = avail;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getFamily() {
        return family;
    }

    public void setFamily(String family) {
        this.family = family;
    }

    public String getBrand() {
        return brand;
    }

    public void setBrand(String brand) {
        this.brand = brand;
    }

    public String getModal() {
        return modal;
    }

    public void setModal(String modal) {
        this.modal = modal;
    }

    public String getPrice() {
        return price;
    }

    public void setPrice(String price) {
        this.price = price;
    }

    public String getShopname() {
        return shopname;
    }

    public void setShopname(String shopname) {
        this.shopname = shopname;
    }

    public String getShoploc() {
        return shoploc;
    }

    public void setShoploc(String shoploc) {
        this.shoploc = shoploc;
    }

    public String getAvail() {
        return avail;
    }

    public void setAvail(String avail) {
        this.avail = avail;
    }
}

