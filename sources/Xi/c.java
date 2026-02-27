package Xi;

import Ui.k;
import java.util.HashMap;
import java.util.regex.Pattern;

/* JADX INFO: loaded from: classes4.dex */
public final class c implements k {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public String f6678a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public Pattern f6679b;

    @Override // Ui.k
    public final boolean c(Object obj, HashMap map, U8.c cVar) {
        if (obj instanceof String) {
            return this.f6679b.matcher((String) obj).find();
        }
        return false;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && c.class == obj.getClass()) {
            String str = ((c) obj).f6678a;
            String str2 = this.f6678a;
            if (str2 != null) {
                return str2.equals(str);
            }
            if (str == null) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        String str = this.f6678a;
        if (str != null) {
            return str.hashCode();
        }
        return 0;
    }

    public final String toString() {
        return "matches " + this.f6678a;
    }
}
