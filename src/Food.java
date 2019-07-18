import java.util.Date;

import lombok.Builder;
import lombok.Value;
@Value 
@Builder
public class Food {
	String name;
	int quantity;
	Date exp;
}
