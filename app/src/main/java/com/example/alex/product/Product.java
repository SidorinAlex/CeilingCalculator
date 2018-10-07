package com.example.alex.product;

import android.os.Parcel;
import android.os.Parcelable;
import android.util.Log;

import com.example.alex.product.ceiling.Texture;

import java.util.Objects;

/**
 * Created by alex on 01.03.2018.
 */

public class Product implements Parcelable, Cloneable {
    public static final Parcelable.Creator<Product> CREATOR = new Parcelable.Creator<Product>() {
        // распаковываем объект из Parcel
        public Product createFromParcel(Parcel in) {
            Log.d("Parcelable", "createFromParcel");
            return new Product(in);
        }

        @Override
        public Product[] newArray(int i) {
            return new Product[i];
        }
    };
    private float quantity;
    private float materialCoast;
    private int coastOfWork;
    private int price;
    private String name;
    private String groupName;
    private String units;
    private Texture texture;

    public Product() {
    }

    private Product(Parcel parcel) {
        Log.d("parcel", "MyObject(Parcel parcel)");
        quantity = parcel.readFloat();
        materialCoast = parcel.readFloat();
        coastOfWork = parcel.readInt();
        price = parcel.readInt();
        name = parcel.readString();
        groupName = parcel.readString();
        units = parcel.readString();
        texture = (Texture) parcel.readSerializable();

    }

    public float getQuantity() {
        return quantity;
    }

    public void setQuantity(float quantity) {
        this.quantity = quantity;
    }

    public int getIntQuantity() {
        int intQuantity = (int) (quantity);
        return intQuantity;
    }

    public float getCoastPrice() {
        float coastPrice = materialCoast + coastOfWork;
        return coastPrice;
    }

    public float getMaterialCoast() {
        return materialCoast;
    }

    public void setMaterialCoast(float materialCoast) {
        this.materialCoast = materialCoast;
    }

    public int getCoastOfWork() {
        return coastOfWork;
    }

    public void setCoastOfWork(int coastOfWork) {
        this.coastOfWork = coastOfWork;
    }

    public int getPrice() {
        return price;
    }

    public void setPrice(int price) {
        this.price = price;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getGroupName() {
        return groupName;
    }

    public void setGroupName(String groupName) {
        this.groupName = groupName;
    }

    public String getUnits() {
        return units;
    }

    public void setUnits(String units) {
        this.units = units;
    }

    public Texture getTexture() {
        return texture;
    }

    public void setTexture(Texture texture) {
        this.texture = texture;
    }

    public String getStringQuantity() {
        float val = getQuantity();
        String s = String.format("%.0f", val);
        return s;
    }

    public int getTotalPrice() {
        int totalCoast = (int) (quantity * price);
        return totalCoast;
    }

    public int getTotalCoastPrice() {
        int totalCoast = (int) (quantity * getCoastPrice());
        return totalCoast;
    }

    public int getTotalCoastOfWork() {
        int totalCoast = (int) (quantity * coastOfWork);
        return totalCoast;
    }

    public int getTotalMaterialCoast() {
        int totalCoast = (int) (quantity * materialCoast);
        return totalCoast;
    }

    @Override
    public String toString() {

        String str = null;
        String quantityAndUnits;
        if (getUnits().equals("шт") || getUnits().equals("км") || getUnits().equals("помещ.")) {
            quantityAndUnits = getIntQuantity() + " " + getUnits();
        } else {
            quantityAndUnits = getStringQuantity() + " " + getUnits();
        }

        switch (getGroupName()) {
            case "Белые натяжные потолки":
                str = getName() + " " + getTexture() + " " + getQuantity()
                        + " " + getUnits() + "\n за единицу " + getPrice() + ", всего " + getTotalPrice();
                break;
            case "Цветные натяжные потолки":
                str = getName() + getTexture() + " " + getQuantity()
                        + " " + getUnits() + "\nЗа единицу " + getPrice() + ", всего " + getTotalPrice();
                break;
            case "Натяжные потолки Exclusive":
                str = getName() + " " + getTexture() + " " + getQuantity()
                        + " " + getUnits() + "\nЗа единицу " + getPrice() + ", всего " + getTotalPrice();
                break;
            case "Тканевые потолки":
                str = getName() + " " + getTexture() + " " + getQuantity()
                        + " " + getUnits() + "\nЗа единицу " + getPrice() + ", всего " + getTotalPrice();
                break;
            case "Система крепления":
                str = getName() + " " + quantityAndUnits + "\nЗа единицу " + getPrice() + ", всего " + getTotalPrice();
                break;
            case "Декоративные вставки":
                str = getName() + " " + quantityAndUnits + "\nЗа единицу " + getPrice() + ", всего " + getTotalPrice();
                break;
            case "Основные работы":
                str = getName() + " " + quantityAndUnits + "\nЗа единицу " + getPrice() + ", всего " + getTotalPrice();
                break;
            case "Дизайн":
                str = getName() + " " + getQuantity()
                        + " " + getUnits() + "\nЗа единицу " + getPrice() + ", всего " + getTotalPrice();
                break;
            case "Многоуровневость":
                str = getName() + " " + quantityAndUnits + "\nЗа единицу " + getPrice() + ", всего " + getTotalPrice();
                break;
            case "Светодиодная лента":
                str = getName() + " " + quantityAndUnits + "\nЗа единицу " + getPrice() + ", всего " + getTotalPrice();
                break;
            case "Установка бруса":
                str = getName() + " " + quantityAndUnits + "\nЗа единицу " + getPrice() + ", всего " + getTotalPrice();
                break;
            case "Второстепенные доп.работы":
                str = getName() + " " + quantityAndUnits + "\nЗа единицу " + getPrice() + ", всего " + getTotalPrice();
                break;
            case "Потолочные карнизы":
                str = getName() + " " + quantityAndUnits + "\nЗа единицу " + getPrice() + ", всего " + getTotalPrice();
                break;
            case "Светодиодные светильники":
                str = getName() + " " + quantityAndUnits + "\nЗа единицу " + getPrice() + ", всего " + getTotalPrice();
                break;
            case "Светодиодные панели":
                str = getName() + " " + quantityAndUnits + "\nЗа единицу " + getPrice() + ", всего " + getTotalPrice();
                break;
            case "Люстры":
                str = getName() + " " + quantityAndUnits + "\nЗа единицу " + getPrice() + ", всего " + getTotalPrice();
                break;

        }

        return str;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Product)) return false;
        Product product = (Product) o;
        return Objects.equals(name, product.name) &&
                Objects.equals(groupName, product.groupName) &&
                texture == product.texture;
    }

    @Override
    public int hashCode() {

        return Objects.hash(name, groupName, texture);
    }

    @Override
    public int describeContents() {
        return 0;
    }

    @Override
    public void writeToParcel(Parcel parcel, int i) {
        Log.d("parcel", "writeToParcel");
        parcel.writeFloat(quantity);
        parcel.writeFloat(materialCoast);
        parcel.writeInt(coastOfWork);
        parcel.writeInt(price);
        parcel.writeString(name);
        parcel.writeString(groupName);
        parcel.writeString(units);
        parcel.writeSerializable(texture);
    }

    public Product clone() throws CloneNotSupportedException {
        return (Product) super.clone();
    }

}
