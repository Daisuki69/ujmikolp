package io.flutter.plugins.sharedpreferences;

import cj.C1132s;
import java.util.List;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.j;

/* JADX INFO: loaded from: classes4.dex */
public final class SharedPreferencesPigeonOptions {
    public static final Companion Companion = new Companion(null);
    private final String fileName;
    private final boolean useDataStore;

    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final SharedPreferencesPigeonOptions fromList(List<? extends Object> pigeonVar_list) {
            j.g(pigeonVar_list, "pigeonVar_list");
            String str = (String) pigeonVar_list.get(0);
            Object obj = pigeonVar_list.get(1);
            j.e(obj, "null cannot be cast to non-null type kotlin.Boolean");
            return new SharedPreferencesPigeonOptions(str, ((Boolean) obj).booleanValue());
        }

        private Companion() {
        }
    }

    public SharedPreferencesPigeonOptions(String str, boolean z4) {
        this.fileName = str;
        this.useDataStore = z4;
    }

    public static /* synthetic */ SharedPreferencesPigeonOptions copy$default(SharedPreferencesPigeonOptions sharedPreferencesPigeonOptions, String str, boolean z4, int i, Object obj) {
        if ((i & 1) != 0) {
            str = sharedPreferencesPigeonOptions.fileName;
        }
        if ((i & 2) != 0) {
            z4 = sharedPreferencesPigeonOptions.useDataStore;
        }
        return sharedPreferencesPigeonOptions.copy(str, z4);
    }

    public final String component1() {
        return this.fileName;
    }

    public final boolean component2() {
        return this.useDataStore;
    }

    public final SharedPreferencesPigeonOptions copy(String str, boolean z4) {
        return new SharedPreferencesPigeonOptions(str, z4);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof SharedPreferencesPigeonOptions)) {
            return false;
        }
        SharedPreferencesPigeonOptions sharedPreferencesPigeonOptions = (SharedPreferencesPigeonOptions) obj;
        return j.b(this.fileName, sharedPreferencesPigeonOptions.fileName) && this.useDataStore == sharedPreferencesPigeonOptions.useDataStore;
    }

    public final String getFileName() {
        return this.fileName;
    }

    public final boolean getUseDataStore() {
        return this.useDataStore;
    }

    public int hashCode() {
        String str = this.fileName;
        return ((str == null ? 0 : str.hashCode()) * 31) + (this.useDataStore ? 1231 : 1237);
    }

    public final List<Object> toList() {
        return C1132s.g(this.fileName, Boolean.valueOf(this.useDataStore));
    }

    public String toString() {
        return "SharedPreferencesPigeonOptions(fileName=" + this.fileName + ", useDataStore=" + this.useDataStore + ")";
    }

    public /* synthetic */ SharedPreferencesPigeonOptions(String str, boolean z4, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? null : str, z4);
    }
}
