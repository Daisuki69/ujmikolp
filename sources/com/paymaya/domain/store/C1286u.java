package com.paymaya.domain.store;

import android.database.Cursor;
import android.provider.ContactsContract;
import com.paymaya.domain.model.Contact;
import com.paymaya.domain.model.ContactName;
import java.util.ArrayList;
import java.util.List;
import o1.AbstractC1955a;

/* JADX INFO: renamed from: com.paymaya.domain.store.u, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes4.dex */
public final class C1286u extends y5.f {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public com.paymaya.data.database.repository.k f11483b;

    public final Contact a(String str) {
        ArrayList arrayList = new ArrayList();
        arrayList.add(str);
        String strR = com.paymaya.common.utility.C.r(str);
        if (!strR.isEmpty()) {
            String strS = com.paymaya.common.utility.C.s(str);
            String strReplace = strS.replace("+63 ", "0");
            String strReplace2 = strR.replace("+63", "0");
            String strSubstring = strS.substring(1);
            String strSubstring2 = strR.substring(1);
            arrayList.add(strR);
            arrayList.add(strReplace2);
            arrayList.add(strS);
            arrayList.add(strReplace);
            arrayList.add(strSubstring);
            arrayList.add(strSubstring2);
        }
        List listA = this.f11483b.a(new M5.c(arrayList));
        if (listA.isEmpty()) {
            return null;
        }
        return (Contact) listA.get(0);
    }

    public final ContactName b(String str) {
        Cursor cursorQuery;
        K5.b bVar = this.f11483b.f11313a;
        if (AbstractC1955a.u(bVar.f2645a, "android.permission.READ_CONTACTS")) {
            cursorQuery = bVar.f2646b.f2644a.getContentResolver().query(ContactsContract.Data.CONTENT_URI, new String[]{"data2", "data5", "data3", "mimetype"}, "contact_id = ? AND mimetype = ?", new String[]{str, "vnd.android.cursor.item/name"}, null);
        } else {
            cursorQuery = null;
        }
        if (cursorQuery == null || !cursorQuery.moveToFirst()) {
            return null;
        }
        ContactName contactName = new ContactName(cursorQuery.getString(cursorQuery.getColumnIndex("data2")), cursorQuery.getString(cursorQuery.getColumnIndex("data5")), cursorQuery.getString(cursorQuery.getColumnIndex("data3")), null);
        cursorQuery.close();
        return contactName;
    }
}
