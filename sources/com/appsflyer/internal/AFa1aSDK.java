package com.appsflyer.internal;

import android.content.ContentResolver;
import android.content.Context;
import android.database.Cursor;
import android.net.Uri;
import androidx.annotation.Nullable;

/* JADX INFO: loaded from: classes2.dex */
final class AFa1aSDK extends AFb1kSDK<String> {
    public AFa1aSDK(Context context, AFc1zSDK aFc1zSDK) {
        super(context, aFc1zSDK, "com.facebook.katana.provider.AttributionIdProvider", "E3F9E1E0CF99D0E56A055BA65E241B3399F7CEA524326B0CDD6EC1327ED0FDC1");
    }

    /* JADX INFO: Access modifiers changed from: private */
    @Override // com.appsflyer.internal.AFb1kSDK
    /* JADX INFO: renamed from: AFInAppEventParameterName, reason: merged with bridge method [inline-methods] */
    public String valueOf() throws Throwable {
        Cursor cursor = null;
        try {
            ContentResolver contentResolver = this.AFKeystoreWrapper.getContentResolver();
            StringBuilder sb2 = new StringBuilder("content://");
            sb2.append(this.valueOf);
            Cursor cursorQuery = contentResolver.query(Uri.parse(sb2.toString()), new String[]{"aid"}, null, null, null);
            if (cursorQuery != null) {
                try {
                    if (cursorQuery.moveToFirst()) {
                        String string = cursorQuery.getString(cursorQuery.getColumnIndex("aid"));
                        cursorQuery.close();
                        return string;
                    }
                } catch (Throwable th2) {
                    th = th2;
                    cursor = cursorQuery;
                    if (cursor != null) {
                        cursor.close();
                    }
                    throw th;
                }
            }
            if (cursorQuery != null) {
                cursorQuery.close();
            }
            return null;
        } catch (Throwable th3) {
            th = th3;
        }
    }

    @Override // com.appsflyer.internal.AFb1kSDK
    @Nullable
    public final /* synthetic */ String AFKeystoreWrapper() {
        this.AFInAppEventParameterName.AFInAppEventParameterName().execute(this.values);
        return (String) super.AFKeystoreWrapper();
    }

    @Nullable
    public final String values() {
        this.AFInAppEventParameterName.AFInAppEventParameterName().execute(this.values);
        return (String) super.AFKeystoreWrapper();
    }
}
