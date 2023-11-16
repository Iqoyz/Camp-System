package Camp;
import java.time.LocalDate;

public class CampInfo {

    // Camp Information
    private String campName;
    private LocalDate startDate;
    private LocalDate endDate;
    private LocalDate regClosingDate;
<<<<<<< HEAD
    private String campUserGroup;
=======
    private CampUserGroup campUserGroup;
>>>>>>> d1526f33a465bfbd7f6b99f7d459f10f43b0a0fa
    private CampVisibility campVisibility;
    private String location;
    private int totalSlots;
    private int campCommitteeSlot;
    private String description;
    private String staffInChargeID;

    // Constructor
    public CampInfo(String campName, LocalDate startDate, LocalDate endDate, LocalDate regClosingDate,
<<<<<<< HEAD
                    String campUserGroup, CampVisibility campVisibility, String location, int totalSlots,
=======
                    CampUserGroup campUserGroup, CampVisibility campVisibility, String location, int totalSlots,
>>>>>>> d1526f33a465bfbd7f6b99f7d459f10f43b0a0fa
                    int campCommitteeSlot, String description, String staffInChargeID) {
        this.campName = campName;
        this.startDate = startDate;
        this.endDate = endDate;
        this.regClosingDate = regClosingDate;
        this.campUserGroup= campUserGroup;
        this.campVisibility = campVisibility;
        this.location = location;
        this.totalSlots = totalSlots;
        this.campCommitteeSlot = campCommitteeSlot;
        this.description = description;
        this.staffInChargeID = staffInChargeID;
    }

    // //Below are all getters and setters
    public String getCampName() {
        return campName;
    }

    public void setCampName(String campName) {
        this.campName = campName;
    }

    public LocalDate getStartDate() {
        return startDate;
    }

    public void setStartDate(LocalDate startDate) {
        this.startDate = startDate;
    }

    public LocalDate getEndDate() {
        return endDate;
    }

    public void setEndDate(LocalDate endDate) {
        this.endDate = endDate;
    }

    public LocalDate getRegClosingDate() {
        return regClosingDate;
    }

    public void setRegClosingDate(LocalDate regClosingDate) {
        this.regClosingDate = regClosingDate;
    }

<<<<<<< HEAD
    public String getCampUserGroup() {
        return this.campUserGroup;
    }

    public void setCampUserGroup(String campUserGroup) {
=======
    public CampUserGroup getCampUserGroup() {
        return this.campUserGroup;
    }

    public void setCampUserGroup(CampUserGroup campUserGroup) {
>>>>>>> d1526f33a465bfbd7f6b99f7d459f10f43b0a0fa
        this.campUserGroup = campUserGroup;
    }

    public CampVisibility getCampVisibility() {
        return campVisibility;
    }

    public void setCampVisibility(CampVisibility campVisibility) {
        this.campVisibility = campVisibility;
    }

    public String getLocation() {
        return location;
    }

    public void setLocation(String location) {
        this.location = location;
    }

    public int getTotalSlots() {
        return totalSlots;
    }

    public void setTotalSlots(int totalSlots) {
        this.totalSlots = totalSlots;
    }

    public int getCampCommitteeSlot() {
        return campCommitteeSlot;
    }

    public void setCampCommitteeSlot(int campCommitteeSlot) {
        this.campCommitteeSlot = campCommitteeSlot;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public String getStaffInChargeID() {
        return staffInChargeID;
    }

    public void setStaffInChargeID(String staffInChargeID) {
        this.staffInChargeID = staffInChargeID;
    }
}
