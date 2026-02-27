package M8;

import android.os.Bundle;
import androidx.annotation.NonNull;
import androidx.navigation.NavArgs;
import java.util.HashMap;

/* JADX INFO: loaded from: classes4.dex */
public final class J1 implements NavArgs {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final HashMap f3182a = new HashMap();

    @NonNull
    public static J1 fromBundle(@NonNull Bundle bundle) {
        J1 j12 = new J1();
        bundle.setClassLoader(J1.class.getClassLoader());
        if (!bundle.containsKey("sourceKey")) {
            throw new IllegalArgumentException("Required argument \"sourceKey\" is missing and does not have an android:defaultValue");
        }
        String string = bundle.getString("sourceKey");
        if (string == null) {
            throw new IllegalArgumentException("Argument \"sourceKey\" is marked as non-null but was passed a null value.");
        }
        j12.f3182a.put("sourceKey", string);
        return j12;
    }

    public final String a() {
        return (String) this.f3182a.get("sourceKey");
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || J1.class != obj.getClass()) {
            return false;
        }
        J1 j12 = (J1) obj;
        if (this.f3182a.containsKey("sourceKey") != j12.f3182a.containsKey("sourceKey")) {
            return false;
        }
        return a() == null ? j12.a() == null : a().equals(j12.a());
    }

    public final int hashCode() {
        return 31 + (a() != null ? a().hashCode() : 0);
    }

    public final String toString() {
        return "MayaKycRestartBottomSheetDialogFragmentArgs{sourceKey=" + a() + "}";
    }
}
