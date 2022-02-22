package ru.babyhall.domain;

import java.io.Serializable;
import java.util.List;

public class Offer implements Serializable {
    //<offer id="00-00023530" available="false">
    private int id;
    private String categoryId; //<categoryId>00-00023507</categoryId>
    private String category; //<category>Подгузники и пеленки</category>
    private String subcategory; //<subcategory>Подгузники-трусики</subcategory>
    private String vendor; // <vendor>INSEENSE</vendor>
    private String country; // <country>Россия</country>
    private String vendorCode; //<vendorCode>Ins20gold</vendorCode>
    private String barcode; //<barcode>6970659872379</barcode>
    private String name; //<name>Подгузники-трусики Inseense V6 XXL (+15 кг) 20 шт</name>
    private String namefull; //<namefull>Подгузники-трусики Inseense V6 XXL (+15 кг) 20 шт</namefull>
    private String price1; // <price1>812</price1>
    private String price2; //<price2>650</price2>
    private String currencyId; //<curencyId>RUR</curencyId>
    private String stockstatus; //<stockstatus>Нет на складе</stockstatus>
    private String demission; //<demission>20х24х16</demission>
    private String boxtype; //<BoxType/>
    private String gabarit; //<gabarit>20х24х16</gabarit>
    private String volume; //<volume>0,00768</volume>
    private String weight; //<weight>0,66</weight>
    private String nettoweight; //<nettoweight>0,66</nettoweight>
    private String materials; //<materials>внутренняя поверхность: полиолефин, впитывающий слой; внешней: полиолефин нетканного типа</materials>
    private String garantee; //<garantee>0</garantee>
    private String description;//<description>• Новые подгузники-трусики Inseense V6 создают максимальный комфорт, обеспечивая сухость кожи и свободу движений. • Благодаря суперабсорбенту во впитывающем слое подгузник быстро и надежно впитывает влагу. • Кожа остается сухой и здоровой. • Водонепроницаемая дышащая мембрана обеспечивает вентиляцию воздуха внутри подгузника, позволяя коже дышать. • Приятный нетканный материал внешней поверхности не раздражает кожу, препятствует появлению покраснений. • Подгузники-трусики имеют удобные бортики и пояс, которые растягиваются на нужную длину. • Резиночки не натирают и не оставляют следов на коже ребенка. • Размер XXL предназначен для детей с весом от 15 кг.</description>
    private String colour; //<colour>Белый</colour>
    private String picture; //<picture>http://www.paremo.ru/upload/images/goods/7800a4d0-7ef7-11ea-6291-b42e99403749_1.970.jpg</picture>
    private String medialink; //<medialink/>
    private String delivery; //<delivery>true</delivery>
    private String HScode; //<HScode>9619008101</HScode>
    //private List<Offer> offers;


    public Offer() {
    }

