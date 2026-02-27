package io.flutter.view;

import android.view.accessibility.AccessibilityManager;
import io.flutter.embedding.engine.systemchannels.AccessibilityChannel;

/* JADX INFO: loaded from: classes4.dex */
public final class b implements AccessibilityManager.AccessibilityStateChangeListener {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ l f17400a;

    public b(l lVar) {
        this.f17400a = lVar;
    }

    @Override // android.view.accessibility.AccessibilityManager.AccessibilityStateChangeListener
    public final void onAccessibilityStateChanged(boolean z4) {
        l lVar = this.f17400a;
        if (lVar.f17484u) {
            return;
        }
        AccessibilityChannel accessibilityChannel = lVar.f17472b;
        if (z4) {
            accessibilityChannel.setAccessibilityMessageHandler(lVar.f17485v);
            accessibilityChannel.onAndroidAccessibilityEnabled();
        } else {
            lVar.i(false);
            accessibilityChannel.setAccessibilityMessageHandler(null);
            accessibilityChannel.onAndroidAccessibilityDisabled();
        }
        h hVar = lVar.f17482s;
        if (hVar != null) {
            hVar.onAccessibilityChanged(z4, lVar.c.isTouchExplorationEnabled());
        }
    }
}
