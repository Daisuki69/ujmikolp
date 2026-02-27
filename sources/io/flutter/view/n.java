package io.flutter.view;

import android.view.View;

/* JADX INFO: loaded from: classes4.dex */
public final class n {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final View f17492a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final int f17493b;

    public n(View view, int i) {
        this.f17492a = view;
        this.f17493b = i;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof n)) {
            return false;
        }
        n nVar = (n) obj;
        return this.f17493b == nVar.f17493b && this.f17492a.equals(nVar.f17492a);
    }

    public final int hashCode() {
        return ((this.f17492a.hashCode() + 31) * 31) + this.f17493b;
    }
}
