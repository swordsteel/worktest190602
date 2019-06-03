package test.work.model;

import com.fasterxml.jackson.dataformat.xml.annotation.JacksonXmlRootElement;

@JacksonXmlRootElement(localName = "error")
public class ErrorMessage {

    private String code;

    public ErrorMessage() {}

    public ErrorMessage(String code) {
        this.code = code;
    }

    public String getCode() {
        return code;
    }

}
