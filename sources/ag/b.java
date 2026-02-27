package Ag;

import com.paymaya.domain.model.SecondaryFeature;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import okhttp3.OkHttpClient;
import zg.AbstractC2573h;

/* JADX INFO: loaded from: classes4.dex */
public final /* synthetic */ class b implements Function1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f278a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ Function1 f279b;

    public /* synthetic */ b(int i, Function1 function1) {
        this.f278a = i;
        this.f279b = function1;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        switch (this.f278a) {
            case 0:
                OkHttpClient.Builder builder = (OkHttpClient.Builder) obj;
                kotlin.jvm.internal.j.g(builder, "<this>");
                this.f279b.invoke(builder);
                N4.e.f3530a.invoke(builder);
                break;
            case 1:
                SecondaryFeature it = (SecondaryFeature) obj;
                kotlin.jvm.internal.j.g(it, "it");
                Boolean bool = (Boolean) this.f279b.invoke(it);
                bool.booleanValue();
                break;
            case 2:
                String selectedItem = (String) obj;
                kotlin.jvm.internal.j.g(selectedItem, "selectedItem");
                Function1 function1 = this.f279b;
                if (function1 != null) {
                    function1.invoke(selectedItem);
                }
                break;
            case 3:
                CharSequence it2 = (CharSequence) obj;
                kotlin.jvm.internal.j.g(it2, "it");
                Function1 function12 = this.f279b;
                if (function12 != null) {
                    function12.invoke(it2.toString());
                }
                break;
            default:
                AbstractC2573h abstractC2573h = (AbstractC2573h) obj;
                kotlin.jvm.internal.j.g(abstractC2573h, "<this>");
                this.f279b.invoke(abstractC2573h);
                N4.f.f3531b.invoke(abstractC2573h);
                break;
        }
        return Unit.f18162a;
    }
}
