package X1;

import androidx.annotation.NonNull;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: classes2.dex */
public final class a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final /* synthetic */ a[] f6465a = {new a("GRANTED", 0), new a("DENIED", 1)};

    /* JADX INFO: Fake field, exist only in values array */
    a EF6;

    @NonNull
    public static a valueOf(@NonNull String str) {
        return (a) Enum.valueOf(a.class, str);
    }

    @NonNull
    public static a[] values() {
        return (a[]) f6465a.clone();
    }
}
