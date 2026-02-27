package n1;

import android.os.Build;
import java.util.HashSet;

/* JADX INFO: renamed from: n1.h, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes2.dex */
public abstract class AbstractC1902h {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final HashSet f18571a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static String f18572b;

    static {
        String str = Build.VERSION.RELEASE;
        f18571a = new HashSet();
        f18572b = "goog.exo.core";
    }
}
