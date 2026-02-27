package Rg;

import java.util.Map;
import rj.InterfaceC2213d;

/* JADX INFO: loaded from: classes4.dex */
public final class n implements Map.Entry, InterfaceC2213d {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Object f5546a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public Object f5547b;

    public n(Object obj, Object obj2) {
        this.f5546a = obj;
        this.f5547b = obj2;
    }

    @Override // java.util.Map.Entry
    public final boolean equals(Object obj) {
        if (obj != null && (obj instanceof Map.Entry)) {
            Map.Entry entry = (Map.Entry) obj;
            if (kotlin.jvm.internal.j.b(entry.getKey(), this.f5546a) && kotlin.jvm.internal.j.b(entry.getValue(), this.f5547b)) {
                return true;
            }
        }
        return false;
    }

    @Override // java.util.Map.Entry
    public final Object getKey() {
        return this.f5546a;
    }

    @Override // java.util.Map.Entry
    public final Object getValue() {
        return this.f5547b;
    }

    @Override // java.util.Map.Entry
    public final int hashCode() {
        Object obj = this.f5546a;
        kotlin.jvm.internal.j.d(obj);
        int iHashCode = obj.hashCode() + 527;
        Object obj2 = this.f5547b;
        kotlin.jvm.internal.j.d(obj2);
        return obj2.hashCode() + iHashCode;
    }

    @Override // java.util.Map.Entry
    public final Object setValue(Object obj) {
        this.f5547b = obj;
        return obj;
    }

    public final String toString() {
        StringBuilder sb2 = new StringBuilder();
        sb2.append(this.f5546a);
        sb2.append('=');
        sb2.append(this.f5547b);
        return sb2.toString();
    }
}
