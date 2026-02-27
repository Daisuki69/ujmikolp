package com.shield.android.p;

import com.shield.android.p.a;
import com.shield.android.p.d;
import java.util.Comparator;

/* JADX INFO: loaded from: classes4.dex */
public final /* synthetic */ class k implements Comparator {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f15483a;

    public /* synthetic */ k(int i) {
        this.f15483a = i;
    }

    @Override // java.util.Comparator
    public final int compare(Object obj, Object obj2) {
        switch (this.f15483a) {
            case 0:
                return a.a((a.C0078a) obj, (a.C0078a) obj2);
            default:
                return d.a((d.a) obj, (d.a) obj2);
        }
    }
}
