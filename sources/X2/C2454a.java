package x2;

/* JADX INFO: renamed from: x2.a, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes2.dex */
public final class C2454a implements InterfaceC2458e {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final int f20880a;

    public C2454a(int i) {
        this.f20880a = i;
    }

    @Override // java.lang.annotation.Annotation
    public final Class annotationType() {
        return InterfaceC2458e.class;
    }

    @Override // java.lang.annotation.Annotation
    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof InterfaceC2458e)) {
            return false;
        }
        C2454a c2454a = (C2454a) ((InterfaceC2458e) obj);
        if (this.f20880a != c2454a.f20880a) {
            return false;
        }
        Object obj2 = EnumC2457d.f20882a;
        c2454a.getClass();
        return obj2.equals(obj2);
    }

    @Override // java.lang.annotation.Annotation
    public final int hashCode() {
        return (14552422 ^ this.f20880a) + (EnumC2457d.f20882a.hashCode() ^ 2041407134);
    }

    @Override // java.lang.annotation.Annotation
    public final String toString() {
        return "@com.google.firebase.encoders.proto.Protobuf(tag=" + this.f20880a + "intEncoding=" + EnumC2457d.f20882a + ')';
    }
}
