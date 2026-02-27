package com.tencent.youtu.sdkkitframework.liveness;

import com.tencent.youtu.sdkkitframework.common.YtLogger;
import com.tencent.youtu.ytagreflectlivecheck.YTAGReflectLiveCheckInterface;
import com.tencent.youtu.ytagreflectlivecheck.jni.cppDefine.RawImgData;

/* JADX INFO: loaded from: classes4.dex */
public class n implements YTAGReflectLiveCheckInterface.LightLiveCheckResult {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ ReflectLivenessState f16017a;

    public n(ReflectLivenessState reflectLivenessState) {
        this.f16017a = reflectLivenessState;
    }

    @Override // com.tencent.youtu.ytagreflectlivecheck.YTAGReflectLiveCheckInterface.LightLiveCheckResult
    public void onFailed(int i, String str, String str2) {
        this.f16017a.a(i, str, str2);
    }

    @Override // com.tencent.youtu.ytagreflectlivecheck.YTAGReflectLiveCheckInterface.LightLiveCheckResult
    public void onReflectLiveImgData(RawImgData rawImgData) {
    }

    @Override // com.tencent.youtu.ytagreflectlivecheck.YTAGReflectLiveCheckInterface.LightLiveCheckResult
    public void onSuccess(com.tencent.youtu.ytagreflectlivecheck.a aVar) {
        YtLogger.o("ReflectLivenessState", "reflect succeed,get frame count:" + aVar.f16028a.length);
        this.f16017a.a(aVar);
    }
}
