package K5;

import android.content.Context;
import android.database.Cursor;
import android.provider.ContactsContract;
import o1.AbstractC1955a;

/* JADX INFO: loaded from: classes3.dex */
public final class b {
    public static b c;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Context f2645a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final a f2646b;

    public b(Context context) {
        a aVar;
        this.f2645a = context;
        synchronized (a.class) {
            try {
                if (a.c == null) {
                    a aVar2 = new a();
                    aVar2.f2644a = context;
                    a.c = aVar2;
                }
                aVar = a.c;
            } catch (Throwable th2) {
                throw th2;
            }
        }
        this.f2646b = aVar;
    }

    public final Cursor a(String str) {
        if (!AbstractC1955a.u(this.f2645a, "android.permission.READ_CONTACTS")) {
            return null;
        }
        a aVar = this.f2646b;
        aVar.getClass();
        String str2 = "%" + str + "%";
        return aVar.f2644a.getContentResolver().query(ContactsContract.CommonDataKinds.Phone.CONTENT_URI, a.f2643b, "has_phone_number = 1 AND (display_name LIKE ? OR data1 LIKE ?)", new String[]{str2, str2}, "display_name COLLATE LOCALIZED ASC");
    }

    public final Cursor b(String str, String str2) {
        if (!AbstractC1955a.u(this.f2645a, "android.permission.READ_CONTACTS")) {
            return null;
        }
        a aVar = this.f2646b;
        aVar.getClass();
        String str3 = "%" + str + "%";
        return aVar.f2644a.getContentResolver().query(ContactsContract.CommonDataKinds.Phone.CONTENT_URI, a.f2643b, "has_phone_number = 1 AND (display_name LIKE ? OR data1 LIKE ? OR data1 = ?)", new String[]{str3, str3, str2}, ("(CASE data1 WHEN \"" + str2 + "\" THEN 0 ELSE 1 END), ").concat("display_name COLLATE LOCALIZED ASC"));
    }
}
