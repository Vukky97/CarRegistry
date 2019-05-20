/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Frontend;

import java.beans.PropertyChangeListener;
import java.beans.PropertyChangeSupport;
import java.io.Serializable;
import javax.persistence.Basic;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;
import javax.persistence.Table;
import javax.persistence.Transient;

/**
 *
 * @author Dell
 */
@Entity
@Table(name = "cars", catalog = "myschema", schema = "")
@NamedQueries({
    @NamedQuery(name = "Cars.findAll", query = "SELECT c FROM Cars c")
    , @NamedQuery(name = "Cars.findById", query = "SELECT c FROM Cars c WHERE c.id = :id")
    , @NamedQuery(name = "Cars.findByMake", query = "SELECT c FROM Cars c WHERE c.make = :make")
    , @NamedQuery(name = "Cars.findByModell", query = "SELECT c FROM Cars c WHERE c.modell = :modell")
    , @NamedQuery(name = "Cars.findByEngine", query = "SELECT c FROM Cars c WHERE c.engine = :engine")
    , @NamedQuery(name = "Cars.findByPrice", query = "SELECT c FROM Cars c WHERE c.price = :price")
    , @NamedQuery(name = "Cars.findByAvailable", query = "SELECT c FROM Cars c WHERE c.available = :available")
    , @NamedQuery(name = "Cars.findByYear", query = "SELECT c FROM Cars c WHERE c.year = :year")})
public class Cars implements Serializable {

    @Transient
    private PropertyChangeSupport changeSupport = new PropertyChangeSupport(this);

    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Basic(optional = false)
    @Column(name = "id")
    private Integer id;
    @Basic(optional = false)
    @Column(name = "make")
    private String make;
    @Basic(optional = false)
    @Column(name = "modell")
    private String modell;
    @Basic(optional = false)
    @Column(name = "engine")
    private String engine;
    @Basic(optional = false)
    @Column(name = "price")
    private int price;
    @Column(name = "available")
    private Boolean available;
    @Basic(optional = false)
    @Column(name = "year")
    private int year;

    public Cars() {
    }

    public Cars(Integer id) {
        this.id = id;
    }

    public Cars(Integer id, String make, String modell, String engine, int price, int year) {
        this.id = id;
        this.make = make;
        this.modell = modell;
        this.engine = engine;
        this.price = price;
        this.year = year;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        Integer oldId = this.id;
        this.id = id;
        changeSupport.firePropertyChange("id", oldId, id);
    }

    public String getMake() {
        return make;
    }

    public void setMake(String make) {
        String oldMake = this.make;
        this.make = make;
        changeSupport.firePropertyChange("make", oldMake, make);
    }

    public String getModell() {
        return modell;
    }

    public void setModell(String modell) {
        String oldModell = this.modell;
        this.modell = modell;
        changeSupport.firePropertyChange("modell", oldModell, modell);
    }

    public String getEngine() {
        return engine;
    }

    public void setEngine(String engine) {
        String oldEngine = this.engine;
        this.engine = engine;
        changeSupport.firePropertyChange("engine", oldEngine, engine);
    }

    public int getPrice() {
        return price;
    }

    public void setPrice(int price) {
        int oldPrice = this.price;
        this.price = price;
        changeSupport.firePropertyChange("price", oldPrice, price);
    }

    public Boolean getAvailable() {
        return available;
    }

    public void setAvailable(Boolean available) {
        Boolean oldAvailable = this.available;
        this.available = available;
        changeSupport.firePropertyChange("available", oldAvailable, available);
    }

    public int getYear() {
        return year;
    }

    public void setYear(int year) {
        int oldYear = this.year;
        this.year = year;
        changeSupport.firePropertyChange("year", oldYear, year);
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (id != null ? id.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof Cars)) {
            return false;
        }
        Cars other = (Cars) object;
        if ((this.id == null && other.id != null) || (this.id != null && !this.id.equals(other.id))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "Frontend.Cars[ id=" + id + " ]";
    }

    public void addPropertyChangeListener(PropertyChangeListener listener) {
        changeSupport.addPropertyChangeListener(listener);
    }

    public void removePropertyChangeListener(PropertyChangeListener listener) {
        changeSupport.removePropertyChangeListener(listener);
    }
    
}
