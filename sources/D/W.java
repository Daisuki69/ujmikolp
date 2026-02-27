package D;

import android.content.Context;
import com.clevertap.android.sdk.CleverTapInstanceConfig;
import dOYHB6.tiZVw8.numX49;
import kotlin.jvm.functions.Function1;

/* JADX INFO: loaded from: classes2.dex */
public final /* synthetic */ class W implements Function1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f887a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ CleverTapInstanceConfig f888b;

    public /* synthetic */ W(CleverTapInstanceConfig cleverTapInstanceConfig, int i) {
        this.f887a = i;
        this.f888b = cleverTapInstanceConfig;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        switch (this.f887a) {
            case 0:
                Context context = (Context) obj;
                String strTnTj78 = numX49.tnTj78("PeuH");
                CleverTapInstanceConfig cleverTapInstanceConfig = this.f888b;
                kotlin.jvm.internal.j.g(cleverTapInstanceConfig, strTnTj78);
                kotlin.jvm.internal.j.g(context, numX49.tnTj78("PeuO"));
                return C0181n.f929a.a(context, cleverTapInstanceConfig);
            default:
                kotlin.jvm.internal.j.g((String) obj, numX49.tnTj78("PeuF"));
                return new l0.c(this.f888b);
        }
    }
}
