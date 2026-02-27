package com.tencent.could.component.common.ai.net;

/* JADX INFO: loaded from: classes4.dex */
public class DnsCacheInfo {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public String f15564a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public String f15565b;
    public long c;

    public DnsCacheInfo(String str, String str2, long j) {
        this.f15564a = str;
        this.f15565b = str2;
        this.c = j;
    }

    public String getHostName() {
        return this.f15564a;
    }

    public String getIp() {
        return this.f15565b;
    }

    public long getRefreshTime() {
        return this.c;
    }

    public void setHostName(String str) {
        this.f15564a = str;
    }

    public void setIp(String str) {
        this.f15565b = str;
    }

    public void setRefreshTime(long j) {
        this.c = j;
    }

    public String toString() {
        return "DnsCacheInfo{hostName='" + this.f15564a + "', ip='" + this.f15565b + "', refreshTime=" + this.c + '}';
    }
}
