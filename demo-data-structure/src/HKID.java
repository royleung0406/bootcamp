import java.util.Objects;

public class HKID {
  private String value;

  public HKID(String value) {
    this.value = value;
  }

  public String getValue() {
    return this.value;
  }

  @Override
  public boolean equals(Object obj){
    if(this == obj)
    return true;
    // Step 2 (return false if the object is not "from" Company.class)
    if (!(obj instanceof HKID))
      return false;
    // Step 3: downcast to target type, and then compare all values
    HKID hkid = (HKID) obj; //
    return Objects.equals(this.value, hkid.getValue());
  }

  @Override
  public int hashCode() {
    return Objects.hash(this.value);
  }

  }

