//
//package Entity;
//
//import java.io.Serializable;
//import java.util.Collection;
//import javax.persistence.Basic;
//import javax.persistence.Column;
//import javax.persistence.Entity;
//import javax.persistence.GeneratedValue;
//import javax.persistence.GenerationType;
//import javax.persistence.Id;
//import javax.persistence.NamedQueries;
//import javax.persistence.NamedQuery;
//import javax.persistence.OneToMany;
//import javax.persistence.Table;
//import javax.validation.constraints.Size;
//import javax.xml.bind.annotation.XmlRootElement;
//import javax.xml.bind.annotation.XmlTransient;
//
//@Entity
//@Table(name = "Airport")
//@XmlRootElement
//@NamedQueries(
//{
//    @NamedQuery(name = "Airport.findAll", query = "SELECT a FROM Airport a"),
//    @NamedQuery(name = "Airport.findByairportID", query = "SELECT a FROM Airport a WHERE a.airportID = :airportID"),
//    @NamedQuery(name = "Airport.findByIATACode", query = "SELECT a FROM Airport a WHERE a.iATACode = :iATACode"),
//    @NamedQuery(name = "Airport.findByTimeZone", query = "SELECT a FROM Airport a WHERE a.timeZone = :timeZone"),
//    @NamedQuery(name = "Airport.findByName", query = "SELECT a FROM Airport a WHERE a.name = :name"),
//    @NamedQuery(name = "Airport.findByCountry", query = "SELECT a FROM Airport a WHERE a.country = :country"),
//    @NamedQuery(name = "Airport.findByCity", query = "SELECT a FROM Airport a WHERE a.city = :city")
//})
//public class Airport implements Serializable {
//
//    private static final long serialVersionUID = 1L;
//    @Id
//    @GeneratedValue(strategy = GenerationType.IDENTITY)
//    @Basic(optional = false)
//    @Column(name = "airportID")
//    private Integer airportID;
//    @Size(max = 30)
//    @Column(name = "IATACode")
//    private String iATACode;
//    @Size(max = 30)
//    @Column(name = "timeZone")
//    private String timeZone;
//    @Size(max = 30)
//    @Column(name = "name")
//    private String name;
//    @Size(max = 30)
//    @Column(name = "country")
//    private String country;
//    @Size(max = 30)
//    @Column(name = "city")
//    private String city;
//    @OneToMany(mappedBy = "from1")
//    private Collection<Flight> flightCollection;
//    @OneToMany(mappedBy = "too")
//    private Collection<Flight> flightCollection1;
//
//    public Airport()
//    {
//    }
//
//    public Airport(Integer airportID)
//    {
//        this.airportID = airportID;
//    }
//
//    public Integer getairportID()
//    {
//        return airportID;
//    }
//
//    public void setairportID(Integer airportID)
//    {
//        this.airportID = airportID;
//    }
//
//    public String getIATACode()
//    {
//        return iATACode;
//    }
//
//    public void setIATACode(String iATACode)
//    {
//        this.iATACode = iATACode;
//    }
//
//    public String getTimeZone()
//    {
//        return timeZone;
//    }
//
//    public void setTimeZone(String timeZone)
//    {
//        this.timeZone = timeZone;
//    }
//
//    public String getName()
//    {
//        return name;
//    }
//
//    public void setName(String name)
//    {
//        this.name = name;
//    }
//
//    public String getCountry()
//    {
//        return country;
//    }
//
//    public void setCountry(String country)
//    {
//        this.country = country;
//    }
//
//    public String getCity()
//    {
//        return city;
//    }
//
//    public void setCity(String city)
//    {
//        this.city = city;
//    }
//
//    @XmlTransient
//    public Collection<Flight> getFlightCollection()
//    {
//        return flightCollection;
//    }
//
//    public void setFlightCollection(Collection<Flight> flightCollection)
//    {
//        this.flightCollection = flightCollection;
//    }
//
//    @XmlTransient
//    public Collection<Flight> getFlightCollection1()
//    {
//        return flightCollection1;
//    }
//
//    public void setFlightCollection1(Collection<Flight> flightCollection1)
//    {
//        this.flightCollection1 = flightCollection1;
//    }
//
//    @Override
//    public int hashCode()
//    {
//        int hash = 0;
//        hash += (airportID != null ? airportID.hashCode() : 0);
//        return hash;
//    }
//
//    @Override
//    public boolean equals(Object object)
//    {
//        // TODO: Warning - this method won't work in the case the id fields are not set
//        if (!(object instanceof Airport))
//        {
//            return false;
//        }
//        Airport other = (Airport) object;
//        if ((this.airportID == null && other.airportID != null) || (this.airportID != null && !this.airportID.equals(other.airportID)))
//        {
//            return false;
//        }
//        return true;
//    }
//
//    @Override
//    public String toString()
//    {
//        return "com.mycompany.ca4.Airport[ airportID=" + airportID + " ]";
//    }
//
//}
