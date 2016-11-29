//
//package Entity;
//
//import java.io.Serializable;
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
//import javax.persistence.Table;
//import javax.validation.constraints.Size;
//import javax.xml.bind.annotation.XmlRootElement;
//
//@Entity
//@Table(name = "Passenger")
//@XmlRootElement
//@NamedQueries(
//{
//    @NamedQuery(name = "Passenger.findAll", query = "SELECT p FROM Passenger p"),
//    @NamedQuery(name = "Passenger.findByPassengerID", query = "SELECT p FROM Passenger p WHERE p.passengerID = :passengerID"),
//    @NamedQuery(name = "Passenger.findByFirstname", query = "SELECT p FROM Passenger p WHERE p.firstname = :firstname"),
//    @NamedQuery(name = "Passenger.findByLastname", query = "SELECT p FROM Passenger p WHERE p.lastname = :lastname")
//})
//public class Passenger implements Serializable {
//
//    private static final long serialVersionUID = 1L;
//    @Id
//    @GeneratedValue(strategy = GenerationType.IDENTITY)
//    @Basic(optional = false)
//    @Column(name = "passengerID")
//    private Integer passengerID;
//    @Size(max = 30)
//    @Column(name = "firstname")
//    private String firstname;
//    @Size(max = 30)
//    @Column(name = "lastname")
//    private String lastname;
//    @JoinColumn(name = "reservation", referencedColumnName = "reservationID")
//    @ManyToOne
//    private Reservation reservation;
//
//    public Passenger()
//    {
//    }
//
//    public Passenger(Integer passengerID)
//    {
//        this.passengerID = passengerID;
//    }
//
//    public Integer getPassengerID()
//    {
//        return passengerID;
//    }
//
//    public void setPassengerID(Integer passengerID)
//    {
//        this.passengerID = passengerID;
//    }
//
//    public String getFirstname()
//    {
//        return firstname;
//    }
//
//    public void setFirstname(String firstname)
//    {
//        this.firstname = firstname;
//    }
//
//    public String getLastname()
//    {
//        return lastname;
//    }
//
//    public void setLastname(String lastname)
//    {
//        this.lastname = lastname;
//    }
//
//    public Reservation getReservation()
//    {
//        return reservation;
//    }
//
//    public void setReservation(Reservation reservation)
//    {
//        this.reservation = reservation;
//    }
//
//    @Override
//    public int hashCode()
//    {
//        int hash = 0;
//        hash += (passengerID != null ? passengerID.hashCode() : 0);
//        return hash;
//    }
//
//    @Override
//    public boolean equals(Object object)
//    {
//        // TODO: Warning - this method won't work in the case the id fields are not set
//        if (!(object instanceof Passenger))
//        {
//            return false;
//        }
//        Passenger other = (Passenger) object;
//        if ((this.passengerID == null && other.passengerID != null) || (this.passengerID != null && !this.passengerID.equals(other.passengerID)))
//        {
//            return false;
//        }
//        return true;
//    }
//
//    @Override
//    public String toString()
//    {
//        return "com.mycompany.ca4.Passenger[ passengerID=" + passengerID + " ]";
//    }
//
//}
