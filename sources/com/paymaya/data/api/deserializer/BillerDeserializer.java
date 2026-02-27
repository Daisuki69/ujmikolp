package com.paymaya.data.api.deserializer;

import androidx.media3.extractor.text.ttml.TtmlNode;
import com.google.android.gms.measurement.api.AppMeasurementSdk;
import com.google.gson.internal.k;
import com.google.gson.l;
import com.google.gson.m;
import com.google.gson.n;
import com.google.gson.o;
import com.google.gson.q;
import com.google.gson.r;
import com.google.gson.reflect.TypeToken;
import com.paymaya.common.utility.A;
import com.paymaya.domain.model.Biller;
import com.paymaya.domain.model.BillerDynamicField;
import com.paymaya.domain.model.BillerMetadata;
import com.paymaya.domain.model.ImageUrl;
import com.paymaya.domain.model.UIComponent;
import java.lang.reflect.Type;
import java.util.List;

/* JADX INFO: loaded from: classes3.dex */
public class BillerDeserializer implements n {

    /* JADX INFO: renamed from: com.paymaya.data.api.deserializer.BillerDeserializer$1, reason: invalid class name */
    class AnonymousClass1 extends TypeToken<List<UIComponent>> {
    }

    /* JADX INFO: renamed from: com.paymaya.data.api.deserializer.BillerDeserializer$2, reason: invalid class name */
    class AnonymousClass2 extends TypeToken<List<BillerDynamicField>> {
    }

    @Override // com.google.gson.n
    public final Object deserialize(o oVar, Type type, m mVar) {
        Biller.Builder builderMSlug = Biller.sBuilder().mSlug("");
        q qVarG = oVar.g();
        k kVar = qVarG.f10034a;
        if (kVar.containsKey(AppMeasurementSdk.ConditionalUserProperty.NAME)) {
            o oVarM = qVarG.m(AppMeasurementSdk.ConditionalUserProperty.NAME);
            oVarM.getClass();
            if (oVarM instanceof r) {
                builderMSlug.mName(qVarG.m(AppMeasurementSdk.ConditionalUserProperty.NAME).j());
            }
        }
        if (kVar.containsKey("slug")) {
            o oVarM2 = qVarG.m("slug");
            oVarM2.getClass();
            if (oVarM2 instanceof r) {
                builderMSlug.mSlug(qVarG.m("slug").j());
            }
        }
        if (kVar.containsKey("hasOtherCharges")) {
            o oVarM3 = qVarG.m("hasOtherCharges");
            oVarM3.getClass();
            if (oVarM3 instanceof r) {
                builderMSlug.mHasOtherCharges(Boolean.valueOf(qVarG.m("hasOtherCharges").c()));
            }
        }
        if (kVar.containsKey("otherFields")) {
            o oVarM4 = qVarG.m("otherFields");
            oVarM4.getClass();
            if (oVarM4 instanceof l) {
                builderMSlug.mOtherFields((List) A.f10366a.f(qVarG.m("otherFields").toString(), new AnonymousClass1().getType()));
            }
        }
        if (kVar.containsKey("category")) {
            o oVarM5 = qVarG.m("category");
            oVarM5.getClass();
            if (oVarM5 instanceof r) {
                builderMSlug.mCategory(qVarG.m("category").j());
            }
        }
        if (kVar.containsKey("categorySlug")) {
            o oVarM6 = qVarG.m("categorySlug");
            oVarM6.getClass();
            if (oVarM6 instanceof l) {
                l lVarF = qVarG.m("categorySlug").f();
                if (lVarF.f10032a.size() > 0) {
                    o oVarK = lVarF.k(0);
                    oVarK.getClass();
                    if (oVarK instanceof r) {
                        builderMSlug.mCategorySlug(lVarF.k(0).j());
                    }
                }
            } else {
                o oVarM7 = qVarG.m("categorySlug");
                oVarM7.getClass();
                if (oVarM7 instanceof r) {
                    builderMSlug.mCategorySlug(qVarG.m("categorySlug").j());
                }
            }
        }
        if (kVar.containsKey("listUrl")) {
            o oVarM8 = qVarG.m("listUrl");
            oVarM8.getClass();
            if (oVarM8 instanceof q) {
                builderMSlug.mListUrl((ImageUrl) A.f10366a.b(qVarG.m("listUrl"), ImageUrl.class));
            } else {
                o oVarM9 = qVarG.m("listUrl");
                oVarM9.getClass();
                if (oVarM9 instanceof r) {
                    String strJ = qVarG.m("listUrl").j();
                    builderMSlug.mListUrl(ImageUrl.sBuilder().mHdpi(strJ).mMdpi(strJ).mXhdpi(strJ).build());
                }
            }
        }
        if (kVar.containsKey("iconUrl")) {
            o oVarM10 = qVarG.m("iconUrl");
            oVarM10.getClass();
            if (oVarM10 instanceof q) {
                builderMSlug.mIconUrl((ImageUrl) A.f10366a.b(qVarG.m("iconUrl"), ImageUrl.class));
            } else {
                o oVarM11 = qVarG.m("iconUrl");
                oVarM11.getClass();
                if (oVarM11 instanceof r) {
                    String strJ2 = qVarG.m("iconUrl").j();
                    builderMSlug.mIconUrl(ImageUrl.sBuilder().mHdpi(strJ2).mMdpi(strJ2).mXhdpi(strJ2).build());
                }
            }
        }
        if (kVar.containsKey("confirmationUrl")) {
            o oVarM12 = qVarG.m("confirmationUrl");
            oVarM12.getClass();
            if (oVarM12 instanceof q) {
                builderMSlug.mConfirmationUrl((ImageUrl) A.f10366a.b(qVarG.m("confirmationUrl"), ImageUrl.class));
            } else {
                o oVarM13 = qVarG.m("confirmationUrl");
                oVarM13.getClass();
                if (oVarM13 instanceof r) {
                    String strJ3 = qVarG.m("confirmationUrl").j();
                    builderMSlug.mConfirmationUrl(ImageUrl.sBuilder().mHdpi(strJ3).mMdpi(strJ3).mXhdpi(strJ3).build());
                }
            }
        }
        if (kVar.containsKey("account_number")) {
            o oVarM14 = qVarG.m("account_number");
            oVarM14.getClass();
            if (oVarM14 instanceof r) {
                builderMSlug.mAccountNumber(qVarG.m("account_number").j());
            }
        }
        if (kVar.containsKey("other_fields")) {
            o oVarM15 = qVarG.m("other_fields");
            oVarM15.getClass();
            if (oVarM15 instanceof l) {
                builderMSlug.mDynamicFields((List) A.f10366a.f(qVarG.m("other_fields").toString(), new AnonymousClass2().getType()));
            }
        }
        if (kVar.containsKey(TtmlNode.TAG_METADATA)) {
            builderMSlug.mMetadata((BillerMetadata) A.f10366a.b(qVarG.m(TtmlNode.TAG_METADATA), BillerMetadata.class));
        }
        return builderMSlug.build();
    }
}
