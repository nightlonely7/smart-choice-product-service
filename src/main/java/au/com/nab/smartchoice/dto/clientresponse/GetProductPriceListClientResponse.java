package au.com.nab.smartchoice.dto.clientresponse;

import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.ToString;

@Data
@EqualsAndHashCode(callSuper = true)
@ToString(callSuper = true)
public class GetProductPriceListClientResponse extends BaseClientResponse<GetProductPriceListDataClientResponse> {
}


