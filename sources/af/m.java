package af;

import com.dynatrace.android.agent.Global;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/* JADX INFO: loaded from: classes4.dex */
public final class m {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f7169a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final List f7170b;

    public m(String str, List list) {
        this.f7169a = str;
        this.f7170b = list == null ? new ArrayList() : list;
    }

    public static Object a(Object obj) {
        if (obj == null) {
            return null;
        }
        if (!(obj instanceof List)) {
            return obj;
        }
        List list = (List) obj;
        byte[] bArr = new byte[list.size()];
        for (int i = 0; i < list.size(); i++) {
            bArr[i] = (byte) ((Integer) list.get(i)).intValue();
        }
        return bArr;
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof m)) {
            return false;
        }
        m mVar = (m) obj;
        String str = this.f7169a;
        if (str != null) {
            if (!str.equals(mVar.f7169a)) {
                return false;
            }
        } else if (mVar.f7169a != null) {
            return false;
        }
        List list = this.f7170b;
        if (list.size() != mVar.f7170b.size()) {
            return false;
        }
        for (int i = 0; i < list.size(); i++) {
            boolean z4 = list.get(i) instanceof byte[];
            List list2 = mVar.f7170b;
            if (z4 && (list2.get(i) instanceof byte[])) {
                if (!Arrays.equals((byte[]) list.get(i), (byte[]) list2.get(i))) {
                    return false;
                }
            } else if (!list.get(i).equals(list2.get(i))) {
                return false;
            }
        }
        return true;
    }

    public final int hashCode() {
        String str = this.f7169a;
        if (str != null) {
            return str.hashCode();
        }
        return 0;
    }

    public final String toString() {
        String str;
        StringBuilder sb2 = new StringBuilder();
        sb2.append(this.f7169a);
        List list = this.f7170b;
        if (list == null || list.isEmpty()) {
            str = "";
        } else {
            str = Global.BLANK + list;
        }
        sb2.append(str);
        return sb2.toString();
    }
}
