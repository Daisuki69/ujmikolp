package bg;

import android.content.Context;
import kotlin.jvm.functions.Function0;

/* JADX INFO: renamed from: bg.J0, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes4.dex */
public abstract class AbstractC0971J0 {
    public static void c(C1005j c1005j, O4.k kVar, Function0 function0) {
        try {
            if (((Boolean) function0.invoke()).booleanValue()) {
                c1005j.invoke();
            }
        } catch (Exception e) {
            kVar.invoke(e);
        }
    }

    public float a() {
        return 1.0f;
    }

    public abstract void b(Context context, C1005j c1005j, O4.k kVar, StringBuilder sb2);
}
