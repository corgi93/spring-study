package com.example.springvalidation.controller.dto;import java.util.List;public class ErrorResponse {    String statusCode;    String requestUrl;    String code;    String message;    String resultCode;    List<Error> errorList;    public String getStatusCode() {        return statusCode;    }    public String getRequestUrl() {        return requestUrl;    }    public String getCode() {        return code;    }    public String getMessage() {        return message;    }    public String getResultCode() {        return resultCode;    }    public List<Error> getErrorList() {        return errorList;    }    public void setStatusCode(String statusCode) {        this.statusCode = statusCode;    }    public void setRequestUrl(String requestUrl) {        this.requestUrl = requestUrl;    }    public void setCode(String code) {        this.code = code;    }    public void setMessage(String message) {        this.message = message;    }    public void setResultCode(String resultCode) {        this.resultCode = resultCode;    }    public void setErrorList(List<Error> errorList) {        this.errorList = errorList;    }}