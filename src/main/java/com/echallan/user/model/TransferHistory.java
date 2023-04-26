package com.echallan.user.model;
import javax.persistence.*;
import javax.validation.constraints.NotBlank;
import javax.validation.constraints.NotNull;
import java.time.ZonedDateTime;

@Entity
@Table(name = "ech_transfer_history",
        indexes = @Index(name = "idx_name_ech_transfer_history", columnList = "name, district_code_from, district_code_to, tranfer_id_from"))
public class TransferHistory {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name="id")
    private Long id;

    @NotBlank
    private String name;

    @Column(name="district_code_from")
    private Integer districtCodeFrom;

    @Column(name ="district_code_to")
    private Integer districtCodeTo;

    @Column(name="tranfer_id_from")
    private Integer transferIdFrom;

    @Column(name="tranfer_id_to")
    private Integer transferIdTo;

    private Integer transferredBy;

    private Integer type;

    @NotBlank
    private String userTypeFrom;

    @NotBlank
    private String userTypeTo;

    @NotNull
    private ZonedDateTime createdAt;

    @NotNull
    private ZonedDateTime updatedAt;

    public TransferHistory() {
        // default constructor
    }

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public Integer getDistrictCodeFrom() {
		return districtCodeFrom;
	}

	public void setDistrictCodeFrom(Integer districtCodeFrom) {
		this.districtCodeFrom = districtCodeFrom;
	}

	public Integer getDistrictCodeTo() {
		return districtCodeTo;
	}

	public void setDistrictCodeTo(Integer districtCodeTo) {
		this.districtCodeTo = districtCodeTo;
	}

	public Integer getTransferIdFrom() {
		return transferIdFrom;
	}

	public void setTransferIdFrom(Integer transferIdFrom) {
		this.transferIdFrom = transferIdFrom;
	}

	public Integer getTransferIdTo() {
		return transferIdTo;
	}

	public void setTransferIdTo(Integer transferIdTo) {
		this.transferIdTo = transferIdTo;
	}

	public Integer getTransferredBy() {
		return transferredBy;
	}

	public void setTransferredBy(Integer transferredBy) {
		this.transferredBy = transferredBy;
	}

	public Integer getType() {
		return type;
	}

	public void setType(Integer type) {
		this.type = type;
	}

	public String getUserTypeFrom() {
		return userTypeFrom;
	}

	public void setUserTypeFrom(String userTypeFrom) {
		this.userTypeFrom = userTypeFrom;
	}

	public String getUserTypeTo() {
		return userTypeTo;
	}

	public void setUserTypeTo(String userTypeTo) {
		this.userTypeTo = userTypeTo;
	}

	public ZonedDateTime getCreatedAt() {
		return createdAt;
	}

	public void setCreatedAt(ZonedDateTime createdAt) {
		this.createdAt = createdAt;
	}

	public ZonedDateTime getUpdatedAt() {
		return updatedAt;
	}

	public void setUpdatedAt(ZonedDateTime updatedAt) {
		this.updatedAt = updatedAt;
	}

    

}
