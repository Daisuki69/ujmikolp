package com.tencent.could.huiyansdk.entity;

import g3.InterfaceC1498b;

/* JADX INFO: loaded from: classes4.dex */
public class LivenessRequest {

    @InterfaceC1498b("bestFrameImageFromTerminal")
    public String bestFrameImageFromTerminal;

    @InterfaceC1498b("LiveData")
    public String liveData;

    @InterfaceC1498b("NeedBestFrame")
    public boolean needBestFrame = false;

    @InterfaceC1498b("Video")
    public String video;

    public String getBestFrameImageFromTerminal() {
        return this.bestFrameImageFromTerminal;
    }

    public String getLiveData() {
        return this.liveData;
    }

    public String getVideo() {
        return this.video;
    }

    public boolean isNeedBestFrame() {
        return this.needBestFrame;
    }

    public void setBestFrameImageFromTerminal(String str) {
        this.bestFrameImageFromTerminal = str;
    }

    public void setLiveData(String str) {
        this.liveData = str;
    }

    public void setNeedBestFrame(boolean z4) {
        this.needBestFrame = z4;
    }

    public void setVideo(String str) {
        this.video = str;
    }
}
