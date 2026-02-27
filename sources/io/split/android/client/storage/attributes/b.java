package io.split.android.client.storage.attributes;

import java.util.HashMap;
import java.util.concurrent.ConcurrentHashMap;

/* JADX INFO: loaded from: classes4.dex */
public final class b implements a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final ConcurrentHashMap f17615a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final Object f17616b;

    public b(int i) {
        switch (i) {
            case 1:
                this.f17616b = new Object();
                this.f17615a = new ConcurrentHashMap();
                break;
            default:
                this.f17615a = new ConcurrentHashMap();
                this.f17616b = new Object();
                break;
        }
    }

    public HashMap a() {
        HashMap map;
        synchronized (this.f17616b) {
            map = new HashMap(this.f17615a);
            this.f17615a.clear();
        }
        return map;
    }
}
