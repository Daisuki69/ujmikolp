package Ui;

/* JADX INFO: loaded from: classes4.dex */
public final class c {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f5985a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final b f5986b;

    public c(String str, k kVar, boolean z4) {
        this.f5985a = str;
        this.f5986b = new b(kVar, z4);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || c.class != obj.getClass()) {
            return false;
        }
        c cVar = (c) obj;
        String str = cVar.f5985a;
        String str2 = this.f5985a;
        if (str2 != null) {
            if (!str2.equals(str)) {
                return false;
            }
        } else if (str != null) {
            return false;
        }
        return this.f5986b.equals(cVar.f5986b);
    }

    public final int hashCode() {
        String str = this.f5985a;
        return this.f5986b.hashCode() + ((str != null ? str.hashCode() : 0) * 31);
    }

    public final String toString() {
        StringBuilder sb2 = new StringBuilder("key");
        String str = this.f5985a;
        if (str != null) {
            sb2.append(".");
            sb2.append(str);
        }
        sb2.append(" is");
        sb2.append(this.f5986b);
        return sb2.toString();
    }
}
