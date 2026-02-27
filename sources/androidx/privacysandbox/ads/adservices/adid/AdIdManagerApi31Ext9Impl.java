package androidx.privacysandbox.ads.adservices.adid;

import android.annotation.SuppressLint;
import android.content.Context;
import androidx.annotation.RequiresExtension;
import androidx.annotation.RestrictTo;
import kotlin.jvm.internal.j;

/* JADX INFO: loaded from: classes2.dex */
@RequiresExtension(extension = 31, version = 9)
@SuppressLint({"NewApi", "ClassVerificationFailure"})
@RestrictTo({RestrictTo.Scope.LIBRARY})
public final class AdIdManagerApi31Ext9Impl extends AdIdManagerImplCommon {
    /* JADX WARN: Illegal instructions before constructor call */
    public AdIdManagerApi31Ext9Impl(Context context) {
        j.g(context, "context");
        android.adservices.adid.AdIdManager adIdManager = android.adservices.adid.AdIdManager.get(context);
        j.f(adIdManager, "get(context)");
        super(adIdManager);
    }
}
