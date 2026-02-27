package com.tencent.could.huiyansdk.entity;

import androidx.camera.core.impl.a;

/* JADX INFO: loaded from: classes4.dex */
public class LiveDataCheckResult {
    public boolean isHaveColorData = false;
    public boolean isNoAction = false;

    public boolean isHaveColorData() {
        return this.isHaveColorData;
    }

    public boolean isNoAction() {
        return this.isNoAction;
    }

    public void setHaveColorData(boolean z4) {
        this.isHaveColorData = z4;
    }

    public void setNoAction(boolean z4) {
        this.isNoAction = z4;
    }

    public String toString() {
        StringBuilder sb2 = new StringBuilder("LiveDataCheckResult{isHaveColorData=");
        sb2.append(this.isHaveColorData);
        sb2.append(", isNoAction=");
        return a.q(sb2, this.isNoAction, '}');
    }
}
