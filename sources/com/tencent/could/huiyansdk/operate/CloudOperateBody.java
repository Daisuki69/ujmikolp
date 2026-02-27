package com.tencent.could.huiyansdk.operate;

import g3.InterfaceC1498b;
import java.util.ArrayList;
import java.util.List;

/* JADX INFO: loaded from: classes4.dex */
public abstract class CloudOperateBody {

    @InterfaceC1498b("Actions")
    public List<CloudOperateItem> actions = new ArrayList();

    public CloudOperateBody() {
        initData();
    }

    public abstract void initData();

    public abstract void reset();

    public void updateInfo(String str, int i, long j, long j6) {
        updateInfo(str, i, j, j6, "");
    }

    public void updateInfo(String str, int i, long j, long j6, String str2) {
        for (CloudOperateItem cloudOperateItem : this.actions) {
            if (cloudOperateItem != null && cloudOperateItem.getAction().equals(str)) {
                cloudOperateItem.updateInfo(i, j, j6);
                cloudOperateItem.setInfo(str2);
            }
        }
    }
}