    public Offer(int id, String categoryId, String category, String subcategory, String vendor, String country, String vendorCode, String barcode, String name, String namefull,
                 String price1, String price2, String currencyId, String stockstatus, String demission, String boxtype, String gabarit, String volume, String weight, String nettoweight, String materials,
                 String garantee, String description, String colour, String picture, String medialink, String delivery, String HScode) {

    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getCategoryId() {
        return categoryId;
    }

    public void setCategoryId(String categoryId) {
        this.categoryId = categoryId;
    }

    public String getCategory() {
        return category;
    }

    public void setCategory(String category) {
        this.category = category;
    }

    public String getSubcategory() {
        return subcategory;
    }

    public void setSubcategory(String subcategory) {
        this.subcategory = subcategory;
    }

    public String getVendor() {
        return vendor;
    }

    public void setVendor(String vendor) {
        this.vendor = vendor;
    }

    public String getCountry() {
        return country;
    }

    public void setCountry(String country) {
        this.country = country;
    }

    public String getVendorCode() {
        return vendorCode;
    }

    public void setVendorCode(String vendorCode) {
        this.vendorCode = vendorCode;
    }

    public String getBarcode() {
        return barcode;
    }

    public void setBarcode(String barcode) {
        this.barcode = barcode;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getNamefull() {
        return namefull;
    }

    public void setNamefull(String namefull) {
        this.namefull = namefull;
    }

    public String getPrice1() {
        return price1;
    }

    public void setPrice1(String price1) {
        this.price1 = price1;
    }

    public String getPrice2() {
        return price2;
    }

    public void setPrice2(String price2) {
        this.price2 = price2;
    }

    public String getCurrencyId() {
        return currencyId;
    }

    public void setCurrencyId(String currencyId) {
        this.currencyId = currencyId;
    }

    public String getStockstatus() {
        return stockstatus;
    }

    public void setStockstatus(String stockstatus) {
        this.stockstatus = stockstatus;
    }

    public String getDemission() {
        return demission;
    }

    public void setDemission(String demission) {
        this.demission = demission;
    }

    public String getBoxtype() {
        return boxtype;
    }

    public void setBoxtype(String boxtype) {
        this.boxtype = boxtype;
    }

    public String getGabarit() {
        return gabarit;
    }

    public void setGabarit(String gabarit) {
        this.gabarit = gabarit;
    }

    public String getVolume() {
        return volume;
    }

    public void setVolume(String volume) {
        this.volume = volume;
    }

    public String getWeight() {
        return weight;
    }

    public void setWeight(String weight) {
        this.weight = weight;
    }

    public String getNettoweight() {
        return nettoweight;
    }

    public void setNettoweight(String nettoweight) {
        this.nettoweight = nettoweight;
    }

    public String getMaterials() {
        return materials;
    }

    public void setMaterials(String materials) {
        this.materials = materials;
    }

    public String getGarantee() {
        return garantee;
    }

    public void setGarantee(String garantee) {
        this.garantee = garantee;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public String getColour() {
        return colour;
    }

    public void setColour(String colour) {
        this.colour = colour;
    }

    public String getPicture() {
        return picture;
    }

    public void setPicture(String picture) {
        this.picture = picture;
    }

    public String getMedialink() {
        return medialink;
    }

    public void setMedialink(String medialink) {
        this.medialink = medialink;
    }

    public String getDelivery() {
        return delivery;
    }

    public void setDelivery(String delivery) {
        this.delivery = delivery;
    }

    public String getHScode() {
        return HScode;
    }

    public void setHScode(String HScode) {
        this.HScode = HScode;
    }

    /*public List<Offer> getOffers() {
        return offers;
    }

    public void setOffers(List<Offer> offers) {
        this.offers = offers;
    }*/

    public Offer clone() {
        return new Offer(getId(), getCategoryId(), getCategory(), getSubcategory(), getVendor(), getCountry(), getVendorCode(), getBarcode(), getName(), getNamefull(), getPrice1(), getPrice2(), getCurrencyId(), getStockstatus(), getDemission(), getBoxtype(), getGabarit(), getVolume(), getWeight(), getNettoweight(), getMaterials(), getGarantee(), getDescription(), getColour(), getPicture(), getMedialink(), getDelivery(), getHScode());
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + ((category == null) ? 0 : category.hashCode());
        return result;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null) {
            return false;
        }
        if (getClass() != obj.getClass()) {
            return false;
        }
        Offer other = (Offer) obj;
        if (category == null) {
            return other.category == null;
        }
        else {
            return category.equals(other.category);
        }
    }

//</offer>
    /*private int id;
    private String code;
    private String name;
    private String description;
    private String image;
    private double price;
    private String category;
    private int quantity;
    private InventoryStatus inventoryStatus;
    private int rating;
    private List<Order> orders;*/





    /*public Offer(int id, String code, String name, String description, String image, double price, String category, int quantity,
                 InventoryStatus inventoryStatus, int rating) {
        this.id = id;
        this.code = code;
        this.name = name;
        this.description = description;
        this.image = image;
        this.price = price;
        this.category = category;
        this.quantity = quantity;
        this.inventoryStatus = inventoryStatus;
        this.rating = rating;
    }*/

 /*   @Override
    public Offer clone() {
        return new Offer(getId(), getCode(), getName(), getDescription(), getImage(), getPrice(), getCategory(), getQuantity(),
                getInventoryStatus(), getRating());
    }


    public List<Offer> getOffers() {
        return this.offers;
    }

    public void setOffers(List<Offer> offers) {
        this.offers = offers;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + ((code == null) ? 0 : code.hashCode());
        return result;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null) {
            return false;
        }
        if (getClass() != obj.getClass()) {
            return false;
        }
        Offer other = (Offer) obj;
        if (code == null) {
            return other.code == null;
        }
        else {
            return code.equals(other.code);
        }
    }*/

}
