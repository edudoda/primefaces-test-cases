package org.primefaces.test;

import java.io.Serializable;
import java.math.BigDecimal;
import java.time.LocalDateTime;
import java.time.chrono.ChronoLocalDateTime;
import java.util.ArrayList;
import java.util.List;

import javax.annotation.PostConstruct;
import javax.faces.bean.ManagedBean;
import javax.faces.bean.SessionScoped;
import javax.faces.view.ViewScoped;
//import javax.inject.Named;

//import lombok.Data;

//@Data
//@Named
//@ViewScoped
@SessionScoped
@ManagedBean
public class TestView implements Serializable {
     
	    private String string;
	    private Integer integer;
	    private BigDecimal decimal;
	    private LocalDateTime localDateTime;
	    
	    private List<Avatar> fl = null;
	    
	    
	    @PostConstruct  
	    public void init() {  
	        string = "DataTable/treeTable sorting problem due to STATE_SAVING_METHOD = client"; 
	        fl =  new ArrayList<Avatar>();
	        fl.add(new Avatar(1, "Joseph", "http://localhost:8080/test1"));
	        fl.add(new Avatar(2, "Richard", "http://localhost:8080/test2"));
	        fl.add(new Avatar(3, "Zalter", "http://localhost:8080/test3"));
	        fl.add(new Avatar(4, "Antony", "http://localhost:8080/test4")); 
	        fl.add(new Avatar(5, "Zalter Joseph", "http://localhost:8080/test5"));
	        fl.add(new Avatar(6, "Joseph Richard", "http://localhost:8080/test6"));
	        fl.add(new Avatar(7, "Antony Zalter", "http://localhost:8080/test7"));
	        fl.add(new Avatar(8, "Richard Antony", "http://localhost:8080/test8"));
	        
	      }
	    
	    
	    public String callTimeNow() {
	    	localDateTime = LocalDateTime.now();
	    	return null;
	   }


		public String getString() {
			return string;
		}


		public void setString(String string) {
			this.string = string;
		}


		public Integer getInteger() {
			return integer;
		}


		public void setInteger(Integer integer) {
			this.integer = integer;
		}


		public BigDecimal getDecimal() {
			return decimal;
		}


		public void setDecimal(BigDecimal decimal) {
			this.decimal = decimal;
		}


		public LocalDateTime getLocalDateTime() {
			return localDateTime;
		}


		public void setLocalDateTime(LocalDateTime localDateTime) {
			this.localDateTime = localDateTime;
		}


		public List<Avatar> getFl() {
			
//			if( fl == null) {
//				string = "Welcome to PrimeFaces!"; 
//		        fl =  new ArrayList<Avatar>();
//		        fl.add(new Avatar(1, "Jose", "http://localhost:8080/teste1"));
//		        fl.add(new Avatar(2, "Ricardo", "http://localhost:8080/teste2"));
//		        fl.add(new Avatar(3, "Marcos", "http://localhost:8080/teste3"));
//			} 
			
			return fl;
		}


		public void setFl(List<Avatar> fl) {
			this.fl = fl;
		}
 
	 
}
