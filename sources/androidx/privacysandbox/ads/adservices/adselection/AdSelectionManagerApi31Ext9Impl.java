package androidx.privacysandbox.ads.adservices.adselection;

import android.annotation.SuppressLint;
import android.content.Context;
import androidx.annotation.RequiresExtension;
import androidx.annotation.RestrictTo;
import kotlin.jvm.internal.j;

/* JADX INFO: loaded from: classes2.dex */
@RequiresExtension(extension = 31, version = 9)
@SuppressLint({"NewApi", "ClassVerificationFailure"})
@RestrictTo({RestrictTo.Scope.LIBRARY})
public final class AdSelectionManagerApi31Ext9Impl extends AdSelectionManagerImplCommon {
    /* JADX WARN: Illegal instructions before constructor call */
    public AdSelectionManagerApi31Ext9Impl(Context context) {
        j.g(context, "context");
        android.adservices.adselection.AdSelectionManager adSelectionManager = android.adservices.adselection.AdSelectionManager.get(context);
        j.f(adSelectionManager, "get(context)");
        super(adSelectionManager);
    }
}
