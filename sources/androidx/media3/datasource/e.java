package androidx.media3.datasource;

import android.text.TextUtils;
import androidx.media3.common.MimeTypes;
import k2.v0;

/* JADX INFO: loaded from: classes.dex */
public abstract /* synthetic */ class e {
    public static /* synthetic */ boolean a(String str) {
        if (str == null) {
            return false;
        }
        String strH = v0.H(str);
        return (TextUtils.isEmpty(strH) || (strH.contains("text") && !strH.contains(MimeTypes.TEXT_VTT)) || strH.contains("html") || strH.contains("xml")) ? false : true;
    }
}
