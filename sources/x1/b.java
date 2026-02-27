package X1;

import androidx.annotation.NonNull;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: classes2.dex */
public final class b {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final /* synthetic */ b[] f6466a = {new b("AD_STORAGE", 0), new b("ANALYTICS_STORAGE", 1), new b("AD_USER_DATA", 2), new b("AD_PERSONALIZATION", 3)};

    /* JADX INFO: Fake field, exist only in values array */
    b EF8;

    @NonNull
    public static b valueOf(@NonNull String str) {
        return (b) Enum.valueOf(b.class, str);
    }

    @NonNull
    public static b[] values() {
        return (b[]) f6466a.clone();
    }
}
