package M8;

import android.os.Bundle;
import androidx.annotation.NonNull;
import androidx.navigation.NavArgs;
import java.util.HashMap;

/* JADX INFO: renamed from: M8.k0, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes4.dex */
public final class C0373k0 implements NavArgs {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final HashMap f3326a = new HashMap();

    @NonNull
    public static C0373k0 fromBundle(@NonNull Bundle bundle) {
        C0373k0 c0373k0 = new C0373k0();
        bundle.setClassLoader(C0373k0.class.getClassLoader());
        boolean zContainsKey = bundle.containsKey("destinationScreenName");
        HashMap map = c0373k0.f3326a;
        if (zContainsKey) {
            String string = bundle.getString("destinationScreenName");
            if (string == null) {
                throw new IllegalArgumentException("Argument \"destinationScreenName\" is marked as non-null but was passed a null value.");
            }
            map.put("destinationScreenName", string);
        } else {
            map.put("destinationScreenName", "");
        }
        if (bundle.containsKey("isMinor")) {
            map.put("isMinor", Boolean.valueOf(bundle.getBoolean("isMinor")));
            return c0373k0;
        }
        map.put("isMinor", Boolean.FALSE);
        return c0373k0;
    }

    public final String a() {
        return (String) this.f3326a.get("destinationScreenName");
    }

    public final boolean b() {
        return ((Boolean) this.f3326a.get("isMinor")).booleanValue();
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || C0373k0.class != obj.getClass()) {
            return false;
        }
        C0373k0 c0373k0 = (C0373k0) obj;
        HashMap map = this.f3326a;
        boolean zContainsKey = map.containsKey("destinationScreenName");
        HashMap map2 = c0373k0.f3326a;
        if (zContainsKey != map2.containsKey("destinationScreenName")) {
            return false;
        }
        if (a() == null ? c0373k0.a() == null : a().equals(c0373k0.a())) {
            return map.containsKey("isMinor") == map2.containsKey("isMinor") && b() == c0373k0.b();
        }
        return false;
    }

    public final int hashCode() {
        return (b() ? 1 : 0) + (((a() != null ? a().hashCode() : 0) + 31) * 31);
    }

    public final String toString() {
        return "MayaKycConfirmationBottomSheetDialogFragmentArgs{destinationScreenName=" + a() + ", isMinor=" + b() + "}";
    }
}
