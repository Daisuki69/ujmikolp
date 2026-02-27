package com.paymaya.data.api.deserializer;

import androidx.media3.exoplayer.rtsp.SessionDescription;
import androidx.media3.extractor.text.ttml.TtmlNode;
import com.appsflyer.AppsFlyerProperties;
import com.google.android.gms.measurement.api.AppMeasurementSdk;
import com.google.gson.JsonParseException;
import com.google.gson.internal.k;
import com.google.gson.j;
import com.google.gson.m;
import com.google.gson.n;
import com.google.gson.o;
import com.google.gson.q;
import com.paymaya.common.utility.A;
import com.paymaya.domain.model.Amount;
import com.paymaya.domain.model.ImageUrl;
import com.paymaya.domain.model.LoadUpPartner;
import com.paymaya.domain.model.MaintenanceDate;
import java.lang.reflect.Type;
import yk.a;

/* JADX INFO: loaded from: classes3.dex */
public class LoadUpPartnerDeserializer implements n {
    @Override // com.google.gson.n
    public final Object deserialize(o oVar, Type type, m mVar) {
        try {
            q qVarG = oVar.g();
            k kVar = qVarG.f10034a;
            q qVarN = qVarG.n("icon_url").n("android");
            ImageUrl imageUrlBuild = ImageUrl.sBuilder().mHdpi(qVarN.m("hdpi").j()).mMdpi(qVarN.m("mdpi").j()).mXhdpi(qVarN.m("xhdpi").j()).build();
            String strJ = kVar.containsKey("subtitle") ? qVarG.m("subtitle").j() : null;
            String strJ2 = kVar.containsKey("steps") ? qVarG.m("steps").j() : null;
            String strJ3 = kVar.containsKey("note") ? qVarG.m("note").j() : null;
            String strJ4 = kVar.containsKey(AppsFlyerProperties.CHANNEL) ? qVarG.m(AppsFlyerProperties.CHANNEL).j() : null;
            boolean zC = kVar.containsKey("no_fee_display") ? qVarG.m("no_fee_display").c() : false;
            LoadUpPartner.Builder builderMNote = LoadUpPartner.sBuilder().mId(qVarG.m(TtmlNode.ATTR_ID).j()).mName(qVarG.m(AppMeasurementSdk.ConditionalUserProperty.NAME).j()).mSubtitle(strJ).mType(qVarG.m(SessionDescription.ATTR_TYPE).j()).mNote(strJ3);
            o oVarM = qVarG.m("limit_min");
            j jVar = A.f10366a;
            return builderMNote.mLimitMin((Amount) jVar.b(oVarM, Amount.class)).mLimitMax((Amount) jVar.b(qVarG.m("limit_max"), Amount.class)).mMaintenance((MaintenanceDate) jVar.b(qVarG.m("maintenance"), MaintenanceDate.class)).mIconUrl(imageUrlBuild).mSteps(strJ2).mChannel(strJ4).mSlug(qVarG.m("slug").j()).mNoFeeDisplay(zC).build();
        } catch (JsonParseException unused) {
            a.e();
            return null;
        }
    }
}
