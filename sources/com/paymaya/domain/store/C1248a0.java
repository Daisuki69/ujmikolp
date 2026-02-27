package com.paymaya.domain.store;

import com.clevertap.android.sdk.inbox.CTInboxMessage;
import com.clevertap.android.sdk.inbox.CTInboxMessageContent;
import com.google.android.gms.common.internal.ImagesContract;
import com.paymaya.domain.model.InboxMessage;
import java.util.ArrayList;
import org.joda.time.DateTime;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: renamed from: com.paymaya.domain.store.a0, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes4.dex */
public final class C1248a0 implements Ch.f {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final C1248a0 f11423a = new C1248a0();

    @Override // Ch.f
    public final Object apply(Object obj) throws JSONException {
        CTInboxMessage ctInboxMessage = (CTInboxMessage) obj;
        kotlin.jvm.internal.j.g(ctInboxMessage, "ctInboxMessage");
        InboxMessage.Builder builderMId = InboxMessage.sBuilder().mId(ctInboxMessage.f9561l);
        ArrayList arrayList = ctInboxMessage.j;
        InboxMessage.Builder builderIsRead = builderMId.mMessage(((CTInboxMessageContent) arrayList.get(0)).j).isRead(ctInboxMessage.f9560k);
        long j = ctInboxMessage.f9559g * ((long) 1000);
        builderIsRead.mDate(new DateTime(j));
        ArrayList arrayList2 = ctInboxMessage.f9562n;
        kotlin.jvm.internal.j.f(arrayList2, "getTags(...)");
        if (!arrayList2.isEmpty()) {
            builderIsRead.mTag((String) arrayList2.get(0));
        }
        builderIsRead.mDate(new DateTime(j));
        if (!arrayList.isEmpty()) {
            CTInboxMessageContent cTInboxMessageContent = (CTInboxMessageContent) arrayList.get(0);
            JSONArray jSONArray = cTInboxMessageContent.f9569g;
            if (jSONArray != null && jSONArray.length() != 0) {
                JSONObject jSONObject = jSONArray.getJSONObject(0);
                builderIsRead.mActionLink(jSONObject.getJSONObject(ImagesContract.URL).getJSONObject("android").getString("text"));
                builderIsRead.mActionText(jSONObject.getString("text"));
            }
            builderIsRead.mTitle(cTInboxMessageContent.m);
            builderIsRead.mMediaLink(cTInboxMessageContent.h);
        }
        return builderIsRead.build();
    }
}
