package com.kltn.motelservice.model;

public class CriteriaDTO {
    private Long id;

    private boolean motel;

    private double priceStart;

    private double priceEnd;

    private double acreageStart;

    private double acreageEnd;

    private DistrictDTO districtDTO;

    private boolean stop;

    public CriteriaDTO() {
    }

    public CriteriaDTO(Long id, boolean motel, double priceStart, double priceEnd, double acreageStart, double acreageEnd, DistrictDTO districtDTO, boolean stop) {
        this.id = id;
        this.motel = motel;
        this.priceStart = priceStart;
        this.priceEnd = priceEnd;
        this.acreageStart = acreageStart;
        this.acreageEnd = acreageEnd;
        this.districtDTO = districtDTO;
        this.stop = stop;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public double getPriceStart() {
        return priceStart;
    }

    public void setPriceStart(double priceStart) {
        this.priceStart = priceStart;
    }

    public double getPriceEnd() {
        return priceEnd;
    }

    public void setPriceEnd(double priceEnd) {
        this.priceEnd = priceEnd;
    }

    public double getAcreageStart() {
        return acreageStart;
    }

    public void setAcreageStart(double acreageStart) {
        this.acreageStart = acreageStart;
    }

    public double getAcreageEnd() {
        return acreageEnd;
    }

    public void setAcreageEnd(double acreageEnd) {
        this.acreageEnd = acreageEnd;
    }

    public DistrictDTO getDistrictDTO() {
        return districtDTO;
    }

    public void setDistrictDTO(DistrictDTO districtDTO) {
        this.districtDTO = districtDTO;
    }

    public boolean isMotel() {
        return motel;
    }

    public void setMotel(boolean motel) {
        this.motel = motel;
    }
}
