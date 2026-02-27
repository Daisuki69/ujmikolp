package M8;

import android.os.Bundle;
import androidx.annotation.NonNull;
import androidx.navigation.NavArgs;
import java.util.HashMap;

/* JADX INFO: loaded from: classes4.dex */
public final class F implements NavArgs {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final HashMap f3159a = new HashMap();

    @NonNull
    public static F fromBundle(@NonNull Bundle bundle) {
        F f = new F();
        bundle.setClassLoader(F.class.getClassLoader());
        boolean zContainsKey = bundle.containsKey("destinationScreenName");
        HashMap map = f.f3159a;
        if (!zContainsKey) {
            map.put("destinationScreenName", "");
            return f;
        }
        String string = bundle.getString("destinationScreenName");
        if (string == null) {
            throw new IllegalArgumentException("Argument \"destinationScreenName\" is marked as non-null but was passed a null value.");
        }
        map.put("destinationScreenName", string);
        return f;
    }

    public final String a() {
        return (String) this.f3159a.get("destinationScreenName");
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || F.class != obj.getClass()) {
            return false;
        }
        F f = (F) obj;
        if (this.f3159a.containsKey("destinationScreenName") != f.f3159a.containsKey("destinationScreenName")) {
            return false;
        }
        return a() == null ? f.a() == null : a().equals(f.a());
    }

    public final int hashCode() {
        return 31 + (a() != null ? a().hashCode() : 0);
    }

    public final String toString() {
        return "MayaKycChangeYourMindBottomSheetDialogFragmentArgs{destinationScreenName=" + a() + "}";
    }
}
