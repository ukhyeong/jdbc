module org.zerock.myapp {
	requires java.base;
	requires java.sql; // JDBC 모듈 추가
	
    requires javafx.controls;
    requires javafx.fxml;
    requires javafx.media;
    requires javafx.graphics;
    
    requires lombok;
    requires org.apache.logging.log4j;
	
	
    opens org.zerock.myapp
       to javafx.fxml,
          javafx.controls,
          javafx.graphics;
    
    opens org.zerock.myapp.controller
       to javafx.fxml,
    	  javafx.controls,
          javafx.graphics,
    	  javafx.base;
    
    opens org.zerock.myapp.test
	   to javafx.fxml,
	 	  javafx.controls,
	      javafx.graphics;
    
    opens org.zerock.myapp.seongi
	   to javafx.fxml,
	 	  javafx.controls,
	      javafx.graphics;

//    opens org.zerock.myapp.model
//       to javafx.base;
}
