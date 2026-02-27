package df;

import java.util.ArrayList;

/* JADX INFO: loaded from: classes4.dex */
public final class y {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public String f16502a;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public String f16504d;
    public final ArrayList f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public ArrayList f16505g;
    public String h;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public String f16503b = "";
    public String c = "";
    public int e = -1;

    public y() {
        ArrayList arrayList = new ArrayList();
        this.f = arrayList;
        arrayList.add("");
    }

    public final z a() {
        if (this.f16502a == null) {
            throw new IllegalStateException("scheme == null");
        }
        if (this.f16504d != null) {
            return new z(this);
        }
        throw new IllegalStateException("host == null");
    }

    /* JADX WARN: Removed duplicated region for block: B:129:0x025d  */
    /* JADX WARN: Removed duplicated region for block: B:175:0x0342  */
    /* JADX WARN: Removed duplicated region for block: B:33:0x0062  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void b(df.z r26, java.lang.String r27) {
        /*
            Method dump skipped, instruction units count: 897
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: df.y.b(df.z, java.lang.String):void");
    }

    public final String toString() {
        StringBuilder sb2 = new StringBuilder();
        String str = this.f16502a;
        if (str != null) {
            sb2.append(str);
            sb2.append("://");
        } else {
            sb2.append("//");
        }
        if (!this.f16503b.isEmpty() || !this.c.isEmpty()) {
            sb2.append(this.f16503b);
            if (!this.c.isEmpty()) {
                sb2.append(':');
                sb2.append(this.c);
            }
            sb2.append('@');
        }
        String str2 = this.f16504d;
        if (str2 != null) {
            if (str2.indexOf(58) != -1) {
                sb2.append('[');
                sb2.append(this.f16504d);
                sb2.append(']');
            } else {
                sb2.append(this.f16504d);
            }
        }
        int iA = this.e;
        if (iA != -1 || this.f16502a != null) {
            if (iA == -1) {
                iA = z.a(this.f16502a);
            }
            String str3 = this.f16502a;
            if (str3 == null || iA != z.a(str3)) {
                sb2.append(':');
                sb2.append(iA);
            }
        }
        ArrayList arrayList = this.f;
        int size = arrayList.size();
        for (int i = 0; i < size; i++) {
            sb2.append('/');
            sb2.append((String) arrayList.get(i));
        }
        if (this.f16505g != null) {
            sb2.append('?');
            ArrayList arrayList2 = this.f16505g;
            int size2 = arrayList2.size();
            for (int i4 = 0; i4 < size2; i4 += 2) {
                String str4 = (String) arrayList2.get(i4);
                String str5 = (String) arrayList2.get(i4 + 1);
                if (i4 > 0) {
                    sb2.append('&');
                }
                sb2.append(str4);
                if (str5 != null) {
                    sb2.append('=');
                    sb2.append(str5);
                }
            }
        }
        if (this.h != null) {
            sb2.append('#');
            sb2.append(this.h);
        }
        return sb2.toString();
    }
}
