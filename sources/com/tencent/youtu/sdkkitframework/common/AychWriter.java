package com.tencent.youtu.sdkkitframework.common;

/* JADX INFO: loaded from: classes4.dex */
public class AychWriter extends Thread {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public String f15798a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public String f15799b;
    public String c;

    public AychWriter(String str, String str2, String str3) {
        this.f15798a = str;
        this.f15799b = str2;
        this.c = str3;
    }

    @Override // java.lang.Thread, java.lang.Runnable
    public void run() {
        System.out.println("开始执行run()");
        long jCurrentTimeMillis = System.currentTimeMillis();
        try {
            LogWriter.getLogWriter(this.f15799b, this.c).log(this.f15798a);
        } catch (Exception e) {
            e.printStackTrace();
        }
        LogWriter.logWriter = null;
        long jCurrentTimeMillis2 = System.currentTimeMillis();
        System.out.println("总消耗时间：" + (jCurrentTimeMillis2 - jCurrentTimeMillis));
    }
}
