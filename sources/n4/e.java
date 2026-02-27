package N4;

import M8.A0;
import bj.AbstractC1039j;
import bj.C1030a;
import bj.C1037h;
import bj.C1038i;
import java.util.Arrays;
import java.util.concurrent.TimeUnit;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.j;
import kotlin.jvm.internal.k;
import kotlin.jvm.internal.z;
import okhttp3.CertificatePinner;
import okhttp3.OkHttpClient;
import s.AbstractC2217b;

/* JADX INFO: loaded from: classes3.dex */
public final class e extends k implements Function1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final e f3530a = new e(1);

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        Object objA;
        OkHttpClient.Builder config = (OkHttpClient.Builder) obj;
        j.g(config, "$this$config");
        TimeUnit timeUnit = TimeUnit.MILLISECONDS;
        config.readTimeout(10000L, timeUnit);
        config.writeTimeout(10000L, timeUnit);
        String[] strArr = g.f3534a;
        try {
            C1037h.a aVar = C1037h.f9166b;
            int iC = AbstractC2217b.c(g.c);
            if (iC == 1 || iC == 2) {
                String strC = z.a(g.class).c();
                if (strC == null) {
                    strC = "NetworkConfig";
                }
                A0.v("pinner applied", strC);
                CertificatePinner.Builder builder = new CertificatePinner.Builder();
                builder.add(g.e, (String[]) Arrays.copyOf(g.f3534a, 3));
                objA = builder.build();
            } else if (iC != 3) {
                String strC2 = z.a(g.class).c();
                if (strC2 == null) {
                    strC2 = "NetworkConfig";
                }
                A0.v("pinner not applied", strC2);
                objA = null;
            } else {
                String strC3 = z.a(g.class).c();
                if (strC3 == null) {
                    strC3 = "NetworkConfig";
                }
                A0.v("pinner applied", strC3);
                CertificatePinner.Builder builder2 = new CertificatePinner.Builder();
                builder2.add(g.e, (String[]) Arrays.copyOf(g.f3535b, 3));
                objA = builder2.build();
            }
        } catch (Throwable th2) {
            C1037h.a aVar2 = C1037h.f9166b;
            objA = AbstractC1039j.a(th2);
        }
        Throwable thA = C1037h.a(objA);
        if (thA != null) {
            String strB = C1030a.b(thA);
            String strC4 = z.a(g.class).c();
            A0.v(strB, strC4 != null ? strC4 : "NetworkConfig");
        }
        CertificatePinner certificatePinner = (CertificatePinner) (objA instanceof C1038i ? null : objA);
        if (certificatePinner != null) {
            config.certificatePinner(certificatePinner);
        }
        config.addInterceptor(new P4.a());
        return Unit.f18162a;
    }
}
