package Oe;

import android.content.Context;
import android.content.pm.ShortcutInfo;
import com.paymaya.PayMayaApplication;

/* JADX INFO: loaded from: classes4.dex */
public abstract /* synthetic */ class a {
    public static /* synthetic */ ShortcutInfo.Builder d(Context context, String str) {
        return new ShortcutInfo.Builder(context, str);
    }

    public static /* synthetic */ ShortcutInfo.Builder j(PayMayaApplication payMayaApplication, String str) {
        return new ShortcutInfo.Builder(payMayaApplication, str);
    }

    public static /* bridge */ /* synthetic */ ShortcutInfo l(Object obj) {
        return (ShortcutInfo) obj;
    }

    public static /* synthetic */ void r() {
    }
}
