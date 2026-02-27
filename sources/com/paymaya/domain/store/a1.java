package com.paymaya.domain.store;

import android.content.SharedPreferences;
import com.paymaya.common.utility.AbstractC1234x;
import com.paymaya.domain.model.Validation;
import dOYHB6.yFtIp6.svM7M6;
import java.util.List;
import org.joda.time.LocalDateTime;
import retrofit2.Response;

/* JADX INFO: loaded from: classes4.dex */
public final /* synthetic */ class a1 implements Ch.c {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f11424a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ b1 f11425b;

    public /* synthetic */ a1(b1 b1Var, int i) {
        this.f11424a = i;
        this.f11425b = b1Var;
    }

    @Override // Ch.c
    public final void accept(Object obj) {
        String strMPattern;
        SharedPreferences sharedPreferences;
        String str;
        switch (this.f11424a) {
            case 0:
                b1 b1Var = this.f11425b;
                b1Var.getClass();
                String str2 = ((Response) obj).headers().get("Last-Modified");
                LocalDateTime localDateTimeC = AbstractC1234x.c(str2);
                com.paymaya.data.preference.a aVar = b1Var.f11428b;
                String string = svM7M6.getString(aVar.f11330b, "key_validation_head_date", null);
                LocalDateTime localDateTimeC2 = string != null ? AbstractC1234x.c(string) : null;
                if (localDateTimeC2 == null || localDateTimeC == null || localDateTimeC.isAfter(localDateTimeC2)) {
                    Ah.p<List<Validation>> validations = b1Var.c.getValidations();
                    a1 a1Var = new a1(b1Var, 1);
                    Kh.I i = Eh.d.f1366d;
                    validations.getClass();
                    validations.f(new Gh.d(1, a1Var, i));
                }
                androidx.media3.datasource.cache.c.u(aVar.f11330b, "key_validation_head_date", str2);
                break;
            default:
                List list = (List) obj;
                b1 b1Var2 = this.f11425b;
                b1Var2.getClass();
                for (int i4 = 0; i4 < list.size(); i4++) {
                    Validation validation = (Validation) list.get(i4);
                    boolean zEquals = "smart_msisdn".equals(validation.mName());
                    com.paymaya.data.preference.a aVar2 = b1Var2.f11428b;
                    if (zEquals) {
                        strMPattern = validation.mPattern();
                        sharedPreferences = aVar2.f11330b;
                        str = "key_smart_msisdn";
                    } else if ("globe_msisdn".equals(validation.mName())) {
                        strMPattern = validation.mPattern();
                        sharedPreferences = aVar2.f11330b;
                        str = "key_globe_msisdn";
                    } else if ("visa_scheme".equals(validation.mName())) {
                        strMPattern = validation.mPattern();
                        sharedPreferences = aVar2.f11330b;
                        str = "key_visa_scheme";
                    } else if ("mastercard_scheme".equals(validation.mName())) {
                        strMPattern = validation.mPattern();
                        sharedPreferences = aVar2.f11330b;
                        str = "key_mastercard_scheme";
                    } else if ("bancnet_scheme".equals(validation.mName())) {
                        strMPattern = validation.mPattern();
                        sharedPreferences = aVar2.f11330b;
                        str = "key_bancnet_scheme";
                    } else if ("email".equals(validation.mName())) {
                        strMPattern = validation.mPattern();
                        sharedPreferences = aVar2.f11330b;
                        str = "key_email_regex";
                    }
                    androidx.media3.datasource.cache.c.u(sharedPreferences, str, strMPattern);
                }
                break;
        }
    }
}
