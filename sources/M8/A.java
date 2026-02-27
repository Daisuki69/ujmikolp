package M8;

import android.os.Bundle;
import androidx.annotation.NonNull;
import androidx.navigation.NavArgs;
import java.util.HashMap;

/* JADX INFO: loaded from: classes4.dex */
public final class A implements NavArgs {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final HashMap f3131a = new HashMap();

    @NonNull
    public static A fromBundle(@NonNull Bundle bundle) {
        A a8 = new A();
        bundle.setClassLoader(A.class.getClassLoader());
        boolean zContainsKey = bundle.containsKey("isFromDashboard");
        HashMap map = a8.f3131a;
        if (zContainsKey) {
            map.put("isFromDashboard", Boolean.valueOf(bundle.getBoolean("isFromDashboard")));
            return a8;
        }
        map.put("isFromDashboard", Boolean.FALSE);
        return a8;
    }

    public final boolean a() {
        return ((Boolean) this.f3131a.get("isFromDashboard")).booleanValue();
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || A.class != obj.getClass()) {
            return false;
        }
        A a8 = (A) obj;
        return this.f3131a.containsKey("isFromDashboard") == a8.f3131a.containsKey("isFromDashboard") && a() == a8.a();
    }

    public final int hashCode() {
        return (a() ? 1 : 0) + 31;
    }

    public final String toString() {
        return "MayaKycAmlcUploadDocumentsFragmentArgs{isFromDashboard=" + a() + "}";
    }
}
