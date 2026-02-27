package M8;

import android.os.Bundle;
import androidx.annotation.NonNull;
import androidx.navigation.NavArgs;
import java.util.HashMap;

/* JADX INFO: loaded from: classes4.dex */
public final class i3 implements NavArgs {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final HashMap f3317a = new HashMap();

    @NonNull
    public static i3 fromBundle(@NonNull Bundle bundle) {
        i3 i3Var = new i3();
        bundle.setClassLoader(i3.class.getClassLoader());
        boolean zContainsKey = bundle.containsKey("navigationSource");
        HashMap map = i3Var.f3317a;
        if (!zContainsKey) {
            map.put("navigationSource", "normal_flow");
            return i3Var;
        }
        String string = bundle.getString("navigationSource");
        if (string == null) {
            throw new IllegalArgumentException("Argument \"navigationSource\" is marked as non-null but was passed a null value.");
        }
        map.put("navigationSource", string);
        return i3Var;
    }

    public final String a() {
        return (String) this.f3317a.get("navigationSource");
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || i3.class != obj.getClass()) {
            return false;
        }
        i3 i3Var = (i3) obj;
        if (this.f3317a.containsKey("navigationSource") != i3Var.f3317a.containsKey("navigationSource")) {
            return false;
        }
        return a() == null ? i3Var.a() == null : a().equals(i3Var.a());
    }

    public final int hashCode() {
        return 31 + (a() != null ? a().hashCode() : 0);
    }

    public final String toString() {
        return "MayaKycWorkDetailsFragmentArgs{navigationSource=" + a() + "}";
    }
}
