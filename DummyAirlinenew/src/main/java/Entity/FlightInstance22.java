//
//package Entity;
//
//import java.io.Serializable;
//import java.util.Collection;
//import java.util.Date;
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
//import javax.persistence.Temporal;
//import javax.persistence.TemporalType;
//import javax.xml.bind.annotation.XmlRootElement;
//import javax.xml.bind.annotation.XmlTransient;
//
//@Entity
//@Table(name = "FlightInstance")
//@XmlRootElement
//@NamedQueries(
//{
//    @NamedQuery(name = "FlightInstance.findAll", query = "SELECT f FROM FlightInstance f"),
//    @NamedQuery(name = "FlightInstance.findByFlightInstanceID", query = "SELECT f FROM FlightInstance f WHERE f.flightInstanceID = :flightInstanceID"),
//    @NamedQuery(name = "FlightInstance.findByDateAndTime", query = "SELECT f FROM FlightInstance f WHERE f.dateAndTime = :dateAndTime"),
//    @NamedQuery(name = "FlightInstance.findByavailableSeats", query = "SELECT f FROM FlightInstance f WHERE f.availableSeats = :availableSeats"),
//    @NamedQuery(name = "FlightInstance.findByPrice", query = "SELECT f FROM FlightInstance f WHERE f.price = :price")
//})
//public class FlightInstance implements Serializable {
//
//    private static final long serialVersionUID = 1L;
//    @Id
//    @GeneratedValue(strategy = GenerationType.IDENTITY)
//    @Basic(optional = false)
//    @Column(name = "flightInstanceID")
//    private Integer flightInstanceID;
//    @Column(name = "dateAndTime")
//    @Temporal(TemporalType.DATE)
//    private Date dateAndTime;
//    @Column(name = "availableSeats")
//    private Integer availableSeats;
//    @Column(name = "price")
//    private Integer price;
//    @JoinColumn(name = "flight", referencedColumnName = "flightID")
//    @ManyToOne
//    private Flight flight;
//    @OneToMany(mappedBy = "flightInstance")
//    private Collection<Reservation> reservationCollection;
//
//    public FlightInstance()
//    {
//    }
//
//    public FlightInstance(Integer flightInstanceID)
//    {
//        this.flightInstanceID = flightInstanceID;
//    }
//
//    public Integer getFlightInstanceID()
//    {
//        return flightInstanceID;
//    }
//
//    public void setFlightInstanceID(Integer flightInstanceID)
//    {
//        this.flightInstanceID = flightInstanceID;
//    }
//
//    public Date getDateAndTime()
//    {
//        return dateAndTime;
//    }
//
//    public void setDateAndTime(Date dateAndTime)
//    {
//        this.dateAndTime = dateAndTime;
//    }
//
//    public Integer getavailableSeats()
//    {
//        return availableSeats;
//    }
//
//    public void setavailableSeats(Integer availableSeats)
//    {
//        this.availableSeats = availableSeats;
//    }
//
//    public Integer getPrice()
//    {
//        return price;
//    }
//
//    public void setPrice(Integer price)
//    {
//        this.price = price;
//    }
//
//    public Flight getFlight()
//    {
//        return flight;
//    }
//
//    public void setFlight(Flight flight)
//    {
//        this.flight = flight;
//    }
//
//    @XmlTransient
//    public Collection<Reservation> getReservationCollection()
//    {
//        return reservationCollection;
//    }
//
//    public void setReservationCollection(Collection<Reservation> reservationCollection)
//    {
//        this.reservationCollection = reservationCollection;
//    }
//
//    @Override
//    public int hashCode()
//    {
//        int hash = 0;
//        hash += (flightInstanceID != null ? flightInstanceID.hashCode() : 0);
//        return hash;
//    }
//
//    @Override
//    public boolean equals(Object object)
//    {
//        // TODO: Warning - this method won't work in the case the id fields are not set
//        if (!(object instanceof FlightInstance))
//        {
//            return false;
//        }
//        FlightInstance other = (FlightInstance) object;
//        if ((this.flightInstanceID == null && other.flightInstanceID != null) || (this.flightInstanceID != null && !this.flightInstanceID.equals(other.flightInstanceID)))
//        {
//            return false;
//        }
//        return true;
//    }
//
//    @Override
//    public String toString()
//    {
//        return "com.mycompany.ca4.FlightInstance[ flightInstanceID=" + flightInstanceID + " ]";
//    }
//
//}
