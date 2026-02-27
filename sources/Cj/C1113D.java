package cj;

import com.tencent.youtu.sdkkitframework.common.WeJson;
import java.io.Serializable;
import java.util.Collection;
import java.util.Map;
import java.util.Set;
import rj.InterfaceC2210a;

/* JADX INFO: renamed from: cj.D, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes4.dex */
final class C1113D implements Map, Serializable, InterfaceC2210a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final C1113D f9378a = new C1113D();

    @Override // java.util.Map
    public final void clear() {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    @Override // java.util.Map
    public final boolean containsKey(Object obj) {
        return false;
    }

    @Override // java.util.Map
    public final boolean containsValue(Object obj) {
        if (!(obj instanceof Void)) {
            return false;
        }
        Void value = (Void) obj;
        kotlin.jvm.internal.j.g(value, "value");
        return false;
    }

    @Override // java.util.Map
    public final Set entrySet() {
        return C1114E.f9379a;
    }

    @Override // java.util.Map
    public final boolean equals(Object obj) {
        return (obj instanceof Map) && ((Map) obj).isEmpty();
    }

    @Override // java.util.Map
    public final /* bridge */ /* synthetic */ Object get(Object obj) {
        return null;
    }

    @Override // java.util.Map
    public final int hashCode() {
        return 0;
    }

    @Override // java.util.Map
    public final boolean isEmpty() {
        return true;
    }

    @Override // java.util.Map
    public final Set keySet() {
        return C1114E.f9379a;
    }

    @Override // java.util.Map
    public final /* bridge */ /* synthetic */ Object put(Object obj, Object obj2) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    @Override // java.util.Map
    public final void putAll(Map map) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    @Override // java.util.Map
    public final Object remove(Object obj) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    @Override // java.util.Map
    public final /* bridge */ int size() {
        return 0;
    }

    public final String toString() {
        return WeJson.EMPTY_MAP;
    }

    @Override // java.util.Map
    public final Collection values() {
        return C1112C.f9377a;
    }
}
