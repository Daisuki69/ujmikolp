package com.paymaya.data.api.deserializer;

import M8.T2;
import androidx.core.app.NotificationCompat;
import androidx.media3.exoplayer.rtsp.SessionDescription;
import androidx.media3.extractor.text.ttml.TtmlNode;
import com.google.gson.internal.bind.f;
import com.google.gson.internal.k;
import com.google.gson.j;
import com.google.gson.m;
import com.google.gson.n;
import com.google.gson.o;
import com.google.gson.q;
import com.google.gson.s;
import com.paymaya.common.utility.A;
import com.paymaya.common.utility.C;
import com.paymaya.domain.model.FavoriteContentPreview;
import com.paymaya.domain.model.FavoriteDetails;
import com.paymaya.domain.model.FavoriteReminder;
import java.lang.reflect.Type;
import yk.a;

/* JADX INFO: loaded from: classes3.dex */
public class FavoriteDetailsDeserializer implements n, s {
    @Override // com.google.gson.s
    public final o a(Object obj) {
        FavoriteDetails favoriteDetails = (FavoriteDetails) obj;
        q qVar = new q();
        try {
            if (!C.e(favoriteDetails.mId())) {
                qVar.l(TtmlNode.ATTR_ID, favoriteDetails.mId());
            }
            if (!C.e(favoriteDetails.mAlias())) {
                qVar.l("alias", favoriteDetails.mAlias());
            }
            if (!C.e(favoriteDetails.mType())) {
                qVar.l(SessionDescription.ATTR_TYPE, favoriteDetails.mType());
            }
            if (!C.e(favoriteDetails.mTemplateJson())) {
                qVar.k("template", T2.x(favoriteDetails.mTemplateJson()).g());
            }
            if (!C.e(favoriteDetails.mContentPreview())) {
                j jVar = A.f10366a;
                FavoriteContentPreview favoriteContentPreviewMContentPreview = favoriteDetails.mContentPreview();
                jVar.getClass();
                f fVar = new f();
                jVar.n(favoriteContentPreviewMContentPreview, FavoriteContentPreview.class, fVar);
                qVar.k("content_preview", fVar.H().g());
            }
            if (!C.e(favoriteDetails.mFavoriteReminder())) {
                j jVar2 = A.f10366a;
                FavoriteReminder favoriteReminderMFavoriteReminder = favoriteDetails.mFavoriteReminder();
                jVar2.getClass();
                f fVar2 = new f();
                jVar2.n(favoriteReminderMFavoriteReminder, FavoriteReminder.class, fVar2);
                qVar.k(NotificationCompat.CATEGORY_REMINDER, fVar2.H().g());
                return qVar;
            }
        } catch (Exception unused) {
            a.b();
        }
        return qVar;
    }

    @Override // com.google.gson.n
    public final Object deserialize(o oVar, Type type, m mVar) {
        FavoriteDetails.Builder builderSBuilder = FavoriteDetails.sBuilder();
        try {
            q qVarG = oVar.g();
            k kVar = qVarG.f10034a;
            if (kVar.containsKey(TtmlNode.ATTR_ID)) {
                builderSBuilder.mId(qVarG.m(TtmlNode.ATTR_ID).j());
            }
            if (kVar.containsKey("alias")) {
                builderSBuilder.mAlias(qVarG.m("alias").j());
            }
            if (kVar.containsKey(SessionDescription.ATTR_TYPE)) {
                builderSBuilder.mType(qVarG.m(SessionDescription.ATTR_TYPE).j());
            }
            if (kVar.containsKey("template")) {
                builderSBuilder.mTemplateJson(qVarG.m("template").toString());
            }
            if (kVar.containsKey("content_preview")) {
                builderSBuilder.mContentPreview((FavoriteContentPreview) A.f10366a.b(qVarG.m("content_preview"), FavoriteContentPreview.class));
            }
        } catch (Exception unused) {
            a.b();
        }
        return builderSBuilder.build();
    }
}
