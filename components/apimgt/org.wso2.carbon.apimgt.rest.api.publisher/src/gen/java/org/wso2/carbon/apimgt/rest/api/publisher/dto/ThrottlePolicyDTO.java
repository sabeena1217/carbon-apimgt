package org.wso2.carbon.apimgt.rest.api.publisher.dto;

import org.wso2.carbon.apimgt.rest.api.publisher.dto.QuotaPolicyDTO;

import io.swagger.annotations.*;
import org.codehaus.jackson.annotate.*;

import javax.validation.constraints.NotNull;





@ApiModel(description = "")
public class ThrottlePolicyDTO  {
  
  
  
  private String policyName = null;
  
  
  private String displayName = null;
  
  
  private String description = null;
  
  
  private QuotaPolicyDTO defaultQuotaPolicy = null;
  
  
  private String tenantDomain = null;
  
  
  private Boolean isDeployed = null;

  
  /**
   **/
  @ApiModelProperty(value = "")
  @JsonProperty("policyName")
  public String getPolicyName() {
    return policyName;
  }
  public void setPolicyName(String policyName) {
    this.policyName = policyName;
  }

  
  /**
   **/
  @ApiModelProperty(value = "")
  @JsonProperty("displayName")
  public String getDisplayName() {
    return displayName;
  }
  public void setDisplayName(String displayName) {
    this.displayName = displayName;
  }

  
  /**
   **/
  @ApiModelProperty(value = "")
  @JsonProperty("description")
  public String getDescription() {
    return description;
  }
  public void setDescription(String description) {
    this.description = description;
  }

  
  /**
   **/
  @ApiModelProperty(value = "")
  @JsonProperty("defaultQuotaPolicy")
  public QuotaPolicyDTO getDefaultQuotaPolicy() {
    return defaultQuotaPolicy;
  }
  public void setDefaultQuotaPolicy(QuotaPolicyDTO defaultQuotaPolicy) {
    this.defaultQuotaPolicy = defaultQuotaPolicy;
  }

  
  /**
   **/
  @ApiModelProperty(value = "")
  @JsonProperty("tenantDomain")
  public String getTenantDomain() {
    return tenantDomain;
  }
  public void setTenantDomain(String tenantDomain) {
    this.tenantDomain = tenantDomain;
  }

  
  /**
   **/
  @ApiModelProperty(value = "")
  @JsonProperty("isDeployed")
  public Boolean getIsDeployed() {
    return isDeployed;
  }
  public void setIsDeployed(Boolean isDeployed) {
    this.isDeployed = isDeployed;
  }

  

  @Override
  public String toString()  {
    StringBuilder sb = new StringBuilder();
    sb.append("class ThrottlePolicyDTO {\n");
    
    sb.append("  policyName: ").append(policyName).append("\n");
    sb.append("  displayName: ").append(displayName).append("\n");
    sb.append("  description: ").append(description).append("\n");
    sb.append("  defaultQuotaPolicy: ").append(defaultQuotaPolicy).append("\n");
    sb.append("  tenantDomain: ").append(tenantDomain).append("\n");
    sb.append("  isDeployed: ").append(isDeployed).append("\n");
    sb.append("}\n");
    return sb.toString();
  }
}
