package jp.tefuna.divliv.api.resource.rate;

import java.math.BigDecimal;

import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonProperty;

import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

@ToString
public class RateResource {

    @Getter
    @Setter
    @JsonProperty("id")
    private String rateId;

    @Getter
    @Setter
    private String baseDate;

    @Getter
    @Setter
    private String currency;

    @Getter
    @Setter
    private BigDecimal rate;

    private String createdAt;

    private String updatedAt;

    @JsonProperty
    public String getCreatedAt() {
        return createdAt;
    }

    @JsonIgnore
    public void setCreatedAt(String createdAt) {
        this.createdAt = createdAt;
    }

    @JsonProperty
    public String getUpdatedAt() {
        return updatedAt;
    }

    @JsonIgnore
    public void setUpdatedAt(String updatedAt) {
        this.updatedAt = updatedAt;
    }

}
