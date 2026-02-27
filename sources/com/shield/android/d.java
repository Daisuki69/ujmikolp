package com.shield.android;

import android.app.Application;
import android.content.ContentResolver;
import android.database.ContentObserver;
import android.database.Cursor;
import android.net.Uri;
import android.os.Build;
import android.os.Handler;
import android.os.Looper;
import android.provider.MediaStore;
import com.paymaya.common.utility.AbstractC1213b;
import java.lang.ref.WeakReference;
import java.util.HashMap;

/* JADX INFO: loaded from: classes4.dex */
final class d {

    /* JADX INFO: renamed from: z, reason: collision with root package name */
    private static ContentObserver f15205z;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private static long[] f15204d = {242337823, 726563179, 307382719, 352415802, 198813486, 1754209559, 35855457, 1612754733};

    /* JADX INFO: renamed from: A, reason: collision with root package name */
    private static long f15203A = System.currentTimeMillis();

    public static String d(String str) {
        int i = ((int) f15204d[5]) ^ 1754204540;
        StringBuilder sb2 = new StringBuilder();
        int i4 = ((int) f15204d[2]) ^ 307382719;
        while (i4 < str.length()) {
            long[] jArr = f15204d;
            int i6 = (((i >> (((int) jArr[2]) ^ 307382719)) ^ (i >> (((int) jArr[1]) ^ 726563177))) ^ (i >> (((int) jArr[6]) ^ 35855458))) ^ (i >> 5);
            long j = jArr[0];
            i = (char) ((i >> (((int) j) ^ 242337822)) | (((char) (i6 & (((int) j) ^ 242337822))) << (((int) jArr[7]) ^ 1612754722)));
            char cCharAt = str.charAt(i4);
            int i10 = cCharAt + i;
            long j6 = f15204d[0];
            int i11 = (~cCharAt) | (~i);
            sb2.append((char) AbstractC1213b.H(i10, ((int) j6) ^ 242337822, i11, i10, (((int) j6) ^ 242337822) + i10 + i11));
            long j7 = f15204d[0];
            int i12 = ~i4;
            i4 = i4 + (((int) j7) ^ 242337822) + (((int) j7) ^ 242337822) + ((~(((int) j7) ^ 242337822)) | i12) + (((((int) j7) ^ 242337822) + i4) - ((((((int) j7) ^ 242337822) + i4) + (((int) j7) ^ 242337822)) + ((~(((int) j7) ^ 242337822)) | i12)));
        }
        return sb2.toString();
    }

    public final void a(Application application, e eVar) {
        if (com.shield.android.internal.i.b(application, d("詔앴\ue2e9\uf134\uf8cc簸빌强꿺힠殐떜媑ⴏ雍쬶\ue5c0犹㥅鳧츟\ue76c珒릔岠긪흭\uebd9疜㪩鴲仵꜃叽ꦃ咤ꨧ핻櫚딋")) && f15205z == null) {
            try {
                f15205z = a(application, application.getContentResolver(), eVar);
            } catch (Exception unused) {
            }
        }
    }

    public static void a(Application application) {
        if (f15205z != null) {
            try {
                application.getContentResolver().unregisterContentObserver(f15205z);
            } catch (Exception unused) {
            }
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    private ContentObserver a(final Application application, ContentResolver contentResolver, final e eVar) {
        ContentObserver contentObserver = new ContentObserver(new Handler(Looper.getMainLooper())) { // from class: com.shield.android.d.1

            /* JADX INFO: renamed from: d, reason: collision with root package name */
            private static long[] f15206d = {670943800, 309524338, 1792482397};

            @Override // android.database.ContentObserver
            public final void onChange(boolean z4, Uri uri) {
                super.onChange(z4, uri);
                if (uri != null) {
                    try {
                        d.a(d.this, application, uri, eVar);
                    } catch (Exception unused) {
                    }
                }
            }
        };
        try {
            contentResolver.registerContentObserver(MediaStore.Images.Media.EXTERNAL_CONTENT_URI, ((int) f15204d[0]) ^ 242337822, contentObserver);
        } catch (Exception unused) {
        }
        return contentObserver;
    }

    public static /* synthetic */ void a(d dVar, Application application, Uri uri, e eVar) {
        String string;
        String string2;
        try {
            long[] jArr = f15204d;
            String[] strArr = new String[((int) jArr[1]) ^ 726563177];
            strArr[((int) jArr[2]) ^ 307382719] = d("詪앾\ue2e4\uf135\uf8d3簽빉彭꿕\ud7ab殃떜媝");
            int i = Build.VERSION.SDK_INT;
            long[] jArr2 = f15204d;
            if (i >= (((int) jArr2[3]) ^ 352415783)) {
                strArr[((int) jArr2[0]) ^ 242337822] = d("詇앿\ue2e1\uf127\uf8d7簸빞影꿕ힵ殃떅媐");
            }
            Cursor cursorQuery = application.getContentResolver().query(uri, strArr, null, null, null);
            if (cursorQuery != null) {
                try {
                    if (cursorQuery.moveToFirst()) {
                        long[] jArr3 = f15204d;
                        int columnIndex = ((int) jArr3[2]) ^ 307382719;
                        if (i >= (((int) jArr3[3]) ^ 352415783)) {
                            columnIndex = cursorQuery.getColumnIndex(d("詇앿\ue2e1\uf127\uf8d7簸빞影꿕ힵ殃떅媐"));
                        }
                        int columnIndex2 = cursorQuery.getColumnIndex(d("詪앾\ue2e4\uf135\uf8d3簽빉彭꿕\ud7ab殃떜媝"));
                        do {
                            try {
                                string = cursorQuery.getString(columnIndex2);
                                string2 = cursorQuery.getString(columnIndex);
                            } catch (Exception unused) {
                            }
                            if (string.toLowerCase().contains(d("詆앹\ue2ff\uf123\uf8c6簿빛彼꿥ힱ")) || string2.toLowerCase().contains(d("詆앹\ue2ff\uf123\uf8c6簿빛彼꿥ힱ"))) {
                                HashMap<String, String> map = new HashMap<>();
                                map.put(d("詐앬\ue2e8\uf128\uf8d7簎빆彵꿧힠"), d("詆앹\ue2ff\uf123\uf8c6簿빛彼꿥ힱ"));
                                String strD = d("詆앹\ue2ff\uf123\uf8c6簿빛彼꿥ힱ");
                                try {
                                    WeakReference<String> weakReference = eVar.f15219ah;
                                    if (weakReference != null) {
                                        strD = weakReference.get();
                                    }
                                    if (System.currentTimeMillis() - f15203A > (f15204d[4] ^ 198812870)) {
                                        eVar.s().c(strD, map);
                                        f15203A = System.currentTimeMillis();
                                    }
                                } catch (Exception unused2) {
                                }
                            }
                        } while (cursorQuery.moveToNext());
                    }
                } finally {
                }
            }
            if (cursorQuery != null) {
                cursorQuery.close();
            }
        } catch (Exception unused3) {
        }
    }
}
