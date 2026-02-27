package Xj;

import android.hardware.Camera;
import n4.C1917a;

/* JADX INFO: loaded from: classes.dex */
public final class d implements Camera.AutoFocusCallback {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f6689a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ Object f6690b;

    public /* synthetic */ d(Object obj, int i) {
        this.f6689a = i;
        this.f6690b = obj;
    }

    @Override // android.hardware.Camera.AutoFocusCallback
    public final void onAutoFocus(boolean z4, Camera camera) {
        switch (this.f6689a) {
            case 0:
                e eVar = (e) this.f6690b;
                eVar.f6692b.postDelayed(eVar.i, 1000L);
                break;
            default:
                ((C1917a) this.f6690b).e.post(new C.h(this, 27));
                break;
        }
    }
}
