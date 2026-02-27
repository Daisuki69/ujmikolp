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
public final class AFf1nSDK extends AFf1sSDK {
    private final AFc1zSDK AFInAppEventType;

    public AFf1nSDK(Runnable runnable, AFc1zSDK aFc1zSDK) {
        super("store", "samsung", runnable);
        this.AFInAppEventType = aFc1zSDK;
    }

    @Override // com.appsflyer.internal.AFf1oSDK
    public final void valueOf(Context context) {
        AFInAppEventParameterName(context, new AFb1kSDK<Map<String, Object>>(context, this.AFInAppEventType, "com.sec.android.app.samsungapps.referrer", "FBA3AF4E7757D9016E953FB3EE4671CA2BD9AF725F9A53D52ED4A38EAAA08901") { // from class: com.appsflyer.internal.AFf1nSDK.2
            private static void AFInAppEventType(String str, Map<String, Object> map, Cursor cursor) {
                int columnIndex = cursor.getColumnIndex(str);
                if (columnIndex == -1) {
                    return;
                }
                long j = cursor.getLong(columnIndex);
                if (j == 0) {
                    return;
                }
                map.put(str, Long.valueOf(j));
            }

            /* JADX INFO: Access modifiers changed from: private */
            @Override // com.appsflyer.internal.AFb1kSDK
            /* JADX INFO: renamed from: values, reason: merged with bridge method [inline-methods] */
            public Map<String, Object> valueOf() {
                String string;
                Cursor cursorQuery = null;
                try {
                    try {
                        ContentResolver contentResolver = this.AFKeystoreWrapper.getContentResolver();
                        StringBuilder sb2 = new StringBuilder("content://");
                        sb2.append(this.valueOf);
                        cursorQuery = contentResolver.query(Uri.parse(sb2.toString()), null, null, null, null);
                        if (cursorQuery == null) {
                            AFf1nSDK.this.valueOf.put("response", "SERVICE_UNAVAILABLE");
                        } else if (cursorQuery.moveToFirst()) {
                            AFf1nSDK.this.valueOf.put("response", "OK");
                            valueOf("referrer", AFf1nSDK.this.valueOf, cursorQuery);
                            AFInAppEventType("click_ts", AFf1nSDK.this.valueOf, cursorQuery);
                            AFInAppEventType("install_begin_ts", AFf1nSDK.this.valueOf, cursorQuery);
                            AFInAppEventType("install_end_ts", AFf1nSDK.this.valueOf, cursorQuery);
                            valueOf("organic_keywords", AFf1nSDK.this.valueOf, cursorQuery);
                            valueOf("attr_type", AFf1nSDK.this.valueOf, cursorQuery);
                            HashMap map = new HashMap();
                            int columnIndex = cursorQuery.getColumnIndex("instant");
                            if (columnIndex != -1 && (string = cursorQuery.getString(columnIndex)) != null) {
                                map.put("instant", Boolean.valueOf(Boolean.parseBoolean(string)));
                            }
                            AFInAppEventType("click_server_ts", map, cursorQuery);
                            AFInAppEventType("install_begin_server_ts", map, cursorQuery);
                            valueOf("install_version", map, cursorQuery);
                            if (!map.isEmpty()) {
                                AFf1nSDK.this.valueOf.put("custom", map);
                            }
                        } else {
                            AFf1nSDK.this.valueOf.put("response", "FEATURE_NOT_SUPPORTED");
                        }
                    } catch (Exception e) {
                        AFf1nSDK.this.valueOf.put("response", "FEATURE_NOT_SUPPORTED");
                        AFLogger.afErrorLog(e.getMessage(), e);
                        if (0 != 0) {
                        }
                    }
                    if (cursorQuery != null) {
                        cursorQuery.close();
                    }
                    String str = ((PackageItemInfo) this.AFKeystoreWrapper.getPackageManager().resolveContentProvider(this.valueOf, 128)).packageName;
                    AFf1nSDK.this.valueOf.put("api_ver", Long.valueOf(AFa1cSDK.AFKeystoreWrapper(this.AFKeystoreWrapper, str)));
                    AFf1nSDK.this.valueOf.put("api_ver_name", AFa1cSDK.AFInAppEventType(this.AFKeystoreWrapper, str));
                    AFf1nSDK.this.values();
                    return AFf1nSDK.this.valueOf;
                } catch (Throwable th2) {
                    if (0 != 0) {
                        cursorQuery.close();
                    }
                    throw th2;
                }
            }

            private static void valueOf(String str, Map<String, Object> map, Cursor cursor) {
                String string;
                int columnIndex = cursor.getColumnIndex(str);
                if (columnIndex == -1 || (string = cursor.getString(columnIndex)) == null) {
                    return;
                }
                map.put(str, string);
            }
        });
    }
}
