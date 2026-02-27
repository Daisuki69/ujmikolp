package com.appsflyer.internal;

import android.content.ContentResolver;
import android.content.Context;
import android.content.pm.PackageItemInfo;
import android.database.Cursor;
import android.net.Uri;
import com.appsflyer.AFLogger;
import java.util.HashMap;
import java.util.Map;

/* JADX INFO: loaded from: classes2.dex */
public final class AFf1uSDK extends AFf1sSDK {
    private final AFc1zSDK values;

    public AFf1uSDK(Runnable runnable, AFc1zSDK aFc1zSDK) {
        super("store", "huawei", runnable);
        this.values = aFc1zSDK;
    }

    @Override // com.appsflyer.internal.AFf1oSDK
    public final void valueOf(Context context) {
        AFInAppEventParameterName(context, new AFb1kSDK<Map<String, Object>>(context, this.values, "com.huawei.appmarket.commondata", "FFE391E0EA186D0734ED601E4E70E3224B7309D48E2075BAC46D8C667EAE7212", "3BAF59A2E5331C30675FAB35FF5FFF0D116142D3D4664F1C3CB804068B40614F") { // from class: com.appsflyer.internal.AFf1uSDK.4
            /* JADX INFO: Access modifiers changed from: private */
            @Override // com.appsflyer.internal.AFb1kSDK
            /* JADX INFO: renamed from: AFInAppEventParameterName, reason: merged with bridge method [inline-methods] */
            public Map<String, Object> valueOf() {
                String str = ((PackageItemInfo) this.AFKeystoreWrapper.getPackageManager().resolveContentProvider(this.valueOf, 128)).packageName;
                AFf1uSDK.this.valueOf.put("api_ver", Long.valueOf(AFa1cSDK.AFKeystoreWrapper(this.AFKeystoreWrapper, str)));
                AFf1uSDK.this.valueOf.put("api_ver_name", AFa1cSDK.AFInAppEventType(this.AFKeystoreWrapper, str));
                Cursor cursorQuery = null;
                try {
                    try {
                        ContentResolver contentResolver = this.AFKeystoreWrapper.getContentResolver();
                        StringBuilder sb2 = new StringBuilder("content://");
                        sb2.append(this.valueOf);
                        sb2.append("/item/5");
                        cursorQuery = contentResolver.query(Uri.parse(sb2.toString()), null, null, new String[]{this.AFKeystoreWrapper.getPackageName()}, null);
                        if (cursorQuery == null) {
                            AFf1uSDK.this.valueOf.put("response", "SERVICE_UNAVAILABLE");
                        } else if (cursorQuery.moveToFirst()) {
                            AFf1uSDK.this.valueOf.put("response", "OK");
                            AFf1uSDK.this.valueOf.put("referrer", cursorQuery.getString(0));
                            AFf1uSDK.this.valueOf.put("click_ts", Long.valueOf(cursorQuery.getLong(1)));
                            AFf1uSDK.this.valueOf.put("install_end_ts", Long.valueOf(cursorQuery.getLong(2)));
                            if (cursorQuery.getColumnCount() > 3) {
                                AFf1uSDK.this.valueOf.put("install_begin_ts", Long.valueOf(cursorQuery.getLong(3)));
                                HashMap map = new HashMap();
                                String string = cursorQuery.getString(4);
                                if (string != null) {
                                    map.put("track_id", string);
                                }
                                map.put("referrer_ex", cursorQuery.getString(5));
                                AFf1uSDK.this.valueOf.put("huawei_custom", map);
                            }
                        } else {
                            AFf1uSDK.this.valueOf.put("response", "FEATURE_NOT_SUPPORTED");
                        }
                    } catch (Exception e) {
                        AFf1uSDK.this.valueOf.put("response", "FEATURE_NOT_SUPPORTED");
                        AFLogger.afErrorLog(e.getMessage(), e);
                        if (0 != 0) {
                        }
                    }
                    if (cursorQuery != null) {
                        cursorQuery.close();
                    }
                    AFf1uSDK.this.values();
                    return AFf1uSDK.this.valueOf;
                } catch (Throwable th2) {
                    if (0 != 0) {
                        cursorQuery.close();
                    }
                    throw th2;
                }
            }
        });
    }
}
