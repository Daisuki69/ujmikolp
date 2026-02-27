package com.tencent.could.huiyansdk.turing;

import android.os.Handler;
import android.os.HandlerThread;
import androidx.media3.common.C;
import com.tencent.could.huiyansdk.api.j;
import com.tencent.could.huiyansdk.common.a;
import com.tencent.could.huiyansdk.entity.TuringResultCacheEntity;
import com.tencent.could.huiyansdk.enums.AuthState;
import com.tencent.could.huiyansdk.manager.b;
import com.tencent.could.huiyansdk.manager.e;

/* JADX INFO: loaded from: classes4.dex */
public class f {
    public TuringResultCacheEntity f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public volatile b f15720g;
    public com.tencent.could.huiyansdk.manager.f h;
    public com.tencent.could.huiyansdk.callback.d i;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public HandlerThread f15722l;
    public volatile Handler m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public long f15723n;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public long f15717a = C.DEFAULT_MAX_SEEK_TO_PREVIOUS_POSITION_MS;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public volatile boolean f15718b = false;
    public volatile boolean c = false;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public boolean f15719d = false;
    public boolean e = false;
    public boolean j = false;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public volatile boolean f15721k = false;

    public static final class a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final f f15724a = new f();
    }

    public static void a(f fVar) {
        fVar.getClass();
        if (a.C0082a.f15626a.f15625d) {
            return;
        }
        b.C0084b.f15678a.a(AuthState.START_GET_LIVE_TYPE, (Object) null);
    }

    public final void c() {
        this.f15720g = (b) EmptyTuringHelper.class.newInstance();
        this.j = true;
        com.tencent.could.huiyansdk.manager.e eVar = e.a.f15688a;
        StringBuilder sb2 = new StringBuilder("real init turing: ");
        sb2.append(this.j);
        sb2.append(", ");
        sb2.append(this.f15720g == null);
        sb2.append(", [turing version]: ");
        sb2.append(a());
        eVar.a(1, "TuringSdkHelper", sb2.toString());
    }

    public final void d() {
        e.a.f15688a.a(2, "TuringSdkHelper", "get turing face result and remove time out event!");
        if (this.m != null) {
            this.m.removeMessages(5);
        }
    }

    public void b() {
        if (this.m == null) {
            return;
        }
        this.m.removeMessages(3);
        this.m.removeMessages(5);
        this.m.removeMessages(3);
        this.m.removeMessages(4);
        this.m = null;
        HandlerThread handlerThread = this.f15722l;
        if (handlerThread == null || !handlerThread.isAlive()) {
            return;
        }
        this.f15722l.quitSafely();
    }

    public String a() {
        if (this.j && this.f15720g != null) {
            ((EmptyTuringHelper) this.f15720g).getClass();
            return "";
        }
        e.a.f15688a.a(2, "TuringSdkHelper", "get version, turing is not create!");
        return "";
    }

    public static void a(f fVar, boolean z4) {
        fVar.d();
        long jCurrentTimeMillis = System.currentTimeMillis() - fVar.f15723n;
        if (z4) {
            j jVar = j.a.f15618a;
            String strF = androidx.camera.core.impl.a.f(jCurrentTimeMillis, "");
            com.tencent.could.huiyansdk.api.b bVar = jVar.f15617g;
            if (bVar != null) {
                bVar.onBuriedPointCallBack("AuthCheckStage", "GetTuringTokenTimeOut", strF);
                return;
            }
            return;
        }
        j jVar2 = j.a.f15618a;
        String strF2 = androidx.camera.core.impl.a.f(jCurrentTimeMillis, "");
        com.tencent.could.huiyansdk.api.b bVar2 = jVar2.f15617g;
        if (bVar2 != null) {
            bVar2.onBuriedPointCallBack("AuthCheckStage", "GetTuringTokenSuccess", strF2);
        }
    }
}
