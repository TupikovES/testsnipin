package snipin.entity;

public class TestResponse {

    private String resp;

    public TestResponse(String resp) {
        this.resp = resp;
    }

    public String getResp() {
        return resp;
    }

    public void setResp(String resp) {
        this.resp = resp;
    }

    @Override
    public String toString() {
        return "TestResponse{" +
                "resp='" + resp + '\'' +
                '}';
    }
}
