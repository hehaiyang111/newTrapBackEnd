package cn.huihongcloud.entity;

import cn.afterturn.easypoi.excel.annotation.Excel;
import com.fasterxml.jackson.annotation.JsonFormat;
import lombok.Data;
import org.springframework.format.annotation.DateTimeFormat;

import java.util.Date;
@Data
public class Device_DeadTrees_maintanceEntity {

    private Long id;
    @Excel(name = "设备ID")
    private Long scanId;
    @Excel(name = "序列号")
    private String serial;
    @Excel(name = "区域")
    private String customTown;

    private Long deviceId;

    @JsonFormat(timezone = "GMT+8", pattern = "yyyy年MM月dd日")
    @DateTimeFormat(pattern = "yyyy年MM月dd日")
    @Excel(name = "日期", format = "yyyy年MM月dd日")
    private Date submitDate;
    @Excel(name = "批次")
    private String batch;
    @Excel(name = "经度")
    private Double longitude;
    @Excel(name = "纬度")
    private Double latitude;
    @Excel(name = "树木直径")
    private String wooddiameter;
    @Excel(name = "树木高度")
    private String woodheight;
    @Excel(name = "树木材积")
    private String woodvolume;
    @Excel(name = "除害方式")
    private String killmethod;
    @Excel(name = "工人")
    private String worker;
    @Excel(name = "备注")
    private String remarks;
//    @Excel(name = "二维码ID")

    private String pic;
    @Excel(name = "用户名")
    private String username;

    private String region;

    private String altitude;

    private String accuracy;


    @Excel(name = "乡镇")
    private String town;

    private int reported;

    private String province;

    private String customProject;

    private String city;

    private String area;

    private String pic2;
    private String workDaySum;
    private String woodVolumeSum;
    private String woodNumSum;
    private String pic3;



    private String startDate;
    private String endDate;

    private String deadTreesMannerTotal;
    private String deadTreesMannerOne;
    private String deadTreesMannerTwo;

    public String getDeadTreesMannerTotal() {
        return deadTreesMannerTotal;
    }

    public void setDeadTreesMannerTotal(String deadTreesMannerTotal) {
        this.deadTreesMannerTotal = deadTreesMannerTotal;
    }

    public String getDeadTreesMannerOne() {
        return deadTreesMannerOne;
    }

    public void setDeadTreesMannerOne(String deadTreesMannerOne) {
        this.deadTreesMannerOne = deadTreesMannerOne;
    }

    public String getDeadTreesMannerTwo() {
        return deadTreesMannerTwo;
    }

    public void setDeadTreesMannerTwo(String deadTreesMannerTwo) {
        this.deadTreesMannerTwo = deadTreesMannerTwo;
    }

    public String getDeadTreesMannerThree() {
        return deadTreesMannerThree;
    }

    public void setDeadTreesMannerThree(String deadTreesMannerThree) {
        this.deadTreesMannerThree = deadTreesMannerThree;
    }

    public String getDeadTreesMannerFour() {
        return deadTreesMannerFour;
    }

    public void setDeadTreesMannerFour(String deadTreesMannerFour) {
        this.deadTreesMannerFour = deadTreesMannerFour;
    }

    public String getDeadTreesMannerFive() {
        return deadTreesMannerFive;
    }

    public void setDeadTreesMannerFive(String deadTreesMannerFive) {
        this.deadTreesMannerFive = deadTreesMannerFive;
    }

    private String deadTreesMannerThree;
    private String deadTreesMannerFour;
    private String deadTreesMannerFive;
    private String totalWoodVolume;

    private Integer totalDeadId;

    private Double totalWoodVolumeSum;
    private Integer totalDeadIdSum;

    public Double getTotalWoodVolumeSum() {
        return totalWoodVolumeSum;
    }

    public void setTotalWoodVolumeSum(Double totalWoodVolumeSum) {
        this.totalWoodVolumeSum = totalWoodVolumeSum;
    }

    public Integer getTotalDeadIdSum() {
        return totalDeadIdSum;
    }

    public void setTotalDeadIdSum(Integer totalDeadIdSum) {
        this.totalDeadIdSum = totalDeadIdSum;
    }

    public Integer getTotalDeadId() {
        return totalDeadId;
    }

    public void setTotalDeadId(Integer totalDeadId) {
        this.totalDeadId = totalDeadId;
    }

    public String getTotalWoodVolume() {
        return totalWoodVolume;
    }

    public void setTotalWoodVolume(String totalWoodVolume) {
        this.totalWoodVolume = totalWoodVolume;
    }

