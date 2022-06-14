//Name: Levi Williams
// Student number: 218250142
package za.ac.cput.domain;


import javax.persistence.Embeddable;

@Embeddable
public class Country {
    public String id;
    public String name;

    public Country(){}

    public Country (Builder builder){
        this.id = builder.id;
        this.name = builder.name;
    }

    public String getId() {
        return id;
    }


    public String getName() {
        return name;
    }

    @Override
    public String toString() {
        return "Country{" +
                "id='" + id + '\'' +
                ", name='" + name + '\'' +
                '}';
    }
public static class Builder{
public String id;
public String name;

    public Builder setId(String id) {
        this.id = id;
        return this;
    }

    public Builder setName(String name) {
        this.name = name;
        return this;
    }
    public Builder copy(Country country){
this.id = country.id;
this.name = country.name;
return this;
    }
    public Country build(){return new Country(this);}
}
}