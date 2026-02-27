package M8;

import android.os.Bundle;
import androidx.annotation.NonNull;
import androidx.navigation.NavArgs;
import java.util.HashMap;

/* JADX INFO: renamed from: M8.n0, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes4.dex */
public final class C0385n0 implements NavArgs {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final HashMap f3340a = new HashMap();

    @NonNull
    public static C0385n0 fromBundle(@NonNull Bundle bundle) {
        C0385n0 c0385n0 = new C0385n0();
        bundle.setClassLoader(C0385n0.class.getClassLoader());
        if (!bundle.containsKey("sourceKey")) {
            throw new IllegalArgumentException("Required argument \"sourceKey\" is missing and does not have an android:defaultValue");
        }
        String string = bundle.getString("sourceKey");
        if (string == null) {
            throw new IllegalArgumentException("Argument \"sourceKey\" is marked as non-null but was passed a null value.");
        }
        c0385n0.f3340a.put("sourceKey", string);
        return c0385n0;
    }

    public final String a() {
        return (String) this.f3340a.get("sourceKey");
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || C0385n0.class != obj.getClass()) {
            return false;
        }
        C0385n0 c0385n0 = (C0385n0) obj;
        if (this.f3340a.containsKey("sourceKey") != c0385n0.f3340a.containsKey("sourceKey")) {
            return false;
        }
        return a() == null ? c0385n0.a() == null : a().equals(c0385n0.a());
    }

    public final int hashCode() {
        return 31 + (a() != null ? a().hashCode() : 0);
    }

    public final String toString() {
        return "MayaKycDnfbpWhyNeededBottomSheetDialogFragmentArgs{sourceKey=" + a() + "}";
    }
}
