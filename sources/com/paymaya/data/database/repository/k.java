package com.paymaya.data.database.repository;

import android.database.Cursor;
import android.provider.ContactsContract;
import com.paymaya.domain.model.Contact;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import o1.AbstractC1955a;

/* JADX INFO: loaded from: classes3.dex */
public final class k {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public K5.b f11313a;

    public final List a(M5.c cVar) {
        Cursor cursorQuery;
        K5.b bVar = this.f11313a;
        String strD = cVar.d();
        if (AbstractC1955a.u(bVar.f2645a, "android.permission.READ_CONTACTS")) {
            cursorQuery = bVar.f2646b.f2644a.getContentResolver().query(ContactsContract.CommonDataKinds.Phone.CONTENT_URI, K5.a.f2643b, strD, new String[0], "display_name COLLATE LOCALIZED ASC");
        } else {
            cursorQuery = null;
        }
        if (cursorQuery == null || !cursorQuery.moveToFirst()) {
            return Collections.EMPTY_LIST;
        }
        ArrayList arrayList = new ArrayList(cursorQuery.getCount());
        do {
            String string = cursorQuery.getString(cursorQuery.getColumnIndex("display_name"));
            String string2 = cursorQuery.getString(cursorQuery.getColumnIndex("data1"));
            String string3 = cursorQuery.getString(cursorQuery.getColumnIndex("photo_uri"));
            if (!com.paymaya.common.utility.C.a0(string2)) {
                string2 = com.paymaya.common.utility.C.r(string2);
            }
            if (!com.paymaya.common.utility.C.e(string2)) {
                arrayList.add(Contact.sBuilder().mName(string).mNumber(string2).mPhotoUri(string3).build());
            }
        } while (cursorQuery.moveToNext());
        cursorQuery.close();
        return Collections.unmodifiableList(arrayList);
    }

    public final List b() {
        K5.b bVar = this.f11313a;
        Cursor cursorQuery = null;
        if (AbstractC1955a.u(bVar.f2645a, "android.permission.READ_CONTACTS")) {
            K5.a aVar = bVar.f2646b;
            cursorQuery = aVar.f2644a.getContentResolver().query(ContactsContract.CommonDataKinds.Phone.CONTENT_URI, K5.a.f2643b, null, null, "display_name COLLATE LOCALIZED ASC");
        }
        if (cursorQuery == null || !cursorQuery.moveToFirst()) {
            return Collections.EMPTY_LIST;
        }
        ArrayList arrayList = new ArrayList(cursorQuery.getCount());
        do {
            String string = cursorQuery.getString(cursorQuery.getColumnIndex("display_name"));
            String string2 = cursorQuery.getString(cursorQuery.getColumnIndex("data1"));
            String string3 = cursorQuery.getString(cursorQuery.getColumnIndex("photo_uri"));
            String string4 = cursorQuery.getString(cursorQuery.getColumnIndex("contact_id"));
            if (!com.paymaya.common.utility.C.e(string2)) {
                arrayList.add(Contact.sBuilder().mName(string).mNumber(string2).mPhotoUri(string3).mContactId(string4).build());
            }
        } while (cursorQuery.moveToNext());
        cursorQuery.close();
        return Collections.unmodifiableList(arrayList);
    }
}
