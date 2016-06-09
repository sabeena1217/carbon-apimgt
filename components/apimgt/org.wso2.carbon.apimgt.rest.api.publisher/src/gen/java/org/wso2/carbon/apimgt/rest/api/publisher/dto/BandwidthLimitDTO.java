package org.wso2.carbon.apimgt.rest.api.publisher.dto;

import org.wso2.carbon.apimgt.rest.api.publisher.dto.ThrottleLimitDTO;

import io.swagger.annotations.*;
import org.codehaus.jackson.annotate.*;

import javax.validation.constraints.NotNull;





@ApiModel(description = "")
public class BandwidthLimitDTO extends ThrottleLimitDTO {
  
  
  
  private Long dataAmount = null;
  
  
  private String dataUnit = null;

  
  /**
   **/
  @ApiModelProperty(value = "")
  @JsonProperty("dataAmount")
  public Long getDataAmount() {
    return dataAmount;
  }
  public void setDataAmount(Long dataAmount) {
    this.dataAmount = dataAmount;
  }

  
  /**
   **/
  @ApiModelProperty(value = "")
  @JsonProperty("dataUnit")
  public String getDataUnit() {
    return dataUnit;
  }
  public void setDataUnit(String dataUnit) {
    this.dataUnit = dataUnit;
  }

  

  @Override
  public String toString()  {
    StringBuilder sb = new StringBuilder();
    sb.append("class BandwidthLimitDTO {\n");
    sb.append("  " + super.toString()).append("\n");
    sb.append("  dataAmount: ").append(dataAmount).append("\n");
    sb.append("  dataUnit: ").append(dataUnit).append("\n");
    sb.append("}\n");
    return sb.toString();
  }
}
