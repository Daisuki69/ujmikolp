package io.flutter.plugin.platform;

import android.view.MotionEvent;
import io.flutter.embedding.android.FlutterImageView;

/* JADX INFO: renamed from: io.flutter.plugin.platform.d, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes4.dex */
public final class C1620d extends FlutterImageView {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public C1617a f17223a;

    @Override // android.view.View
    public final boolean onHoverEvent(MotionEvent motionEvent) {
        C1617a c1617a = this.f17223a;
        if (c1617a != null) {
            io.flutter.view.l lVar = c1617a.f17218a;
            if (lVar == null ? false : lVar.e(motionEvent, true)) {
                return true;
            }
        }
        return super.onHoverEvent(motionEvent);
    }
}
