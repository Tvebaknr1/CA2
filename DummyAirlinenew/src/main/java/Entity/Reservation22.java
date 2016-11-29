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
//import javax.xml.bind.annotation.XmlRootElement;
//import javax.xml.bind.annotation.XmlTransient;
//
//@Entity
//@Table(name = "Reservation")
//@XmlRootElement
//@NamedQueries(
//{
//    @NamedQuery(name = "Reservation.findAll", query = "SELECT r FROM Reservation r"),
//    @NamedQuery(name = "Reservation.findByReservationID", query = "SELECT r FROM Reservation r WHERE r.reservationID = :reservationID"),
//    @NamedQuery(name = "Reservation.findByTotalPrice", query = "SELECT r FROM Reservation r WHERE r.totalPrice = :totalPrice")
//})
//public class Reservation implements Serializable {
//
//    private static final long serialVersionUID = 1L;
//    @Id
//    @GeneratedValue(strategy = GenerationType.IDENTITY)
//    @Basic(optional = false)
//    @Column(name = "reservationID")
//    private Integer reservationID;
//    @Column(name = "totalPrice")
//    private Integer totalPrice;
//    @JoinColumn(name = "flightInstance", referencedColumnName = "flightInstanceID")
//    @ManyToOne
//    private FlightInstance flightInstance;
//    @OneToMany(mappedBy = "reservation")
//    private Collection<Passenger> passengerCollection;
//
//    public Reservation()
//    {
//    }
//
//    public Reservation(Integer reservationID)
//    {
//        this.reservationID = reservationID;
//    }
//
//    public Integer getReservationID()
//    {
//        return reservationID;
//    }
//
//    public void setReservationID(Integer reservationID)
//    {
//        this.reservationID = reservationID;
//    }
//
//    public Integer getTotalPrice()
//    {
//        return totalPrice;
//    }
//
//    public void setTotalPrice(Integer totalPrice)
//    {
//        this.totalPrice = totalPrice;
//    }
//
//    public FlightInstance getFlightInstance()
//    {
//        return flightInstance;
//    }
//
//    public void setFlightInstance(FlightInstance flightInstance)
//    {
//        this.flightInstance = flightInstance;
//    }
//
//    @XmlTransient
//    public Collection<Passenger> getPassengerCollection()
//    {
//        return passengerCollection;
//    }
//
//    public void setPassengerCollection(Collection<Passenger> passengerCollection)
//    {
//        this.passengerCollection = passengerCollection;
//    }
//
//    @Override
//    public int hashCode()
//    {
//        int hash = 0;
//        hash += (reservationID != null ? reservationID.hashCode() : 0);
//        return hash;
//    }
//
//    @Override
//    public boolean equals(Object object)
//    {
//        // TODO: Warning - this method won't work in the case the id fields are not set
//        if (!(object instanceof Reservation))
//        {
//            return false;
//        }
//        Reservation other = (Reservation) object;
//        if ((this.reservationID == null && other.reservationID != null) || (this.reservationID != null && !this.reservationID.equals(other.reservationID)))
//        {
//            return false;
//        }
//        return true;
//    }
//
//    @Override
//    public String toString()
//    {
//        return "com.mycompany.ca4.Reservation[ reservationID=" + reservationID + " ]";
//    }
//
//}
