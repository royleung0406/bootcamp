import java.time.LocalDate;
import java.util.Objects;

public class Staff2 {
  private String name;
  private LocalDate joinDate;

  public Staff2 (String name, LocalDate joinDate){
    this.name = name;
    this.joinDate = joinDate;
  }
public String getName(){
  return this.name;
}

public LocalDate getJoinDate(){
  return this.joinDate;
}
  @Override
  public String toString(){
    return "Staff2 ("
    + "name=" + this.name + ")";
  }

  @Override
  public boolean equals(Object obj) { // same name ? true : false
    if (this == obj)
      return true;
    if (!(obj instanceof Staff2 ))
      return false;
    // because we do not have staff object , so we cannot obj.getName
    // Parent - Child (downcast)
    Staff2 staff = (Staff2) obj;
    return Objects.equals(this.name, staff.getName()) // 
          && Objects.equals(this.joinDate, staff.getJoinDate());  
  }

  // LocalDate.class already override equals() method
  // Objects.equals() -> calling joinDate.equals(joinDate())

  @Override
  public int hashCode(){
      return Objects.hash(this.name, this.joinDate);
  }
}
