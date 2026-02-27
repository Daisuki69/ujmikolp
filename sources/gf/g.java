package gf;

import android.util.Log;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/* JADX INFO: loaded from: classes4.dex */
public final class g {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final ArrayList f16826a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public int f16827b;

    public g(ArrayList arrayList) {
        this.f16827b = 0;
        this.f16826a = arrayList;
    }

    public synchronized List a() {
        return Collections.unmodifiableList(new ArrayList(this.f16826a));
    }

    public synchronized boolean b(List list) {
        this.f16826a.clear();
        if (list.size() <= this.f16827b) {
            return this.f16826a.addAll(list);
        }
        Log.w("FirebaseCrashlytics", "Ignored 0 entries when adding rollout assignments. Maximum allowable: " + this.f16827b, null);
        return this.f16826a.addAll(list.subList(0, this.f16827b));
    }

    public g() {
        this.f16826a = new ArrayList();
        this.f16827b = 128;
    }
}
