package io.flutter.view;

import android.database.ContentObserver;
import android.net.Uri;
import android.os.Handler;
import android.provider.Settings;

/* JADX INFO: loaded from: classes4.dex */
public final class c extends ContentObserver {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ l f17401a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public c(l lVar, Handler handler) {
        super(handler);
        this.f17401a = lVar;
    }

    @Override // android.database.ContentObserver
    public final void onChange(boolean z4, Uri uri) {
        l lVar = this.f17401a;
        if (lVar.f17484u) {
            return;
        }
        if (Settings.Global.getFloat(lVar.f, "transition_animation_scale", 1.0f) == 0.0f) {
            lVar.f17476l |= 4;
        } else {
            lVar.f17476l &= -5;
        }
        lVar.f17472b.setAccessibilityFeatures(lVar.f17476l);
    }

    @Override // android.database.ContentObserver
    public final void onChange(boolean z4) {
        onChange(z4, null);
    }
}
