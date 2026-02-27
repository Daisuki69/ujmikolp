package com.tencent.could.component.common.ai.eventreport.api;

/* JADX INFO: loaded from: classes4.dex */
public class EventReportConfig {
    public static String STRING_INIT = "";

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public String f15537a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public String f15538b;
    public String c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public String f15539d;
    public String e;

    public static class ConfigBuilder {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public String f15540a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public String f15541b;
        public String c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public String f15542d;
        public String e;

        public ConfigBuilder() {
            String str = EventReportConfig.STRING_INIT;
            this.f15540a = str;
            this.f15541b = str;
            this.c = str;
            this.f15542d = str;
            this.e = str;
        }

        public EventReportConfig create() {
            return new EventReportConfig(this);
        }

        public ConfigBuilder setBusiness(String str) {
            this.f15540a = str;
            return this;
        }

        public ConfigBuilder setDeviceInfoUrl(String str) {
            this.f15542d = str;
            return this;
        }

        public ConfigBuilder setErrorInfoUrl(String str) {
            this.e = str;
            return this;
        }

        public ConfigBuilder setOrigin(String str) {
            this.c = str;
            return this;
        }

        public ConfigBuilder setSdkVersion(String str) {
            this.f15541b = str;
            return this;
        }
    }

    public EventReportConfig(ConfigBuilder configBuilder) {
        this.f15537a = configBuilder.f15540a;
        this.c = configBuilder.c;
        this.f15538b = configBuilder.f15541b;
        this.f15539d = configBuilder.f15542d;
        this.e = configBuilder.e;
    }

    public static ConfigBuilder builder() {
        return new ConfigBuilder();
    }

    public String getBusiness() {
        return this.f15537a;
    }

    public String getDeviceInfoUrl() {
        return this.f15539d;
    }

    public String getErrorInfoUrl() {
        return this.e;
    }

    public String getOrigin() {
        return this.c;
    }

    public String getSdkVersion() {
        return this.f15538b;
    }
}