    public Device_DeadTrees_maintanceEntity(Long id, Long deviceId, String serial,
                                            Date submitDate, String batch, Double longitude,
                                            Double latitude, String wooddiameter, String woodheight,
                                            String woodvolume, String killmethod, String worker, String remarks,
                                            Long scanId, String pic, String username,String region,
                                            String altitude,String accuracy,String town,int reported,String pic2,
                                            String pic3) {
        this.id = id;
        this.deviceId = deviceId;
        this.serial = serial;
        this.submitDate = submitDate;
        this.batch = batch;
        this.longitude = longitude;
        this.latitude = latitude;
        this.wooddiameter = wooddiameter;
        this.woodheight = woodheight;
        this.woodvolume = woodvolume;
        this.killmethod = killmethod;
        this.worker = worker;
        this.remarks = remarks;
        this.scanId = scanId;
        this.pic = pic;
        this.username = username;
        this.region = region;
        this.altitude = altitude;
        this.accuracy = accuracy;
        this.town = town;
        this.reported = reported;
        this.pic2 = pic2;
        this.pic3 = pic3;
    }

    public Device_DeadTrees_maintanceEntity() {
        super();
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public Long getDeviceId() {
        return deviceId;
    }

    public void setDeviceId(Long deviceId) {
        this.deviceId = deviceId;
    }

    public String getSerial() {
        return serial;
    }

    public void setSerial(String serial) {
        this.serial = serial == null ? null : serial.trim();
    }

    public String getBatch() {
        return batch;
    }

    public void setBatch(String batch) {
        this.batch = batch == null ? null : batch.trim();
    }

    public String getWooddiameter() {
        return wooddiameter;
    }

    public void setWooddiameter(String wooddiameter) {
        this.wooddiameter = wooddiameter == null ? null : wooddiameter.trim();
    }

    public String getWoodheight() {
        return woodheight;
    }

    public void setWoodheight(String woodheight) {
        this.woodheight = woodheight == null ? null : woodheight.trim();
    }

    public String getWoodvolume() {
        return woodvolume;
    }

    public void setWoodvolume(String woodvolume) {
        this.woodvolume = woodvolume == null ? null : woodvolume.trim();
    }

    public String getKillmethod() {
        return killmethod;
    }

    public void setKillmethod(String killmethod) {
        this.killmethod = killmethod == null ? null : killmethod.trim();
    }


    public String getRemarks() {
        return remarks;
    }

    public void setRemarks(String remarks) {
        this.remarks = remarks == null ? null : remarks.trim();
    }

    public String getPic() {
        return pic;
    }

    public void setPic(String pic) {
        this.pic = pic == null ? null : pic.trim();
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getRegion() {
        return region;
    }

    public void setRegion(String region) {
        this.region = region;
    }

    public String getAltitude() {
        return altitude;
    }

    public void setAltitude(String altitude) {
        this.altitude = altitude;
    }

    public String getAccuracy() {
        return accuracy;
    }

    public void setAccuracy(String accuracy) {
        this.accuracy = accuracy;
    }

    public String getCustomTown() {
        return customTown;
    }

    public void setCustomTown(String customTown) {
        this.customTown = customTown;
    }

    public String getTown() {
        return town;
    }

    public void setTown(String town) {
        this.town = town;
    }

    public int getReported() {
        return reported;
    }

    public void setReported(int reported) {
        this.reported = reported;
    }

    public String getProvince() {
        return province;
    }

    public void setProvince(String province) {
        this.province = province;
    }

    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city;
    }

    public String getArea() {
        return area;
    }

    public void setArea(String area) {
        this.area = area;
    }

    public String getPic2() {
        return pic2;
    }

    public void setPic2(String pic2) {
        this.pic2 = pic2;
    }

    public String getPic3() {
        return pic3;
    }

    public void setPic3(String pic3) {
        this.pic3 = pic3;
    }

    public Double getLongitude() {
        return longitude;
    }

    public void setLongitude(Double longitude) {
        this.longitude = longitude;
    }

    public Double getLatitude() {
        return latitude;
    }

    public void setLatitude(Double latitude) {
        this.latitude = latitude;
    }

    public Long getScanId() {
        return scanId;
    }

    public void setScanId(Long scanId) {
        this.scanId = scanId;
    }

    public Date getSubmitDate() {
        return submitDate;
    }

    public void setSubmitDate(Date submitDate) {
        this.submitDate = submitDate;
    }

    public String getWorkDaySum() {
        return workDaySum;
    }

    public void setWorkDaySum(String workDaySum) {
        this.workDaySum = workDaySum;
    }

    public String getWoodVolumeSum() {
        return woodVolumeSum;
    }

    public void setWoodVolumeSum(String woodVolumeSum) {
        this.woodVolumeSum = woodVolumeSum;
    }

    public String getWoodNumSum() {
        return woodNumSum;
    }

    public void setWoodNumSum(String woodNumSum) {
        this.woodNumSum = woodNumSum;
    }

    public String getStartDate() {
        return startDate;
    }

    public void setStartDate(String startDate) {
        this.startDate = startDate;
    }

    public String getEndDate() {
        return endDate;
    }

    public void setEndDate(String endDate) {
        this.endDate = endDate;
    }

    public String getCustomProject() {
        return customProject;
    }

    public void setCustomProject(String customProject) {
        this.customProject = customProject;
    }

    public String getWorker() {
        return worker;
    }

    public void setWorker(String worker) {
        this.worker = worker;
    }
}