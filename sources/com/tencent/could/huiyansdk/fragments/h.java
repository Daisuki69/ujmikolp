package com.tencent.could.huiyansdk.fragments;

import com.tencent.could.huiyansdk.manager.e;
import com.tencent.youtu.sdkkitframework.framework.YtSDKKitFramework;
import java.io.InputStream;
import java.util.HashMap;

/* JADX INFO: loaded from: classes4.dex */
public class h implements YtSDKKitFramework.IYTBaseFunctionListener {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ AuthingFragment f15655a;

    public h(AuthingFragment authingFragment) {
        this.f15655a = authingFragment;
    }

    @Override // com.tencent.youtu.sdkkitframework.framework.YtSDKKitFramework.IYTBaseFunctionListener
    public String base64Encode(byte[] bArr, int i) {
        return null;
    }

    @Override // com.tencent.youtu.sdkkitframework.framework.YtSDKKitFramework.IYTBaseFunctionListener
    public void detectActionDone(int i) {
    }

    @Override // com.tencent.youtu.sdkkitframework.framework.YtSDKKitFramework.IYTBaseFunctionListener
    public HashMap<String, Integer> getFrameResult(Object obj) {
        return null;
    }

    @Override // com.tencent.youtu.sdkkitframework.framework.YtSDKKitFramework.IYTBaseFunctionListener
    public byte[] getVoiceData() {
        try {
            InputStream inputStreamOpen = this.f15655a.getContextResources().getAssets().open("readnum6098.spx");
            bArr = inputStreamOpen.available() != 0 ? new byte[inputStreamOpen.available()] : null;
            inputStreamOpen.read(bArr);
            inputStreamOpen.close();
            return bArr;
        } catch (Exception e) {
            e.a.f15688a.a(2, "AuthingFragment", "get voice failed " + e.getLocalizedMessage());
            return bArr;
        }
    }
}
