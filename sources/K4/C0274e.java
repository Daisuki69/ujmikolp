package K4;

import g3.InterfaceC1497a;
import g3.InterfaceC1498b;

/* JADX INFO: renamed from: K4.e, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
public final class C0274e {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @InterfaceC1497a
    @InterfaceC1498b("message")
    private final String f2617a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @InterfaceC1497a
    @InterfaceC1498b("code")
    private final String f2618b;

    @InterfaceC1497a
    @InterfaceC1498b("spiel")
    private final String c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final Integer f2619d;
    public final String e;

    public C0274e(Integer num, String str, String str2, String str3, String str4) {
        this.f2617a = str;
        this.f2618b = str2;
        this.c = str3;
        this.f2619d = num;
        this.e = str4;
    }

    public static C0274e a(C0274e c0274e, String str, Integer num, String str2, int i) {
        if ((i & 1) != 0) {
            str = c0274e.f2617a;
        }
        String str3 = str;
        String str4 = c0274e.f2618b;
        String str5 = c0274e.c;
        if ((i & 8) != 0) {
            num = c0274e.f2619d;
        }
        Integer num2 = num;
        if ((i & 16) != 0) {
            str2 = c0274e.e;
        }
        c0274e.getClass();
        return new C0274e(num2, str3, str4, str5, str2);
    }

    public final String b() {
        return this.f2618b;
    }

    public final String c() {
        return this.f2617a;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C0274e)) {
            return false;
        }
        C0274e c0274e = (C0274e) obj;
        return kotlin.jvm.internal.j.b(this.f2617a, c0274e.f2617a) && kotlin.jvm.internal.j.b(this.f2618b, c0274e.f2618b) && kotlin.jvm.internal.j.b(this.c, c0274e.c) && kotlin.jvm.internal.j.b(this.f2619d, c0274e.f2619d) && kotlin.jvm.internal.j.b(this.e, c0274e.e);
    }

    public final int hashCode() {
        String str = this.f2617a;
        int iHashCode = (str == null ? 0 : str.hashCode()) * 31;
        String str2 = this.f2618b;
        int iHashCode2 = (iHashCode + (str2 == null ? 0 : str2.hashCode())) * 31;
        String str3 = this.c;
        int iHashCode3 = (iHashCode2 + (str3 == null ? 0 : str3.hashCode())) * 31;
        Integer num = this.f2619d;
        int iHashCode4 = (iHashCode3 + (num == null ? 0 : num.hashCode())) * 31;
        String str4 = this.e;
        return iHashCode4 + (str4 != null ? str4.hashCode() : 0);
    }

    public final String toString() {
        StringBuilder sb2 = new StringBuilder("Error(message=");
        sb2.append(this.f2617a);
        sb2.append(", code=");
        sb2.append(this.f2618b);
        sb2.append(", spiel=");
        sb2.append(this.c);
        sb2.append(", statusCode=");
        sb2.append(this.f2619d);
        sb2.append(", requestReferenceNumber=");
        return androidx.camera.core.impl.a.n(sb2, this.e, ')');
    }
}
