package io.flutter.view;

import android.view.accessibility.AccessibilityManager;

/* JADX INFO: loaded from: classes4.dex */
public final class d implements AccessibilityManager.TouchExplorationStateChangeListener {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ AccessibilityManager f17402a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ l f17403b;

    public d(l lVar, AccessibilityManager accessibilityManager) {
        this.f17403b = lVar;
        this.f17402a = accessibilityManager;
    }

    @Override // android.view.accessibility.AccessibilityManager.TouchExplorationStateChangeListener
    public final void onTouchExplorationStateChanged(boolean z4) {
        l lVar = this.f17403b;
        if (lVar.f17484u) {
            return;
        }
        if (!z4) {
            lVar.i(false);
            i iVar = lVar.f17478o;
            if (iVar != null) {
                lVar.g(iVar.f17450b, 256);
                lVar.f17478o = null;
            }
        }
        h hVar = lVar.f17482s;
        if (hVar != null) {
            hVar.onAccessibilityChanged(this.f17402a.isEnabled(), z4);
        }
    }
}
