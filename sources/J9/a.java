package J9;

import We.s;
import java.io.Serializable;
import kotlin.jvm.internal.j;

/* JADX INFO: loaded from: classes4.dex */
public final class a implements Serializable {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public String f2485a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public String f2486b;
    public String c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public String f2487d;

    public a(String str, String str2, String str3, String str4) {
        this.f2485a = str;
        this.f2486b = str2;
        this.c = str3;
        this.f2487d = str4;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof a)) {
            return false;
        }
        a aVar = (a) obj;
        return j.b(this.f2485a, aVar.f2485a) && j.b(this.f2486b, aVar.f2486b) && j.b(this.c, aVar.c) && j.b(this.f2487d, aVar.f2487d);
    }

    public final int hashCode() {
        String str = this.f2485a;
        int iHashCode = (str == null ? 0 : str.hashCode()) * 31;
        String str2 = this.f2486b;
        int iHashCode2 = (iHashCode + (str2 == null ? 0 : str2.hashCode())) * 31;
        String str3 = this.c;
        int iHashCode3 = (iHashCode2 + (str3 == null ? 0 : str3.hashCode())) * 31;
        String str4 = this.f2487d;
        return iHashCode3 + (str4 != null ? str4.hashCode() : 0);
    }

    public final String toString() {
        String str = this.f2485a;
        String str2 = this.f2486b;
        return androidx.camera.core.impl.a.p(s.x("ContactReferenceModel(contactFirstName=", str, ", contactLastName=", str2, ", contactRelationship="), this.c, ", contactMobile=", this.f2487d, ")");
    }
}
