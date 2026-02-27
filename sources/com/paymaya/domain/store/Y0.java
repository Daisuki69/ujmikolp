package com.paymaya.domain.store;

import com.paymaya.data.api.PayMayaClientApi;
import com.paymaya.domain.model.Contact;
import com.paymaya.domain.model.UserActivity;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

/* JADX INFO: loaded from: classes4.dex */
public final class Y0 extends y5.f {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public PayMayaClientApi f11408b;
    public com.paymaya.data.database.repository.G c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public com.paymaya.data.database.repository.k f11409d;

    public final void a(List list) {
        ArrayList arrayList = new ArrayList();
        J5.c cVarD = J5.c.d();
        int size = list.size();
        for (int i = 0; i < size; i++) {
            UserActivity userActivity = (UserActivity) list.get(i);
            String strMTarget = userActivity.mDescription().mTarget();
            if (!userActivity.mType().equals("System Alert")) {
                String strR = com.paymaya.common.utility.C.r(strMTarget);
                if (!com.paymaya.common.utility.C.e(strR)) {
                    String strS = com.paymaya.common.utility.C.s(strMTarget);
                    String strReplace = strS.replace("+63 ", "0");
                    String strReplace2 = strR.replace("+63", "0");
                    String strSubstring = strS.substring(1);
                    String strSubstring2 = strR.substring(1);
                    if (cVarD.c(strR) == null || arrayList.contains(strR)) {
                        yk.a.a();
                        arrayList.add(strR);
                        arrayList.add(strReplace2);
                        arrayList.add(strS);
                        arrayList.add(strReplace);
                        arrayList.add(strSubstring);
                        arrayList.add(strSubstring2);
                    }
                }
            }
        }
        if (arrayList.isEmpty()) {
            return;
        }
        List listA = this.f11409d.a(new M5.c(arrayList));
        for (int i4 = 0; i4 < listA.size(); i4++) {
            Contact contact = (Contact) listA.get(i4);
            ((HashMap) cVarD.f2418b).put(com.paymaya.common.utility.C.r(contact.mNumber()), contact);
            contact.mName();
            contact.mPhotoUri();
            yk.a.a();
        }
    }
}
