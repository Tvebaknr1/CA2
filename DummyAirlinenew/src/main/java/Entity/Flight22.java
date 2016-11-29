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
//import javax.persistence.JoinColumn;
//import javax.persistence.ManyToOne;
//import javax.persistence.NamedQueries;
//import javax.persistence.NamedQuery;
//import javax.persistence.OneToMany;
//import javax.persistence.Table;
//import javax.validation.constraints.Size;
//import javax.xml.bind.annotation.XmlRootElement;
//import javax.xml.bind.annotation.XmlTransient;
//
//@Entity
//@Table(name = "Flight")
//@XmlRootElement
//@NamedQueries(
//{
//    @NamedQuery(name = "Flight.findAll", query = "SELECT f FROM Flight f"),
//    @NamedQuery(name = "Flight.findByFlightID", query = "SELECT f FROM Flight f WHERE f.flightID = :flightID"),
//    @NamedQuery(name = "Flight.findByFlightNumber", query = "SELECT f FROM Flight f WHERE f.flightNumber = :flightNumber"),
//    @NamedQuery(name = "Flight.findBySeats", query = "SELECT f FROM Flight f WHERE f.seats = :seats"),
//    @NamedQuery(name = "Flight.findByFlightTimeAirline", query = "SELECT f FROM Flight f WHERE f.flightTimeAirline = :flightTimeAirline")
//})
//public class Flight implements Serializable {
//
//    private static final long serialVersionUID = 1L;
//    @Id
//    @GeneratedValue(strategy = GenerationType.IDENTITY)
//    @Basic(optional = false)
//    @Column(name = "flightID")
//    private Integer flightID;
//    @Size(max = 30)
//    @Column(name = "flightNumber")
//    private String flightNumber;
//    @Column(name = "seats")
//    private Integer seats;
//    @Column(name = "flightTimeAirline")
//    private Integer flightTimeAirline;
//    @OneToMany(mappedBy = "flight")
//    private Collection<FlightInstance> flightInstanceCollection;
//    @JoinColumn(name = "airline", referencedColumnName = "AirlineID")
//    @ManyToOne
//    private Airline airline;
//    @JoinColumn(name = "from", referencedColumnName = "airportID")
//    @ManyToOne
//    private Airport from1;
//    @JoinColumn(name = "too", referencedColumnName = "airportID")
//    @ManyToOne
//    private Airport too;
//
//    public Flight()
//    {
//    }
//
//    public Flight(Integer flightID)
//    {
//        this.flightID = flightID;
//    }
//
//    public Integer getFlightID()
//    {
//        return flightID;
//    }
//
//    public void setFlightID(Integer flightID)
//    {
//        this.flightID = flightID;
//    }
//
//    public String getFlightNumber()
//    {
//        return flightNumber;
//    }
//
//    public void setFlightNumber(String flightNumber)
//    {
//        this.flightNumber = flightNumber;
//    }
//
//    public Integer getSeats()
//    {
//        return seats;
//    }
//
//    public void setSeats(Integer seats)
//    {
//        this.seats = seats;
//    }
//
//    public Integer getFlightTimeAirline()
//    {
//        return flightTimeAirline;
//    }
//
//    public void setFlightTimeAirline(Integer flightTimeAirline)
//    {
//        this.flightTimeAirline = flightTimeAirline;
//    }
//
//    @XmlTransient
//    public Collection<FlightInstance> getFlightInstanceCollection()
//    {
//        return flightInstanceCollection;
//    }
//
//    public void setFlightInstanceCollection(Collection<FlightInstance> flightInstanceCollection)
//    {
//        this.flightInstanceCollection = flightInstanceCollection;
//    }
//
//    public Airline getAirline()
//    {
//        return airline;
//    }
//
//    public void setAirline(Airline airline)
//    {
//        this.airline = airline;
//    }
//
//    public Airport getFrom1()
//    {
//        return from1;
//    }
//
//    public void setFrom1(Airport from1)
//    {
//        this.from1 = from1;
//    }
//
//    public Airport getToo()
//    {
//        return too;
//    }
//
//    public void setToo(Airport too)
//    {
//        this.too = too;
//    }
//
//    @Override
//    public int hashCode()
//    {
//        int hash = 0;
//        hash += (flightID != null ? flightID.hashCode() : 0);
//        return hash;
//    }
//
//    @Override
//    public boolean equals(Object object)
//    {
//        // TODO: Warning - this method won't work in the case the id fields are not set
//        if (!(object instanceof Flight))
//        {
//            return false;
//        }
//        Flight other = (Flight) object;
//        if ((this.flightID == null && other.flightID != null) || (this.flightID != null && !this.flightID.equals(other.flightID)))
//        {
//            return false;
//        }
//        return true;
//    }
//
//    @Override
//    public String toString()
//    {
//        return "com.mycompany.ca4.Flight[ flightID=" + flightID + " ]";
//    }
//
//}
