package androidx.privacysandbox.ads.adservices.adselection;

import android.annotation.SuppressLint;
import android.content.Context;
import androidx.annotation.RequiresExtension;
import androidx.annotation.RestrictTo;
import androidx.media3.common.PlaybackException;
import androidx.media3.datasource.g;
import kotlin.jvm.internal.j;

/* JADX INFO: loaded from: classes2.dex */
@RequiresExtension(extension = PlaybackException.CUSTOM_ERROR_CODE_BASE, version = 4)
@SuppressLint({"NewApi", "ClassVerificationFailure"})
@RestrictTo({RestrictTo.Scope.LIBRARY})
public final class AdSelectionManagerApi33Ext4Impl extends AdSelectionManagerImplCommon {
    /* JADX WARN: Illegal instructions before constructor call */
    public AdSelectionManagerApi33Ext4Impl(Context context) {
        j.g(context, "context");
        Object systemService = context.getSystemService((Class<Object>) g.B());
        j.f(systemService, "context.getSystemService…ctionManager::class.java)");
        super(g.n(systemService));
    }
}
