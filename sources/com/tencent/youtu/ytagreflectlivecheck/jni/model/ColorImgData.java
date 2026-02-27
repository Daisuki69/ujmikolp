package com.tencent.youtu.ytagreflectlivecheck.jni.model;

/* JADX INFO: loaded from: classes4.dex */
public class ColorImgData {
    public long capture_time;
    public String checksum;
    public String image;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public int f16035x;

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    public int f16036y;

    public long getCapture_time() {
        return this.capture_time;
    }

    public String getImage() {
        return this.image;
    }

    public int getX() {
        return this.f16035x;
    }

    public int getY() {
        return this.f16036y;
    }

    public void setCapture_time(long j) {
        this.capture_time = j;
    }

    public void setImage(String str) {
        this.image = str;
    }

    public void setX(int i) {
        this.f16035x = i;
    }

    public void setY(int i) {
        this.f16036y = i;
    }
}
