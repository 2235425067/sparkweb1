package action;

public class User {
    String rowKey ;
    long timestamp ;
    String family ;
    String qualifier  ;
    String value ;
    User(){

    }
    User(String a, long b, String c, String d, String e){
        rowKey=a;
        timestamp=b;
        family=c;
        qualifier=d;
        value=e;
    }
    public void setRowKey(String rowKey) {
        this.rowKey = rowKey;
    }

    public void setTimestamp(long timestamp) {
        this.timestamp = timestamp;
    }

    public void setFamily(String family) {
        this.family = family;
    }

    public void setQualifier(String qualifier) {
        this.qualifier = qualifier;
    }

    public void setValue(String value) {
        this.value = value;
    }


    public String getRowKey() {
        return rowKey;
    }

    public long getTimestamp() {
        return timestamp;
    }

    public String getFamily() {
        return family;
    }

    public String getQualifier() {
        return qualifier;
    }

    public String getValue() {
        return value;
    }
}
