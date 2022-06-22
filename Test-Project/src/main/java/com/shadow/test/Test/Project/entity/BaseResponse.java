package com.shadow.test.Test.Project.entity;

public class BaseResponse {


        private String message ="Success";
        private int responseCode =200;

        public String getMessage()
        {
            return this.message;
        }

        public void setMessage(String message)
        {
            this.message = message;
        }

        public int getResponseCode()
        {
            return this.responseCode;
        }

        public void setResponseCode(int responseCode)
        {
            this.responseCode = responseCode;
        }

    }

