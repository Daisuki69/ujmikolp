package b0;

import D.InterfaceC0191y;
import D.d0;
import java.util.HashSet;
import java.util.Iterator;

/* JADX INFO: loaded from: classes2.dex */
public final class e {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final HashSet f8270a;

    public e(String[] strArr) {
        this.f8270a = new HashSet();
        if (strArr == null || strArr.length <= 0) {
            return;
        }
        for (String string : strArr) {
            if (d0.a(string, InterfaceC0191y.c)) {
                if (string != null && !string.isEmpty()) {
                    StringBuilder sb2 = new StringBuilder();
                    boolean z4 = true;
                    for (char lowerCase : string.toCharArray()) {
                        if (Character.isSpaceChar(lowerCase)) {
                            z4 = true;
                        } else if (z4) {
                            lowerCase = Character.toTitleCase(lowerCase);
                            z4 = false;
                        } else {
                            lowerCase = Character.toLowerCase(lowerCase);
                        }
                        sb2.append(lowerCase);
                    }
                    string = sb2.toString();
                }
                this.f8270a.add(string);
            }
        }
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || e.class != obj.getClass()) {
            return false;
        }
        return this.f8270a.equals(((e) obj).f8270a);
    }

    public final String toString() {
        StringBuilder sb2 = new StringBuilder();
        Iterator it = this.f8270a.iterator();
        while (it.hasNext()) {
            String str = (String) it.next();
            if (InterfaceC0191y.c.contains(str)) {
                sb2.append(str);
                sb2.append(it.hasNext() ? "," : "");
            }
        }
        return sb2.toString();
    }

    public e(HashSet hashSet) {
        HashSet hashSet2 = new HashSet();
        this.f8270a = hashSet2;
        hashSet2.addAll(hashSet);
    }
}
