package com.shield.android.f;

import com.shield.android.ShieldCallback;
import com.shield.android.common.ShieldModule;
import com.shield.android.e.i;
import com.shield.android.f.f;
import java.util.HashMap;

/* JADX INFO: loaded from: classes4.dex */
public final /* synthetic */ class m implements ShieldModule.Callback, com.shield.android.e.h {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f15360a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ Object f15361b;
    public final /* synthetic */ Object c;

    public /* synthetic */ m(int i, Object obj, Object obj2) {
        this.f15360a = i;
        this.f15361b = obj;
        this.c = obj2;
    }

    @Override // com.shield.android.e.h
    public void notifyState(i.a aVar) {
        switch (this.f15360a) {
            case 1:
                d.a((d) this.f15361b, (ShieldCallback) this.c, aVar);
                break;
            default:
                ((e) this.f15361b).a((ShieldCallback) this.c, aVar);
                break;
        }
    }

    @Override // com.shield.android.common.ShieldModule.Callback
    public void onDataReceived(HashMap map) {
        ((f.AnonymousClass14) this.f15361b).d((String) this.c, map);
    }
}
