package test.work.entity;

import com.fasterxml.jackson.dataformat.xml.annotation.JacksonXmlProperty;
import com.fasterxml.jackson.dataformat.xml.annotation.JacksonXmlRootElement;
import org.hibernate.annotations.NaturalId;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@JacksonXmlRootElement(localName = "realm")
@Entity
@Table(name = "realm")
public class Realm {

    @JacksonXmlProperty(isAttribute = true)
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;

    @JacksonXmlProperty(isAttribute = true)
    @Column(nullable = false)
    @NaturalId
    private String name;

    @Column
    private String description;

    @Column(name = "token", length = 32, nullable = false)
    private String key;

    public Realm() {}

    public Realm(String name, String key, String description) {
        this.name = name;
        this.key = key;
        this.description = description;
    }

    public int getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public String getDescription() {
        return description;
    }

    public String getKey() {
        return key;
    }

}
