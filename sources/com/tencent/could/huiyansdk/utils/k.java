package com.tencent.could.huiyansdk.utils;

import android.os.Handler;
import android.os.Looper;
import android.os.Message;
import androidx.media3.exoplayer.upstream.CmcdData;
import com.tencent.could.huiyansdk.manager.e;
import com.tencent.could.huiyansdk.utils.j;
import com.tencent.youtu.sdkkitframework.framework.YtSDKKitFramework;

/* JADX INFO: loaded from: classes4.dex */
public class k extends Handler {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ com.tencent.could.huiyansdk.api.g f15749a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public k(m mVar, Looper looper, com.tencent.could.huiyansdk.api.g gVar) {
        super(looper);
        this.f15749a = gVar;
    }

    @Override // android.os.Handler
    public void handleMessage(Message message) {
        if (message.what == 1) {
            com.tencent.could.huiyansdk.api.a.a().getClass();
            com.tencent.could.huiyansdk.manager.e eVar = e.a.f15688a;
            eVar.a(2, CmcdData.Factory.OBJECT_TYPE_AUDIO_ONLY, "do resume");
            YtSDKKitFramework.getInstance().doResume();
            j jVar = j.b.f15748a;
            eVar.a(1, "TimeOutHelper", "timeout resume: " + jVar.f15746d);
            jVar.a(jVar.f15746d);
            com.tencent.could.huiyansdk.api.g gVar = this.f15749a;
            if (gVar != null) {
                gVar.onEndTransition();
            }
        }
    }
}
