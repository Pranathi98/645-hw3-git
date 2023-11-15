package edu.gmu.springboot;

import java.util.Date;
import java.util.Objects;
import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name = "studentsurvey")
public class StudentSurvey {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    public Long id;
    @Column(name="first_name", nullable=false)
    public String firstName;
    
    @Column(name="last_name", nullable=false)
    public String lastName;
    
    @Column(name="streetAddress", nullable=false)
    public String streetAddress;
    
    @Column(name="city", nullable=false)
    public String city;
    
    @Column(name="state", nullable=false)
    public String state;
    @Column(name="zip", nullable=false)
    public String zip;
    @Column(name="telephone_number", nullable=false)
    public long telephoneNumber;
    @Column(name="email", nullable=false)
    public String email;
    @Column(name="date_of_survey", nullable=false)
    public Date dateOfSurvey;
    @Column(name="liked_most")
    public String likedMost;
    @Column(name="interested_in")
    public String interestedIn;
    @Column(name="recommend_likelihood")
    public String recommendLikelihood;

    // Getters and setters
    public Long getId() { 
    	return id;

    }

    public void setId (Long id) { 
    	this.id =id; 
    }

    public String getFirstName() { 
    	return firstName; 
    	}

    public void setFirstName(String firstName) { 
    	this.firstName = firstName; 
    }

    public String getLastName() { 
    	return lastName;
    }

    public void setLastName (String lastName) { 
    	this.lastName = lastName;
    }
    
    public String getStreetAddress() { 
    	return streetAddress;
    }

    public void setStreetAddress (String streetAddress) { 
    	this.streetAddress = streetAddress;
    }
    public String getState() { 
    	return state;
    }

    public void setState (String state) { 
    	this.state = state;
    }
    
    public String getZip() { 
    	return state;
    }

    public void setZip (String zip) { 
    	this.zip = zip;
    }
    public long getTelephoneNumber() { 
    	return telephoneNumber;
    }

    public void setTelephoneNumber (long telephoneNumber) { 
    	this.telephoneNumber = telephoneNumber;
    }
    
    public Date getDateOfSurvey() { 
    	return dateOfSurvey;
    }

    public void setDateOfSurvey (Date dateOfSurvey) { 
    	this.dateOfSurvey = dateOfSurvey;
    }
    public String getInterestedIn() { 
    	return interestedIn;
    }

    public void setInterestedIn (String interestedIn) { 
    	this.interestedIn = interestedIn;
    }
    public String getEmail() { 
    	return email;
    }

    public void setEmail (String email) { 
    	this.email = email;
    }
    public String getLikedMost() { 
    	return likedMost;
    }

    public void setLikedMost (String likedMost) { 
    	this.likedMost = likedMost;
    }
    public String getCity() { 
    	return city;
    }

    public void setCity (String city) { 
    	this.city = city;
    }
    public String getRecommendLikelihood() { 
    	return recommendLikelihood;
    }

    public void setRecommendLikelihood (String recommendLikelihood) { 
    	this.recommendLikelihood = recommendLikelihood;
    }
    
    @Override
    public String toString() {

    return "Student [id=" + id + ", firstName=" + firstName + ", lastName=" +lastName+ ", city=" +city + ", state=" + state + ", zip=" + zip + ", telephoneno=" + telephoneNumber + ", email=" + email + ", dateOfSurvey=" + dateOfSurvey +  ", likedMost=" + likedMost + ", interestedIn=" + interestedIn + ", recommendLikelihood=" + recommendLikelihood; 

    }

    @Override
    public int hashCode() {
    return Objects.hash (email, firstName, id, lastName, city, state, zip, telephoneNumber, dateOfSurvey, likedMost, interestedIn, recommendLikelihood);
    }
    
    @Override
    public boolean equals (Object obj) {

	    if (this == obj)
	    	return true;
	
	    if (obj == null)
	    	return false;
	
	    if (getClass() != obj.getClass())
	    	return false;
	
	    StudentSurvey other = (StudentSurvey) obj;
	
	    return Objects.equals(email, other.email) && Objects.equals(firstName, other.firstName) && Objects.equals (lastName, other.lastName)  && Objects.equals(city, other.city) && Objects.equals(state, other.state)  && Objects.equals (zip, other.zip)&& Objects.equals (telephoneNumber, other.telephoneNumber)&& Objects.equals (dateOfSurvey, other.dateOfSurvey)&& Objects.equals (likedMost, other.likedMost)&& Objects.equals (interestedIn, other.interestedIn)&& Objects.equals (recommendLikelihood, other.recommendLikelihood);
 }
}
