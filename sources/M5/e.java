package M5;

import We.s;
import android.content.Context;
import android.util.Log;
import androidx.constraintlayout.core.motion.utils.TypedValues;
import c7.C1079c;
import com.google.android.gms.measurement.api.AppMeasurementSdk;
import com.paymaya.common.utility.C;
import com.paymaya.domain.model.PaymentConfirmationSummary;
import com.paymaya.domain.model.ProductProviderField;
import com.paymaya.domain.model.ProductV3;
import defpackage.AbstractC1414e;
import e2.C1421c;
import java.io.IOException;
import java.io.InputStream;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import kotlin.jvm.internal.j;

/* JADX INFO: loaded from: classes3.dex */
public final class e implements f {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f3086a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public String f3087b;
    public String c;

    public /* synthetic */ e(int i) {
        this.f3086a = i;
    }

    public static LinkedHashMap a(List list, Map map) {
        ArrayList<ProductProviderField> arrayList;
        if (list != null) {
            arrayList = new ArrayList();
            for (Object obj : list) {
                if (!j.b(((ProductProviderField) obj).mIsHidden(), Boolean.TRUE)) {
                    arrayList.add(obj);
                }
            }
        } else {
            arrayList = null;
        }
        if (arrayList == null || arrayList.isEmpty() || map == null || map.isEmpty()) {
            return null;
        }
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        for (ProductProviderField productProviderField : arrayList) {
            Object obj2 = map.get(productProviderField.mCode());
            if (obj2 == null) {
                obj2 = "";
            }
            linkedHashMap.put(productProviderField.mName(), (String) obj2);
        }
        return linkedHashMap;
    }

    public static C1079c b(String str, String str2, String str3) {
        if (str == null || str.length() == 0 || str2 == null || str2.length() == 0) {
            return null;
        }
        return new C1079c(str, str2, str3, null, 24);
    }

    public static C1079c c(e eVar, String str, String str2) {
        eVar.getClass();
        if (str == null || str.length() == 0 || str2 == null || str2.length() == 0) {
            return null;
        }
        return new C1079c(str, str2, null, null, 24);
    }

    @Override // M5.f
    public String d() {
        switch (this.f3086a) {
            case 0:
                String strConcat = String.format("WHERE %1$s = \"%2$s\" ", Arrays.copyOf(new Object[]{"provider", this.f3087b}, 2));
                String str = this.c;
                if (str.length() > 0) {
                    strConcat = strConcat.concat(String.format("AND %1$s LIKE '%2$s' ", Arrays.copyOf(new Object[]{"shop_categories", s.j("%\"code\":\"", str, "\"%")}, 2)));
                }
                return String.format("SELECT * FROM %1$s %2$sORDER BY %3$s ASC, %4$s COLLATE NOCASE ASC, %5$s COLLATE NOCASE ASC, CASE WHEN %6$s = 0 THEN %7$s ELSE %8$s END", Arrays.copyOf(new Object[]{"product_v3", strConcat, "priority", "provider_display_name", AppMeasurementSdk.ConditionalUserProperty.NAME, "promo", "original_value", "discounted_value"}, 8));
            default:
                return String.format("SELECT * FROM %1$s WHERE ( %2$s = \"%3$s\" AND %4$s = \"%5$s\" )", "form_series_bir", "form_type", this.f3087b, "form_series", this.c);
        }
    }

    public C1079c e(ProductV3 product, String str, PaymentConfirmationSummary paymentSummary) {
        j.g(product, "product");
        j.g(paymentSummary, "paymentSummary");
        String targetNumber = paymentSummary.getTargetNumber();
        String strP = C.p(targetNumber);
        if (targetNumber != null && targetNumber.length() != 0 && (product.isProductCignal() || product.isProductBeepCard())) {
            return b(this.c, targetNumber, null);
        }
        if ((str == null || str.length() == 0) && targetNumber != null && targetNumber.length() != 0) {
            return b(this.f3087b, strP, null);
        }
        if (str == null || str.length() == 0 || targetNumber == null || targetNumber.length() == 0) {
            return null;
        }
        return b(this.f3087b, str, strP);
    }

    public e(String str, String str2, z2.d dVar) {
        this.f3086a = 5;
        this.f3087b = str;
        this.c = str2;
    }

    public e(String str, String str2) {
        this.f3086a = 0;
        this.f3087b = str;
        this.c = str2;
    }

    public e() {
        this.f3086a = 3;
        this.f3087b = "";
        this.c = "";
    }

    public e(C1421c c1421c) {
        this.f3086a = 4;
        int iD = h2.f.d((Context) c1421c.f16555b, "com.google.firebase.crashlytics.unity_version", TypedValues.Custom.S_STRING);
        Context context = (Context) c1421c.f16555b;
        if (iD != 0) {
            this.f3087b = "Unity";
            String string = context.getResources().getString(iD);
            this.c = string;
            String strH = AbstractC1414e.h("Unity Editor version is: ", string);
            if (Log.isLoggable("FirebaseCrashlytics", 2)) {
                Log.v("FirebaseCrashlytics", strH, null);
                return;
            }
            return;
        }
        if (context.getAssets() != null) {
            try {
                InputStream inputStreamOpen = context.getAssets().open("flutter_assets/NOTICES.Z");
                if (inputStreamOpen != null) {
                    inputStreamOpen.close();
                }
                this.f3087b = "Flutter";
                this.c = null;
                if (Log.isLoggable("FirebaseCrashlytics", 2)) {
                    Log.v("FirebaseCrashlytics", "Development platform is: Flutter", null);
                    return;
                }
                return;
            } catch (IOException unused) {
            }
        }
        this.f3087b = null;
        this.c = null;
    }
}
