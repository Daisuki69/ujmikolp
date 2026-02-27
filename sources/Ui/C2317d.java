package ui;

import dOYHB6.tiZVw8.numX49;

/* JADX INFO: renamed from: ui.d, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes11.dex */
public final class C2317d {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final long f20329a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final Long f20330b;

    public C2317d(long j, Long l6) {
        this.f20329a = j;
        this.f20330b = l6;
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof C2317d)) {
            return false;
        }
        C2317d c2317d = (C2317d) obj;
        return this.f20329a == c2317d.f20329a && this.f20330b == null && c2317d.f20330b == null;
    }

    public final String toString() {
        return numX49.tnTj78("bHPr") + this.f20329a + numX49.tnTj78("bHPZ") + this.f20330b + '}';
    }
}
