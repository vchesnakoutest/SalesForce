package objects;

public class Account {
    String accountName;
    String webSite;
    String industryType;

    public Account(String accountName, String webSite, String industryType) {
        this.accountName = accountName;
        this.webSite = webSite;
        this.industryType = industryType;
    }

    public String getAccountName() {
        return accountName;
    }

    public void setAccountName(String accountName) {
        this.accountName = accountName;
    }

    public String getWebSite() {
        return webSite;
    }

    public void setWebSite(String webSite) {
        this.webSite = webSite;
    }

    public String getIndustryType() {
        return industryType;
    }

    public void setIndustryType(String industryType) {
        this.industryType = industryType;
    }
}
